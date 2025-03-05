package SistemaTrasmilenio;

public abstract class Bus {
		
		private int capacidad;
		private String identifiador;
		private String conductor;
		private String estado;
		public Bus(int capacidad, String identifiador, String conductor, String estado) {
			super();
			this.capacidad = capacidad;
			this.identifiador = identifiador;
			this.conductor = conductor;
			this.estado = estado;
		}
		public int getCapacidad() {
			return capacidad;
		}
		public String getIdentifiador() {
			return identifiador;
		}
		public String getConductor() {
			return conductor;
		}
		public String getEstado() {
			return estado;
		}
		
		
		

}
