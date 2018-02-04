package com.org.test;

import java.util.List;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.org.dto.EmployeeDTO;
import com.org.service.EmployeeService;
import com.org.service.EmployeeServiceImpl;

public class Test {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		ApplicationContext ctx=null;
		EmployeeService service=null;
		EmployeeDTO dto=null;
		ctx= new ClassPathXmlApplicationContext("com/org/cfgs/applicationContext.xml");
		
		service=ctx.getBean(EmployeeServiceImpl.class);
//	dto=	service.getDetails(10);
	
	//System.out.println(dto.getEid()+" "+dto.getEname()+""+dto.getJob());
	
	//list
	List<EmployeeDTO> edto=null;
	edto=service.getListDetails();
	//over ride to string method bo DTO is not industry standard
	
	edto.forEach(i->{
		
		System.out.print(i.getEid() +" ");
		System.out.print(i.getEname() +" ");
		System.out.print(i.getJob() +" ");
		System.out.print(i.getSal() +" ");
		System.out.println();
		
	});
	}

}
