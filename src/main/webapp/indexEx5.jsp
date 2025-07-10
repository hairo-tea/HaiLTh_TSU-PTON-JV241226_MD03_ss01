<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>Exercise 5</title>
    <style>
        .form-login {
            display: flex;
            flex-direction: column;
            align-items: center;
            padding: 10px;
            border: 1px black;
            border-radius: 4px;
        }
        form{
            display: flex;
            align-items: center;
            flex-direction: column;
        }

        input {
            border-radius: 4px;
            padding: 10px;
            margin: 10px;
            width: 500px;
        }
        button{
            width: 500px;
            background: green;
            color: white;
            padding: 10px;
            border-radius: 4px;
            margin-top: 10px;
        }
        .error{
            color: red;
        }
    </style>
</head>
<body>
<div class="form-login">
    <h1>Đăng nhập</h1>
    <c:if test="${not empty error}">
        <div class="error">${error}</div>
    </c:if>
    <form action="login" method="post">
        <input type="text" name="username" placeholder="Tên đăng nhập"/>
        <input type="password" name="password" placeholder="Mật khẩu"/>
        <button type="submit">Đăng nhập</button>
    </form>
</div>
</body>
</html>
