<%@ page language="java" contentType="text/html; charset=EUC-KR"
    pageEncoding="EUC-KR"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="EUC-KR">
<title>Join Page</title>
</head>
<body>
	<form action="join.do" method="post"> <%-- join.do --> FrontController로 보냄 --%>
		ID:<input type="text" name="id" /><br>
		Password:<input type="password" name="pwd" /><br>
		<input type="submit" value="JOIN" /><br>
	</form>
</body>
</html>