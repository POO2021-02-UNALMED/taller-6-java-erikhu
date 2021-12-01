package vehiculos;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.Set;

public class Pais {
	private static Set<String> nombres = new HashSet<String>();
	public Pais(String nombre) {
		this.setNombre(nombre);
		nombres.add(nombre);		
	}

	private String nombre;
	
	public static ArrayList<Vehiculo> vehiculos = new ArrayList<Vehiculo>();

	public static Pais paisMasVendedor() {
		Pais pais = null;
		long cant = 0;
		
		for(String nombre: nombres) {
			long cantVehiculos = vehiculos
					.stream()
					.filter((vehiculo) -> vehiculo.getFabricante().getPais().getNombre().equals(nombre)).count();
			System.out.println(cantVehiculos + " " + nombre);
			if(cantVehiculos > cant) {
				cant = cantVehiculos;
				pais = new Pais(nombre);
			}
		}
		
		return pais;
	}

	public String getNombre() {
		return nombre;
	}

	public void setNombre(String nombre) {
		this.nombre = nombre;
	}
}
