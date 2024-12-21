package com.india;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletException;
import javax.servlet.http.Cookie;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

public class Servlet1 extends HttpServlet {

	protected void service(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
		HttpSession s = req.getSession();
		PrintWriter out = resp.getWriter();
		System.out.println("Servlet1 service");
		
		out.println("<html>");
		out.println("<body>");
		
		s.setAttribute("name", "Kanpur");
		out.println("<h1>Hello, Your name is: " + s.getAttribute(name) + " </h1>");
		
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

