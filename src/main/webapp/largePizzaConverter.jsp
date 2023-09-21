<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
</head>
<body>
	<h1>Large Pizza Converter</h1>
	<form action="getLargePizzasServlet" method="post">
		Enter the number of large pizzas you have in a whole number: <input
			type="text" name="largePizzas" size="10"> <input type="submit"
			value="Calculate Large Pizza Slices" />
	</form>
</body>
</html>