package com.india;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletException;
import javax.servlet.http.Cookie;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

public class Servlet1 extends HttpServlet {

	protected void service(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
		PrintWriter out = resp.getWriter();
		System.out.println("Servlet1 service");
		
		out.println("<html>");
		out.println("<body>");
		
		//Fetching name
		String name = req.getParameter("n1");
		
		out.println("<h1>Hello, Your name is: " + name + " </h1>");
		out.println("<h1><a href ='servlet2?user="+name+"'>Go to Servlet 2</a></h1>");
		
		out.println("</body>");
		out.println("</html>");

	}

}

