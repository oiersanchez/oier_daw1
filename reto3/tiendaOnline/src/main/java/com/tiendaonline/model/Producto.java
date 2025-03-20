package com.tiendaonline.model;

public class Producto {

	private int id_producto, stock;
	private String nombre, descripcion, imagen;
	Categoria categoria;
	private double precio;

	@Override
	public String toString() {
		return "Producto [id_producto=" + id_producto + ", stock=" + stock + ", categoria=" + categoria
				+ ", nombre=" + nombre + ", descripcion=" + descripcion + ", imagen=" + imagen + ", precio=" + precio
				+ "]";
	}

	public Producto() {
		// TODO Auto-generated constructor stub
	}

	public Producto(int id_producto, int stock, Categoria categoria, String nombre, String descripcion, String imagen,
			double precio) {
		super();
		this.id_producto = id_producto;
		this.stock = stock;
		this.categoria = categoria;
		this.nombre = nombre;
		this.descripcion = descripcion;
		this.imagen = imagen;
		this.precio = precio;
	}

	public int getId_producto() {
		return id_producto;
	}

	public void setId_producto(int id_producto) {
		this.id_producto = id_producto;
	}

	public int getStock() {
		return stock;
	}

	public void setStock(int stock) {
		this.stock = stock;
	}

	public Categoria getCategoria() {
		return categoria;
	}

	public void setCategoria(Categoria cat) {
		this.categoria = cat;
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

	public String getImagen() {
		return imagen;
	}

	public void setImagen(String imagen) {
		this.imagen = imagen;
	}

	public double getPrecio() {
		return precio;
	}

	public void setPrecio(double precio) {
		this.precio = precio;
	}

}
