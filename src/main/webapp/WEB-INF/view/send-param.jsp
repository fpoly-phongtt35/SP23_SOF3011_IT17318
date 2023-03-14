<%--
  Created by IntelliJ IDEA.
  User: phongtt
  Date: 14/03/2023
  Time: 14:50
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>Send Param</title>
</head>
<body>
    <h1> Sending Request Parameter</h1>
    <form action="/app/send-param">
        <p><input type="text" name="message" value="${messageRtn}"/></p>
        <p><input type="text" name="title" value="${titleRtn}"/></p>
        <input type="submit" value="Submit"/>
    </form>
    <h2>${result}</h2>
</body>
</html>
