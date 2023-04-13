<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>Create a manufacturer</title>
    <link rel="stylesheet" type="text/css"
          href="${pageContext.request.contextPath}/resources/css/styles.css"/>
    <link href="https://fonts.googleapis.com/css?family=Roboto" rel="stylesheet">
</head>
<body>
<h1>Create a manufacturer</h1>
<form method="POST" action="${pageContext.request.contextPath}/manufacturers/add">
    <label>Name</label> <input type="text" name="name" required pattern="[A-Za-z\s]+"
                               title="The input can only contain letters and spaces.">
    <label>Country</label> <input type="text" name="country" required pattern="[A-Za-z\s]+"
                                  title="The input can only contain letters and spaces.">
    <button type="submit">Confirm</button>
</form>
<button class="back" onclick="history.back()">Go back</button>
</body>
</html>