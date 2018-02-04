package com.org.test;

import java.util.ArrayList;
import java.util.List;

import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

import com.org.cfgs.EmployeeConfigureation;
import com.org.dto.EmployeeDTO;
import com.org.service.EmployeeService;
import com.org.service.EmployeeServiceImpl;

public class Test {

	public static void main(String[] args) {
		ApplicationContext ctx=null;
		EmployeeService service=null;
		List<EmployeeDTO>dto=new ArrayList<>();
		
		ctx=new AnnotationConfigApplicationContext(EmployeeConfigureation.class);
		
		service=ctx.getBean(EmployeeServiceImpl.class);
		
		dto=service.getAllRecord();
		
		dto.forEach(r->{
			System.out.println();
			System.out.print(r.getEid()+"  ");
			System.out.print(r.getName()+"  ");
			System.out.print(r.getJob()+"  ");
			System.out.print(r.getSal()+"  ");
			System.out.println();
			System.out.println();
		});

	}

}
