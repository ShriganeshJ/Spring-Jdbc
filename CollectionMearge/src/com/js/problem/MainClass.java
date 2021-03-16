package com.js.problem;

import org.springframework.beans.factory.BeanFactory;
import org.springframework.beans.factory.xml.XmlBeanFactory;
import org.springframework.core.io.ClassPathResource;

public class MainClass {

	public static void main(String[] args) {
		ClassPathResource resourceProblem = new ClassPathResource("applicationContextP1.xml");

		ClassPathResource resourceSolution = new ClassPathResource("applicationContext.xml");

		try {
			BeanFactory factory = new XmlBeanFactory(resourceProblem);

			// problem without collection merge override existing class
			Cource cus = factory.getBean("curs1", Cource.class);

			System.out.println("Problem:-"+cus);

          // collection merge solution 
			BeanFactory factory2 = new XmlBeanFactory(resourceSolution);
			Cource cus01= factory2.getBean("curs1",Cource.class);
		      
			System.out.println("Solution:-"+cus01);

		} catch (Exception e) {
			// TODO: handle exception
			e.printStackTrace();
		}

	}
}
