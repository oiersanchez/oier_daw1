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
			System.out.println("Al ser cliente normal no dispondras de ningun descuento, el precio final es: " + numero);
			break;
		case "socio":
			double s = importe * 0.05;
			double resultado = importe - s;
			System.out.println("Al ser un cliente socio dispondras de un descuento del 5% el total de su compra sera "+ resultado);
			break;
		case "vip":
			double v = importe * 0.20;
			double resultado2 = importe - v;
			System.out.println("Al ser un cliente vip se te aplicara un descuento del 20%, debera abonar la cantidad de " + resultado2);
			break;
		default:
			System.out.println("opcion no valida");
		}
		System.out.println("Muchas Gracias");
		entrada.close();
	}
}
