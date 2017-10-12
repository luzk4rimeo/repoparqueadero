/**
 * 
 */
package com.ceiba.unitaria;

import static org.junit.Assert.assertEquals;

import org.junit.Test;

import com.ceiba.dominio.Vehiculo;

import testdatabuilder.VehiculoTestDataBuilder;

/**
 * @author luz.ocampo
 *
 */
public class VehiculoTest {

	private static final String MARCA = "Picanto";
	private static final String PLACA = "IPY735";
	private static final String COLOR = "Gris";
	private static final Integer CILINDRAJE = 1250;
	
	@Test
	public void crearVehiculoTest() {
		//arrange
		VehiculoTestDataBuilder vehiculoTestDataBuilder = new VehiculoTestDataBuilder().
				conMarca(MARCA).
				conPlaca(PLACA).
				conColor(COLOR).
				conCilindraje(CILINDRAJE);
		//act
		Vehiculo vehiculo = vehiculoTestDataBuilder.build();
		
		//assert
		assertEquals(MARCA, vehiculo.getMarca());
		assertEquals(PLACA, vehiculo.getPlaca());
		assertEquals(COLOR, vehiculo.getColor());
		assertEquals(CILINDRAJE, vehiculo.getCilindraje());
	}
}
