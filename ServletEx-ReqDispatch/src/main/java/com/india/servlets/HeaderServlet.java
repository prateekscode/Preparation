package com.india.servlets;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

public class HeaderServlet extends HttpServlet {
	@Override
	protected void service(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
		System.out.println("HeaderServlet()-service begin");
		PrintWriter out = resp.getWriter();
		out.println("<font color=red size=8>Welcome to JLC</font><br/><br/><br/>");

		System.out.println("HeaderServlet()-service end");
	}
}
