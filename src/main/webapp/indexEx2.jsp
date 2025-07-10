<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%@ page contentType="text/html; charset=UTF-8" pageEncoding="UTF-8" isELIgnored="false" %>
<!DOCTYPE html>
<html>
<head>
    <title>Excercise 2</title>
    <style>
        .card {
            width: 300px;
            border: 2px solid black;
            padding: 10px;
            margin: 10px auto;
            text-align: left;
        }
        .card h1{
            text-align: center;
        }
       .card p {
            font-size: 20px;
        }
        a {
            text-align: center;
            text-decoration: none;
        }

    </style>
</head>
<body>
<a href="user-info"><h1>Xem thông tin người dùng</h1></a>
<div class="card">
    <h1>User Data</h1>
    <p><b>ID: </b>${id}</p>
    <p><b>Name: </b>${name}</p>
    <p><b>Email: </b>${email}</p>
    <p><b>Age: </b>${age}</p>
</div>
</body>
</html>