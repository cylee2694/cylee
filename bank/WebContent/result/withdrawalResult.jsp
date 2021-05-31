<%@ page language="java" contentType="text/html; charset=EUC-KR"
    pageEncoding="EUC-KR"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="EUC-KR">
<title>Insert title here</title>
</head>
<body>
<%
	String result = (String)request.getAttribute("result");
	if(result == null){
%>
	${id }/${money }/${tMoney }
	<%}else{
		out.print(result);
	}
	
	%>
	<p>
	<%@ include file="homeMenu.jsp" %>
</body>
</html>