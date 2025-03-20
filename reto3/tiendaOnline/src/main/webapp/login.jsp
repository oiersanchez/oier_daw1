<%@ page language="java" contentType="text/html; charset=UTF-8" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Login</title>
</head>
<body>
<div>
	<h2>Iniciar Sesión Admin</h2>
	<form action="login" method="post">
		<input type="text" name="username" placeholder="Nombre de Usuario">
		<input type="password" name="password" placeholder="Contraseña">
		<button type="submit">Entrar</button>
		<button type="reset">Borrar</button>
	</form>
	<% if(request.getParameter("error") != null) {%>
		<p>
			Usuario o contraseña incorrecto
		</p>
	<%} %>
</div>
</body>
</html>