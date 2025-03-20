package com.tiendaonline.dao;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

import com.tiendaonline.dao.AccesoBD;
import com.tiendaonline.model.Categoria;

public class CategoriaDAO {

	public Categoria getCategoriaById(int id_categoria) {
		Categoria cat = new Categoria();
		Connection con = AccesoBD.getConnection();
		PreparedStatement ps = null;
		ResultSet rs = null;

		String sql = "SELECT id_categoria, nombre, descripcion FROM categoria WHERE id_categoria = ?";

		try {
			ps = con.prepareStatement(sql);
			ps.setInt(1, id_categoria);

			rs = ps.executeQuery();

			if (rs.next()) {
				cat = new Categoria(rs.getInt("id_categoria"), rs.getString("nombre"), rs.getString("descripcion"));
			}
		} catch (SQLException e) {
			e.printStackTrace();
		} finally {
			AccesoBD.closeConnection(null, ps, con);
		}

		return cat;
	}

	public List<Categoria> getCategoria() {
		List<Categoria> categorias = new ArrayList<Categoria>();
		Connection con = AccesoBD.getConnection();
		PreparedStatement ps = null;
		ResultSet rs = null;

		String sql = "SELECT id_categoria, nombre, descripcion FROM roles";

		try {
			ps = con.prepareStatement(sql);

			rs = ps.executeQuery();

			while (rs.next()) {
				Categoria cat = new Categoria(rs.getInt("id_categoria"), rs.getString("nombre"),
						rs.getString("descripcion"));

				categorias.add(cat);
			}
		} catch (SQLException e) {
			e.printStackTrace();
		} finally {
			AccesoBD.closeConnection(null, ps, con);
		}

		return categorias;
	}

	public boolean createOrUpdateCategoria(Categoria categoria) {
		Connection con = AccesoBD.getConnection();
		PreparedStatement ps = null;

		String sql = "";

		if (categoria.getId_categoria() != 0) {
			sql = "UPDATE categoria SET nombre = ?, descripcion = ? WHERE id_categoria = ?";
		} else {
			sql = "INSERT INTO categoria (nombre, descripcion) VALUES (?,?)";
		}

		try {
			ps = con.prepareStatement(sql);

			ps.setString(1, categoria.getNombre());

			if (categoria.getId_categoria() != 0) {
				ps.setInt(2, categoria.getId_categoria());
			}

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

	public boolean deleteCategoria(Categoria categoria) {
		Connection con = AccesoBD.getConnection();
		PreparedStatement ps = null;

		String sql = "DELETE FROM roles WHERE id_categoria = ?";

		try {
			ps = con.prepareStatement(sql);

			ps.setInt(1, categoria.getId_categoria());

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
