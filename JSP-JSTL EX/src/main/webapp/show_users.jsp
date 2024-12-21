<%@taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
<%@taglib uri="http://java.sun.com/jsp/jstl/functions" prefix="fn"%>
<%@taglib uri="http://java.sun.com/jsp/jstl/sql" prefix="sql"%>

<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<title>Users Page</title>
</head>
<body>
	<h1>All users are:</h1>

	<sql:setDataSource driver="com.mysql.jdbc.Driver"
		url="jdbc:mysql://localhost:3306/dummy" password="prateek" var="ds" />
	<sql:query dataSource="${ds}" var="rs">select * from emp;</sql:query>

	<table>
		<tr>
			<td>User Id</td>
			<td>UserName</td>
			<td>Sal</td>
			<td>Dept</td>
		</tr>

		<c:forEach items="${rs.rows}" var="row">
			<tr>
				<td><c:out value="${row.id}"></c:out></td>
				<td><c:out value="${row.name}"></c:out></td>
				<td><c:out value="${row.sal}"></c:out></td>
				<td><c:out value="${row.dept}"></c:out></td>
			</tr>
		</c:forEach>
	</table>
</body>
</html>