package com.ceiba.builder;

import com.ceiba.dominio.Vehiculo;
import com.ceiba.entidad.VehiculoEntity;

public class VehiculoBuilder {

	private VehiculoBuilder() {}

	public static Vehiculo convertirADominio(VehiculoEntity vehiculoEntity) {
		Vehiculo vehiculo = null;
		if(vehiculoEntity != null) {
//			vehiculo = new vehiculo(vehiculoEntity.getIsbn(), vehiculoEntity.getTitulo(), vehiculoEntity.getAnio());
		}
		return vehiculo;
	}
	
	public static VehiculoEntity convertirAEntity(Vehiculo vehiculo) {
		VehiculoEntity VehiculoEntity = new VehiculoEntity();
//		libroEntity.setTitulo(vehiculo.getTitulo());
//		libroEntity.setIsbn(vehiculo.getIsbn());
//		libroEntity.setAnio(vehiculo.getAnio());
		return VehiculoEntity;
	}
}
