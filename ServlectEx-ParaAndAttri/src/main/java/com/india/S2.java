package com.india;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;


public class S2 extends HttpServlet {

	protected void service(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
		PrintWriter out=resp.getWriter();
		int nn1=Integer.parseInt(req.getParameter("n1"));
		int nn2=Integer.parseInt(req.getParameter("n2"));
		
		int p=nn1*nn2;
		System.out.println("S2 service");
		//get attribute from req object.
		int sum=(int)req.getAttribute("sum");
		out.println("<html>");
		out.println("<body>");	
		out.println("<h1>");
		out.println("Sum is: "+sum);
		out.println("Product is: "+p);
		out.println("</h1>");
		out.println("</body>");		
		out.println("</html>");
	}
	
}
