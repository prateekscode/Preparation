package com.india.servlets;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

public class HaiServlet extends HttpServlet {
	@Override
	protected void service(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
		System.out.println("HaiServlet()-service begin");
		String name = req.getParameter("name");
		System.out.println(name);
		String nm = req.getAttribute("NM").toString();
		System.out.println(nm);

		RequestDispatcher rd1 = req.getRequestDispatcher("/header.jlc");
		rd1.include(req, resp);

		PrintWriter out = resp.getWriter();
		out.println("<font color=blue size=10>Welcome to JLC</font><br/><br/><br/>");

		RequestDispatcher rd2 = req.getRequestDispatcher("/footer.jsp");
		rd2.include(req, resp);

		System.out.println("HelloServlet()-service end");
	}
}
