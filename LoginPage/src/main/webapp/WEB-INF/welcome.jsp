<%@ page language="java" contentType="text/html; charset=UTF-8" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
    <title>Welcome</title>
</head>
<body>
    <h2>Welcome, ${user.username}!</h2>
    <form action="logout" method="post">
        <input type="submit" value="Logout">
    </form>
</body>
</html>
