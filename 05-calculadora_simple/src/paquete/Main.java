package paquete;

import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		Scanner entrada = new Scanner(System.in);
		
		System.out.println("introduce un numero");
		int numero1 = entrada.nextInt();
		System.out.println("introduce otro numero");
		int numero2 = entrada.nextInt();
		
		System.out.println("+");
		System.out.println(numero1 + numero2);
		System.err.println("-");
		System.out.println(numero1 - numero2);
		System.out.println("/");
		System.out.println(numero1 / numero2);
		System.out.println("*");
		System.out.println(numero1 * numero2);
		
		entrada.close();
	}

}
