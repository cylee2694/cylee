<%@ page language="java" contentType="text/html; charset=EUC-KR"
    pageEncoding="EUC-KR"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="EUC-KR">
<title>Insert title here</title>
</head>
<body>
	Subject<br>
	<form action="EnrollSubject.do" method="post">
	ID: <input type="text" name="id" />
	<input type="submit" value="search" /><br>
	</form>
	${subName }
	<form action="EnrollSubject2.do" method="post">
		<input type="submit" value="enroll" /><br>
	</form>
	<%@ include file = "/result/homeMenu2.jsp" %>
</body>
</html>