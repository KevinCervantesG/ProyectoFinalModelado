public class Boleto {

	private String origen;
	private String destino;

	public Boleto(String origen, String destino) {
		this.origen = origen;
		this.destino = destino;
	}


	public String getOrigen() {
		return this.origen;
	}

	public String getDestino() {
		return this.destino;
	}


	public void setOrigen(String origen) {
		this.origen = origen;
	}

	public void setDestino(String destino) {
		this.destino = destino;
	}
}