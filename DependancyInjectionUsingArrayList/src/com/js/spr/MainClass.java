package com.js.spr;

import org.springframework.beans.factory.BeanFactory;
import org.springframework.beans.factory.xml.XmlBeanFactory;
import org.springframework.core.io.ClassPathResource;

public class MainClass {
	
	public static void main(String[] args) {
		ClassPathResource resource = new ClassPathResource("applicationContext.xml");

		
		
		try
		{
		BeanFactory factory = new XmlBeanFactory(resource);
		
		
	Student st=	factory.getBean("stud", Student.class);
	
	System.out.println(st.toString());

	
		}
		catch (Exception e) {
			// TODO: handle exception
			e.printStackTrace();
		}
		
		

	}
}
