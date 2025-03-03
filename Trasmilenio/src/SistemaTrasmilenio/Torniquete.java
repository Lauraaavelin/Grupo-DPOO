package SistemaTrasmilenio;

public class Torniquete {
      private String identificador;
	    private String entrada;
      private String salida;
	    private double saldo;
      private double diferencia;
      public Torniquete(String identificador,String entrada,String salida,
                        double saldo,double diferencia) {
	        this.identificador = identificador;
	        this.entrada = entrada;
          this.salida = salida;
          this.saldo = saldo;
          this.diferencia = diferencia;
	    }
}
