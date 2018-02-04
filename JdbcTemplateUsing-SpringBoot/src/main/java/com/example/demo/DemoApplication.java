package com.example.demo;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Import;

import com.org.dao.EmployeeDAOImpl;
import com.org.servie.EmployeeServiceImpl;

@SpringBootApplication
@ComponentScan(basePackages= {"com/org/servie","com/org/dao"})
public class DemoApplication {

	public static void main(String[] args) {
		EmployeeServiceImpl service;
		ApplicationContext ctx=null;
		ctx=SpringApplication.run(DemoApplication.class, args);
		service=ctx.getBean(EmployeeServiceImpl.class);
		
		System.out.println(service.getMapDetails(10));
		
	}
}
