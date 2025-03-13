package SistemaTrasmilenio;

public class Torniquete {
      private String identificador;
	  private int entrada;
      private int salida;
	  private double saldo;
      private double diferencia;
      public Torniquete(String identificador,int entrada,int salida,
          double saldo) {
	      this.identificador = identificador;
	      this.entrada = entrada;
          this.salida = salida;
          this.saldo = saldo;
          this.diferencia = (this.saldo - this.salida);
	    }
}
