package notas;

import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		Scanner entrada = new Scanner(System.in);

		System.out.println("Introduce una nota");
		double num1 = entrada.nextInt();
		System.out.println("Introduce otra nota");
		double num2 = entrada.nextInt();
		System.out.println("Introduce otra nota");
		double num3 = entrada.nextInt();
		System.out.println("Introduce otra nota");
		double num4 = entrada.nextInt();
		System.out.println("Introduce otra nota");
		double num5 = entrada.nextInt();
		System.out.println("Introduce otra nota");
		double num6 = entrada.nextInt();
		System.out.println("Introduce otra nota");
		double num7 = entrada.nextInt();
		System.out.println("Introduce otra nota");
		double num8 = entrada.nextInt();
		System.out.println("Introduce otra nota");
		double num9 = entrada.nextInt();
		System.out.println("Introduce otra nota");
		double num10 = entrada.nextInt();

		double[] numero = new double[10];

		numero[0] = num1;
		numero[1] = num2;
		numero[2] = num3;
		numero[3] = num4;
		numero[4] = num5;
		numero[5] = num6;
		numero[6] = num7;
		numero[7] = num8;
		numero[8] = num9;
		numero[9] = num10;

		double suma = 0;

		for (int i = 0; i < numero.length; i++) {
			suma = suma + numero[i];
		}
		System.out.println("tu media es: " + suma / 10);
		entrada.close();
	}

}
