package arrays;

public class Main {

	public static void main(String[] args) {
		// System.out.println(args);

		String[] semana = new String[7];

		semana[0] = "Lunes";
		semana[1] = "Martes";
		semana[1] = semana[1] + "Otro valor";
		semana[1] = null;

		System.out.println(semana[1]);
		
		System.out.println(semana.length);
		
		String[] semana2 = { "lunes", "martes" };

		// System.out.println(args[1]);
		// for (int i=0; i< args.length; i++) {
		// System.out.println(args[i]);
		// }
	}

}
