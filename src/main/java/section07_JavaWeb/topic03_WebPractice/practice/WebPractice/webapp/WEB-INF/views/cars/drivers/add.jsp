<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>Add driver to car</title>
    <link rel="stylesheet" type="text/css"
          href="${pageContext.request.contextPath}/resources/css/styles.css"/>
    <link href="https://fonts.googleapis.com/css?family=Roboto" rel="stylesheet">
</head>
<body>
<h1>Add driver to car</h1>
<form method="POST" action="${pageContext.request.contextPath}/cars/drivers/add">
    <label>Car</label>
    <select id="car" name="car_id" required>
        <c:forEach var="car" items="${cars}">
            <option value="${car.id}">${car.model}</option>
        </c:forEach>
    </select>
    <label>Driver</label>
    <select id="driver" name="driver_id" required>
        <c:forEach var="driver" items="${drivers}">
            <option value="${driver.id}">${driver.name}</option>
        </c:forEach>
    </select>
    <button type="submit">Confirm</button>
</form>
<button class="back" onclick="history.back()">Go back</button>
</body>
</html>
