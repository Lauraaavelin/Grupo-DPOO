package SistemaTrasmilenio;

public abstract class Estación {
	private String nombre;

	public Estación(String nombre) {
		super();
		this.nombre = nombre;
	}

	public String getNombre() {
		return nombre;
	}

	public void setNombre(String nombre) {
		this.nombre = nombre;
	}
	
}
