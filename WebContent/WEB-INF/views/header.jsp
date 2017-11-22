<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
<header>
	<h1>Tetris - ${pageTitle}</h1>
	
<c:if test="${username !=null }" >
	<ul>
		<li><a href ="/Tetris/home">Accueil</a></li>
		<li><a href="/Tetris/tetriminos">Tetriminos</a></li>
	</ul>
</c:if>
		
</header>
