<%@ page language="java" contentType="text/html; charset=EUC-KR"
    pageEncoding="EUC-KR"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="EUC-KR">
<title>일반회원 메뉴</title>
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
.margin {
	margin-top: 10px;
	margin-left: 200px;
}
</style>
</head>
<body>
	<div class="loginForm">
		<h1>Select Menu</h1>
		<p></p>
		<a href="searchBook3.jsp">Search Book</a><br>
		<a href="borrowBook.jsp">Borrow Book</a><br>
		<a href="returnBook.jsp">Return Book</a><br>
		<a href="logoutResult.jsp" class="margin">Logout</a>
	</div>
</body>
</html>