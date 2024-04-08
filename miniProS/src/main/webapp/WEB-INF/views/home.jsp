<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
<%@ page language="java" contentType="text/html; charset=UTF-8" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
	<title>Home</title>
	<%@ include file="/WEB-INF/views/include/css.jsp" %>
    <%@ include file="/WEB-INF/views/include/js.jsp" %>
</head>
<body>
<%@ include file="/WEB-INF/views/include/header.jsp" %>
<h1>
	Hello world!  
</h1>
<a href="<c:url value='/member/loginForm'/>" >로그인 양식</a> <br/>
<a href="<c:url value='/board/list'/>" >게시물 목록</a> <br/>
<P>  The time on the server is ${serverTime}. </P>
<%@ include file="/WEB-INF/views/include/footer.jsp" %>
</body>
</html>
