<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
<header>
	<nav>
		<div class="nav-wrapper">
			<a href="#" class="brand-logo">Tetris - ${pageTitle}</a>
			<c:if test="${username !=null }">
				<ul id="nav-mobile" class="right hide-on-med-and-down">
					<li><a href="/Tetris/home">Accueil</a></li>
					<li><a href="/Tetris/tetriminos">Tetriminos</a></li>
				</ul>

			</c:if>
		</div>
	</nav>

</header>
