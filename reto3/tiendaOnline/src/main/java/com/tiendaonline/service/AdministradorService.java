package com.tiendaonline.service;

import java.security.MessageDigest;
import java.security.NoSuchAlgorithmException;
import java.util.List;

import com.tiendaonline.dao.AdministradorDAO;
import com.tiendaonline.model.Administrador;

public class AdministradorService {

	AdministradorDAO administradorBD;

	public AdministradorService() {
		administradorBD = new AdministradorDAO();
	}

	public Administrador login(Administrador administrador) {
		String hashedPass = hashPassword(administrador.getContrasena());

		administrador.setContrasena(hashedPass);

		return administradorBD.login(administrador);
	}

	public boolean addAdmin(Administrador nuevoAdministrador) {
		String hashedPass = hashPassword(nuevoAdministrador.getContrasena());

		nuevoAdministrador.setContrasena(hashedPass);

		return administradorBD.addAdmin(nuevoAdministrador);
	}

	private String hashPassword(String password) {
		try {
			MessageDigest md = MessageDigest.getInstance("SHA-256");
			byte[] hash = md.digest(password.getBytes());
			StringBuilder hexString = new StringBuilder();
			for (byte b : hash) {
				hexString.append(String.format("%02x", b));
			}
			return hexString.toString();
		} catch (NoSuchAlgorithmException e) {
			e.printStackTrace();
			return "";
		}
	}

	public List<Administrador> getAdmin() {
		return administradorBD.getAdmin();
	}

}
