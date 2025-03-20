package com.tiendaonline.controller;

import java.io.IOException;
import java.util.List;

import javax.servlet.ServletConfig;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.tiendaonline.model.Administrador;
import com.tiendaonline.service.AdministradorService;

public class AltaAdministrador extends HttpServlet{
	
	AdministradorService administradorService;
    @Override
    public void init(ServletConfig config) throws ServletException {
    	super.init(config);
    	administradorService = new AdministradorService();
    }
    
    @Override
    protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
    	String correo = req.getParameter("correo");
    	String usuario = req.getParameter("usuario");
    	String contrasena = req.getParameter("contrasena");
    	
    	Administrador nuevoAdmin = new Administrador(correo, usuario, contrasena);
    	
    	if(administradorService.addAdmin(nuevoAdmin)) {
    		resp.sendRedirect("login.jsp");
    	}else {
    		req.setAttribute("error", "No se ha podido dar de alta el usuario");
    		req.getRequestDispatcher("registro.jsp").forward(req, resp);
    	}
    }
}