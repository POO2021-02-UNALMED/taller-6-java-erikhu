package vehiculos;

public class Camioneta extends Vehiculo {
	private boolean volco;
	
	public static int camionetas;
	
	public Camioneta() {
		super();
		camionetas += 1;
	}

	public Camioneta(String placa, int puertas, String nombre, int precio, int peso, Fabricante fabricante, boolean volco) {
		super(placa, puertas, 90, nombre, precio, peso, "4X4", fabricante);
		camionetas += 1;
		this.setVolco(volco);
	}

	public boolean isVolco() {
		return volco;
	}

	public void setVolco(boolean volco) {
		this.volco = volco;
	}
}
