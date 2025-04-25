package Clase;

public class Vehiculo {
	private String placa;
	private int  tipo;
	public Vehiculo(String placa, int tipo) {
		
		this.placa = placa;
		this.tipo = tipo;
		
	}
	public String getPlaca() {
		return placa;
	}
	public void setPlaca(String placa) {
		this.placa = placa;
	}
	public int getTipo() {
		return tipo;
	}
	public void setTipo(int tipo) {
		this.tipo = tipo;
	}
	
}
