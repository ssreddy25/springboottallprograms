package com.ojas.springmvc.hibernate.springmvchibernateexample.config;

import java.util.Properties;

import javax.sql.DataSource;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.PropertySource;
import org.springframework.core.env.Environment;
import org.springframework.jdbc.datasource.DriverManagerDataSource;
import org.springframework.orm.hibernate5.HibernateTemplate;
import org.springframework.orm.hibernate5.HibernateTransactionManager;
import org.springframework.orm.hibernate5.LocalSessionFactoryBean;
import org.springframework.transaction.annotation.EnableTransactionManagement;
import org.springframework.web.servlet.ViewResolver;
import org.springframework.web.servlet.config.annotation.EnableWebMvc;
import org.springframework.web.servlet.config.annotation.WebMvcConfigurerAdapter;
import org.springframework.web.servlet.view.InternalResourceViewResolver;

@Configuration
@ComponentScan(basePackages="com.ojas.springmvc.hibernate.springmvchibernateexample")
@EnableWebMvc
@PropertySource("classpath:dbandhibernate.properties")
@EnableTransactionManagement
public class MvcConfiguration extends WebMvcConfigurerAdapter{
	
	@Autowired
	private Environment environment;

	@Bean
	public ViewResolver getViewResolver(){
		InternalResourceViewResolver resolver = new InternalResourceViewResolver();
		resolver.setPrefix("/WEB-INF/views/");
		resolver.setSuffix(".jsp");
		return resolver;
	}
	
	
	
	@Bean
	public HibernateTemplate hibernateTemplate() {
		return new HibernateTemplate(sessionFactory().getObject());
	}
	
	@Bean
	public LocalSessionFactoryBean sessionFactory() {
		LocalSessionFactoryBean sessionss=new LocalSessionFactoryBean();
		
		sessionss.setDataSource(getDataSource());
		sessionss.setHibernateProperties(getProperties());
		sessionss.setPackagesToScan("com.ojas.springmvc.hibernate.springmvchibernateexample.model");
		return sessionss;
	}
	
	@Bean
	public DataSource getDataSource() {
		
		DriverManagerDataSource dataSource=new DriverManagerDataSource();
		dataSource.setDriverClassName(environment.getProperty("db.driver"));
		dataSource.setUrl(environment.getProperty("db.url"));
		dataSource.setUsername(environment.getProperty("db.user"));
		dataSource.setPassword(environment.getProperty("db.pwd"));
		
		return dataSource;
	}
	
	  public  Properties getProperties() {
		  
		  Properties properties=new Properties();
		  
		  properties.put("hibernate.show_sql", environment.getProperty("environment"));
		  properties.put("hibernate.hbm2ddl.auto", environment.getProperty("hibernate.hbm2ddl.auto"));
		  properties.put("hibernate.dialect", environment.getProperty("hibernate.dialect"));
		  return  properties;
		  
		  
		
	}
	  @Bean
	  public HibernateTransactionManager hibernateTransactionManager() {
		  HibernateTransactionManager transactionManager=new HibernateTransactionManager();
		  
		  transactionManager.setSessionFactory(sessionFactory().getObject());
		  
		  return transactionManager;
		  
	  }
	  
	  
}
