package workflow;

import com.github.pagehelper.PageHelper;
import org.apache.ibatis.plugin.Interceptor;
import org.apache.ibatis.session.SqlSession;
import org.apache.ibatis.session.SqlSessionFactory;
import org.mybatis.spring.SqlSessionFactoryBean;
import org.springframework.core.io.support.PathMatchingResourcePatternResolver;
import org.springframework.core.io.support.ResourcePatternResolver;
import org.springframework.jdbc.datasource.DataSourceTransactionManager;
import org.springframework.util.StringUtils;

import javax.sql.DataSource;
import java.util.Properties;

public class TestEngineConfiguration {

    protected DataSource dataSource;
    protected SqlSessionFactory sqlSessionFactory;
    protected SqlSession session;
    protected DataSourceTransactionManager transactionManager;
    public static final String DEFAULT_MYBATIS_MAPPING_DIR = "classpath*:workflow/mapper/*Mapper2*.xml";
    private String typeAliasesPackage;

    public DataSource getDataSource() {
        return dataSource;
    }

    public TestEngineConfiguration setDataSource(DataSource dataSource) {
        this.dataSource = dataSource;
        return this;
    }

    public TestEngine buildTestEngine() {
        initSqlSessionFactory();
        session = sqlSessionFactory.openSession();
        transactionManager = new DataSourceTransactionManager(dataSource);
        return new TestEngine(session,transactionManager);
    }

    //配置Session工厂
    public void initSqlSessionFactory() {
        SqlSessionFactoryBean bean = new SqlSessionFactoryBean();
        bean.setDataSource(dataSource);

        if (!StringUtils.isEmpty(typeAliasesPackage)) {
            bean.setTypeAliasesPackage(typeAliasesPackage);
        }
        //分页插件
        PageHelper pageHelper = new PageHelper();
        Properties properties = new Properties();
        properties.setProperty("reasonable", "true");
        properties.setProperty("supportMethodsArguments", "true");
        properties.setProperty("returnPageInfo", "check");
        properties.setProperty("params", "count=countSql");
        pageHelper.setProperties(properties);
        //添加XML目录
        ResourcePatternResolver resolver = new PathMatchingResourcePatternResolver();
        Interceptor[] plugins = new Interceptor[]{pageHelper};
        bean.setPlugins(plugins);
        try {
            bean.setMapperLocations(resolver.getResources(DEFAULT_MYBATIS_MAPPING_DIR));
            sqlSessionFactory = bean.getObject();
        } catch (Exception e) {
            e.printStackTrace();
            throw new RuntimeException(e);
        }
    }
}
