<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<%@ page contentType="text/html; charset=UTF-8" pageEncoding="UTF-8" %>
<!DOCTYPE html>
<html>
<head>
    <title>Exercise 4</title>
    <style>
        .card{
            border: 1px black;
            padding: 5px;
        }
        .card input {
            padding: 6px;
            border-radius: 4px;
            width: 250px;
            margin: 3px;
        }
        button{
            margin-top: 6px;
            border-radius: 4px;
            padding: 5px;
        }
    </style>
</head>
<body>
<div class="card" >
<h1>Chuyển đổi tiền tệ</h1>
    <form action="convert" method="post">
        <lable>Rate</lable><br>
        <input type="number" name="rate" placeholder="Enter your rate"/><br>
        <lable>USD</lable> <br>
        <input type="number" name="usd" placeholder="Enter your used"/><br>
        <button type="submit">Convert</button>
    </form>
</div>

<%--Hiển thị--%>
<c:if test="${not empty vnd}">
    <hr>
    <h1>Kết quả</h1>
    <p>Rate: ${rate}</p>
    <p>USD: ${usd}</p>
    <p>VND: ${vnd} - VND</p>
</c:if>
</body>
</html>