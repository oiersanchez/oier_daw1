package collections;

public class Alumno implements Persona {

	private String nombre;
	private String apellidos;
	public String getNombre() {
		return nombre;
	}

	public void setNombre(String nombre) {
		this.nombre = nombre;
	}

	public String getApellidos() {
		return apellidos;
	}

	public void setApellidos(String apellidos) {
		this.apellidos = apellidos;
	}

	@Override
	public void andar() {
		System.out.println("El alumno anda con swagg");

	}

	@Override
	public void hablar() {
		System.out.println("El alumno habla usando BRO cada 2 palabras");

	}

}
