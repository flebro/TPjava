<%@ taglib uri="http://www.springframework.org/tags/form" prefix="form"%>
<form:form action="/Tetris/tetrimino/${tetrimino.id }" method="post" modelAttribute="tetrimino">
	<form:label path="nom">Nom</form:label>
	<form:input path="nom"/>
	<form:label path="couleur">Couleur</form:label>
	<form:input path="couleur"/>
	<button type="submit">Ok</button>
</form:form>
