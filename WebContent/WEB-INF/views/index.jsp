<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
	<meta charset="UTF-8">
	<title>The Great Number Game</title>
</head>
<body>
	<div id="content">
			<h1>Could you be a WIZARD?!?!?</h1>
			<h3>This is the Great Number Game</h3>
			<p>I am thinking of a number. Can you divine the number from the aether?</p> 
			<p>I shall spell you a hint... 1 to 100...</p>
			<c:if test="${ outcome==2 }">
				<h1>Nope! Too HIGH</h1>
			</c:if>
			<c:if test="${ outcome==1 }">
				<h1>Nope! Too LOW</h1>
			</c:if>
				<c:if test="${ outcome==3 }">
			<h1>YES</h1>
			<form action="Reset" method="POST">
				<input type="submit" name="submit" value="Play Again">
			</form>
			</c:if>
			<form action="Check" method="POST" name="check">
				<input type="number" name="guess">
				<input type="submit" name="submit" value="check">
			</form>
		
		</div>
</body>
</html>