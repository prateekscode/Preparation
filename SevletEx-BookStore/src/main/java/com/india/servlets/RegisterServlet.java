package com.india.servlets;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletConfig;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

public class RegisterServlet extends HttpServlet {
	public void init(ServletConfig sc) {
		System.out.println("RegisterServlet-Init()");
	}

	@Override
	protected void service(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
		System.out.println("RegisterServlet-Service()");

		String fn = req.getParameter("fname");
		String ln = req.getParameter("lname");
		String em = req.getParameter("email");
		String ph = req.getParameter("phone");
		String ge = req.getParameter("gender");
		String ct = req.getParameter("ctype");
		String cno = req.getParameter("cnum");
		String co[] = req.getParameterValues("color");
		String un = req.getParameter("uname");
		String pw = req.getParameter("pword");

		System.out.println(fn);
		System.out.println(ln);
		System.out.println(em);
		System.out.println(ph);
		System.out.println(ge);
		System.out.println(ct);
		System.out.println(cno);
		System.out.println(un);
		System.out.println(pw);

		for(int i=0;i<co.length;i++) {
			System.out.println(co[i]);
		}
		
		PrintWriter out = resp.getWriter();
		out.println("<html>");
		out.println("<body>");
		out.println("<center>");
		out.println("<h1>Best BookStore</h1>");
		out.println("<h2>Hi" + fn +" "+ln+"Your Registration is Successful</h2>");
		out.println("<h1>Best BookStore HomePage</h1>");
		out.println("</center>");
		out.println("</body></html>");
	}

	public void destroy() {
		System.out.println("RegisterServlet-destroy()");
	}
}
