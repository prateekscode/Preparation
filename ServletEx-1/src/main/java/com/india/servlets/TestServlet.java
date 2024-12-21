package com.india.servlets;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletConfig;
import javax.servlet.ServletContext;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

public class TestServlet extends HttpServlet{

	String phone;
	String email;
	String state;
	String country;
	
	public void init(ServletConfig sc) {
		System.out.println("TestServlet- init()");
	
		//Config parameters
		phone=sc.getInitParameter("Phone");
		email=sc.getInitParameter("Email");
		
		//Context parameters
		ServletContext ctx=sc.getServletContext();
		state=ctx.getInitParameter("State");
		country=ctx.getInitParameter("Country");
	}
	
	@Override
	protected void service(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
		System.out.println("TestServlet- Service()");
		
		String un=req.getParameter("uname");
		
		PrintWriter out=resp.getWriter();
		out.print("<h1>Username: "+un+"</h1>");
		out.print("<h1>Phone: "+phone+"</h1>");
		out.print("<h1>Email: "+email+"</h1>");
		out.print("<h1>State: "+state+"</h1>");
		out.print("<h1>Country: "+country+"</h1>");
	}
	
	@Override
	public void destroy() {
		System.out.println("TestServlet-Destroy()");
	}
}
