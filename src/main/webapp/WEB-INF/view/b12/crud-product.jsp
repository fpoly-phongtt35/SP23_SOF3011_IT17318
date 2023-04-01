<%--
  Created by IntelliJ IDEA.
  User: phongtt
  Date: 01/04/2023
  Time: 15:09
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<html>
<head>
    <title>CRUD Product</title>
</head>
<body>
    <h1> CRUD Product </h1>

    <form action="">
        <p> Id:
            <input type="text" readonly="true" name="productId"/>
        </p>
        <p> Name:
            <input type="text" name="productName" />
        </p>
        <p> Quantity:
            <input type="number" name="productQuantity"/>
        </p>
        <p> Price:
            <input type="number" name="currentPrice"/>
        </p>
        <p>
            <input type="submit" value="Thêm"/>
            <input type="submit" value="Sửa"/>
        </p>
    </form>

    <table border="1">
        <tr>
            <th> Id </th>
            <th> Name </th>
            <th> Quantity </th>
            <th> Price </th>
            <th> Action </th>
        </tr>
        <c:forEach items="${dsSanPham}" var="product">
            <tr>
                <td> ${product.productId} </td>
                <td> ${product.productName} </td>
                <td> ${product.quantity} </td>
                <td> ${product.price} </td>
                <td>
                    <a href="#">
                        Chi tiết
                    </a>
                    <a href="/app/b12/admin/product/delete?productId=${product.productId}">
                        Xoá
                    </a>
                </td>
            </tr>
        </c:forEach>
    </table>
</body>
</html>
