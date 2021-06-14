<%@ page language="java" contentType="text/html; charset=EUC-KR"
    pageEncoding="EUC-KR"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="EUC-KR">
<title>도서 반납</title>
<style>
body {
  background-color:#A9BCF5;
}
.loginForm {
  position:absolute;
  width:300px;
  height:450px;
  padding: 30px, 20px;
  background-color:#FFFFFF;
  text-align:center;
  top:50%;
  left:50%;
  transform: translate(-50%,-50%);
  border-radius: 15px;
}
.margin{
	margin-top: 10px;
}
</style>
</head>
<body>
	<form action="returnBook.do" method="post" class="loginForm">
		<h1>Type Book Name to Return</h1>
		<input type="text" name="name" /><br>
		<input type="submit" value="Return" class="margin" />
	</form>
</body>
</html>