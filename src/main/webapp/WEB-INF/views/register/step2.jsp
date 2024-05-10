<%--
  Created by IntelliJ IDEA.
  User: user
  Date: 2024-05-10
  Time: 오후 4:01
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>회원 가입</title>
</head>
<body>
<h2>회원 정보 입력</h2>
<form action="step3" method="post">
    <p>
        <label>이메일:
            <input type="email" name="email" id="email" value="${registerRequest.email}">
        </label>
    </p>
    <p>
        <label>이름:
            <input type="text" name="name" id="name" value="${registerRequest.name}">
        </label>
    </p>
    <p>
        <label>비밀번호:
            <input type="password" name="password" id="password" value="${registerRequest.password}">
        </label>
    </p>
    <p>
        <label>비밀번호 확인:
            <input type="password" name="confirmPassword" id="comfirmPassword" value="${registerRequest.confirmPassword}">
        </label>
    </p>
    <input type="submit" value="가입 완료">
</form>
</body>
</html>
