package model;

public class Vendedor {

	public double acumuladoVentas;
	public String nombre;

	public void vendedor(double acumuladoVentas, String nombre) {
		this.acumuladoVentas = acumuladoVentas;
		this.nombre = nombre;
	}
}
