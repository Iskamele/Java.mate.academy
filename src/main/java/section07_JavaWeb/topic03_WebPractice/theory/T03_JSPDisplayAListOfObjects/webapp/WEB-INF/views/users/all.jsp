<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>Get all users</title>
</head>
<body>
<h1>List of users:</h1>
<table>
    <tr>
        <td>ID</td>
        <td>NAME</td>
        <td>AGE</td>
    </tr>
    <c:forEach items="${users}" var="user">
        <tr>
            <td><c:out value="${user.id}"/></td>
            <td><c:out value="${user.name}"/></td>
            <td><c:out value="${user.age}"/></td>
        </tr>
    </c:forEach>
</table>
</body>
</html>
