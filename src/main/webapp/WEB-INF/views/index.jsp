<%@ page contentType="text/html; charset=UTF-8" pageEncoding="UTF-8" %>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<!DOCTYPE html>
<html>
<head>
    <title>Index</title>
</head>
<body>
인사말: ${greeting}
<c:choose>
    <c:when test="${empty sessionScope.member}">
        <p><a href="<c:url value="/login"/>">로그인</a></p>
    </c:when>
    <c:otherwise>
        <p><a href="<c:url value="/logout"/>">로그아웃</a></p>
    </c:otherwise>
</c:choose>
<p><a href="<c:url value="/register/step1"/>">[회원가입으로 이동]</a></p>
<p><a href="<c:url value="/board/list"/>">게시판</a></p>
</body>
</html>