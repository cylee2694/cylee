<%@ page language="java" contentType="text/html; charset=EUC-KR"
    pageEncoding="EUC-KR"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="EUC-KR">
<title>Insert title here</title>
</head>
<body>
	<h3>Subject</h3><br>
	<form action="RegisterSubject.do" method="post">
		ID: <input type="text" name="id" /><br>
		Title: <input type="text" name="title" /><br>
		Number of Student: <input type="text" name="num" /><br>
		<input type= "submit" value="register" />
	</form>
</body>
</html>