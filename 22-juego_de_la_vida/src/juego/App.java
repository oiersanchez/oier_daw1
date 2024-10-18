package juego;

import java.util.Scanner;

public class App {

	public static void main(String[] args) {
		Scanner entrada = new Scanner(System.in);

		String viva = "*";
		String muerta = ".";

		System.out.println("Introduce el numero de filas");
		int filas = entrada.nextInt();

		System.out.println("Introduce el numero de columnas");
		int columnas = entrada.nextInt();

		String[][] matriz = new String[filas][columnas];

		for (int fila = 0; fila < matriz.length; fila++) {
			for (int col = 0; col < matriz[fila].length; col++) {
				matriz[fila][col] = muerta;
			}
		}
		// mostrar matriz
		for (int fila = 0; fila < matriz.length; fila++) {
			for (int col = 0; col < matriz[fila].length; col++) {
				System.out.print(matriz[fila][col] + " ");
			}
			System.out.println("");

		}
		// posicionar celulas vivas
		for (int i = 0; i < matriz.length; i++) {
			System.out.println(
					"donde quieres celulas vivas? introducir fila (si introduces 0 pararas de añadir celulas)");
			int f = entrada.nextInt();
			if (f == 0) {
				break;
			}
			System.out.println("donde quieres celulas vivas? introducir columna");
			int c = entrada.nextInt();
			matriz[f - 1][c - 1] = viva;
		}
		// mostrar matriz
		for (int fila = 0; fila < filas; fila++) {
			for (int col = 0; col < columnas; col++) {
				System.out.print(matriz[fila][col] + " ");
			}
			System.out.println("");
		}

		// Simular generaciones hasta que no haya cambios
		boolean cambios = true;
		int generacion = 1;

		while (cambios) {
			System.out.println("Generación " + generacion + ":");

			String[][] nuevaMatriz = new String[filas][columnas];
			cambios = false; // Reiniciar cambios para esta generación

			// Actualizar cada célula según las reglas
			for (int fila = 0; fila < filas; fila++) {
				for (int col = 0; col < columnas; col++) {
					int vecinasVivas = 0;

					// Contar vecinas vivas
					for (int i = -1; i <= 1; i++) {
						for (int j = -1; j <= 1; j++) {
							if (i == 0 && j == 0)
								continue;// para que no cuente la posicion de la que se esta analizando

							int filaVecina = fila + i;
							int colVecina = col + j;

							if (filaVecina >= 0 && filaVecina < filas && colVecina >= 0 && colVecina < columnas) {
								if (matriz[filaVecina][colVecina].equals(viva)) {
									vecinasVivas++;
								}
							}
						}
					}

					// Aplicar las reglas
					if (matriz[fila][col].equals(viva)) {
						if (vecinasVivas == 2 || vecinasVivas == 3) {
							nuevaMatriz[fila][col] = viva;
						} else {
							nuevaMatriz[fila][col] = muerta;
						}
					} else {
						if (vecinasVivas == 3) {
							nuevaMatriz[fila][col] = viva;
						} else {
							nuevaMatriz[fila][col] = muerta;
						}
					}
				}
			}

			// Mostrar la nueva generación
			for (int fila = 0; fila < filas; fila++) {
				for (int col = 0; col < columnas; col++) {
					System.out.print(nuevaMatriz[fila][col] + " ");
				}
				System.out.println();
			}

			// Comprobar si hay cambios
			for (int fila = 0; fila < filas; fila++) {
				for (int col = 0; col < columnas; col++) {
					if (matriz[fila][col].equals(nuevaMatriz[fila][col])) {
						cambios = true;
					}
				}
			}

			// Actualizar la matriz para la siguiente generación
			matriz = nuevaMatriz;
			generacion++;
			//una vez ñllegado a 100 romper bucle
			if (generacion==101) {
				break;
			}
		}
		
	}
}