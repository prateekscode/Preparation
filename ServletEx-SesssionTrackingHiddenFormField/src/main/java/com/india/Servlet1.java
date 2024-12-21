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
		
		//hidden form field
		out.println(""
				+ "<form action='servlet2' >"
				+ "<input type='hidden' name='user_name' value='"+name+"' />"
				+ "<button>Go to second servlet</button>"
				+ ""
				+ ""
				+ ""
				+ "</form>");
		
		out.println("</body>");
		out.println("</html>");

	}

}

