package pn;

import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
Scanner entrada = new Scanner(System.in);
		
		System.out.println("Introduce un numero");
		int num1 = entrada.nextInt(); 
		System.out.println("Introduce otro numero");
		int num2 = entrada.nextInt(); 
		System.out.println("Introduce otro numero");
		int num3 = entrada.nextInt(); 
		System.out.println("Introduce otro numero");
		int num4 = entrada.nextInt(); 
		System.out.println("Introduce otro numero");
		int num5 = entrada.nextInt(); 
		
		int[] numero = new int[5];

		numero[0] = num1;
		numero[1] = num2;
		numero[2] = num3;
		numero[3] = num4;
		numero[4] = num5;
		
		
		entrada.close();
	}

}
