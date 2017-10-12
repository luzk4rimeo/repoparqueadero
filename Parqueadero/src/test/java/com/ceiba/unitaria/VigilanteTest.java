/**
 * 
 */
package com.ceiba.unitaria;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertTrue;
import static org.mockito.Mockito.mock;
import static org.mockito.Mockito.when;

import org.junit.Test;

import com.ceiba.dominio.Vigilante;
import com.ceiba.repositorio.RepositorioParqueadero;
import com.ceiba.repositorio.RepositorioVehiculo;

/**
 * @author luz.ocampo
 *
 */
public class VigilanteTest {

	@Test
	public void validarCupoDisponibleTest() {

		// arrange
		RepositorioParqueadero repositorioParqueadero = mock(RepositorioParqueadero.class);
		RepositorioVehiculo repositorioVehiculo = mock(RepositorioVehiculo.class);

		when(repositorioParqueadero.obtenerCupoDisponible()).thenReturn(true);

		Vigilante vigilante = new Vigilante(repositorioVehiculo, repositorioParqueadero);
		// act
		boolean cupoDisponible = vigilante.validarCupoDisponible();

		// assert
		assertTrue(cupoDisponible);
	}

	@Test
	public void validarDiaPlacaTest() {
		// arrange
		RepositorioParqueadero repositorioParqueadero = mock(RepositorioParqueadero.class);
		RepositorioVehiculo repositorioVehiculo = mock(RepositorioVehiculo.class);

//		when(Vigilan.validarDiaPlaca()).thenReturn(true);

		Vigilante vigilante = new Vigilante(repositorioVehiculo, repositorioParqueadero);
		// act
		boolean placaPemritida = vigilante.validarDiaPlaca("IPY735");

		// assert
		assertTrue(placaPemritida);
	}
	
	@Test
	public void calcularHoraServicioMayorCeroTest() {
		// arrange
		RepositorioParqueadero repositorioParqueadero = mock(RepositorioParqueadero.class);
		RepositorioVehiculo repositorioVehiculo = mock(RepositorioVehiculo.class);

//		when(Vigilan.validarDiaPlaca()).thenReturn(true);

		Vigilante vigilante = new Vigilante(repositorioVehiculo, repositorioParqueadero);
		// act
		int horas = vigilante.calcularHoraServicio();

		// assert
		assertTrue(horas>0);
	}

}
