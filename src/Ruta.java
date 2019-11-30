import java.util.*;
import java.io.Serializable;

public class Ruta {

	private int id;
	public List<String> terminales = new ArrayList<String>();
	public int pasajeros;
	public int boletos;

	public Ruta(int id, List<String> terminales, int pasajeros, int boletos) {
		this.terminales = terminales;
		this.pasajeros = pasajeros;
		this.boletos = boletos;
	}

	public int getID() {
		return id;
	}

	/*
	@Override
	public String toString() {
		return new StringBuffer("Id: ").append(Integer.toString(this.id))
		.append("Terminales: ").append(this.terminales)
		.append("Pasajeros: " ).append(Integer.toString(this.pasajeros))
		.append("Boletos: ").append(Integer.toString(this.boletos).toString());
	} */
	

}