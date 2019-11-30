import java.io.*;
import java.util.*;

public class ControladorAdministrador {
	
	public Dictionary rutas = new Hashtable(); //Diccionario para guardar rutas
	public List<String> terminalesSinRuta = new ArrayList<String>();

	/*
	 * Metodo para crear nuevas rutas
	*/
	public void crearRuta(int id, List<String> terminalesRuta, int pasajeros, int boletos) {
		Ruta ruta = new Ruta(id, terminalesRuta, pasajeros, boletos);
		rutas.put(ruta.getID(), ruta);

		//Intente escribirlo en un archivo txt pero no pude
		/*try {
			FileOutputStream f = new FileOutputStream(new File("rutas.txt"));
			ObjectOutputStream o = new ObjectOutputStream(f);

			// Write objects to file
			o.writeObject(ruta);

			o.close();
			f.close();

		} catch (FileNotFoundException e) {
			System.out.println("Error al guardar ruta1");
		} catch (IOException e) {
			System.out.println("Error al guardar ruta2");
		} */

		System.out.println("Ruta con id " + Integer.toString(id) + " creada con exito.\n");	
	}

	/*
	 * Metodo para eliminar rutas dado su id
	*/
	public void eliminarRuta(int id) {
		try { //Verificamos que la ruta existe en el diccionario
			rutas.remove(id);
			System.out.println ("Ruta " + Integer.toString(id) + " eliminada.\n");
		} catch (NullPointerException e) {
			System.out.println ("La ruta no existe.\n");
		}
	}


	/*
	 * Metodo para crear una terminal.
	 * Al principio, las terminales no tienen una ruta.
	*/
	public void crearTerminal(String nombre) {
		terminalesSinRuta.add(nombre);
		int id = terminalesSinRuta.indexOf(nombre);
		System.out.println("Terminal con nombre " + nombre + " y con id " + Integer.toString(id) + " creada con exito.\n");
	}


	/*
	 * Metodo para eliminar terminales dado su id
	*/
	public void eliminarTerminal(int id) {
		try {
			terminalesSinRuta.remove(id);
			System.out.println("Terminal eliminada.\n");
		} catch (NullPointerException e) {
			System.out.println("Terminal no existe.\n");
		} catch (IndexOutOfBoundsException e) {
			System.out.println("Terminal no existe.\n");
		}
	}


	/*
	 * Metodo para agregar una terminal dado su id
	 * a la ruta especificada
	*/
	public String agregarTerminalARuta(Ruta ruta, int id_terminal) {
		try {
			String terminal = terminalesSinRuta.get(id_terminal);
			terminalesSinRuta.remove(id_terminal);
			ruta.terminales.add(terminal);
			return "Terminal agregada.\n";
		} catch (NullPointerException e) {
			return "Terminal no existe.\n";
		}

	}



	



}