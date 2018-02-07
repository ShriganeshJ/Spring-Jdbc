package com.org.controller;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

import com.org.config.BeanConfiguration;
import com.org.dto.FliptkartDTO;
import com.org.service.FliptkartService;

public class FliptkartController extends HttpServlet {
	String name, address, landmark, email, mobile, option, cid;
	ApplicationContext ctx = null;
	FliptkartService service;
	RequestDispatcher rd=null;
	int count=0;

	@Override
	public void init() throws ServletException {
		ctx = new AnnotationConfigApplicationContext(BeanConfiguration.class);
	}

	public void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {

		// general Setting
		PrintWriter pw = null;
		pw = response.getWriter();
		response.setContentType("text/html");
		// access data from client
		name = request.getParameter("txtName");
		email = request.getParameter("txtEmail");
		address = request.getParameter("txtAdd");
		landmark = request.getParameter("txtLand");
		option = request.getParameter("payment");
		mobile = request.getParameter("txtMobile");

		FliptkartDTO dto = new FliptkartDTO();
		dto.setCname(name);
		dto.setCadd(address);
		dto.setCemail(email);
		dto.setMobile(Integer.parseInt(mobile));
		dto.setClandmark(landmark);
		dto.setCoption(option);

		// insert data

		service = ctx.getBean(FliptkartService.class);
		count=service.insertRecord(dto);
		if(count==1)
		{
			pw.print( "<h1 style='color:green'> Register Successful.....  </h1>");
		}
		else
		{
			pw.println("<h1 style='color:red'> Registration failed try again .....  </h1>");
		}

	}

	public void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		doGet(request, response);
	}

}
