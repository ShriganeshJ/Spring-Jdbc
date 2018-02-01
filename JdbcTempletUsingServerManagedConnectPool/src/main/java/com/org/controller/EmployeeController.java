package com.org.controller;

import java.io.IOException;
import java.io.PrintWriter;
import java.util.List;
import java.util.Map;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.org.service.EmployeeService;
import com.org.service.EmployeeServiceImpl;

public class EmployeeController extends HttpServlet {
	// Config IOC container
	ApplicationContext ctx = null;
	EmployeeService service = null;
	String job[] = null;
	RequestDispatcher rd = null;

	@Override
	public void init() throws ServletException {
		// for creating obj only one time
		ctx = new ClassPathXmlApplicationContext("com/org/cfgs/applicationContaxt.xml");

	}

	public void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		PrintWriter pw = null;
		// General Setting
		response.setContentType("text/html");
		pw = response.getWriter();

		// read values
		job = request.getParameterValues("txtDesig");

		List<Map<String, Object>> ls = null;
		service = ctx.getBean(EmployeeServiceImpl.class);
		ls = service.serviceList(job);
		pw.println(ls);
		// forwared result to client
		request.setAttribute("result", ls);
		rd = request.getRequestDispatcher("result.jsp");
		rd.forward(request, response);

	}

	public void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		doGet(request, response);
	}

}
