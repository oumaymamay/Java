<%@ page language="java" contentType="text/html; charset=UTF-8" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
    <meta charset="UTF-8">
    <title>Single Counter Page</title>
    <link rel="stylesheet" type="text/css" href="/css/style.css">
</head>
<body>
    <h1>Page Visit Counter</h1>
    <p>Visits on this page: ${counter}</p>

    <!-- Navigation buttons -->
    <a href="${pageContext.request.contextPath}/your_server"><button>Back to Main Counter</button></a>
    <a href="${pageContext.request.contextPath}/your_server/countDouble"><button>Go to Double Counter Page</button></a>

    <!-- Reset button -->
    <form action="${pageContext.request.contextPath}/your_server/reset" method="post" style="display: inline;">
        <button type="submit">Reset Counter</button>
    </form>
</body>
</html>
