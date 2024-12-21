<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>

<%@ page errorPage="Error.jsp"%>


<!-- taglib directive -->
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>

<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<title>Taglib Example</title>
</head>
<body>
	<h1>Taglib directive tutorial:</h1>
	<hr>
	<c:set var="name" value="TagLib"></c:set>
	<c:out value="${name}"></c:out>
	
	<%!int n1=22;
	int n2=10;
	String content=null;
	%>
	
	<%
	int div=n1/n2;
	%>
	
	<h1>Division= <%=div %></h1>
	<h1> <%=content.length() %></h1>
	
	<c:out value="${34+56}"></c:out>
	<c:if test="${3>2}">
		<h2>this is true 3>2</h2>
	</c:if>

</body>
</html>