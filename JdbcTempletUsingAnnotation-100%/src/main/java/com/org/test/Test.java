package com.org.test;

import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotatedBeanDefinitionReader;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.org.cfg.BeanConfigure;
import com.org.servie.EmployeeServiceImpl;

public class Test {

	public static void main(String[] args) {
		ApplicationContext ctx=null;
		EmployeeServiceImpl es=null;
		
		ctx=new AnnotationConfigApplicationContext(BeanConfigure.class);
		
		es=ctx.getBean(EmployeeServiceImpl.class);
		//System.out.println(es.ServiceCount());
		
		//System.out.println(es.getMapDetails(10));
		
		//System.out.println(es.getAlDetails(11));
		
		System.out.println(es.update(12,70000));
		
		
		

	}

}
