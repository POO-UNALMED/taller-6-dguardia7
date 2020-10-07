package vehiculos;

public class Vehiculo {

	private String placa;
	private int puertas;
	private int velocidadMaxima;
	private String nombre;
	private float precio;
	private float peso;
	private String traccion;
	private Fabricante fabricante;
	private static int cantidadVehiculos;
	
	//Vehiculo(){}
	public Vehiculo(String placa, int puertas, int velocidadMaxima, String nombre,float precio,
			float peso, String traccion, Fabricante fabricante){
		this.setPlaca(placa);
		this.setPuertas(puertas);
		this.setVelocidadMaxima(velocidadMaxima);
		this.setNombre(nombre);
		this.setPrecio(precio);
		this.setPeso(peso);
		this.setTraccion(traccion);
		this.setFabricante(fabricante);
		cantidadVehiculos++;
	}
	
	public String getPlaca() {
		return placa;
	}
	public void setPlaca(String placa) {
		this.placa = placa;
	}
	public int getPuertas() {
		return puertas;
	}
	public void setPuertas(int puertas) {
		this.puertas = puertas;
	}
	public int getVelocidadMaxima() {
		return velocidadMaxima;
	}
	public void setVelocidadMaxima(int velocidadMaxima) {
		this.velocidadMaxima = velocidadMaxima;
	}
	public String getNombre() {
		return nombre;
	}
	public void setNombre(String nombre) {
		this.nombre = nombre;
	}
	public float getPrecio() {
		return precio;
	}
	public void setPrecio(float precio) {
		this.precio = precio;
	}
	public float getPeso() {
		return peso;
	}
	public void setPeso(float peso) {
		this.peso = peso;
	}
	public String getTraccion() {
		return traccion;
	}
	public void setTraccion(String traccion) {
		this.traccion = traccion;
	}
	public Fabricante getFabricante() {
		return fabricante;
	}
	public void setFabricante(Fabricante fabricante) {
		this.fabricante = fabricante;
	}
	
	public static int getCantidadVehiculos() {
		return cantidadVehiculos;
	}
	public static void setCantidadVehiculos(int cantidad) {
		Vehiculo.cantidadVehiculos = cantidad;
	}
	public String vehiculosPorTipo() {
		return "Automoviles: " + Automovil.getTotalAutomoviles() + "\n" + 
				"Camionetas: " + Camioneta.getTotalCamionetas() + "\n" + 
				"Camiones: " + Camion.getTotalCamiones();
	}
	


}
