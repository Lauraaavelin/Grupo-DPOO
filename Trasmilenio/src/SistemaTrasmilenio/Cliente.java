package SistemaTrasmilenio;

public abstract class Cliente {
	
	public static final  String  ASEO = "aseo";
	public static String tipo;
	public static String getTipo() {
		return tipo;
	}
	public static void setTipo(String tipo) {
		Cliente.tipo = tipo;
	}
	
	public abstract int  getTarifa();
}
