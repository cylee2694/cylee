<%@ page language="java" contentType="text/html; charset=EUC-KR"
    pageEncoding="EUC-KR"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="EUC-KR">
<title>Insert title here</title>
</head>
<body>
	${id }: logout complete!
	<%
		session.invalidate();
	%>
	<p>
	<%@ include file = "home.jsp" %>
</body>
</html>