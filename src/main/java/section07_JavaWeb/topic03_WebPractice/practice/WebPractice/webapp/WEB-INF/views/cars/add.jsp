<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>Create a car</title>
    <link rel="stylesheet" type="text/css"
          href="${pageContext.request.contextPath}/resources/css/styles.css"/>
    <link href="https://fonts.googleapis.com/css?family=Roboto" rel="stylesheet">
</head>
<body>
<h1>Create a car</h1>
<form method="POST" action="${pageContext.request.contextPath}/cars/add">
    <label>Model</label> <input type="text" name="model" required pattern="[a-zA-Z0-9\s]+"
                                title="The input can only contain letters, numbers and/or spaces.">
    <label>Manufacturer</label>
    <select id="manufacturer" name="manufacturer_id" required>
        <c:forEach var="manufacturer" items="${manufacturers}">
            <option value="${manufacturer.id}">${manufacturer.name}</option>
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