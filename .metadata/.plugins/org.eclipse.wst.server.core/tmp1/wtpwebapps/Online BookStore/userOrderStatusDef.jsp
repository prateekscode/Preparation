<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<%@taglib prefix="lib" uri="/WEB-INF/tlds/Libindia.tld"%>
<%@taglib prefix="core" uri="http://java.sun.com/jsp/jstl/core"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<title>Lib Book Store</title>
<link rel="stylesheet" type="text/css"
	href="<%=request.getContextPath()%>/css/indexstyle.css">
</head>
<body bgcolor="#lightgray">
	<lib:validateSession />
	<lib:removeSearchInfoFromSessionTag />
	<core:if test="${USER_TO.role ne 'User'}">
		<jsp:forward page="userHomeDef.jsp"></jsp:forward>
	</core:if>
	<table width="90%" align="center" height="97%">
		<tr height="5px" valign="top">
			<td align="center"><jsp:include page="/header.jsp"></jsp:include>
			</td>
		</tr>
		<tr valign="top" bgcolor="orange" height="3px">
			<td align="center"><jsp:include page="/userMenu.jsp"></jsp:include>
			</td>
		</tr>
		<tr valign="top">
			<td align="center"><jsp:include page="/userOrderStatus.jsp"></jsp:include>
			</td>
		</tr>
		<tr valign="bottom" height="2px">
			<td align="center"><jsp:include page="/footer.html"></jsp:include>
			</td>
		</tr>
	</table>
</body>
</html>