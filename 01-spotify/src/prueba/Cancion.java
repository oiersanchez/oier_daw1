package prueba;

public class Cancion {
	// Atributos
	private String nombre;
	private String letra; // La letra completa
	private int duracion; // segundos

	// Constructor
	public Cancion(String nombre, String letra, int duracion) {
		// Validar datos
		if (duracion <= 0) {
			this.duracion = 100; // Valor por defecto
		} else {
			this.duracion = duracion;
		}
		this.nombre = nombre;
		this.letra = letra;
	}

	public String getNombre() {
		return nombre;
	}

	public void setNombre(String nombre) {
		this.nombre = nombre;
	}

	public String getLetra() {
		return letra;
	}

	public void setLetra(String letra) {
		this.letra = letra;
	}

	public int getDuracion() {
		return duracion;
	}

	public void setDuracion(int duracion) {
		this.duracion = duracion;
	}

}