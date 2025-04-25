package Clase;

public class Conductor {
	private int areaLaboral;
	private String nombre, dni;
	
	public Conductor(int areaLaboral, String nombre, String dni) {

		this.nombre = nombre;
		this.areaLaboral = areaLaboral;
		this.dni = dni;
		
	}

	public int getAreaLaboral() {
		return areaLaboral;
	}

	public void setAreaLaboral(int areaLaboral) {
		this.areaLaboral = areaLaboral;
	}

	public String getNombre() {
		return nombre;
	}

	public void setNombre(String nombre) {
		this.nombre = nombre;
	}

	public String getDni() {
		return dni;
	}

	public void setDni(String dni) {
		this.dni = dni;
	}
}
