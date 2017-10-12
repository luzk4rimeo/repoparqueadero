/**
 * 
 */
package com.ceiba.repositorio;

import com.ceiba.dominio.Automovil;
import com.ceiba.dominio.Parqueadero;

/**
 * @author luz.ocampo
 *
 */
public interface RepositorioParqueadero {

	/**
	 * Permite obtener el Automovil parqueado
	 * @param placa
	 * @return
	 */
	Automovil obtenerAutomovilParqueadoByPlaca(String placa);
	
	/**
	 * Permite registrar un cupo de parqueadero asignado
	 * @param parqueadero
	 */
	void agregar(Parqueadero parqueadero);
	
	/**
	 * Permite obtener los datos del cupo asignado por placa
	 * @param placa
	 * @return
	 */
	Parqueadero obtener(String placa);
	
	boolean obtenerCupoDisponible();
	
}
