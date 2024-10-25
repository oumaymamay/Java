<%@ page language="java" contentType="text/html; charset=UTF-8" pageEncoding="UTF-8"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<!DOCTYPE html>
<html>
<head>
    <meta charset="UTF-8">
    <link rel="stylesheet" type="text/css" href="/css/style.css">
    <title>Demo JSP</title>
</head>
<body>
<h1>Send an Omikuji</h1>
<fieldset>
    <form action="http://localhost:8080/omikuji/show" method="post" style="display: flex; flex-direction: column;">
        <label for="number">Pick Any Number From 5 to 25:</label>
        <input type="number" name="number" required min="5" max="25">
        
        <label for="nameCity">Enter The Name Of Any City:</label>
        <input type="text" name="nameCity" required>
        
        <label for="namereal">Enter The Name Of Any Real Person:</label>
        <input type="text" name="namereal" required>
        
        <label for="hobby">Enter Professional Endeavor Or Hobby:</label>
        <input type="text" name="hobby" required>
        
        <label for="type">Enter Any Type Of Living Thing:</label>
        <input type="text" name="type" required>
        
        <label for="something">Say Something Nice To Someone:</label>
        <textarea name="something" rows="10" cols="50" required></textarea>
		<p> Send and Show a friend </p>
        
        <button type="submit">Send</button>
    </form>
</fieldset>
</body>
</html>

