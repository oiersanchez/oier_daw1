package media;

import java.util.Scanner;

public class Main_medias {

	public static void main(String[] args) {
		Scanner entrada = new Scanner(System.in);

		System.out.println("introduce tu nombre");
		String alumno = entrada.next();

		System.out.println("introduce tu nota en matematicas");
		double matematica = entrada.nextDouble();
		System.out.println("Introduce tu nota en historia");
		double historia = entrada.nextDouble();
		System.out.println("introduce tu nota en euskera");
		double euskera = entrada.nextDouble();
		System.out.println("Introduce tu nota en lengua y literatura");
		double lengua = entrada.nextDouble();
		System.out.println("introduce tu nota en gimnasia");
		double gimnasia = entrada.nextDouble();

		{
		}

		double media = (gimnasia + lengua + euskera + historia + matematica) / 5;

		if (matematica < 5 || historia < 5 || euskera < 5 || lengua < 5 || gimnasia < 5) {
			System.out.println("El alumno " + alumno + " no es apto, tiene una asignatura suspendida");
		} else if (media >= 5) {
			System.out.println("El alumno " + alumno + " es apto, su media es " + media);
		} else {
			System.out.println("El alumno " + alumno + " no es apto, su media es " + media);

			entrada.close();

		}

	}
}
