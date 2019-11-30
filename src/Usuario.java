import java.io.Serializable;

public abstract class Usuario  {

	private String nombre;

	private int id;

	public Usuario(String nombre, int id) {
		this.nombre = nombre;
		this.id = id;
	}

	public int getId(){
		return this.id;
	}

	public String getNombre() {
		return this.nombre;
	}

	public void setNombre(String nombre) {
		this.nombre = nombre;
	}


	public void setId(int id) {
		this.id = id;
	}

	/*
	@Override
	public String toString() {
		return "Id:" + Integer.toString(id) + "\n" +
		"Nombre:" + nombre + "\n" +
		"Correo: " + correo + "\n" + 
		"Contrasenia: " + contrasenia;
	} */
}