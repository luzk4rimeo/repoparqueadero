package com.ceiba.dominio;

import com.ceiba.repositorio.RepositorioParqueadero;
import com.ceiba.repositorio.RepositorioVehiculo;

public class Vigilante {

	public static final String MENSAJE_DIA_INHABILITADO_PLACA = "No puede ingresar porque no está en un dia habil";

	private RepositorioVehiculo repositorioVehiculo;
	private RepositorioParqueadero repositorioParqueadero;

	/**
	 * @param repositorioVehiculo
	 * @param repositorioParqueadero
	 */
	public Vigilante(RepositorioVehiculo repositorioVehiculo, RepositorioParqueadero repositorioParqueadero) {
		this.repositorioVehiculo = repositorioVehiculo;
		this.repositorioParqueadero = repositorioParqueadero;
	}

	/**
	 * Recibe el vehiculo que ingresa al parqueadero
	 * 
	 * @param vehiculo
	 */
	public void recibirVehiculo(Vehiculo vehiculo) {
		if (validarCupoDisponible()) {
			if (validarDiaPlaca("IPY735")) {
				System.out.println("Vehiculo recibido");
			}
		}
	}

	/**
	 * Retira el vehiculo del parqueadero asignado
	 * 
	 * @return
	 */
	public boolean retirarVehiculo() {
		return true;
	}

	/**
	 * Valida el cilindraje del vehiculo en caso de ser moto
	 * 
	 * @return
	 */
	public boolean validarCilindraje() {
		return true;
	}

	/**
	 * Calcula el tiemp que permanecio de acuerdo a la hora y fecha de ingreso y
	 * salida
	 * 
	 * @return
	 */
	public int calcularHoraServicio() {
		return 1;
	}

	/**
	 * Calcula cuanto debe pagar el usuario de acuerdo al valor hora y al tiempo en
	 * el parqueadero
	 * 
	 * @return
	 */
	public Integer cobrar() {
		return 0;
	}

	/**
	 * Valida si el vehiculo de acuerdo a su placa puede ingresar ese día
	 * 
	 * @param placa
	 * @return
	 */
	public boolean validarDiaPlaca(String placa) {
		return true;
	}

	/**
	 * Consulta si hay un cupo disponible en el parqueadero
	 * 
	 * @return
	 */
	public boolean validarCupoDisponible() {
		return repositorioParqueadero.obtenerCupoDisponible();
		//
	}

}
