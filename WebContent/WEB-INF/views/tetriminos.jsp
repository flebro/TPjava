<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>

<ul>
	<c:forEach items="${tetriminosDAO.findAll() }" var="tetrimino">
		<li>
	
		Nom : <c:out value="${tetrimino.nom }"></c:out><br/>
		Couleur : <c:out value="${tetrimino.couleur }"></c:out><br/>
		<a
			href="http://localhost:8080/Tetris/editTetrimino?id=${tetrimino.id }">edit</a>
			<a
			href="http://localhost:8080/Tetris/deleteTetrimino?id=${tetrimino.id }">delete</a>
		</li>
	</c:forEach>
	<br/>	
	<a href="http://localhost:8080/Tetris/editTetrimino">Création</a>
</ul>