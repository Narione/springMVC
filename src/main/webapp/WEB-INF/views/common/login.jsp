<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>회원 로그인</title>
<style>
	label {
		display: block;
	}
	#log {
		color: red;
	}
</style>
</head>
<body>
<h2>로그인</h2>
<form action="/login" method="post">
	<label>아이디:
		<input type="text" name="id" value="${cookie.savedId.value }" placeholder="ID를 입력하세요.">
	</label>
	<label>패스워드:
		<input type="password" name="password" placeholder="패스워드를 입력하세요.">
	</label>
	<label>
		<input type="checkbox" name="saveId" value="true"> 아이디 저장
	</label>
	<div id="log">${msg}</div>
	<button type="submit">로그인</button>
	<button type="button">취소</button>
</form>
</body>
</html>