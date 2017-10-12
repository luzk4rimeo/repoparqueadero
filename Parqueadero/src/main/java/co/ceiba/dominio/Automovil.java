package co.ceiba.dominio;

public class Automovil extends Vehiculo{


	private String tipoCarro;

	
	public Automovil(String placa, String tipoCarro) {
		super(placa);
		this.tipoCarro = tipoCarro;
	}

	public String getTipoCarro() {
		return tipoCarro;
	}

	public void setTipoCarro(String tipoCarro) {
		this.tipoCarro = tipoCarro;
	}
	
	
	

}
