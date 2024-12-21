package com.india.servlets;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletConfig;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

public class ForgotServlet extends HttpServlet {
	public void init(ServletConfig sc) {
		System.out.println("ForgotServlet-Init()");
	}

	@Override
	protected void service(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
		System.out.println("ForgotServlet-Service()");

		String em = req.getParameter("email");

		System.out.println(em);

		PrintWriter out = resp.getWriter();
		out.println("<html>");
		out.println("<body>");
		out.println("<center>");
		out.println("<h1>Best BookStore</h1>");
		out.println("<h2>Hi, Your Password is sent to your email Successfully</h2>");
		out.println("<h1>Best BookStore HomePage</h1>");
		out.println("</center>");
		out.println("</body></html>");
	}

	public void destroy() {
		System.out.println("ForgotServlet-destroy()");
	}
}
