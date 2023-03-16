<%--
  Created by IntelliJ IDEA.
  User: phongtt
  Date: 16/03/2023
  Time: 14:30
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<html>
<head>
    <title>Title</title>
</head>
<body>
    <c:forEach begin="1" end="10" step="1">
        <h1>I Love You!!!</h1>
    </c:forEach>

    <c:forEach items="${danhSachNY}" var="ny">
        <p>${ny.ten} - ${ny.namSinh}</p>
    </c:forEach>
</body>
</html>
