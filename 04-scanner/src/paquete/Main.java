package paquete;

import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		Scanner entrada = new Scanner(System.in);
		
		System.out.println("introduce un numero");
		int numero = entrada.nextInt();
		
		System.out.println(numero);
		
		entrada.close();
	}

}
