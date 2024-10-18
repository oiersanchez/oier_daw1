package vista;

import modelo.Futbolista;
import modelo.Persona;
import modelo.Piloto;

public class App {

	public static void main(String[] args) {

		Persona p = new Persona();
		Futbolista f = new Futbolista();
		Piloto pi = new Piloto();
		f.saludar(); //Polimorfismo (mismo metodo diferentes clases).
		pi.saludar();
		
		Persona p1 = new Futbolista();
		//Futbolista fut = new Persona(); no se puede
		
	}

}
