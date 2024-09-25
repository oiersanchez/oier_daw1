package descuentos;

import java.util.Scanner;

public class Descuentos {

	Scanner entrada = new Scanner(System.in);

	public static void main(String[] args) {
		Scanner entrada = new Scanner(System.in);

		System.out.println("Escribe el importe de la compra");
		double numero = entrada.nextDouble();
		double importe = numero;

		System.out.println("¿Que tipo de afiliacion tiene?");
		String tipo = entrada.next();

		switch (tipo) {
		case "normal":
			System.out.println("Al ser cliente normal no dispondras de ningun descuento, el precio final es: "+ numero);
			break;
		case "socio":
			double cinco = importe * 0.05;
			double resultado = importe - cinco;
			System.out.println("Al ser un cliente socio dispondras de un descuento del 5% el total de su compra sera "+ resultado);
			break;
		case "vip":
			double veinte = importe * 0.20;
			double resultado2 = importe - veinte;
			System.out.println("Al ser un cliente vip se te aplicara un descuento del 20% " + resultado2);
			break;
		default:
			System.out.println("opcion no valida");
		}

		entrada.close();
	}
}
