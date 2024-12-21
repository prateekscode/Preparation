package com.india;

import java.io.IOException;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;


public class S1 extends HttpServlet {

	protected void service(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
		String n1=req.getParameter("n1");
		String n2=req.getParameter("n1");
		
		int nn1=Integer.parseInt(n1);
		int nn2=Integer.parseInt(n2);
		
		int s=nn1+nn2;
		System.out.println("S1 service");
		req.setAttribute("sum", s);
		
		//forwarding req using dispatcher
		RequestDispatcher rd=req.getRequestDispatcher("s2");
		rd.forward(req, resp);
	}
	
}
