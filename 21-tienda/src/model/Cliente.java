package model;

public class Cliente {

	public double saldo;
	public String nombre;

	public Cliente(double saldo, String nombre) {
		super();
		this.saldo = saldo;
		this.nombre = nombre;
	}

	public void comprar(Producto p, Vendedor v) {
		if (this.saldo>=p.precio) {
			System.out.println(this.nombre + " compra " +p.nombre + " por "+ p.precio +"€"  );
			this.saldo-=p.precio;
			
		}else {
			System.out.println("pobre detectado");
		}
	}
}
