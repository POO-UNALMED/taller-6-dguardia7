package vehiculos;

public class Camion extends Vehiculo{

	private int ejes;
	private static int totalCamiones;
	
	public Camion(String placa, String nombre, float precio, float peso, Fabricante fabricante, int ejes) {
		super(placa, 2, 80, nombre, precio, peso, "4X2", fabricante);
		this.setEjes(ejes);
		setTotalCamiones(getTotalCamiones() + 1);
		// TODO Auto-generated constructor stub
	}

	public int getEjes() {
		return ejes;
	}

	public void setEjes(int ejes) {
		this.ejes = ejes;
	}

	public static int getTotalCamiones() {
		return totalCamiones;
	}

	public static void setTotalCamiones(int totalCamiones) {
		Camion.totalCamiones = totalCamiones;
	}
}
