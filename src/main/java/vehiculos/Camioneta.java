package vehiculos;

public class Camioneta extends Vehiculo {

	private boolean volco;
	private static int totalCamionetas;
	
	public Camioneta(String placa, int puertas, String nombre, float precio, float peso, Fabricante fabricante, boolean volco) {
		super(placa, puertas, 90, nombre, precio, peso, "4X4", fabricante);
		this.setVolco(volco);
		setTotalCamionetas(getTotalCamionetas() + 1);
		// TODO Auto-generated constructor stub
	}

	public boolean isVolco() {
		return volco;
	}

	public void setVolco(boolean volco) {
		this.volco = volco;
	}

	public static int getTotalCamionetas() {
		return totalCamionetas;
	}

	public static void setTotalCamionetas(int totalCamionetas) {
		Camioneta.totalCamionetas = totalCamionetas;
	}
	
}
