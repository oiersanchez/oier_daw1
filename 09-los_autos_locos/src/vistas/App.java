package vistas;

import modelo.Coche;
import modelo.Persona;

public class App {

	public static void main(String[] args) {
		// Coche c1 = new Coche("BMW","M3",100, 80, 60);
		Persona p1 = new Persona("Vicente", 39, 175, new Coche("BMW", "M3", 100, 80, 60));
		Persona p2 = new Persona("Erlantz", 18, 173, new Coche("Mustang", "GT", 100, 80, 60));

		p1.arrancar();
		p1.chocar(p2);
		
		p1.coche.setFuerza(-2);
	}

}
