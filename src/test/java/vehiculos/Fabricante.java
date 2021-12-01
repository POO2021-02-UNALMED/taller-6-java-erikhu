package vehiculos;

public class Fabricante {
	public Fabricante(String nombre, Pais pais) {
		this.setNombre(nombre);
		this.setPais(pais);
	}
	private String nombre;
	private Pais pais;
	
	public static Vehiculo fabricaMayorVentas() {
		return null;
	}

	public String getNombre() {
		return nombre;
	}

	public void setNombre(String nombre) {
		this.nombre = nombre;
	}

	public Pais getPais() {
		return pais;
	}

	public void setPais(Pais pais) {
		this.pais = pais;
	}
}
