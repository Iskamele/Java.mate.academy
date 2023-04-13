<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>Successful</title>
    <link rel="stylesheet" type="text/css"
          href="${pageContext.request.contextPath}/resources/css/styles.css"/>
    <link href="https://fonts.googleapis.com/css?family=Roboto" rel="stylesheet">
</head>
<body>
<h1>Operation was successful</h1>
<button onclick="location.href='${pageContext.request.contextPath}/index'">Go home page
</button>
<button class="back" onclick="history.back()">Go back</button>
</body>
</html>
