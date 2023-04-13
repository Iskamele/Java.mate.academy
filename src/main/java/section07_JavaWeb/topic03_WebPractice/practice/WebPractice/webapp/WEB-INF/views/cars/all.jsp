<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>All cars</title>
    <link rel="stylesheet" type="text/css"
          href="${pageContext.request.contextPath}/resources/css/styles.css"/>
    <link href="https://fonts.googleapis.com/css?family=Roboto" rel="stylesheet">
</head>
<body>
<h1>All cars</h1>
<table>
    <tr>
        <th>ID</th>
        <th>MODEL</th>
        <th>MANUFACTURER NAME</th>
        <th>MANUFACTURER COUNTRY</th>
        <th>DRIVERS</th>
        <th>DELETE</th>
    </tr>
    <c:forEach items="${cars}" var="car">
        <tr>
            <td><c:out value="${car.id}"/></td>
            <td><c:out value="${car.model}"/></td>
            <td><c:out value="${car.manufacturer.name}"/></td>
            <td><c:out value="${car.manufacturer.country}"/></td>
            <td><c:forEach items="${car.drivers}" var="driver">
                <c:out value="${driver.name}"/><br>
            </c:forEach></td>
            <td>
                <a href="${pageContext.request.contextPath}/cars/delete?id=${car.id}">delete</a>
            </td>
        </tr>
    </c:forEach>
</table>
<button class="back" onclick="location.href='${pageContext.request.contextPath}/index'">Go home page
</button>
</body>
</html>