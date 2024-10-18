package collections;

import java.util.ArrayList;

public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Persona p1 = new Profesor();
		Persona p2 = new Alumno();

		// arrays
		String[] dias = new String[7];
		// Dar valor
		dias[0] = "Lunes";
		// Obtener valor
		System.out.println(dias[0]);
		// recorrer
		for (int i = 0; i < dias.length; i++) {
		}

		// Arraylist - implementa la intefaz list con lo que es un iterable, collection
		// y list
		ArrayList<Alumno> lista = new ArrayList<>(10);

		Alumno a1 = new Alumno();
		a1.setNombre("Sergio");
		a1.setApellidos("Rufian");
		
		Alumno a2 = new Alumno();
		a1.setNombre("Oier");
		a1.setApellidos("Sanchez");
		
		
		// Dar valor
		lista.add(a1);
		lista.add(a2);
		
		//Obtener valor
		System.out.println(lista.get(0));
		
		//Eliminar el 
		lista.remove(0);
		
		//Obtener la dimension
		System.out.println(lista.size());
		
		//Recorrer
		
		for(int i=0; i<lista.size(); i++) {
			System.out.println(lista.get(i));
			
		}
	}

}
