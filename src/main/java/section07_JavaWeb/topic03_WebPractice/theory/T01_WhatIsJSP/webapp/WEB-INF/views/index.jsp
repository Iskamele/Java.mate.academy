<%@ page import="section07_JavaWeb.topic03_WebPractice.theory.T01_WhatIsJSP.model.User" %>
<%@ page contentType="text/html;charset=UTF-8" %>
<html>
<head>
    <title>index page</title>
</head>
<body>
<%
    String message = "Hello";
    message.toLowerCase();
    User bob = new User();
    bob.setName("Bob");
%>
<h1>Hello world!</h1>
</body>
</html>
