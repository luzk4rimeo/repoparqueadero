package co.ceiba.dominio;

import com.sun.jmx.snmp.Timestamp;

public class Parqueadero {
	
	private static final Double valorfechahoracarro = 1000.0;
	private static final Double valorfechadiacarro = 8000.0;
	private static final Double valorfechahoramoto =  500.0;
	private static final Double valorfechadiamoto = 600.0;
	private Integer numeroParqueaderoCarro = 20;
	private Integer numeroParqueaderoMoto = 10;
	private Timestamp fechahoraingreso;
	private Timestamp fechahoraretiro;
	private Vehiculo vehiculo;
	
	
	
	
	public Integer getNumeroParqueaderoCarro() {
		return numeroParqueaderoCarro;
	}
	
	public void setNumeroParqueaderoCarro(Integer numeroParqueaderoCarro) {
		this.numeroParqueaderoCarro = numeroParqueaderoCarro;
	}
	
	public Integer getNumeroParqueaderoMoto() {
		return numeroParqueaderoMoto;
	}
	
	public void setNumeroParqueaderoMoto(Integer numeroParqueaderoMoto) {
		this.numeroParqueaderoMoto = numeroParqueaderoMoto;
	}
	
	public static Double getValorfechahoracarro() {
		return valorfechahoracarro;
	}
	
	public static Double getValorfechadiacarro() {
		return valorfechadiacarro;
	}
	
	public static Double getValorfechahoramoto() {
		return valorfechahoramoto;
	}
	
	public static Double getValorfechadiamoto() {
		return valorfechadiamoto;
	}

	public Timestamp getFechahoraingreso() {
		return fechahoraingreso;
	}

	public void setFechahoraingreso(Timestamp fechahoraingreso) {
		this.fechahoraingreso = fechahoraingreso;
	}

	public Timestamp getFechahoraretiro() {
		return fechahoraretiro;
	}

	public void setFechahoraretiro(Timestamp fechahoraretiro) {
		this.fechahoraretiro = fechahoraretiro;
	}

	public Vehiculo getVehiculo() {
		return vehiculo;
	}

	public void setVehiculo(Vehiculo vehiculo) {
		this.vehiculo = vehiculo;
	}
	

	
	

	
}
