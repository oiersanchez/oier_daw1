package operadores;

public class Main {

	public static void main(String[] args) {
		/*operadores aritmeticos*/
		
			// +	sumar 2 valores
		int n1 = 3;
		int n2 = 4;
		System.out.println(n1+n2);		
		int n3 = 6;
		float n4 = 3.5f;
		System.out.println(n3+n4);
		
			// -	restar 2 valores
		int n5 = 8;
		double n6 = 9.8;
		System.out.println(n6-n5);
		
			// /	dividir 2 valoes
		float n7 = 15.5f;
		int n8 = 5;
		System.out.println(n7/n8);
		
			// *	multiplicar
		int n9 = -1000;
		int n10= -5;
		System.out.println(n9*n10);
		
			// %	modulo/hondarra/resto
		System.out.println(n2%n10);
		
			// ++	aumento (suma 1)
		int n11 = 4;
		n11 = n11 + 1;
		n11++;
		System.out.println(n11);
		
			// --	decremento
		n11 = n11 - 1;
		n11--;
		System.out.println(n11);
		
	
		//operadores relacionales
			//==
		System.out.println(1 == 1);
		System.out.println(1 == 2);
		
			//!=
		System.out.println(1 != 1);
		System.out.println(1 != 2);
		
			//>
		System.out.println(2 > 1);
		System.out.println(1 > 2);
		
			//<
		System.out.println(2 < 1);
		System.out.println(1 < 2);
		
			//>=
		System.out.println(2 >= 1);
		System.out.println(1 >= 2);
		
			//<=
		System.out.println(2 <= 1);
		System.out.println(1 <= 2);

		//operadores logicos
			//&& y
		System.out.println((1>0) && (1<2));
		System.out.println((1>0) && (2<1));
		
			//|| o
		System.out.println((1>0) || (1<2));
		System.out.println((1>0) || (2<1));
		
			//! ngeacion
		System.out.println(! (1>0));
		System.out.println(! (2<1));
	}

}
