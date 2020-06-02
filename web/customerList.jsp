<%@taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%--
  Created by IntelliJ IDEA.
  User: Admin
  Date: 02/06/2020
  Time: 20:55 PM
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<%@ page import="java.util.List" %>
<%@ page import="java.util.ArrayList" %>
<html>
<head>
    <title>Danh Sách Đại Ca trong vùng</title>
    <link rel="stylesheet" href="css/style.css">
</head>
<body>
<%
    List mylist = (ArrayList)request.getAttribute("list");
    String name = String.valueOf(request.getAttribute("name"));
    String birthday = String.valueOf(request.getAttribute("birthday"));
    String address = String.valueOf(request.getAttribute("address"));
%>
<table>
    <tr>
        <th>Tên</th>
        <th>Ngày Sinh</th>
        <th>Địa Chỉ</th>
    </tr>


<c:forEach items="<%=mylist%>" var="danhsach">
    <tr>
        <td><c:out value="${danhsach.getName()}"/></td>
        <td><c:out value="${danhsach.getBirthday()}"/></td>
        <td><c:out value="${danhsach.getAddress()}"/></td>
    </tr>



</c:forEach>
</table>
</body>
</html>

