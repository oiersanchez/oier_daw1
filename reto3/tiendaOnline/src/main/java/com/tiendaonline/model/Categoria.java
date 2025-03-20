package com.tiendaonline.model;

public class Categoria {

	private int id_categoria;
	private String nombre, descripcion;

	@Override
	public String toString() {
		return "Categoria [id_categoria=" + id_categoria + ", nombre=" + nombre + ", descripcion=" + descripcion + "]";
	}

	public Categoria(int id_categoria, String nombre, String descripcion) {
		super();
		this.id_categoria = id_categoria;
		this.nombre = nombre;
		this.descripcion = descripcion;
	}

	public Categoria() {
	}

	public int getId_categoria() {
		return id_categoria;
	}

	public void setId_categoria(int id_categoria) {
		this.id_categoria = id_categoria;
	}

	public String getNombre() {
		return nombre;
	}

	public void setNombre(String nombre) {
		this.nombre = nombre;
	}

	public String getDescripcion() {
		return descripcion;
	}

	public void setDescripcion(String descripcion) {
		this.descripcion = descripcion;
	}

}
