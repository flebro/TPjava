<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>

<form method="post" action="editTetrimino">
	<input type="hidden" name="id" value="${tetrimino.id }" /> Nom :<br>
	<input type="text" name="nom" value="${tetrimino.nom }"><br>
	Couleur :<br> <input type="text" name="couleur"
		value="${tetrimino.couleur }"><br>
	<br> <input type="submit" value="Submit">
</form>
