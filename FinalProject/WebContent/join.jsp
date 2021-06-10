<%@ page language="java" contentType="text/html; charset=EUC-KR"
    pageEncoding="EUC-KR"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="EUC-KR">
<title>회원가입 페이지</title>
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
  height:300px;
  padding: 30px, 20px;
  background-color:#FFFFFF; 
  text-align:center;
  top:50%;
  left:50%;
  transform: translate(-50%,-50%);
  border-radius: 15px;
}

.loginForm h2{
  text-align: center;
  margin: 30px;
}

.idForm{
  border-bottom: 2px solid #adadad;
  margin: 30px;
  padding: 10px 10px;
}

.passForm{
  border-bottom: 2px solid #adadad;
  margin: 30px;
  padding: 10px 10px;
}

.id {
  width: 100%;
  border:none;
  outline:none;
  color: #636e72;
  font-size:16px;
  height:25px;
  background: none;
}

.pw {
  width: 100%;
  border:none;
  outline:none;
  color: #636e72;
  font-size:16px;
  height:25px;
  background: none;
}

.btn {
  position:relative;
  left:40%;
  transform: translateX(-50%);
  margin-bottom: 40px;
  width:80%;
  height:40px;
  background: linear-gradient(125deg,#81ecec,#6c5ce7,#81ecec);
  background-position: left;
  background-size: 200%;
  color:white;
  font-weight: bold;
  border:none;
  cursor:pointer;
  transition: 0.4s;
  display:inline;
}

.btn:hover {
  background-position: right;
}

.bottomText {
  text-align: center;
}

</style>
</head>
<body>
	<form action="join.do" method="post" class="loginForm">
		<h1>Welcome!</h1>
		<div class="idForm">
        <input type="text" name="id" class="id" placeholder="ID">
      </div>
      <div class="passForm">
        <input type="password" name="pwd" class="pw" placeholder="PW">
      </div>
      <button type="submit" class="btn">Join</button>
	</form>
	
</body>
</html>