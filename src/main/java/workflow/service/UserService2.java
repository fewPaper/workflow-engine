package workflow.service;

import com.github.pagehelper.PageHelper;
import org.apache.ibatis.session.SqlSession;
import workflow.dao.UserMapper2;
import workflow.entity.User2;

import java.util.List;

public class UserService2 {
    private UserMapper2 userMapper2;

    public void initService(SqlSession session) {
        this.userMapper2 = session.getMapper(UserMapper2.class);
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

    public int updateByPrimaryKey(User2 record) {
        return userMapper2.updateByPrimaryKey(record);
    }
}
