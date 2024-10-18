package modelo;

public class Piloto extends Persona {
	public String coche;
	public void pilotar() {
		System.out.println("Brooooom");
	}
	@Override
	public void saludar() {
		System.out.println("Te fundooo Ñiiiii");
	}
	public void saludar(String saludo) {
		System.out.println(saludo);
	}
}

