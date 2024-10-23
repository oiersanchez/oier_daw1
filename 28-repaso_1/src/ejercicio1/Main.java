package ejercicio1;

import java.util.Random;
import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		Scanner entrada = new Scanner(System.in);

		System.out.println("¿De cuantas posiciones quieres crear tu array?");
		int posiciones = entrada.nextInt();

		int[] numeros = new int[posiciones];

		System.out.println("¿Como quieres inicializar tu array?");
		System.out.println("1. con ceros");
		System.out.println("2. con numeros aleatorios 1-100");
		System.out.println("3. introduciendo los numeros de forma manual");

		int iniciar = entrada.nextInt();

		switch (iniciar) {
		case (1):
//			mostrarArray(numeros);
			break;
		case (2):
			Random rand = new Random();
			for (int i = 0; i < numeros.length; i++) {
				int numeroAl = rand.nextInt(100);
				if (numeroAl < 1) {
					numeroAl = numeroAl + 1;
				}
				numeros[i] = numeroAl;
			}
//			mostrarArray(numeros);
			break;
		case (3):
			for (int i = 0; i < numeros.length; i++) {
				System.out.println("Introduce un numero");
				int numeroMan = entrada.nextInt();
				numeros[i] = numeroMan;
			}
//			mostrarArray(numeros);
			break;
		}
		for (int i = 0; i < 100; i++) {
			System.out.println(" ");
			System.out.println("-----------------------");
			System.out.println("¿Que quieres hacer con tu array?");
			System.out.println("1.- Cambiar valores de todo el array");
			System.out.println("2.- Cambiar un valor del array");
			System.out.println("3.- Reiniciar el Array");
			System.out.println("4.- Mostrar Array");
			System.out.println("0.- Salir");

			int eleccion = entrada.nextInt();

			switch (eleccion) {
			case (1):
				for (int j = 0; j < numeros.length; j++) {
					System.out.println("introduce el numero para la posicion" + " " + (i + 1));
					int cambiarValor = entrada.nextInt();
					numeros[j] = cambiarValor;
				}
				mostrarArray(numeros);
				break;
			case (2):
				System.out.println("Introduce la posición que quieres cambiar");
				int cambiar = entrada.nextInt();
				System.out.println("Introduce el numero para la posicion" + " " + cambiar);
				int numeroCamb = entrada.nextInt();
				numeros[cambiar - 1] = numeroCamb;
				mostrarArray(numeros);
				break;
			case (3):
				System.out.println("¿Estas seguro de que quieres eliminar todos los numeros del Array?(S/N)");
				String respuesta = entrada.next();
				if (("S").equalsIgnoreCase(respuesta)) {
					for (int h = 0; h < numeros.length; h++) {
						numeros[h] = 0;
					}
					mostrarArray(numeros);
				} else {
					break;
				}
				break;
			case (4):
				mostrarArray(numeros);
				break;
			}
			if (eleccion == 0) {
				break;

			}

		}
		System.out.println("Has salido de forma efectiva");

	}

	private static void mostrarArray(int[] numeros) {
		System.out.println("Se ha creado tu array");
		System.out.println("-----------------------");

		System.out.print("[");
		for (int i = 0; i < numeros.length; i++) {
			System.out.print(numeros[i]);
			if (i < numeros.length - 1) {
				System.out.print(",");
			}
		}
		System.out.print("]");

	}

}
