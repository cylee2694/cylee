<%@ page language="java" contentType="text/html; charset=EUC-KR"
    pageEncoding="EUC-KR"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="EUC-KR">
<title>Insert title here</title>
</head>
<body>
	<form action="login.do" method="post"> 
		ID:<input type="text" name="id" /><br>
		Password:<input type="password" name="pwd" /><br>
		<input type="radio" name="name" value="prof" />Professor<br>
		<input type="radio" name="name" value="stud" />Student<br>
		<input type="submit" value="LOGIN" /><br>
	</form>
</body>
</html>