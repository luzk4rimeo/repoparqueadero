/**
 * 
 */
package com.ceiba.repositorio;

import com.ceiba.dominio.Vehiculo;

/**
 * @author luz.ocampo
 *
 */
public interface RepositorioVehiculo {
	
	/**
	 * 
	 * @param placa
	 * @return
	 */
	Vehiculo obtenerVehiculoByPlaca(String placa);
	
	/**
	 * Permite agregar un vehiculo al repositorio
	 * @param vehiculo
	 */
	void agregarVehiculo(Vehiculo vehiculo);
	

}
