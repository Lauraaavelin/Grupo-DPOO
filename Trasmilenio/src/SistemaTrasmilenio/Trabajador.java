package SistemaTrasmilenio;

public abstract class Trabajador {
	private  String nombre;
	private int Id;
	
	
	
	public Trabajador(String nombre, int iD) {
		this.nombre = nombre;
		this.Id = iD;

	}
	public String getNombre() {
		return nombre;
	}
	public int getID() {
		return Id;
	}

	
	
	
}
