<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>All drivers</title>
    <link rel="stylesheet" type="text/css"
          href="${pageContext.request.contextPath}/resources/css/styles.css"/>
    <link href="https://fonts.googleapis.com/css?family=Roboto" rel="stylesheet">
</head>
<body>
<h1>All drivers</h1>
<table>
    <tr>
        <th>ID</td>
        <th>NAME</th>
        <th>LICENSE NUMBER</th>
        <th>DELETE</th>
    </tr>
    <c:forEach items="${drivers}" var="driver">
        <tr>
            <td><c:out value="${driver.id}"/></td>
            <td><c:out value="${driver.name}"/></td>
            <td><c:out value="${driver.licenseNumber}"/></td>
            <td>
                <a href="${pageContext.request.contextPath}/drivers/delete?id=${driver.id}">delete</a>
            </td>
        </tr>
    </c:forEach>
</table>
<button class="back" onclick="location.href='${pageContext.request.contextPath}/index'">Go home page
</button>
</body>
</html>
