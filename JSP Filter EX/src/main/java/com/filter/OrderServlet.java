package com.filter;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

public class OrderServlet extends HttpServlet {

	@Override
	protected void service(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {

		PrintWriter out = resp.getWriter();
		System.out.println("Order Servlet Executed");
		out.println("<html>");
		out.println("<head>");
		out.println("<title>Order Servlet</title>");
		out.println("</head>");
		out.println("<body>");
		out.println("<h1>Welcome to Order page</h1>");
		out.println("<h1>Servlet orderServlet at: " + req.getContextPath() + "</h1>");
		out.println("</body></html>");
	}
}
