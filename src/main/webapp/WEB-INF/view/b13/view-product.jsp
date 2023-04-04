<%--
  Created by IntelliJ IDEA.
  User: phongtt
  Date: 04/04/2023
  Time: 14:45
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<html>
<head>
    <title>Title</title>
</head>
<body>
<jsp:include page="/WEB-INF/view/b13/_navbar.jsp"/>
<table border="1">
    <tr>
        <th> Id </th>
        <th> Name </th>
        <th> Quantity </th>
        <th> Price </th>
    </tr>
    <c:forEach items="${dsSanPham}" var="product">
        <tr>
            <td> ${product.productId} </td>
            <td> ${product.productName} </td>
            <td> ${product.quantity} </td>
            <td> ${product.price} </td>
        </tr>
    </c:forEach>
</table>
</body>
</html>
