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
	 * 
	 * @param tipoVehiulo
	 * @return
	 */
	boolean obtenerCupoDisponible();
	/**
	 * Permite retirar un registro parqueadero
	 * @param parqueadero
	 */
	boolean retirar(Parqueadero parqueadero);
	
}
