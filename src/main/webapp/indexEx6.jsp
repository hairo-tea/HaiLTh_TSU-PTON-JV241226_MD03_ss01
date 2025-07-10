<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>Exercise 6</title>
    <style>
        .form-register{
            display: flex;
            flex-direction: column;
            justify-content: center;
            border: 1px;
            text-align: center;
            align-items: center;
        }
        .error {
            color: red;
            margin-bottom: 5px;
        }
        .success {
            color: green;
            margin-bottom: 15px;
            font-weight: bold;
        }
        input {
            display: block;
            margin-bottom: 15px;
            padding: 12px;
            width: 400px;
            font-size: 14px;
            border-radius: 5px;
        }
        label {
            font-weight: bold;
        }
        button {
            width: 400px;
            padding: 12px 30px;
            font-size: 16px;
            border-radius: 5px;
            background: blue;
            color: white;
            border: none;
        }

    </style>
</head>
<body>
<div class="form-register">
<h1>Sign up</h1>

<c:if test="${not empty successMessage}">
    <div class="success">${successMessage}</div>
</c:if>

<form action="register" method="post">
    <c:if test="${not empty errors.username}">
        <div class="error">${errors.username}</div>
    </c:if>
    <input type="text" id="username" name="username" value="${param.username}" placeholder="Username"/>

    <c:if test="${not empty errors.email}">
        <div class="error">${errors.email}</div>
    </c:if>
    <input type="text" id="email" name="email" value="${param.email}" placeholder="Email"/>

    <c:if test="${not empty errors.password}">
        <div class="error">${errors.password}</div>
    </c:if>
    <input type="password" id="password" name="password" placeholder="Password" />

    <c:if test="${not empty errors.confirmPassword}">
        <div class="error">${errors.confirmPassword}</div>
    </c:if>
    <input type="password" id="confirmPassword" name="confirmPassword" placeholder="ConfirmPassword" />

    <button type="submit">Sign up</button>
</form>
</div>
</body>
</html>
