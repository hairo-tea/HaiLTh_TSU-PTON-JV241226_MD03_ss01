<%@ page import="entity.Customer" %>
<%@ page import="java.util.List" %>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%@ page contentType="text/html; charset=UTF-8" pageEncoding="UTF-8" %>
<!DOCTYPE html>
<html>
<head>
    <title>Excercise 3</title>
    <style>
        .title, .detatil{
            padding: 15px 20px;
            text-align: center;
            border: 15px black;
        }
    </style>
</head>
<body>
<c:if test="${not empty customers}">
    <table border="10" width="full">
        <tr class="title">
            <td>STT</td>
            <td>NAME</td>
            <td>DATE OF BIRTH</td>
            <td>ADDRESS</td>
            <td>IMAGE</td>
        </tr>
        <c:forEach var="customer" items="${customers}" varStatus="status">
            <tr class = "detatil">
                <td>${customer.id}</td>
                <td>${customer.name}</td>
                <td>${customer.dateOfBirth}</td>
                <td>${customer.address}</td>
                <td><img src="${customer.image}" alt="image" width="200"/></td>
            </tr>
        </c:forEach>
    </table>
</c:if>
</body>
</html>