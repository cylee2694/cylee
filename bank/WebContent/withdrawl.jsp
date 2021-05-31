<%@ page language="java" contentType="text/html; charset=EUC-KR"
    pageEncoding="EUC-KR"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="EUC-KR">
<title>Insert title here</title>
</head>
<body>
	
	Total Money: ${money }
	<p>
	<form action="withdrawal.do" method="post">
		MONEY:<input type="text" name="money" /><br>
		<input type="submit" value="WITHDRAWAL" /><br>
	</form>
</body>
</html>