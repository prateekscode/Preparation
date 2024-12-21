<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>

<!-- Directive Tag -->
<%@page import="java.util.Random,java.util.ArrayList,java.io.*"%>
<%@page isErrorPage="true"%>
<%@page session="false"%>

<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<title>Insert title here</title>
</head>
<body>

	<h1>JSP Page</h1>
<style>
*{
margin: 0px;
padding: 0px;
}
</style>
	<%@include file="Header.jsp"%>

	<h1>
		Random Number:
		<%
	Random r = new Random();
	int n = r.nextInt(10);
	%>

		<%=n%></h1>

	<!-- Declarative Tag -->
	<%!
	int a = 50;
	int b = 20;
	String s = "Kanpur";

	public int doSum() {
		return a + b;
	}

	public String reverse() {
		StringBuffer ss = new StringBuffer(s);
		return ss.reverse().toString();
	}%>

	<!-- Scriptlet Tag -->
	<%
	out.println(a);
	out.println("<br>");
	out.println(b);
	out.println("<br>");
	out.println("Sum is: " + doSum());
	out.println("<br>");
	out.println("Reversed String: " + reverse());
	%>

	<!-- Expression Tag -->
	<h1>
		Sum is :
		<%=doSum()%></h1>
	<h1><%=a%></h1>
	<%=s%>
</body>
</html>