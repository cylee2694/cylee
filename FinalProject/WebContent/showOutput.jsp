<%@ page language="java" contentType="text/html; charset=EUC-KR"
    pageEncoding="EUC-KR"%>
    <%@ page import="java.util.ArrayList" %>
    <%@ page import="lib.vo.Borrow" %>
<!DOCTYPE html>
<html>
<head>
<meta charset="EUC-KR">
<title>대출 현황</title>
<style>
body {
  background-color:#A9BCF5;
}
.margin {
	margin: 30px 0 0 10px;
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
<%
	ArrayList<Borrow> list = (ArrayList<Borrow>)request.getAttribute("list");
	
	if(!list.isEmpty()){ %>
		<div class="loginForm">
		<h3>Borrow Condition</h3>
		<table border="1" class="margin">
			<tr><th>대출자</th><th>도서명</th><th>대출 날짜</th>
			
<% 
	for(int i=0; i<list.size(); i++){
		Borrow borrow = list.get(i); %>
		
		<tr><td><%= borrow.getBorrower() %></td>
			<td><%= borrow.getBname() %></td>
			<td><%= borrow.getTime() %></td>
		</tr>
<% }
	}else{
		out.print("대출 현황이 존재하지 않습니다.");
	}
%>
		</table>
		<%@ include file="home.jsp" %>
		</div>

</body>
</html>