package com.ceiba.dominio;

import java.util.Date;

public class Parqueadero {
	
	private String codigoUbicacion;
	private Vehiculo vehiculo;
	private Date fechaHoraIngreso;
	private Date fechaHoraSalida;
	
	
	
	/**
	 * @param codigoUbicacion
	 * @param vehivulo
	 * @param fechaHoraIngreso
	 * @param fechaHoraSalida
	 */
	public Parqueadero(String codigoUbicacion, Vehiculo vehiculo, Date fechaHoraIngreso, Date fechaHoraSalida) {
		this.codigoUbicacion = codigoUbicacion;
		this.vehiculo = vehiculo;
		this.fechaHoraIngreso = fechaHoraIngreso;
		this.fechaHoraSalida = fechaHoraSalida;
	}
	/**
	 * @return the codigoUbicacion
	 */
	public String getCodigoUbicacion() {
		return codigoUbicacion;
	}
	/**
	 * @param codigoUbicacion the codigoUbicacion to set
	 */
	public void setCodigoUbicacion(String codigoUbicacion) {
		this.codigoUbicacion = codigoUbicacion;
	}
	/**
	 * @return the vehiculo
	 */
	public Vehiculo getVehiculo() {
		return vehiculo;
	}
	/**
	 * @param vehiculo the vehiculo to set
	 */
	public void setVehiculo(Vehiculo vehiculo) {
		this.vehiculo = vehiculo;
	}
	/**
	 * @return the fechaHoraIngreso
	 */
	public Date getFechaHoraIngreso() {
		return fechaHoraIngreso;
	}
	/**
	 * @param fechaHoraIngreso the fechaHoraIngreso to set
	 */
	public void setFechaHoraIngreso(Date fechaHoraIngreso) {
		this.fechaHoraIngreso = fechaHoraIngreso;
	}
	/**
	 * @return the fechaHoraSalida
	 */
	public Date getFechaHoraSalida() {
		return fechaHoraSalida;
	}
	/**
	 * @param fechaHoraSalida the fechaHoraSalida to set
	 */
	public void setFechaHoraSalida(Date fechaHoraSalida) {
		this.fechaHoraSalida = fechaHoraSalida;
	}
	
	

}
