package numero;

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
		
		 int max = numero[0]; 

	        for (int i = 1; i < numero.length; i++) {
	            if (numero[i] > max) {
	                max = numero[i]; 
	            }
	        }

	        System.out.println("El n�mero m�s alto es: " + max);
	}

}
