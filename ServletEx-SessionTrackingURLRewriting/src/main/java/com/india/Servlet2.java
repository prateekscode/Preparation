package com.india;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.Cookie;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;


public class Servlet2 extends HttpServlet {

	protected void service(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
		PrintWriter out=resp.getWriter();
		System.out.println("Servlet 2 service");
		//get attribute from req object.
		out.println("<html>");
		out.println("<head>");
		out.println("<title>Servlet 2</title>");
		out.println("</head>");
		out.println("<body>");	
		
		out.println("<h1 style='color:blue;'>Welcome to Servlet2</h1>");	
		//url: fetch
		String name=req.getParameter("user");
		out.println("<h1 style='color:red;'>Welcome back "+name+" [name getting from url]</h1>");	
		
		out.println("</body>");		
		out.println("</html>");
	}
	
}
