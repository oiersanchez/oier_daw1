package com.tiendaonline.dao;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

import com.tiendaonline.dao.AccesoBD;
import com.tiendaonline.model.Administrador;

public class AdministradorDAO {

	public List<Administrador> getAdmin() {
		List<Administrador> administradores = new ArrayList<Administrador>();
		Connection con = AccesoBD.getConnection();
		PreparedStatement ps = null;
		ResultSet rs = null;

		String sql = "SELECT usuario, correo FROM administradores;";

		try {
			ps = con.prepareStatement(sql);

			rs = ps.executeQuery();

			while (rs.next()) {
				Administrador a = new Administrador();
				a.setCorreo(rs.getString("correo"));
				a.setUsuario(rs.getString("usuario"));

				administradores.add(a);
			}

		} catch (SQLException e) {
			e.printStackTrace();
		} finally {
			AccesoBD.closeConnection(null, ps, con);
		}

		return administradores;
	}

	public Administrador login(Administrador Administrador) {
	    Connection con = AccesoBD.getConnection();
	    PreparedStatement ps = null;
	    ResultSet rs = null;
	    Administrador a = null;  // Inicializar como null

	    String sql = "SELECT usuario, correo FROM administrador WHERE usuario = ? AND contrasena = ?";

	    try {
	        ps = con.prepareStatement(sql);
	        ps.setString(1, Administrador.getUsuario());
	        ps.setString(2, Administrador.getContrasena());
	        rs = ps.executeQuery();

	        if (rs.next()) {  // Si hay un resultado, crear el objeto
	            a = new Administrador();
	            a.setCorreo(rs.getString("correo"));
	            a.setUsuario(rs.getString("usuario"));
	        }
	    } catch (SQLException e) {
	        e.printStackTrace();
	    } finally {
	        AccesoBD.closeConnection(null, ps, con);
	    }

	    return a;  // Retorna null si no encuentra el usuario
	}

	public boolean addAdmin(Administrador nuevoAdministrador) {
		Connection con = AccesoBD.getConnection();
		PreparedStatement ps = null;

		String sql = "INSERT INTO administrador (usuario, correo, contrasena) VALUES (?,?,?)";

		try {
			ps = con.prepareStatement(sql);

			
			ps.setString(4, nuevoAdministrador.getCorreo());
			ps.setString(5, nuevoAdministrador.getUsuario());
			ps.setString(6, nuevoAdministrador.getContrasena());
			

			if (ps.executeUpdate() > 0) {
				return true;
			} else {
				return false;
			}

		} catch (SQLException e) {
			e.printStackTrace();
		} finally {
			AccesoBD.closeConnection(null, ps, con);
		}
		return false;
	}
}
