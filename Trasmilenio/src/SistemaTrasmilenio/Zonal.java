package SistemaTrasmilenio;

public class Zonal extends Estación {
	private Torniquete torniquete;
	
	public Zonal(String nombre) {
		super(nombre);
			}

	public double  Saldo (double saldo) {
		return torniquete.getSaldo();
	}

}
