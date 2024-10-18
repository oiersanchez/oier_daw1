package mese;

import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		Scanner entrada = new Scanner(System.in);

		String[] mes = new String[12];

		mes[0] = "Enero";
		mes[1] = "Febero";
		mes[2] = "Marzo";
		mes[3] = "Abril";
		mes[4] = "Mayo";
		mes[5] = "Junio";
		mes[6] = "Julio";
		mes[7] = "Agosto";
		mes[8] = "Septiembre";
		mes[9] = "Octubre";
		mes[10] = "Noviembre";
		mes[11] = "Diciembre";

		System.out.println("Introduce el numero del mes");
		int numero = entrada.nextInt();
		if(numero>0 && numero<=12) {
			System.out.println(mes[numero-1]);
		}else {
			System.out.println("Ese mes no existe");
		}
		entrada.close();
	}

}
