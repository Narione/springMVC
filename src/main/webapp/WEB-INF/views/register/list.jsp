<%--
  Created by IntelliJ IDEA.
  User: user
  Date: 2024-05-13
  Time: 오후 5:14
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<html>
<head>
    <title>회원 목록</title>
</head>
<body>
    <table>
        <tr>
            <th>아이디</th>
            <th>이메일</th>
            <th>이름</th>
            <th>가입일자</th>
        </tr>
        <c:forEach items="${members}" var="member">
            <tr>
                <td>${member.id}</td>
                <td>${member.email}</td>
                <td>${member.name}</td>
                <td>${member.createDate}</td>
            </tr>
        </c:forEach>
    </table>
</body>
</html>
