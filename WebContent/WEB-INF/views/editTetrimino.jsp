<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<title>Insert title here</title>
</head>
<body>
	<form method="post" action="editTetrimino">
		<input type="hidden" name="id"  value="${tetrimino.id }"/>
		  Nom :<br>
		  <input type="text" name="nom" value="${tetrimino.nom }"><br>
		  Couleur :<br>
		  <input type="text" name="couleur" value="${tetrimino.couleur }"><br><br>
		  <input type="submit" value="Submit">
	</form>
</body>
</html>