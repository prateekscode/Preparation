<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<%@taglib prefix="Lib" uri="/WEB-INF/tlds/Libindia.tld"%>
<%@taglib prefix="core" uri="http://java.sun.com/jsp/jstl/core"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<link rel="stylesheet" type="text/css"
	href="<%=request.getContextPath()%>/css/Libindia.css">
<link rel="stylesheet" type="text/css"
	href="<%=request.getContextPath()%>/css/main.css">
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
</head>
<body>
	<center>
		<form action=register.lib method="post">
			<table class="textStyle">
				<tr>
					<td align="center" colspan="3"><font size="7"><b>Register
								New User</b></font></td>
				</tr>
				<tr>
					<td align="center" colspan="3"><font size="4" color="red"><b>
								<Lib:error property="registrationError" />
						</b></font></td>
				</tr>
				<tr>
					<td><br /></td>
				</tr>
				<core:if test="${REGISTERED ne 'OK'}">
					<tr>
						<td><font size="5"><b>First Name</b></font></td>
						<td><input type="text" id="fname"
							style="color: black; background-color: #b4e0d2; font-size: 25"
							name="fname"></td>
						<td><font size="4" color="red"><b><Lib:error
										property="fname" /></b></font></td>
					</tr>
					<tr>
						<td><font size="5"><b>Middle Name</b></font></td>
						<td><input type="text" id="mname"
							style="color: black; background-color: #b4e0d2; font-size: 25"
							name="mname"></td>
						<td><font size="4" color="red"><b><Lib:error
										property="mname" /></b></font></td>
					</tr>
					<tr>
						<td><font size="5"><b>Last Name</b></font></td>
						<td><input type="text" id="lname"
							style="color: black; background-color: #b4e0d2; font-size: 25"
							name="lname"></td>
						<td><font size="4" color="red"><b><Lib:error
										property="lname" /></b></font></td>
					</tr>
					<tr>
						<td><font size="5"><b>Email</b></font></td>
						<td><input type="text" id="email"
							style="color: black; background-color: #b4e0d2; font-size: 25"
							name="email"></td>
						<td><font size="4" color="red"><b><Lib:error
										property="email" /></b></font></td>
					</tr>
					<tr>
						<td><font size="5"><b>Phone</b></font></td>
						<td><input type="text" id="phone"
							style="color: black; background-color: #b4e0d2; font-size: 25"
							name="phone"></td>
						<td><font size="4" color="red"><b><Lib:error
										property="phone" /></b></font></td>
					</tr>
					<tr>
						<td><font size="5"><b>Gender</b></font></td>
						<td><input type="radio" value="Male" name="gender"> <font
							size="5"><b>Male</b></font> <input type="radio" value="Female"
							name="gender"> <font size="5"><b>Female</b></font></td>

						<td><font size="4" color="red"><b><Lib:error
										property="gender" /></b></font></td>
					</tr>
					<tr>
						<td><font size="5"><b>Username</b></font></td>
						<td><input type="text" id="uname"
							style="color: black; background-color: #b4e0d2; font-size: 25"
							name="uname"></td>
						<td><font size="4" color="red"><b><Lib:error
										property="uname" /></b></font></td>
					</tr>
					<tr>
						<td><font size="5"><b>Password</b></font></td>
						<td><input type="password" id="pass"
							style="color: black; background-color: #b4e0d2; font-size: 25"
							name="pass"></td>
						<td><font size="4" color="red"><b><Lib:error
										property="pass" /></b></font></td>
					</tr>
					<tr>
						<td colspan="3" align="center"><br> <input type="submit"
							value="Register Me" id="phone"
							style="color: white; background-color: maroon; font-size: 17"></td>
						<td>
					</tr>
				</core:if>
				<tr>
					<td align="center" colspan="3"><b> <font size="5">Login</font>&nbsp;
							<a href="index.jsp"> <font size="5">Click Here</font>
						</a></b></td>
				</tr>
				<tr>
					<td align="center" colspan="3"><b><font size="5">Forget
								Password</font>&nbsp; <a href="forgetPasswordDef.jsp"> <font
								size="5">Click Here</font></a> </b></td>
				</tr>
			</table>
		</form>
	</center>
</body>
</html>