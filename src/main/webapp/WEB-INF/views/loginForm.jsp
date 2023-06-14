<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
<%@taglib uri="http://www.springframework.org/security/tags" prefix="sec" %>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Login Form</title>
</head>
<body>
	<h1>Login Form</h1>
	
	<h2 style="">
		<c:out value="${error }"/>
		<c:out value="${logout }"/>
	</h2>
	
	<form action="/login" method="post">	
		이름 : <input type="text" name="username" value="admin"><br>
		비밀번호 : <input type="text" name="password" value="admin"><br>
		<input type="submit" value="렛츠고">
		<sec:csrfInput/>
	</form>
	<!-- '정재균은 바보다' is true -->
</body>
</html>