package co.ceiba.dominio;

public class Moto extends Vehiculo {
	
	public Moto(String placa, Double cilindraje) {
		super(placa);
		this.cilindraje = cilindraje;
	}

	private Double cilindraje;

	public Double getCilindraje() {
		return cilindraje;
	}

	public void setCilindraje(Double cilindraje) {
		this.cilindraje = cilindraje;
	}

}
