package modelo;

public class Persona {

	public String nombre;
	public int edad;
	public float altura;
	public Coche coche;
	
	
	public Persona(String nombre, int edad, float altura, Coche coche) {
		super();
		this.nombre = nombre;
		this.edad = edad;
		this.altura = altura;
		this.coche=coche;
	}

	{
		// TODO Auto-generated constructor stub
	}

	// metodos: arrancar, repostar, chocar
	public void arrancar() {
		System.out.println(this.nombre+"esta intentado arrancar");
		this.coche.arrancar();
	}

	public void repostar() {
		System.out.println("repostando");
	}
/**
 * 
 * @author Oier
 * @param Recibe la persona y se chocara contra sus coche
 * @return devuelve blablabla
 * 
 */
	public void chocar(Persona otraPersona) {
			this.coche.chocar(otraPersona.coche);
			
			this.coche.vida=this.coche.vida-otraPersona.coche.fuerza;
			
	}
}
