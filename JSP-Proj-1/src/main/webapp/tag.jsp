<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@taglib uri="/WEB-INF/mylib.tld" prefix="t" %>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<title>JSP TAGS</title>
</head>
<body>
<h1>Hello Everyone!</h1>
<t:mytag></t:mytag>
<t:printTable number="10" color="red"></t:printTable>
<t:printTable number="5" color="blue"></t:printTable>
<t:printTable number="18" color="yellow"></t:printTable>
<t:printTable number="17" color="green"></t:printTable>

<!-- JSP implicit objects -->
<%
out.println("This is implicit object");

request.getParameter("");

response.sendRedirect("");

// config(ServletConfig); 

// application(ServletContext);

out.println(session.isNew());

session.setAttribute("name", 22);

//page: current jsp page:
	
//exception : Throwable....

//pageContext: PageContext
%>

</body>
</html>