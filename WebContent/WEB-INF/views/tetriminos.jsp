<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>

<div class="nav-content">
	<a href="http://localhost:8080/Tetris/editTetrimino"
		class="btn-floating btn-large halfway-fab waves-effect waves-light teal">
		<i class="material-icons">add</i>
	</a>
</div>

<ul class="collection">
	<c:forEach items="${tetriminosDAO.findAll() }" var="tetrimino">
		<li class="collection-item avatar"><span class="title">${tetrimino.nom }</span>
			<p>Couleur : ${tetrimino.couleur }</p> <a
			class="waves-effect waves-light btn"
			href="http://localhost:8080/Tetris/editTetrimino?id=${tetrimino.id }">Editer</a>
			<a class="waves-effect waves-light btn"
			href="http://localhost:8080/Tetris/deleteTetrimino?id=${tetrimino.id }">Supprimer</a>
		</li>
	</c:forEach>
</ul>