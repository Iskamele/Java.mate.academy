<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%@ page contentType="text/html;charset=UTF-8" %>
<html>
<head>
    <title>index page</title>
</head>
<c:if test="${user.role == 'admin'}">
    <%@include file="headers/adminHeader.jsp" %>
</c:if>
<c:if test="${user.role == 'user'}">
    <%@include file="headers/userHeader.jsp" %>
</c:if>
<body>
<h1>Welcome to internet shop!</h1>
</body>
</html>
