package com.india;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
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
		String name=req.getParameter("name");
		out.println("<h1>Hello, "+name+" Welcome back to my website...</h1>");
		out.println("<h1>Thank You</h1>");
		out.println("</body>");		
		out.println("</body>");		
		out.println("</html>");
	}
	
}