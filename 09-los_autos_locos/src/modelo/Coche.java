package modelo;

public class Coche {
	public String marca, modelo;
	public int vida;
	public int fuerza;
	public int capacidadDeposito, combustible;

	public Coche(String marca, String modelo, int vida, int fuerza, int capacidadDeposito) {
		super();
		this.marca = marca;
		this.modelo = modelo;
		this.vida = vida;
		this.fuerza = fuerza;
		this.capacidadDeposito = capacidadDeposito;
		this.combustible = capacidadDeposito; // LLeno

	}
		public void setFuerza(int fuerza) {
			if (fuerza<0) {
				this.fuerza=50;
			}
			this.fuerza=fuerza;}
			public int gettFuerza(int fuerza) {
			return this.fuerza;
				}
		
	public void chocar(Coche coche) {

	}

	public void arrancar() {
		// Validar combustible
		if (this.combustible > 0) {

			// arrancar
			System.out.println("Brooooom");
			// restar combustible
			this.combustible--;
		} else {

			// no arrancar
			// informar
			System.out.println("no hay combustible");

		}
	}
}
