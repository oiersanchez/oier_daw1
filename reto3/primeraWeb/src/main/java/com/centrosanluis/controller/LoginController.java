package com.centrosanluis.controller;

import java.io.IOException;

import javax.servlet.ServletConfig;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.Cookie;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.centrosanluis.model.Usuario;
import com.centrosanluis.service.UsuarioService;

@WebServlet("/login")
public class LoginController extends HttpServlet {
	private static final long serialVersionUID = 1L;
	UsuarioService usuarioService;
	
    public LoginController() {
        super();
    }
    
    @Override
    public void init(ServletConfig config) throws ServletException {
    	super.init(config);
    	usuarioService = new UsuarioService();
    }

	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		System.out.println("Estoy entrando con POST");
		
		Usuario usuario = new Usuario();
		
		usuario.setUsuario(request.getParameter("username"));
		usuario.setContrasena(request.getParameter("password"));
		
		Usuario usuarioLogin = usuarioService.login(usuario);

		if(usuarioLogin!=null) {
			request.getSession().setAttribute("usuario", usuarioLogin);
			Cookie userCookie = new Cookie("username", usuarioLogin.getUsuario());

            // Establecer la duraci�n de la cookie (1 d�a)
            userCookie.setMaxAge(60 * 60 * 24);  // 1 d�a

            // Agregar la cookie a la respuesta
            response.addCookie(userCookie);

			
			response.sendRedirect("private/index.jsp");
			
			
		}else {
			response.sendRedirect("login.jsp?error=1");
		}
	}
	

}
