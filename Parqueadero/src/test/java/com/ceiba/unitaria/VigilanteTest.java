/**
 * 
 */
package com.ceiba.unitaria;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertTrue;
import static org.mockito.Mockito.mock;
import static org.mockito.Mockito.when;

import org.junit.Test;

import com.ceiba.dominio.Parqueadero;
import com.ceiba.dominio.Vigilante;
import com.ceiba.repositorio.RepositorioParqueadero;

import testdatabuilder.VehiculoTestDataBuilder;

/**
 * @author luz.ocampo
 *
 */
public class VigilanteTest {

	@Test
	public void validarCupoDisponibleTest() {

		// arrange
		RepositorioParqueadero repositorioParqueadero = mock(RepositorioParqueadero.class);

		when(repositorioParqueadero.obtenerCupoDisponible()).thenReturn(true);

		Vigilante vigilante = new Vigilante(repositorioParqueadero);
		// act
		boolean cupoDisponible = vigilante.validarCupoDisponible();

		// assert
		assertTrue(cupoDisponible);
	}

	@Test
	public void validarDiaPlacaTest() {
		// arrange
		RepositorioParqueadero repositorioParqueadero = mock(RepositorioParqueadero.class);

//		when(Vigilan.validarDiaPlaca()).thenReturn(true);

		Vigilante vigilante = new Vigilante(repositorioParqueadero);
		// act
		boolean placaPemritida = vigilante.validarDiaPlaca("IPY735");

		// assert
		assertTrue(placaPemritida);
	}
	
	@Test
	public void recibirVehiculo() {
		// arrange
		RepositorioParqueadero repositorioParqueadero = mock(RepositorioParqueadero.class);
		Vigilante vigilante = new Vigilante(repositorioParqueadero);
		VehiculoTestDataBuilder vehiculoTestDataBuilder = new VehiculoTestDataBuilder();
		
		
	}
	
	@Test
	public void calcularHoraServicioMayorCeroTest() {
		// arrange
		RepositorioParqueadero repositorioParqueadero = mock(RepositorioParqueadero.class);
		Parqueadero parqueadero = mock(Parqueadero.class);
//		when(Vigilan.validarDiaPlaca()).thenReturn(true);

		Vigilante vigilante = new Vigilante(repositorioParqueadero);
		// act
		int horas = vigilante.calcularHoraServicio(parqueadero);

		// assert
		assertTrue(horas>0);
	}

}
