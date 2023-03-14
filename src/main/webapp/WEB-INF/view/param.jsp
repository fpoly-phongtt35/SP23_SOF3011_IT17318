<%--
  Created by IntelliJ IDEA.
  User: phongtt
  Date: 14/03/2023
  Time: 14:24
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>Sample Parameter</title>
</head>
<body>
    <h1>Hello, IT17318</h1>
    <form action="/app/param" method="POST">
        <p> Số thứ nhất: <input type="text" name="firstNumber"/></p>
        <p> Số thứ hai: <input type="text" name="secondNumber"/></p>
        <p>
            <input type="submit" name="Cộng"/>
        </p>
    </form>
</body>
</html>
