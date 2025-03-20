<%@page import="com.tiendaonline.model.Administrador"%>
<%@page import="java.util.ArrayList"%>
<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<%Administrador administrador = (Administrador) request.getAttribute("usuario"); %>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Registro de Administrador</title>
</head>
<body>
<div class="register-container">
	<h2>
			 Registrar Administrador
	</h2>
	<form action="<%=administrador!=null?"editarUsuario":"registro" %>" method="post">
		<input type="text" name="correo" value="<%= administrador!=null?administrador.getCorreo():"" %>" placeholder="Correo electronico" required>
		<input type="text" 
			name="usuario" 
			value="<%= administrador!=null?administrador.getUsuario():"" %>" 
			<%= administrador!=null?"readonly":"" %>
			placeholder="Usuario" 
			required>
		
		<%if(administrador == null){ %>
			<input type="text" name="contrasena" placeholder="Contraseña" required>
		<%} %>
		
		<!-- input type="file" name="imagen" required -->
		<button type="submit">
		 		Crear Usuario 
		 </button>
	</form>
	<%if(administrador != null){ %>
		<a href="private/index.jsp">Volver al index</a>
	<%}else{ %>
		<a href="login.jsp">Volver al login</a>
	<%} %>
	
</div>
</body>
</html>