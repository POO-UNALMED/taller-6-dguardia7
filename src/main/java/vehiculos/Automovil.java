package vehiculos;

public class Automovil extends Vehiculo {
	
	private int puestos;
	private static int totalAutomoviles;
	
	public Automovil(String placa, String nombre, float precio, float peso, Fabricante fabricante, int puestos) {
		super(placa, 4, 100, nombre, precio, peso, "FWD", fabricante);
		this.setPuestos(puestos);
		totalAutomoviles++;
		// TODO Auto-generated constructor stub
	}

	public int getPuestos() {
		return puestos;
	}

	public void setPuestos(int puestos) {
		this.puestos = puestos;
	}

	public static int getTotalAutomoviles() {
		return totalAutomoviles;
	}

	public static void setTotalAutomoviles(int totalAutomoviles) {
		Automovil.totalAutomoviles = totalAutomoviles;
	}
}
