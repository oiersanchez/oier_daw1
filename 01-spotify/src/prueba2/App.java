package prueba2;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Random;

import prueba.Cancion;

public class App {

	public static void main(String[] args) {

		// String nombre = "Oier";
		// int edad = 19;

		// System.out.println("Hola, te llamas "+nombre+" y tienes "+edad+" a�os");

		// Crear objetos: NombreClase nombreObjeto = new NombreClase

		List<Cancion> lista = new ArrayList<>(10);

		Cancion c1 = new Cancion("Alehop", "Ale hop hop hop hip hap....", 150);

		Cancion c2 = new Cancion("La Macarena", "Dale a tu cuerpo...", 180);

		Cancion c3 = new Cancion("Pepi", "PiPiPiPiPiPiPE....", 150);

		Cancion c4 = new Cancion("Pepe", "PEPEPEPEPEPEPE....", 150);

		Cancion c5 = new Cancion("Fena", "FENA fena FENA...", 180);

		Cancion c6 = new Cancion("Hip", "JIJIhi hip hap....", 150);

		Cancion c7 = new Cancion("Sepe Paro", "Sin curro...", 180);

		Cancion c8 = new Cancion("asdasd", "kokokokokokokokokoko....", 150);

		Cancion c9 = new Cancion("LILO", "LOLILOLILOLI...", 180);

		Cancion c10 = new Cancion("Popo", "Popopopopopopipo....", 150);

		lista.add(c1);
		lista.add(c2);
		lista.add(c3);
		lista.add(c4);
		lista.add(c5);
		lista.add(c6);
		lista.add(c7);
		lista.add(c8);
		lista.add(c9);
		lista.add(c10);

		Random random = new Random();

//		for (int i = 0; i < lista.size(); i++) {
//			System.out.println(lista.get(i).getNombre()+" "+ lista.get(i).getLetra()+" " + lista.get(i).getDuracion());
//		}

//		for (int i = 0; i < lista.size(); i++) {
//			System.out.println(lista.get(random.nextInt(lista.size())).getNombre()+" "+ lista.get(i).getLetra()+" " + lista.get(i).getDuracion());
//		}

//		boolean[] reproducidas = new boolean[lista.size()]; // valor por defecto de boolean = false
//		int cancionesRestantes = lista.size();
//
//		while (cancionesRestantes > 0) {
//			int indice = random.nextInt(lista.size());
//
//			if (reproducidas[indice] == false) {
//				System.out.println(lista.get(indice).getNombre()+" "+ lista.get(indice).getLetra()+" " + lista.get(indice).getDuracion());
//				reproducidas[indice] = true;
//				cancionesRestantes--;
//			}
//		}

		Collections.shuffle(lista);

		for (int i = 0; i < lista.size(); i++) {
			System.out.println(
					lista.get(i).getNombre() + " " + lista.get(i).getLetra() + " " + lista.get(i).getDuracion());
		}
//		System.out.println(c1.getLetra());
//		System.out.println(c2.getLetra());

	}

}
