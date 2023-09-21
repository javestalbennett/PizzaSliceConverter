<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Small Pizza Results</title>
</head>
<body>
	<p>${userNumSmallSlices.getNumPizzas()}
		Small pizzas contains the following: <br /> ${userNumSmallSlices.getNumSlices()} slices 
	</p>
	<a href="index.jsp">Select another pizza size or enter a new number of pizzas</a>
</head>
</html>