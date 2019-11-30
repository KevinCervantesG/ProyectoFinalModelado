import java.util.*;

public class ControladorVendedor {

	public List<Boleto> boletosVendidos = new ArrayList<Boleto>();

	public void vender(String origen, String destino) {
		Boleto boleto = new Boleto(origen, destino);
		boletosVendidos.add(boleto);
		int id_boleto = boletosVendidos.indexOf(boleto);
		System.out.println("Boleto con id " + Integer.toString(id_boleto) + 
			" , origen " + origen + " y destino " + destino + " vendido.");
	}
}