<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
<%@ page language="java" contentType="text/html; charset=UTF-8" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
	<title>Home</title>
</head>
<body>
<h1>
	Hello world!  
</h1>
<a href="<c:url value='/board/list'/>" >게시물 목록</a> <br/>
<P>  The time on the server is ${serverTime}. </P>
</body>
</html>
