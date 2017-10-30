package net.vig.shoppingbackend.config;

import java.util.Properties;

import javax.sql.DataSource;

import org.apache.commons.dbcp2.BasicDataSource;
import org.hibernate.SessionFactory;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.orm.hibernate5.HibernateTransactionManager;
import org.springframework.orm.hibernate5.LocalSessionFactoryBuilder;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.EnableTransactionManagement;

@Configuration
@ComponentScan(basePackages= {"net.vig.shoppingbackend.dao"})
@EnableTransactionManagement
public class HibernateConfig {
	
	//change the below based on the dbms
 private final static String Database_URL="jdbc:h2:tcp://127.0.0.1/~/vickyfood";
 private final static String Database_DRIVER="org.h2.Driver";
 private final static String Database_DIALECT="org.hibernate.dialect.H2Dialect";
 private final static String Database_USERNAME="sa";
 private final static String Database_PASSWORD="";
 
 @Bean
 public DataSource getSource() {
	 
	 BasicDataSource dataSource=new BasicDataSource();
	 
	 dataSource.setDriverClassName(Database_DRIVER);
	 dataSource.setUrl(Database_URL);
	 dataSource.setUsername(Database_USERNAME);
	 dataSource.setPassword(Database_PASSWORD);
	 return dataSource;
 }
 
@Bean
 public SessionFactory getSessionFactory(DataSource dataSource) {
	 
	 
	 LocalSessionFactoryBuilder builder=new LocalSessionFactoryBuilder(dataSource);
	 builder.addProperties(getHibernateProperties());
	 builder.scanPackages("net.vig.shoppingbackend.dto");

	 return builder.buildSessionFactory();
 }

 
 //All the hibernate properties will be returned in this method
private Properties getHibernateProperties() {
	// TODO Auto-generated method stub
	Properties properties=new Properties();
	properties.put("hibernate.dilect", Database_DIALECT);
	properties.put("hibernate.show_sql", "true");
	properties.put("hibernate.format_sql", "true");

	return properties;
}

@Bean
public HibernateTransactionManager getTransactionManager(SessionFactory sessionFactory) {
	HibernateTransactionManager transactionManager=new HibernateTransactionManager();
	transactionManager.setSessionFactory(sessionFactory);
	return transactionManager;	
}
	
	
}
