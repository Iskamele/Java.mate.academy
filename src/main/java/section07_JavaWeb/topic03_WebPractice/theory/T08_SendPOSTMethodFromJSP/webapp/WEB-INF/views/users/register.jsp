<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>Registration</title>
</head>
<body>
<h1>Please the form below</h1>
<form method="post" action="${pageContext.request.contextPath}/users/register">
    Username <input type="text" name="username"><br>
    Password <input type="password" name="password"><br>
    Repeat password <input type="password" name="repeat_password"><br>
    <button type="submit">Confirm</button>
</form>
</body>
</html>
