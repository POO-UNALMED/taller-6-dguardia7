package vehiculos;

import java.util.*;
import java.util.Map.Entry;

public class Pais {

	private String nombre;
	private static ArrayList<Pais> paises = new ArrayList<Pais>();
	private static Map<Pais, Integer> x = new HashMap<Pais, Integer>();
	private int total;
	
	public Pais(String nombre) {
		this.setNombre(nombre);
		paises.add(this);
		/*Pais pais = this;
		if(!x.containsKey(pais)) {
			x.put(pais, 1);
		}else {
			x.put(pais, x.get(pais)+1);
		}*/
		
	}

	public String getNombre() {
		return nombre;
	}

	public void setNombre(String nombre) {
		this.nombre = nombre;
	}
	
	public static ArrayList<Pais> getPaises() {
		return paises;
	}

	public static void setPaises(ArrayList<Pais> paises) {
		Pais.paises = paises;
	}

	public int getTotal() {
		return total;
	}

	public void setTotal(int total) {
		this.total = total;
	}

	public static Pais paisMasVendedor() {
		/*for(int i = 0; i < paises.size(); i++) {
			Pais pais = paises.get(i);
			if(!x.containsKey(pais)) {
				x.put(pais, 1);
			}else {
				x.put(pais, x.get(pais)+1);
			}
		}
		Collection<Integer> cantidades2 = x.values();
        ArrayList<Integer> cantidades = new  ArrayList<>(cantidades2);
        int mayor = Collections.max(cantidades);
        Pais salida = null;
        for (Entry<Pais, Integer> entry : x.entrySet()) {
            if (entry.getValue().equals(mayor)) {
                salida = entry.getKey();
            }
        }
        return salida;*/
		Collections.sort(paises, new Comparator<Pais>() {
			   public int compare(Pais pais1, Pais pais2) {
			      return new Integer(pais2.getTotal()).compareTo(pais1.getTotal());
			   }
			}
		)
		;
		return paises.get(0);
		
	}

}
