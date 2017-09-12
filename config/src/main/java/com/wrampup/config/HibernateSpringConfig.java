package com.wrampup.config;

import java.util.Properties;

import javax.sql.DataSource;

import org.apache.commons.dbcp2.BasicDataSource;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Profile;
import org.springframework.orm.hibernate4.LocalSessionFactoryBean;

@Configuration
@Profile("!test")
public class HibernateSpringConfig {
	@Bean(name = "dataSource")
	public static DataSource getDataSource() {
		BasicDataSource dataSource = new BasicDataSource();
		dataSource.setDriverClassName("com.mysql.jdbc.Driver");
		dataSource.setUsername("root");
		dataSource.setPassword("user");
		dataSource.setUrl("jdbc:mysql://localhost:3306/hrdb");
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
		properties.put("hibernate.show_sql", true);
		properties.put("hibernate.dialect", "org.hibernate.dialect.MySQL5Dialect");
		return properties;
	}
}
