package com.js.tg;

import org.springframework.beans.factory.BeanFactory;
import org.springframework.beans.factory.xml.XmlBeanFactory;
import org.springframework.core.io.ClassPathResource;

public class MainClass {

	public static void main(String[] args) {
		ClassPathResource resource = new ClassPathResource("applicationContext.xml");

		try {
			BeanFactory factory = new XmlBeanFactory(resource);

			Cancellation st = factory.getBean("cance", Cancellation.class);

			System.out.println(st.toString());

		} catch (Exception e) {
			// TODO: handle exception
			e.printStackTrace();
		}

	}

}
