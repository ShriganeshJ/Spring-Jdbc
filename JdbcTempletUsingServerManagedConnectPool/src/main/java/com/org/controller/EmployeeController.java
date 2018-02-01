package com.org.controller;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
public class EmployeeController extends HttpServlet {
	
       
   	public void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
   		PrintWriter pw=null;
   		//General Setting
   		response.setContentType("text/html");
   		pw=response.getWriter();
		}

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	public void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		doGet(request, response);
	}

}
