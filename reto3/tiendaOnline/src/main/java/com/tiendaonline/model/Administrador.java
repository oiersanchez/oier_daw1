package com.tiendaonline.model;

public class Administrador {

	private String usuario, contrasena, correo;

	@Override
	public String toString() {
		return "Administrador [usuario=" + usuario + ", contrasena=" + contrasena + ", correo=" + correo + "]";
	}

	public Administrador() {
	}

	public Administrador(String usuario, String contrasena, String correo) {
		super();
		this.usuario = usuario;
		this.contrasena = contrasena;
		this.correo = correo;
	}

	public String getUsuario() {
		return usuario;
	}

	public void setUsuario(String usuario) {
		this.usuario = usuario;
	}

	public String getContrasena() {
		return contrasena;
	}

	public void setContrasena(String contrasena) {
		this.contrasena = contrasena;
	}

	public String getCorreo() {
		return correo;
	}

	public void setCorreo(String correo) {
		this.correo = correo;
	}

}
