package com.org.test;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.org.servie.EmployeeServiceImpl;

public class Test {

	public static void main(String[] args) {
		ApplicationContext ctx=null;
		EmployeeServiceImpl es=null;
		
		ctx=new ClassPathXmlApplicationContext("com/org/cfg/applicationContext.xml");
		
		es=ctx.getBean("service",EmployeeServiceImpl.class);
		//System.out.println(es.ServiceCount());
		
		//System.out.println(es.getMapDetails(10));
		
		//System.out.println(es.getAlDetails(11));
		
		//System.out.println(es.update(12,70000));
		
		
		

	}

}
