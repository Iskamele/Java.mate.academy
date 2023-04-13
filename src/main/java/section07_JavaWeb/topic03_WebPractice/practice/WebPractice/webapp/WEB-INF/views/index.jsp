<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>Admin panel</title>
    <link rel="stylesheet" type="text/css"
          href="${pageContext.request.contextPath}/resources/css/styles.css"/>
    <link href="https://fonts.googleapis.com/css?family=Roboto" rel="stylesheet">
</head>
<body>
<h1>Hello, %username%!</h1>
<br>
<h2>Create</h2>
<button onclick="location.href='${pageContext.request.contextPath}/drivers/add'">
    Create a driver
</button>
<button onclick="location.href='${pageContext.request.contextPath}/manufacturers/add'">
    Create a
    manufacturer
</button>
<button onclick="location.href='${pageContext.request.contextPath}/cars/add'">Create a
    car
</button>
<br>
<h2>Edit</h2>
<button onclick="location.href='${pageContext.request.contextPath}/cars/drivers/add'">Add a
    driver to car
</button>
<br>
<h2>Display</h2>
<button onclick="location.href='${pageContext.request.contextPath}/drivers'">
    Display all drivers
</button>
<button onclick="location.href='${pageContext.request.contextPath}/manufacturers'">
    Display all manufacturers
</button>
<button onclick="location.href='${pageContext.request.contextPath}/cars'">
    Display all cars
</button>
</body>
</html>
