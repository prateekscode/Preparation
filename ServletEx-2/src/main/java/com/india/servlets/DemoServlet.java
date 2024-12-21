package com.india.servlets;

import java.io.IOException;
import java.io.PrintWriter;
import java.util.Enumeration;
import java.util.Locale;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

public class DemoServlet extends HttpServlet{
	@Override
	protected void service(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
		String un=req.getParameter("uname");
		
		PrintWriter out=resp.getWriter();
		out.println("<h1>Username: "+un+"</h1>");
		
		Enumeration e=req.getHeaderNames();
		
		while(e.hasMoreElements()) {
			String hn=e.nextElement().toString();
			String hv=req.getHeader(hn);
			out.println("<h1>"+hn+" : "+hv+"</h1>");
		}
		
		out.println("<h1>req.getLocale(): "+req.getLocale()+"</h1>");
		out.println("<h1>All the locales supported</h1>");
		
		Enumeration locs=req.getLocales();
		while(locs.hasMoreElements()) {
			Locale l=(Locale)locs.nextElement();
			out.println("<h1>"+l+"</h1>");
		}
		
		out.println("<h1>req.getMethod(): "+req.getMethod()+"</h1>");
		out.println("<h1>req.getRequestURI(): "+req.getRequestURI()+"</h1>");
		out.println("<h1>req.getRequestURL(): "+req.getRequestURL()+"</h1>");
		out.println("<h1>req.getProtocol(): "+req.getProtocol()+"</h1>");
		out.println("<h1>req.getScheme(): "+req.getScheme()+"</h1>");
		out.println("<h1>req.getCharacterEncoding(): "+req.getCharacterEncoding()+"</h1>");
		out.println("<h1>req.getContentLength(): "+req.getContentLength()+"</h1>");
		out.println("<h1>req.getContentType(): "+req.getContentType()+"</h1>");
		out.println("<h1>req.getPathInfo(): "+req.getPathInfo()+"</h1>");
		out.println("<h1>req.getPathTranslated(): "+req.getPathTranslated()+"</h1>");
		out.println("<h1>req.getRemoteAddr(): "+req.getRemoteAddr()+"</h1>");
		out.println("<h1>req.getRemotePort(): "+req.getRemotePort()+"</h1>");
		out.println("<h1>req.getRemoteHost(): "+req.getRemoteHost()+"</h1>");
		out.println("<h1>req.getLocalAddr(): "+req.getLocalAddr()+"</h1>");
		out.println("<h1>req.getLocalPort(): "+req.getLocalPort()+"</h1>");
		out.println("<h1>req.getLocalName(): "+req.getLocalName()+"</h1>");
		out.println("<h1>req.getServerPort(): "+req.getServerPort()+"</h1>");
		out.println("<h1>req.getServerName(): "+req.getServerName()+"</h1>");
		out.println("<h1>req.getQueryString(): "+req.getQueryString()+"</h1>");
		out.println("<h1>req.getServletPath(): "+req.getServletPath()+"</h1>");
		out.println("<h1>req.getContextPath(): "+req.getContextPath()+"</h1>");
		out.println("<h1>req.getRemoteUser(): "+req.getRemoteUser()+"</h1>");
		out.println("<h1>req.getUserPrincipal(): "+req.getUserPrincipal()+"</h1>");
		out.println("<h1>req.getAuthType(): "+req.getAuthType()+"</h1>");
		
	}
}
