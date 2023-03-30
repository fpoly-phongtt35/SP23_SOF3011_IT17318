<%--
  Created by IntelliJ IDEA.
  User: phongtt
  Date: 30/03/2023
  Time: 15:11
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<html>
<head>
    <title>Login Page</title>
</head>
<body>
    <h1> HELLO WORLD! </h1>
    <c:if test="${errMessage != ''}">
        <i style="color: red">${errMessage}</i>
    </c:if>
    <form action="/app/b11/login" method="POST">
        <p>Username: <input name="username"/> </p>
        <p>Password: <input name="password"/> </p>
        <p> <input type="submit" value="Login"> </p>
    </form>
</body>
</html>
