package com.tiendaonline.dao;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

public class AccesoBD {
	
	private static final String URL = "jdbc:mysql://localhost:3306/tienda_bd?useSSL=false&serverTimezone=UTC";
	private static final String USER = "root";
	private static final String PASSWORD = "";

	public static Connection getConnection() {
		Connection con = null;
		try {
			//   Usar el driver correcto para MySQL 8+
			Class.forName("com.mysql.cj.jdbc.Driver");
			con = DriverManager.getConnection(URL, USER, PASSWORD);
			System.out.println("Conexión establecida correctamente.");
		} catch (ClassNotFoundException e) {
			System.err.println("ERROR: No se encontró el driver de MySQL.");
			e.printStackTrace();
		} catch (SQLException e) {
			System.err.println("ERROR: No se pudo conectar a la base de datos.");
			e.printStackTrace();
		}
		return con;
	}

	public static void closeConnection(ResultSet rs, PreparedStatement ps, Connection con) {
		try {
			if (rs != null) rs.close();
			if (ps != null) ps.close();
			if (con != null) con.close();
			System.out.println("Conexión cerrada correctamente.");
		} catch (SQLException e) {
			System.err.println("ERROR: No se pudo cerrar la conexión.");
			e.printStackTrace();
		}
	}
}
