package vehiculos;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;
import java.util.Comparator;
import java.util.HashMap;
import java.util.Map;
import java.util.Map.Entry;

public class Fabricante {

	private String nombre;
	private Pais pais;
	private static ArrayList<Fabricante> fabricantes = new ArrayList<Fabricante>();
	private static Map<Fabricante, Integer> x = new HashMap<Fabricante, Integer>();
	private int total;
	
	public Fabricante(String nombre, Pais pais) {
		this.setNombre(nombre);
		this.setPais(pais);
		fabricantes.add(this);
		/*if(!x.containsKey(this)) {
			x.put(this, 1);
		}else {
			x.put(this, x.get(this)+1);
		}*/
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
	
	public static ArrayList<Fabricante> getFabricantes() {
		return fabricantes;
	}

	public static void setFabricantes(ArrayList<Fabricante> fabricantes) {
		Fabricante.fabricantes = fabricantes;
	}

	public int getTotal() {
		return total;
	}

	public void setTotal(int total) {
		this.total = total;
	}

	public static Fabricante fabricaMayorVentas() {
		/*for(int i = 0; i < fabricantes.size(); i++) {
			Fabricante fabricante = fabricantes.get(i);
			if(!x.containsKey(fabricante)) {
				x.put(fabricante, 1);
			}else {
				x.put(fabricante, x.get(fabricante)+1);
			}
		}
		Collection<Integer> cantidades2 = x.values();
        ArrayList<Integer> cantidades = new  ArrayList<>(cantidades2);
        int mayor = Collections.max(cantidades);
        Fabricante salida = null;
        String nombre = "";
        for (Entry<Fabricante, Integer> entry : x.entrySet()) {
            if (entry.getValue().equals(mayor)) {
                salida = entry.getKey();
            }
        }
        for(Fabricante i: fabricantes) {
        	if (i.getNombre()==nombre) {
        		salida = i;
        	}
        }
        //salida = Fabricante.fabricantes.get(fabricantes.indexOf(nombre));
        return salida; */
		
		Collections.sort(fabricantes, new Comparator<Fabricante>() {
			
			   public int compare(Fabricante fabricante1, Fabricante fabricante2) {
			      return new Integer(fabricante2.getTotal()).compareTo(fabricante1.getTotal());
			   }
			   
			}
		)
		;
		return fabricantes.get(0);
	}

}
