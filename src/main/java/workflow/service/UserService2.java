package workflow.service;

import com.github.pagehelper.PageHelper;
import org.apache.ibatis.session.SqlSession;
import org.springframework.jdbc.datasource.DataSourceTransactionManager;
import org.springframework.transaction.TransactionDefinition;
import org.springframework.transaction.TransactionStatus;
import org.springframework.transaction.annotation.Transactional;
import org.springframework.transaction.support.DefaultTransactionDefinition;
import workflow.dao.UserMapper2;
import workflow.entity.User2;

import java.util.List;

public class UserService2 {
    private UserMapper2 userMapper2;
    private DataSourceTransactionManager txManager;

    public void initService(SqlSession session, DataSourceTransactionManager txManager) {
        this.userMapper2 = session.getMapper(UserMapper2.class);
        this.txManager = txManager;
    }

    public User2 getUser2(Integer userid) {
        return userMapper2.selectByPrimaryKey(userid);
    }

    public List<User2> getUser2s(int pageNum, int pageSize) {
        PageHelper.startPage(pageNum, pageSize);
        return userMapper2.selectAll();
    }

    public List<User2> selectAll() {
        return userMapper2.selectAll();
    }

    public int insert(User2 record) {
        return userMapper2.insert(record);
    }

    public int updateByPrimaryKey(User2 record) {
        return userMapper2.updateByPrimaryKey(record);
    }

    public void transactionTest2() {
        DefaultTransactionDefinition def = new DefaultTransactionDefinition();
        def.setPropagationBehavior(TransactionDefinition.PROPAGATION_REQUIRED);// 事物隔离级别，开启新事务
        TransactionStatus status = txManager.getTransaction(def); // 获得事务状态
        try {
            User2 user = new User2(2, "bbb", String.valueOf((int) ((Math.random() * 9 + 1) * 100000)));
            userMapper2.updateByPrimaryKey(user);
            User2 user2 = new User2(666, "fff", String.valueOf((int) ((Math.random() * 9 + 1) * 100000)));
            userMapper2.insert(user2);
            //逻辑代码，可以写上你的逻辑处理代码
            txManager.commit(status);
        } catch (Exception e) {
            txManager.rollback(status);
        }

    }
}
