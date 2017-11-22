<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
<header>
	<nav class="navbar navbar-expand-lg navbar-dark bg-primary">
		<a class="navbar-brand" href="#">Tetris - ${pageTitle}</a>
		<button class="navbar-toggler" type="button" data-toggle="collapse"
			data-target="#navbarSupportedContent"
			aria-controls="navbarSupportedContent" aria-expanded="false"
			aria-label="Toggle navigation">
			<span class="navbar-toggler-icon"></span>
		</button>

		<c:if test="${username !=null }">
			<div class="collapse navbar-collapse" id="navbarSupportedContent">
				<ul class="navbar-nav mr-auto">
					<li class="nav-item active"><a class="nav-link"
						href="/Tetris/home">Accueil</a>
					</li>
					<li class="nav-item active"><a class="nav-link"
						href="/Tetris/tetriminos">Tetriminos</a></li>
				</ul>
			</div>
			<form class="form-inline my-2 my-lg-0" method="post" action="home">
				<button class="btn my-2 my-sm-0" type="submit">Se Déconnecter</button>
			</form>
		</c:if>
	</nav>

</header>
