<%@taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
<%@taglib uri="http://java.sun.com/jsp/jstl/functions" prefix="fn"%>

<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<title>JSTL Exmaple</title>
</head>
<body>
	<h1>This page is all about functions tag</h1>
	
	<c:set var="k" value="Jstl function tags"></c:set>
	<h2><c:out value="${k }"></c:out></h2>

	<h1>Length of heading is <c:out value="${fn:length(k)}"></c:out></h1>
	
	<h1><c:out value="${fn:toUpperCase(k) }"></c:out></h1>
	<h2><c:out value="${fn:contains(k,'tags')}"></c:out></h2>
</body>
</html>