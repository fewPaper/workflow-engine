package workflow;

import org.springframework.beans.BeansException;
import org.springframework.beans.factory.FactoryBean;
import org.springframework.context.ApplicationContext;
import org.springframework.context.ApplicationContextAware;

public class TestEngineFactoryBean implements FactoryBean<TestEngine>, ApplicationContextAware {

    protected ApplicationContext applicationContext;
    protected TestEngine testEngine;
    private TestEngineConfiguration testEngineConfiguration;

    public TestEngine getObject() throws Exception {
        this.testEngine = testEngineConfiguration.buildTestEngine();
        return this.testEngine;
    }

    public TestEngineConfiguration getTestEngineConfiguration() {
        return testEngineConfiguration;
    }

    public void setTestEngineConfiguration(TestEngineConfiguration testEngineConfiguration) {
        this.testEngineConfiguration = testEngineConfiguration;
    }

    public void setApplicationContext(ApplicationContext applicationContext) throws BeansException {
        this.applicationContext = applicationContext;
    }

    public Class<TestEngine> getObjectType() {
        return TestEngine.class;
    }

    public boolean isSingleton() {
        return true;
    }
}
