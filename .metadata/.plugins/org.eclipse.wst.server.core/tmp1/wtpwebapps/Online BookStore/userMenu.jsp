<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<%@taglib prefix="Lib" uri="/WEB-INF/tlds/Libindia.tld"%>
<%@taglib prefix="core" uri="http://java.sun.com/jsp/jstl/core"%>
<%@page isELIgnored="false"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<link rel="stylesheet" type="text/css"
	href="<%=request.getContextPath()%>/css/Libindia.css">
<link rel="stylesheet" type="text/css"
	href="<%=request.getContextPath()%>/css/indexstyle.css">
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<title>User Menu</title>
</head>
<body>
	<center>
		<table class="textStyle" width="95%">
			<tr>
				<td><font color="green"><b>Welcome &nbsp;<font
							color="red"> ${USER_TO.firstName} &nbsp;
								${USER_TO.middleName} &nbsp; ${USER_TO.lastName} </font>[${USER_TO.role}]
					</b></font></td>
				<td><a href="userHomeDef.jsp">Home</a></td>
				<core:if test="${USER_TO.role eq 'Admin'}">
					<td><a href="addBookDef.jsp">Add Book</a></td>
				</core:if>

				<td><a href="searchBookDef.jsp">Search Book</a></td>
				<core:if test="${USER_TO.role eq 'User'}">
					<td><a href="userorderstatus.lib">My Order Status</a></td>
				</core:if>

				<core:if test="${USER_TO.role eq 'Admin'}">
					<td><a href="allorders.lib">Display Orders</a></td>
				</core:if>

				<td><a href="detailsDef.jsp">View Details</a></td>
				<td><a href="changePasswordDef.jsp">ChangePassword</a></td>

				<td><a href="logout.lib">Logout</a></td>
			</tr>
		</table>
	</center>
</body>
</html>