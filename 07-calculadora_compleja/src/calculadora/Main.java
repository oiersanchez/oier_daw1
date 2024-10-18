package calculadora;

import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		Scanner entrada = new Scanner(System.in);

		System.out.println("introduce un numero");
		int numero1 = entrada.nextInt();
		System.out.println("Introduce la operacion");
		String operacion = entrada.next();
		System.out.println("introduce otro numero");
		int numero2 = entrada.nextInt();

		switch (operacion) {
		case "+":
			System.out.println(numero1 + numero2);
			break;
		case "-":
			System.out.println(numero1 - numero2);
			break;
		case "/":
			System.out.println(numero1 / numero2);
			break;
		case "*":
			System.out.println(numero1 * numero2);
			break;
		default:
			System.out.println("Operacion no valida >:(");
		}

		entrada.close();

	}

}
