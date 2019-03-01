package workflow;

import org.apache.ibatis.session.SqlSession;
import org.springframework.jdbc.datasource.DataSourceTransactionManager;
import workflow.service.UserService2;

public class TestEngine {

    protected SqlSession session;
    protected DataSourceTransactionManager transactionManager;
    protected UserService2 userService2;

    public TestEngine() {
    }

    public TestEngine(SqlSession session, DataSourceTransactionManager transactionManager) {
        this.session = session;
        this.transactionManager = transactionManager;
        userService2 = new UserService2();
        userService2.initService(this.session, this.transactionManager);
    }

    public UserService2 getUserService2() {
        return userService2;
    }

    public SqlSession getSession() {
        return session;
    }

    public void setSession(SqlSession session) {
        this.session = session;
    }

    public String getResult() {
        return "OK";
    }
}
