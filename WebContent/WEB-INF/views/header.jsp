<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
<%@ taglib uri="http://tiles.apache.org/tags-tiles" prefix="tiles"%>
<header>
	<nav>
		<div class="nav-wrapper">
			<a href="#" class="brand-logo">Tetris - <tiles:insertAttribute name="pageTitle" /></a>
			<c:if test="${user !=null }">
				<ul id="nav-mobile" class="right hide-on-med-and-down">
					<li><a href="/Tetris/home">Accueil</a></li>
					<li><a href="/Tetris/tetriminos">Tetriminos</a></li>
					<li><a href="/Tetris/logout" class="waves-effect waves-light btn">Déconnexion</a></li>
				</ul>

			</c:if>
		</div>
	</nav>

</header>
