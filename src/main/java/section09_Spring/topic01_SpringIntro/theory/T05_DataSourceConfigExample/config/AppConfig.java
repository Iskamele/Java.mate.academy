package section09_Spring.topic01_SpringIntro.theory.T05_DataSourceConfigExample.config;

import org.apache.commons.dbcp2.BasicDataSource;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.orm.hibernate5.LocalSessionFactoryBean;
import java.util.Properties;
import javax.sql.DataSource;

@Configuration
@ComponentScan(basePackages = "section09_Spring.topic01_SpringIntro.theory.T05_DataSourceConfigExample")
public class AppConfig {
    // TODO с этой реализацией можно избавиться от hibernate.cfg и util директории
    @Bean
    public DataSource getDataSource(){
        BasicDataSource dataSource = new BasicDataSource();
        dataSource.setDriverClassName("com.mysql.cj.jdbc.Driver");
        dataSource.setUrl("jdbc:mysql://localhost:3306/ticket_app?serverTimeZone=UTC");
        dataSource.setUsername("root");
        dataSource.setPassword("8CMT3f~8F4H_2v+f4py^d7+3p%MP)!fG");
        return dataSource;
    }

    @Bean
    public LocalSessionFactoryBean getSessionFactory(){
        LocalSessionFactoryBean localSessionFactoryBean = new LocalSessionFactoryBean();
        localSessionFactoryBean.setDataSource(getDataSource());

        Properties properties = new Properties();
        properties.put("show_sql", "true");
        properties.put("hibernate.hbm2ddl.auto", "create-drop");
        localSessionFactoryBean.setHibernateProperties(properties);

        localSessionFactoryBean.setPackagesToScan("section09_Spring.topic01_SpringIntro.theory.T05_DataSourceConfigExample.model");
        return localSessionFactoryBean;
    }
}
