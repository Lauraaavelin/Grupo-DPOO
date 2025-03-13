package SistemaTrasmilenio;

import java.util.*;
import java.time.LocalDateTime;


public class Ruta {
      private String numeroIdentificador;
      private String origin;
	  private String destino;
	  private int kilometros;
	  private LocalDateTime horairo;
	  private int tiempoPromedioMinutos;
	  private ArrayList<Estación> listEstaciones;
	  public final static int ZONAL= 1;
	  public final static int TRONCAL=0;
	  private int tipo;
	  
	  
	 
	  
public Ruta(String numeroIdentificador, String origin, String destino, int kilometros, LocalDateTime horairo,
			int tiempoPromedioMinutos, ArrayList<Estación> listEstaciones) {
		super();
		this.numeroIdentificador = numeroIdentificador;
		this.origin = origin;
		this.destino = destino;
		this.kilometros = kilometros;
		this.horairo = horairo;
		this.tiempoPromedioMinutos = tiempoPromedioMinutos;
		this.listEstaciones = listEstaciones;
		if (listEstaciones.getFirst() instanceof Zonal ) {
			this.tipo = ZONAL;}
		if (listEstaciones.getFirst() instanceof Troncal){
			this.tipo= TRONCAL;
		}
	}
public void AgregarParada(Estación estacion, int posicion) {
	listEstaciones.add(posicion, estacion);
}

public void EliminarParada(Estación estacion) {
	listEstaciones.remove(estacion);
}
public String getNumeroIdentificador() {
	return numeroIdentificador;
}
public void setNumeroIdentificador(String numeroIdentificador) {
	this.numeroIdentificador = numeroIdentificador;
}
public String getOrigin() {
	return origin;
}
public void setOrigin(String origin) {
	this.origin = origin;
}
public String getDestino() {
	return destino;
}
public void setDestino(String destino) {
	this.destino = destino;
}
public int getKilometros() {
	return kilometros;
}
public void setKilometros(int kilometros) {
	this.kilometros = kilometros;
}
public LocalDateTime getHorairo() {
	return horairo;
}
public void setHorairo(LocalDateTime horairo) {
	this.horairo = horairo;
}
public int getTiempoPromedioMinutos() {
	return tiempoPromedioMinutos;
}
public void setTiempoPromedioMinutos(int tiempoPromedioMinutos) {
	this.tiempoPromedioMinutos = tiempoPromedioMinutos;
}
public ArrayList<Estación> getListEstaciones() {
	return listEstaciones;
}
public void setListEstaciones(ArrayList<Estación> listEstaciones) {
	this.listEstaciones = listEstaciones;
}
public int getTipo() {
	return tipo;
}
public void setTipo(int tipo) {
	this.tipo = tipo;
}


}
