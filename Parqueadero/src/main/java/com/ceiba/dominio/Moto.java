package com.ceiba.dominio;

public class Moto extends Vehiculo {
	
	private Integer tiempo;
	

	/**
	 * @param marca
	 * @param placa
	 * @param color
	 * @param cilindraje
	 * @param tiempo
	 */
	public Moto(String marca, String placa, String color, Integer cilindraje, Integer tiempo) {
		super(marca, placa, color, cilindraje);
		this.tiempo = tiempo;
	}

	/**
	 * @return the tiempo
	 */
	public Integer getTiempo() {
		return tiempo;
	}

	/**
	 * @param tiempo the tiempo to set
	 */
	public void setTiempo(Integer tiempo) {
		this.tiempo = tiempo;
	}
	
	
	

}
