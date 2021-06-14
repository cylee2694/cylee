<%@ page language="java" contentType="text/html; charset=EUC-KR"
    pageEncoding="EUC-KR"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="EUC-KR">
<title>Insert title here</title>
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
</style>
</head>
<body>
	<form action="register.do" method="post" class="loginForm">
		<h1>Type Book Info</h1>
		Name:<input type="text" name="name" /><br>
		Publisher:<input type="text" name="publisher" /><br>
		Author:<input type="text" name="author" /><br>
		Stock:<input type="text" name="stock" /><br>
		<p></p>
		<input type="submit" value="Register" />
	</form>
</body>
</html>