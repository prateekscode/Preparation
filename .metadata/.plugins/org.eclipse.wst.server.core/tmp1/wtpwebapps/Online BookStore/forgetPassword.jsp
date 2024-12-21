<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<%@taglib prefix="jlc" uri="/WEB-INF/tlds/jlcindia.tld"%>
<%@taglib prefix="core" uri="http://java.sun.com/jsp/jstl/core"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<link rel="stylesheet" type="text/css"
	href="<%=request.getContextPath()%>/css/jlcindia.css">
<link rel="stylesheet" type="text/css"
	href="<%=request.getContextPath()%>/css/main.css">
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
</head>
<body>
	<center>
		<form action="forgetPassword.jlc" method="post">
			<table class="textStyle">
				<tr>
					<td align="center" colspan="3"><font size="7"><b>Retrieve
								Your Password</b></font></td>
				</tr>
				<tr>
					<td align="center" colspan="3"><font size="4" color="red"><b><jlc:error
									property="forgetPasswordError" /></b></font></td>
				</tr>
				<tr>
					<td><br /></td>
				</tr>
				<core:if test="${PASSWORD eq null}">
					<tr>
						<td align="center" height=""><font size="5"><b>Username</b></font></td>
						<td><input type="text" size="35"
							style="color: black; background-color: #b4e0d2; font-size: 20"
							name="uname"></td>
						<td><font size="4" color="red"><b><jlc:error
										property="uname" /></b></font></td>
					</tr>
					<tr>
						<td colspan="3"><br /></td>
					</tr>
					<tr>
						<td align="center"><font size="5"><b>Email</b></font></td>
						<td><input type="text" size="35"
							style="color: black; background-color: #b4e0d2; font-size: 20"
							;name="email"></td>
						<td><font size="4" color="red"><b><jlc:error
										property="email" /></b></font></td>
					</tr>
					<tr>
						<td align="center" colspan="3"><br /> <input type="submit"
							value="Show Password"
							style="color: white; background-color: maroon; font-size: 17"></td>
					</tr>
					<tr>
						<td align="center" colspan="3"><br /> <font size="5"
							color="red"><b>New User</b></font>&nbsp<a href="registerDef.jsp">
								<font size="5">SignUp Here</font>
						</a></b></td>
					</tr>
				</core:if>
				<core:if test="${PASSWORD ne null }">
					<tr>
						<td align="center" colspan="3"><br /> <font size="5"
							color="green">Your Password is</font> <font size="6" color="red">${PASSWORD}</font>
							</b></td>
					</tr>
				</core:if>
				<tr>
					<td align="center" colspan="3"><b> <font size="5"><b>Login</b></font>&nbsp<a
							href="index.jsp"> <font size="5">Click Here</font></a>
					</b></td>
				</tr>
			</table>
		</form>
	</center>
</body>
</html>