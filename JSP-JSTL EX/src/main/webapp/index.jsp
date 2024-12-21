<%@taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<title>JSTL Exmaple</title>
</head>
<body>
	<h1>This is JSTL Example</h1>

	<!--1. out tag:  -->

	<!-- 2.set tag:  -->

	<c:set var="i" value="10" scope="application"></c:set>

	<h1>
		<c:out value="${i}"></c:out>
	</h1>

	<!-- 3.remove tag:  -->

	<!-- <c:remove var="i"/> -->
	<h1>
		<c:out value="${i}">Value removed using remove tag. </c:out>
	</h1>

	<hr>

	<!-- 4. if tag: test condition : true => print... -->

	<c:if test="${i== 10}">
		<h1>Yes, i is (23) and condition is true</h1>
	</c:if>

	<!-- 5. choose, when, otherwise: java switch -->

	<c:choose>
		<c:when test="${i>0}">
			<h1>this is my case 1st</h1>
			<h1>No. is +ve</h1>
		</c:when>

		<c:when test="${i<0}">
			<h1>this is my case 2nd</h1>
			<h1>No. is -ve</h1>
		</c:when>

		<c:otherwise>
			<h1>this is default case.. otherwise</h1>
			<h1>No. is ZERO</h1>
		</c:otherwise>
	</c:choose>

	<!-- 6. forEach tag: for repeating and traversing elements -->

	<c:forEach var="j" begin="1" end="10">
		<h2>
			Hey
			<c:out value="${j}">Value of j is </c:out>
		</h2>
	</c:forEach>

	<!-- 7. redirect tag -->
	
	<!-- 7. url, param tag -->
	
	<%-- <c:url var="myurl" value="https://www.google.com/search">
	<c:param name="q" value="Kia automobile wikipedia"></c:param>
	</c:url> --%>
	
<%-- 	<h1><c:out value="${myurl }"></c:out></h1>
	
	<c:redirect url="${myurl }"></c:redirect>
 --%>
</body>
</html>