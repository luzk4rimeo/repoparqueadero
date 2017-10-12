package com.ceiba.persistencia.repositorio;

import com.ceiba.dominio.Automovil;
import com.ceiba.dominio.Parqueadero;
import com.ceiba.repositorio.RepositorioParqueadero;

public class RepositorioParqueaderoPersistencia implements RepositorioParqueadero {

	@Override
	public Automovil obtenerAutomovilParqueadoByPlaca(String placa) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public void agregar(Parqueadero parqueadero) {
		// TODO Auto-generated method stub

	}

	@Override
	public Parqueadero obtener(String placa) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public boolean obtenerCupoDisponible() {
		// TODO Auto-generated method stub
		System.out.println("hhshshshs");
		return false;
	}

}
