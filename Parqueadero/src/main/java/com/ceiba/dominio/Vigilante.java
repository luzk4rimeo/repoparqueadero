package com.ceiba.dominio;

import com.ceiba.repositorio.RepositorioParqueadero;

public class Vigilante {

	public static final String MENSAJE_DIA_INHABILITADO_PLACA = "No puede ingresar porque no esta en un dia habil";

	
	private RepositorioParqueadero repositorioParqueadero;

	/**
	 * @param repositorioVehiculo
	 * @param repositorioParqueadero
	 */
	public Vigilante(RepositorioParqueadero repositorioParqueadero) {
		this.repositorioParqueadero = repositorioParqueadero;
	}

	/**
	 * Recibe el vehiculo que ingresa al parqueadero
	 * 
	 * @param vehiculo
	 */
	public void recibirVehiculo(Vehiculo vehiculo) {
	}

	/**
	 * Retira el vehiculo del parqueadero asignado
	 * 
	 * @return
	 */
	public boolean retirarVehiculo(Parqueadero parqueadero) {
		repositorioParqueadero.retirar(parqueadero);
		return true;
	}

	/**
	 * Valida el cilindraje del vehiculo en caso de ser moto
	 * 
	 * @return
	 */
	public boolean validarCilindraje(int cilindraje) {
		return true;
	}

	/**
	 * Calcula el tiemp que permanecio de acuerdo a la hora y fecha de ingreso y
	 * salida
	 * 
	 * @return
	 */
	public int calcularHoraServicio(Parqueadero parqueadero) {
		return 1;
	}

	/**
	 * Calcula cuanto debe pagar el usuario de acuerdo al valor hora y al tiempo en
	 * el parqueadero
	 * 
	 * @return
	 */
	public Integer cobrar(int horas) {
		return 0;
	}

	/**
	 * Valida si el vehiculo de acuerdo a su placa puede ingresar ese dia
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
	}

}
