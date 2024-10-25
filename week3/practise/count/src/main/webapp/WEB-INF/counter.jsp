<%@ page language="java" contentType="text/html; charset=UTF-8" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
    <meta charset="UTF-8">
    <title>Counter</title>
    <link rel="stylesheet" type="text/css" href="/css/style.css">
</head>
<body>
    <h1>Visitor Counter</h1>
    <p>Your current visit count is: ${counter}</p>

    <!-- Button to increment by 1 (default behavior) -->
    <a href="${pageContext.request.contextPath}/your_server"><button>Increment Counter by 1</button></a>

    <!-- Button to increment by 2 (bonus route) -->
    <a href="${pageContext.request.contextPath}/your_server/countDouble"><button>Increment Counter by 2</button></a>

    <!-- Button to reset the counter -->
    <form action="${pageContext.request.contextPath}/your_server/reset" method="post" style="display: inline;">
        <button type="submit">Reset Counter</button>
    </form>
</body>
</html>
