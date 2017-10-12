/**
 * 
 */
package testdatabuilder;

import com.ceiba.dominio.Vehiculo;

/**
 * @author luz.ocampo
 *
 */
public class VehiculoTestDataBuilder {

	private static final String MARCA = "Picanto";
	private static final String PLACA = "IPY735";
	private static final String COLOR = "Gris";
	private static final Integer CILINDRAJE = 1250;
	
	
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
	public VehiculoTestDataBuilder() {
		this.marca = MARCA;
		this.placa = PLACA;
		this.color = COLOR;
		this.cilindraje = CILINDRAJE;
	}



	public VehiculoTestDataBuilder conMarca(String marca) {
		this.marca = marca;
		return this;
	}
	
	public VehiculoTestDataBuilder conPlaca(String placa) {
		this.placa = placa;
		return this;
	}
	
	public VehiculoTestDataBuilder conColor(String color) {
		this.color = color;
		return this;
	}
	
	public VehiculoTestDataBuilder conCilindraje(Integer cilindraje) {
		this.cilindraje = cilindraje;
		return this;
	}
	
	public Vehiculo build() {
		return new Vehiculo(this.marca, this.placa, this.color, this.cilindraje);
	}
	
	

}
