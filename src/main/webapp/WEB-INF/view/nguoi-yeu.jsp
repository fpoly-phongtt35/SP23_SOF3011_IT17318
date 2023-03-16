<%--
  Created by IntelliJ IDEA.
  User: phongtt
  Date: 16/03/2023
  Time: 15:48
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<html>
<head>
    <title>Quản lý Người Yêu</title>
</head>
<body>
  <h1>Quản lý Người Yêu</h1>

  <form action="/app/nguoi-yeu" method="POST">
    <p>Tên người yêu: <input name="tenNy"/></p>
    <p>Năm sinh: <input name="namSinh"/></p>
    <input type="submit" value="Thêm"/>
  </form>

  <table border="1">
    <tr>
      <th>Họ tên</th>
      <th>Năm sinh</th>
      <th>Hành động</th>
    </tr>
    <c:forEach items="${dsachNY}" var="ny">
      <tr>
        <td>${ny.ten}</td>
        <td>${ny.namSinh}</td>
        <td>
          <a href="/app/nguoi-yeu/xoa/{id}">Xoá</a>
        </td>
      </tr>
    </c:forEach>
  </table>

</body>
</html>
