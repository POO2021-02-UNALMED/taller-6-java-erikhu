package vehiculos;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.Set;

public class Fabricante {
	private static Set<String> nombres = new HashSet<String>();

	public Fabricante(String nombre, Pais pais) {
		this.setNombre(nombre);
		this.setPais(pais);
		nombres.add(nombre);
	}
	private String nombre;
	private Pais pais;
	
	public static ArrayList<Vehiculo> vehiculos = new ArrayList<Vehiculo>();
	
	public static Fabricante fabricaMayorVentas() {
		Fabricante fabricante = null;
		long cant = 0;
		
		for(String nombre: nombres) {
			Object[] vh = vehiculos
					.stream()
					.filter((vehiculo) -> vehiculo.getFabricante().getNombre().equals(nombre)).toArray();
			if(vh.length > cant) {
				cant = vh.length;
				fabricante = ((Vehiculo) vh[0]).getFabricante();
			}
		}
		
		return fabricante;
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
