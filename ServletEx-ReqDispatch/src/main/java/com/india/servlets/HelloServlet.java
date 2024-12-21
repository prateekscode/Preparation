package com.india.servlets;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

public class HelloServlet extends HttpServlet{
	@Override
	protected void service(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
		System.out.println("HelloServlet()-service begin");
		String name=req.getParameter("name");
		System.out.println(name);
		req.setAttribute("NM", name);
		
		PrintWriter out=resp.getWriter();
		out.println("<font color=red size=8>No Gaurantee</font>");
		RequestDispatcher rd2=req.getRequestDispatcher("/hai.jlc");
		rd2.forward(req, resp);
		System.out.println("HelloServlet()-service end");
	}
}
