<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Access Error</title>
</head>
<body>
	<h2>Access Denied</h2>
	
	<h2 style="color: red;">
		<!-- 
			SPRING_SECURITY_403_EXCEPTION.message는 Access is denied 문자열이 출력된다.
			security-context.xml 에서 security:access-denied-handler 태그 자체로 설정햇을떄 메세지가 출력된다.
		 -->
		SPRING_SECURITY_403_EXCEPTION.message : 
		<c:out value="${SPRING_SECURITY_403_EXCEPTION.message }"/>
	</h2>
	<h2 style="color: red;">
		msg : <c:out value="${msg }"/>
	</h2>
</body>
</html>