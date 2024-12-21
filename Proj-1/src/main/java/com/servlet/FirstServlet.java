package com.servlet;

import java.io.IOException;
import java.io.PrintWriter;
import java.util.Date;

import javax.servlet.Servlet;
import javax.servlet.ServletConfig;
import javax.servlet.ServletException;
import javax.servlet.ServletRequest;
import javax.servlet.ServletResponse;

public class FirstServlet implements Servlet{

	ServletConfig conf;
	
	//Life-cycle Methods
	@Override
	public void init(ServletConfig config) throws ServletException {
		System.out.println("Creating object...");
	}
	
	@Override
	public void service(ServletRequest req, ServletResponse res) throws ServletException, IOException {
		System.out.println("Servicing...");	
		res.setContentType("text/html");
		PrintWriter writer = res.getWriter();
		writer.println("<h1>This is output from my servlet method</h1>");
		writer.println("<h1>Today's date and time : "+ new Date().toString()+"</h1>");
	}
	
	@Override
	public void destroy() {
		System.out.println("Destoying object...");
	}
	
	//Non-LifeCycle Methods 
	@Override
	public ServletConfig getServletConfig() {
		return conf;
	}
	
	@Override
	public String getServletInfo() {
		return "Servlet created by Prateek";
	}
	
	
}
