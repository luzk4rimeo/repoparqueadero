package com.ceiba.dominio;

public class Vehiculo {
	
	private String marca;
	private String placa;
	private String color;
	private Integer cilindraje;
	
	/**
	 * @param marca
	 * @param placa
	 * @param color
	 * @param cilindraje
	 */
	public Vehiculo(String marca, String placa, String color, Integer cilindraje) {
		this.marca = marca;
		this.placa = placa;
		this.color = color;
		this.cilindraje = cilindraje;
	}
	/**
	 * @return the marca
	 */
	public String getMarca() {
		return marca;
	}
	/**
	 * @param marca the marca to set
	 */
	public void setMarca(String marca) {
		this.marca = marca;
	}
	/**
	 * @return the placa
	 */
	public String getPlaca() {
		return placa;
	}
	/**
	 * @param placa the placa to set
	 */
	public void setPlaca(String placa) {
		this.placa = placa;
	}
	/**
	 * @return the color
	 */
	public String getColor() {
		return color;
	}
	/**
	 * @param color the color to set
	 */
	public void setColor(String color) {
		this.color = color;
	}
	/**
	 * @return the cilindraje
	 */
	public Integer getCilindraje() {
		return cilindraje;
	}
	/**
	 * @param cilindraje the cilindraje to set
	 */
	public void setCilindraje(Integer cilindraje) {
		this.cilindraje = cilindraje;
	}
	
	

}
