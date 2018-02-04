package com.org.cfg;

import javax.sql.DataSource;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.PropertySource;
import org.springframework.core.env.Environment;
import org.springframework.jdbc.core.JdbcTemplate;

import com.mchange.v2.c3p0.ComboPooledDataSource;

@Configuration("dao")
@ComponentScan(basePackages= {"com/org/dao","com/org/servie"})
@PropertySource("classpath:/com/org/prop/JDBC.properties")
public class BeanConfigure {
	@Autowired
	Environment env ;
	
      @Bean
	public DataSource getDataSource()throws Exception
	{
		ComboPooledDataSource ds= new ComboPooledDataSource();
		ds.setDriverClass(env.getProperty("jdbc.driver"));
		ds.setJdbcUrl(env.getProperty("jdbc.url"));
		ds.setUser(env.getProperty("jdbc.user"));
		ds.setPassword(env.getProperty("jdbc.pass"));
		
		return ds;
	}
	
      @Bean
	public JdbcTemplate getTemplet() throws Exception
	{
		JdbcTemplate jt = new JdbcTemplate(getDataSource());
		return jt;
	}
	

}
