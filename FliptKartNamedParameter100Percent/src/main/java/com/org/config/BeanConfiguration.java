package com.org.config;

import javax.sql.DataSource;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.dao.DataAccessException;
import org.springframework.jdbc.core.namedparam.NamedParameterJdbcTemplate;

import com.mchange.v2.c3p0.ComboPooledDataSource;

@Configuration
@ComponentScan(basePackages= {"com/org/dao","com/org/service"})
public class BeanConfiguration {
	
	@Bean
	public DataSource getDS()throws DataAccessException,Exception
	{
		ComboPooledDataSource cpds = new ComboPooledDataSource();
		cpds.setDriverClass("com.mysql.jdbc.Driver");
		cpds.setJdbcUrl("jdbc:mysql:///fliptkart");
		cpds.setUser("root");
		cpds.setPassword("root");
		return cpds;
	}

	@Bean
	public NamedParameterJdbcTemplate getParameter()throws DataAccessException,Exception
	{
		return new NamedParameterJdbcTemplate(getDS());
	}
	
	
	
}
