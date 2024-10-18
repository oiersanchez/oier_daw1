package palindromo;

import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		Scanner entrada = new Scanner(System.in);
		System.out.println("Introduce tu palabra");
		String palabra = entrada.next();
		String palabraSinEspacios = "";
		
		
		for (int i = 0; i < palabra.length(); i++) {
			if(palabra.charAt(i)!= ' ') {
				palabraSinEspacios = palabraSinEspacios + palabra.charAt(i);
			}
		}

		String palabraAlReves = "";
		for (int i = palabraSinEspacios.length() - 1; i >= 0; i--) {
			palabraAlReves = palabraAlReves + palabraSinEspacios.charAt(i);
			// palabra = oNA
			// 0 o // 0 A
			// 1 N // 1 N
			// 2 A // 2=o
		}
		System.out.println(palabraAlReves);
		if (palabraSinEspacios.equalsIgnoreCase(palabraAlReves)) {
			System.out.println("tu palabra es un palindromo");
		} else {
			System.out.println("tu palabra no es un palindromo");
		}
	}

}
