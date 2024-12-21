package com.jlc.servlets;

import java.io.IOException;
import java.io.Writer;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

public class LoginServlet extends HttpServlet {
	protected void service(HttpServletRequest req, HttpServletResponse res) throws ServletException, IOException {
		String unm = req.getParameter("uname");
		String pwd = req.getParameter("pword");
		String msg = "";

		if (unm.equals(pwd)) {
			msg = "<h1>Login Success<br/> Welcome to HomePage";
		} else {
			msg = "<h1>Login Failed<br/> Invalid Username or Password";
		}

		Writer out = res.getWriter();
		out.write(msg);
	}
}
