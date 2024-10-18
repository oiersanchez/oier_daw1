package estructuras;

import java.util.Random;
import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		// ESTRUCTURAS DE CONTROL DE FLUJO

		// condicionales
		// if
		Scanner entrada = new Scanner(System.in);
		/*
		 * System.out.println("Introduce tu edad"); int edad = entrada.nextInt(); if
		 * (edad >= 16 && edad < 18) { System.out.println("ACCESO PERMITIDO CON TUTOR");
		 * } else if (edad >= 18) { System.out.println("ACCESO PERMITIDO"); } else {
		 * System.out.println("ACCESO DENEGADO"); }
		 * System.out.println("Fin del programa");
		 * 
		 * // switch System.out.println("Introduce la inicial del dia de la semana");
		 * String dia = entrada.next();
		 * 
		 * switch (dia) { case "l": System.out.println("Lunes"); break; case "m":
		 * System.out.println("Martes"); break; case "x":
		 * System.out.println("Miercoles"); break; case "j":
		 * System.out.println("Jueves"); break; case "v": System.out.println("Viernes");
		 * break; case "s": System.out.println("Sabado"); break; case "d":
		 * System.out.println("Domingo"); break; default:
		 * System.out.println("Eso no es un dia :(");
		 */
// repetitivas - bucle (for/while, do..while)
		// for cuando sabes cuantas veces(inicializacion;condición;)
		/*
		 * for(int i=0;i<10;i++){ System.out.println("Mensaje" + i); }
		 */
		System.out.println("Introduce tu nombre: ");
		String nombre = entrada.next();

		for (int i = nombre.length() - 1; i >= 0; i--) {// de 0..n veces
			System.out.println(nombre.charAt(i));
		}

		// While cuando no sabes cuantas veces(condicion)
		Random random = new Random();
		int numeroOculto = random.nextInt(10) + 1; // Genera un número aleatorio entre 1 y 100

		//while (true) {// de 0..n veces
			//System.out.println("introduce un numero");
			//int numeroUsuario = entrada.nextInt();
			//if (numeroUsuario == numeroOculto) {
				//System.out.println("as ganau");
				//break;
			//}
			// do.while de 1..n veces
		int numeroUsuario= 0;
			do {
				System.out.println("introduce un numero");
				 numeroUsuario = entrada.nextInt();
			} while (numeroUsuario != numeroOculto);
		
	System.out.println("has ganado");}}
