package com.india.servlets;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletConfig;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

public class LoginServlet extends HttpServlet {
	public void init(ServletConfig sc) {
		System.out.println("LoginServlet-Init()");
	}

	@Override
	protected void service(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
		System.out.println("LoginServlet-Service()");

		String un = req.getParameter("uname");
		String pw = req.getParameter("pword");

		System.out.println(un);
		System.out.println(pw);

		PrintWriter out = resp.getWriter();
		out.println("<html>");
		out.println("<body>");
		out.println("<center>");
		out.println("<h1>Best BookStore</h1>");
		out.println("<h2>Hi" + un + "Your Login is Successful</h2>");
		out.println("<h1>Best BookStore HomePage</h1>");
		out.println("</center>");
		out.println("</body></html>");
	}

	public void destroy() {
		System.out.println("LoginServlet-destroy()");
	}
}
