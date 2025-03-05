package SistemaTrasmilenio;

public class Patio {
      private String ubicacion;
	  private int cantidadBuses;

	    public Patio(String ubicacion, int cantidadBuses) {
	        this.ubicacion = ubicacion;
	        this.cantidadBuses = cantidadBuses;
	    }

	    public String getUbicacion() {
	        return ubicacion;
	    }

	    public int getCantidadBuses() {
	        return cantidadBuses;
	    }
}
