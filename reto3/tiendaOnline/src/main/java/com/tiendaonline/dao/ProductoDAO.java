package com.tiendaonline.dao;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

import com.tiendaonline.dao.AccesoBD;
import com.tiendaonline.model.Categoria;
import com.tiendaonline.model.Producto;

public class ProductoDAO {

	public List<Producto> getProducto() {
		List<Producto> productos = new ArrayList<Producto>();
		Connection con = AccesoBD.getConnection();
		PreparedStatement ps = null;
		ResultSet rs = null;

		String sql = "SELECT p.id_producto, p.nombre, p.stock, p.descripcion, p.precio, p.imagen, c.id_categoria, c.nombre FROM producto u inner join categoria c on c.id_categoria = c.id_categoria";

		try {
			ps = con.prepareStatement(sql);

			rs = ps.executeQuery();

			while (rs.next()) {
				Producto p = new Producto();
				
				p.setId_producto(rs.getInt("id_producto"));
				p.setNombre(rs.getString("nombre"));
				p.setStock(rs.getInt("stock"));
				p.setDescripcion(rs.getString("descripcion"));
				p.setPrecio(rs.getDouble("precio"));
				p.setImagen(rs.getString("imagen"));

				Categoria cat = new Categoria();

				cat.setId_categoria(rs.getInt("id_categoria"));
				cat.setNombre(rs.getString("nombre"));

				p.setCategoria(cat);

				productos.add(p);
			}

		} catch (SQLException e) {
			e.printStackTrace();
		} finally {
			AccesoBD.closeConnection(null, ps, con);
		}

		return productos;
	}

	public boolean addProducto(Producto nuevoUsuario) {
		Connection con = AccesoBD.getConnection();
		PreparedStatement ps = null;
		
		String sql = "INSERT INTO producto (nombre, stock, descripcion, precio, imagen, id_categoria) VALUES (?,?,?,?,?,?)";
		
		try {
			ps = con.prepareStatement(sql);
			
			ps.setString(1, nuevoUsuario.getNombre());
			ps.setInt(2, nuevoUsuario.getStock());
			ps.setString(3, nuevoUsuario.getDescripcion());
			ps.setDouble(4, nuevoUsuario.getPrecio());
			ps.setString(5, nuevoUsuario.getImagen());
			ps.setInt(6, nuevoUsuario.getCategoria().getId_categoria());
			
			if(ps.executeUpdate() > 0) {
				return true;
			}else {
				return false;
			}
			
		}catch(SQLException e) {
			e.printStackTrace();
		}finally {
			AccesoBD.closeConnection(null, ps, con);
		}
		return false;
	}
	
	public boolean deleteProducto(Producto producto) {
		Connection con = AccesoBD.getConnection();
		PreparedStatement ps = null;
		
		String sql = "DELETE FROM producto WHERE id_producto = ?";
		
		try {
			ps = con.prepareStatement(sql);
			
			ps.setInt(1, producto.getId_producto());
			
			if(ps.executeUpdate() > 0) {
				return true;
			}else {
				return false;
			}
			
		}catch(SQLException e) {
			e.printStackTrace();
		}finally {
			AccesoBD.closeConnection(null, ps, con);
		}
		return false;
	}

	
}
