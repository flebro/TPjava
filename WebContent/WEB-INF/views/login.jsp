<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1"%>

<div class="card">
	<div class="card-body">
		<form method="post" action="login">
			<div class="form-group">
				<label for="usernameInput">Username</label> 
				<input name="login" type="text"
					class="form-control" id="usernameInput" placeholder="Username">
			</div>
			<div class="form-group">
				<label for="passwordInput">Mot de passe</label> 
				<input  name="motdepasse"
					type="password" class="form-control" id="passwordInput"
					placeholder="Mot de passe">
			</div>

			<button type="submit" class="btn btn-primary">Ok</button>
		</form>
	</div>
</div>