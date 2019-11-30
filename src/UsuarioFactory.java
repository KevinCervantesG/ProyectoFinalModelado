public class UsuarioFactory implements UsuarioFactoryMethod {
	
	public Usuario createUsuario(String nombre, int id) {
		if (id == 0) {
			return new Administrador(nombre, id);
		} else {
			return new Vendedor(nombre, id);
		}
	}
}