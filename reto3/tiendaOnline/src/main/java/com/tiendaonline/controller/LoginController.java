package com.tiendaonline.controller;

import java.io.IOException;

import javax.servlet.ServletConfig;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.Cookie;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.tiendaonline.model.Administrador;
import com.tiendaonline.service.AdministradorService;

@WebServlet("/login")
public class LoginController extends HttpServlet {
	private static final long serialVersionUID = 1L;
	AdministradorService administradorService;
	
    public LoginController() {
        super();
    }
    
    @Override
    public void init(ServletConfig config) throws ServletException {
    	super.init(config);
    	administradorService = new AdministradorService();
    }

	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		System.out.println("Estoy entrando con POST");
		
		Administrador admin = new Administrador();
		
		admin.setUsuario(request.getParameter("username"));
		admin.setContrasena(request.getParameter("password"));
		
		Administrador adminLogin = administradorService.login(admin);

		if(adminLogin!=null) {
			request.getSession().setAttribute("usuario", adminLogin);
			Cookie userCookie = new Cookie("username", adminLogin.getUsuario());

            // Establecer la duración de la cookie (1 día)
            userCookie.setMaxAge(60 * 60 * 24);  // 1 día

            // Agregar la cookie a la respuesta
            response.addCookie(userCookie);

			
			response.sendRedirect("private/index.jsp");
			
			
		}else {
			response.sendRedirect("login.jsp?error=1");
		}
	}
	

}
