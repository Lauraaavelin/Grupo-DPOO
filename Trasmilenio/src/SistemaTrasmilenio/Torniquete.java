package SistemaTrasmilenio;

public class Torniquete {
      private String identificador;
	  private int entrada;
      private int salida;
	  private double saldo;
      private double diferencia;
      private int estado;
      
      public Torniquete(String identificador,int entrada,int salida,
          double saldo) {
	      this.identificador = identificador;
	      this.entrada = entrada;
          this.salida = salida;
          this.saldo = saldo;
          this.diferencia = (this.entrada - this.salida);
	   }
      public void Entrada( Cliente cliente ) {
    	  int tarifa= cliente.getTarifa();
    	  this.entrada+=1;
    	  this.saldo += tarifa;
    	  
    	  
      }
      
      public void Salida() {
    	  salida +=1;
    	  
      }
}	
