package com.wrampup.config;

import java.util.Properties;

import javax.sql.DataSource;

import org.apache.commons.dbcp2.BasicDataSource;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Profile;
import org.springframework.orm.hibernate4.LocalSessionFactoryBean;

@Configuration
@Profile("test")
public class H2Config {

	@Bean(name = "dataSource")
	public static DataSource getDataSource() {
		BasicDataSource dataSource = new BasicDataSource();
		dataSource.setDriverClassName("org.h2.Driver");
		dataSource.setUrl("jdbc:h2:mem:~/test;DB_CLOSE_DELAY=-1;DB_CLOSE_ON_EXIT=FALSE");
		return dataSource;
	}

	@Bean
	public static LocalSessionFactoryBean getSessionFactory() {
		LocalSessionFactoryBean sessionFactory = new LocalSessionFactoryBean();
		sessionFactory.setDataSource(getDataSource());
		sessionFactory.setPackagesToScan("com.wrampup");
		sessionFactory.setHibernateProperties(getHibernateProperties());
		return sessionFactory;
	}

	private static Properties getHibernateProperties() {
		Properties properties = new Properties();
		properties.put("hibernate.hbm2ddl.auto", "update");
		properties.put("hibernate.dialect", "org.hibernate.dialect.H2Dialect");
		properties.put("hibernate.show_sql", true);
		return properties;
	}
}
