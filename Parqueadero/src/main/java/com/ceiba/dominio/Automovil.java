package com.ceiba.dominio;

public class Automovil extends Vehiculo{
	
	private String tipoAuto;
	
	

	/**
	 * @param marca
	 * @param placa
	 * @param color
	 * @param cilindraje
	 * @param tipoAuto
	 */
	public Automovil(String marca, String placa, String color, Integer cilindraje, String tipoAuto) {
		super(marca, placa, color, cilindraje);
		this.tipoAuto = tipoAuto;
	}

	/**
	 * @return the tipoAuto
	 */
	public String getTipoAuto() {
		return tipoAuto;
	}

	/**
	 * @param tipoAuto the tipoAuto to set
	 */
	public void setTipoAuto(String tipoAuto) {
		this.tipoAuto = tipoAuto;
	}
	
	
	
}
