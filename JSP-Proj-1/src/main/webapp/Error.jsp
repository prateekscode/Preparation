<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>

<%@ page isErrorPage="true"%>

<!-- taglib directive -->

<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<title>Sorry! Something went wrong..</title>

<style>
*{
padding: 0px;
margin: 0px;
}
</style>

</head>
<body>
	<div style="padding: 20px; color: blue; background: #e2e2e2;">
		<h1>Sorry! Something went wrong..</h1>
		<br>
		<p><%=exception %></p>
	</div>
</body>
</html>