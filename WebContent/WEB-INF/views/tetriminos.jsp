<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
    <%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<title>Insert title here</title>
</head>
<body>
Hello World
<ul>
	<c:forEach items="${tetriminosDAO.findAll() }" var="tetrimino">
		<li>
		<c:out value="${tetrimino.nom }"></c:out> 
		<a href="http://localhost:8080/Tetris/editTetrimino?id=${tetrimino.id }">edit</a>
		<a href="http://localhost:8080/Tetris/deleteTetrimino?id=${tetrimino.id }">delete</a>
		</li>
	</c:forEach>
	</ul>
</body>
</html>