<%@ page language="java" contentType="text/html; charset=EUC-KR"
    pageEncoding="EUC-KR"%>
    <%@ page import="java.util.ArrayList" %>
    <%@ page import="lib.vo.Borrow" %>
<!DOCTYPE html>
<html>
<head>
<meta charset="EUC-KR">
<title>���� ��Ȳ</title>
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
			<tr><th>������</th><th>������</th><th>���� ��¥</th>
			
<% 
	for(int i=0; i<list.size(); i++){
		Borrow borrow = list.get(i); %>
		
		<tr><td><%= borrow.getBorrower() %></td>
			<td><%= borrow.getBname() %></td>
			<td><%= borrow.getTime() %></td>
		</tr>
<% }
	}else{
		out.print("���� ��Ȳ�� �������� �ʽ��ϴ�.");
	}
%>
		</table>
		<%@ include file="home.jsp" %>
		</div>

</body>
</html>