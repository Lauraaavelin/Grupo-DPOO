package SistemaTrasmilenio;

public abstract class Cliente {
	private int tarifa;
	
	private String tipo;

	public Cliente(String tipo) {
		this.tipo = tipo;
		if (this.tipo.equals("Preferencial")) {
			this.tarifa = 2400;
			}
		else {
			this.tarifa = 3200;
		}
	}

	public int getTarifa() {
		return this.tarifa;
	}

	public String getTipo() {
		return tipo;
	}



	
	
	
	
}
