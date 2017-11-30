<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
	<%@ taglib uri="http://tiles.apache.org/tags-tiles" prefix="tiles"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>

<link href="https://fonts.googleapis.com/icon?family=Material+Icons" rel="stylesheet">
<link type="text/css" rel="stylesheet" href="/Tetris/css/materialize.min.css" media="screen,projection" />

<meta name="viewport" content="width=device-width, initial-scale=1.0" />

<title><tiles:insertAttribute name="pageTitle" /></title>
</head>
<body>
	<tiles:insertAttribute name="header" />
	<div class="card">
		<div class="card-content">
			<tiles:insertAttribute name="body" />
		</div>
	</div>

	<script type="text/javascript" src="https://code.jquery.com/jquery-3.2.1.min.js"></script>
	<script type="text/javascript" src="/Tetris/js/materialize.min.js"></script>
</body>
</html>