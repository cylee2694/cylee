<%@ page language="java" contentType="text/html; charset=EUC-KR"
    pageEncoding="EUC-KR"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="EUC-KR">
<title>Insert title here</title>
<style>
*{
  margin: 0px;
  padding: 0px;
  text-decoration: none;
  font-family:sans-serif;
  
}

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
	margin: 0 0 0 50px;
}
</style>
</head>
<body>

	<form action="delete.do" method = "post" class="loginForm">
		<h3>Delete Menu</h3><br>
		
		<table border="1" class="margin">
			<tr><th>도서명</th><th>출판사</th><th>저자</th><th>재고</th>
			
			<tr><td>${name }</td>
				<td>${pub }</td>
				<td>${auth }</td>
				<td>${stck }</td>
			</tr>
		</table><br>
	
			<input type="submit" value="Delete" /><br>
			<%@ include file="home.jsp" %>
	</form>

</body>
</html>