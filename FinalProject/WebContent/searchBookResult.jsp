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
.margin {
	margin: 30px 0 0 50px;
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
		<div class="loginForm">
		<h3>Book Info</h3>
		<table border="1" class="margin">
			<tr><th>도서명</th><th>출판사</th><th>저자</th><th>재고</th>
			
			<tr><td>${name }</td>
				<td>${pub }</td>
				<td>${auth }</td>
				<td>${stck }</td>
			</tr>
		</table>
		<%@ include file="home.jsp" %>
		</div>

</body>
</html>