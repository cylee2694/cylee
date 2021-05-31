<%@ page language="java" contentType="text/html; charset=EUC-KR"
    pageEncoding="EUC-KR"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="EUC-KR">
<title>Insert title here</title>
</head>
<body>
	<form action="search.do" method="post">
		Receiver ID:<input type="text" name="id" /><br>
		<input type="submit" value="SEARCH" /><br>
	</form>
	
	<%
		String result = (String)request.getAttribute("msg");
		
		
		if(result != null && result.equals("true")){
	%>
	
		<form action="transfer.do" method="post">
		Receiver ID: <input type = "text" readonly name="rId" value="${rId }" /><br>
		MONEY:<input type="text" name="money" /><br>
		<input type="submit" value="Transfer" /><br>
		</form>
	<%}else{
		out.print("No receiver ID");	
	}
		%>
</body>
</html>