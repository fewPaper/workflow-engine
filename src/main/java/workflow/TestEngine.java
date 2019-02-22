package workflow;

import org.apache.ibatis.session.SqlSession;
import workflow.service.UserService2;

public class TestEngine {

    protected SqlSession session;
    protected UserService2 userService2;

    public TestEngine() {
    }

    public TestEngine(SqlSession session) {
        this.session = session;
        userService2 = new UserService2();
        userService2.initService(this.session);
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
