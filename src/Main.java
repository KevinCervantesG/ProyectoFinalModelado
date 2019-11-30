import java.util.Scanner;
import java.util.*;


public class Main {

	public static void main(String[] args) {
		

		Scanner sc = new Scanner(System.in);
		int login;

		do{

			System.out.println("Inicie sesión:\n\n" +
				"1.-Administrador\n" +
				"2.-Vendedor\n" + 
				"0.-Salir\n");
			String entrada = sc.nextLine();
			login = Integer.parseInt(entrada);

			switch(login) {//Switch principal
				case 1: //Administrador
					UsuarioFactoryMethod factory = new UsuarioFactory();
					Usuario usuario = factory.createUsuario("Administrador", 1); //Instancia del factory que nos dice el tipo de usuario
					ControladorAdministrador ctrAdmin = new ControladorAdministrador(); //Instancia del controlador
					Scanner scAdmin = new Scanner(System.in);
					int opcionAdmin;
					do {
						System.out.println("Bienvenido Administrador.\n" +
						"¿Que desea hacer?\n" +
						"1.-Crear ruta.\n" +
						"2.-Crear terminal.\n" +
						"3.-Eliminar ruta.\n" +
						"4.-Eliminar terminal.\n" +
						"0.-Salir\n");
						String entradaAdmin = scAdmin.nextLine();
						opcionAdmin = Integer.parseInt(entradaAdmin);

						switch (opcionAdmin) {
							case 1:

								Scanner scAdmin11 = new Scanner(System.in);
								List<String> terminales = new ArrayList<String>();
								String terminal = "";
								System.out.println("Ingrese los nombres de las terminales, termine solo dando Enter.");
								while(! terminal.equals("-1")) {
									terminal = scAdmin11.nextLine();
         							terminales.add(terminal);
								}

								Scanner scAdmin12 = new Scanner(System.in);
								System.out.println("Ingrese el numero de pasajeros");
								int pasajeros = (int) scAdmin12.nextInt();

								Scanner scAdmin13 = new Scanner(System.in);
								System.out.println("Ingrese el numero de boletos");
								int boletos = (int) scAdmin13.nextInt();

								Scanner scAdmin14 = new Scanner(System.in);
								System.out.println("Ingrese el id de la ruta");
								int id = (int) scAdmin14.nextInt();

								ctrAdmin.crearRuta(id, terminales, pasajeros, boletos); //El controlador se encarga de crear la ruta
								
							break;

							case 2:
								Scanner scAdmin2 = new Scanner(System.in);
								System.out.println("Ingrese el nombre de la terminal");
								String nombreTerminal = scAdmin2.nextLine();
								ctrAdmin.crearTerminal(nombreTerminal); //El controlador se encarga de crear la terminal
				
							break;

							case 3:
								Scanner scAdmin3 = new Scanner(System.in);
								System.out.println("Ingrese el id de la ruta");
								int id_ruta = scAdmin3.nextInt();
								ctrAdmin.eliminarRuta(id_ruta); //El controlador se encarga de eliminar la ruta
							break;

							case 4:
								Scanner scAdmin4 = new Scanner(System.in);
								System.out.println("Ingrese el id de la terminal");
								int id_terminal = scAdmin4.nextInt();
								ctrAdmin.eliminarTerminal(id_terminal); //El controlador se encarga de eliminar la terminal
							break;

							case 0:
								break;

							default:
								System.out.println("Elige una opcion valida.\n");
								break;
						} //switch opcionAdmin
					}while(opcionAdmin != 0);//do admin

				case 2: //Vendedor
					UsuarioFactoryMethod factory2 = new UsuarioFactory();
					Usuario usuario2 = factory2.createUsuario("Vendedor", 2); //Instancia del factory que nos dice el tipo de usuario
					ControladorVendedor ctrVen = new ControladorVendedor(); //Instancia del controlador
					Scanner scVen = new Scanner(System.in);
					int opcionVen;

					do {
						System.out.println("Bienvenido Vendedor.\n" +
						"¿Que desea hacer?\n" +
						"1.-Vender boletos.\n" +
						"0.-Salir\n");
						String entradaVen = scVen.nextLine();
						opcionVen = Integer.parseInt(entradaVen);

						switch(opcionVen) {//switch opcionVen

							case 1:
								Scanner scVen12 = new Scanner(System.in);
								System.out.println("Ingrese el origen");
								String origen = scVen12.nextLine();

								Scanner scVen13 = new Scanner(System.in);
								System.out.println("Ingrese el destino");
								String destino = scVen13.nextLine();

								ctrVen.vender(origen, destino); //El controlador se encarga de vender el boleto

							case 0:
								break;

							default:
								System.out.println("Elige una opcion valida.\n");
								break;

						}//switch opcionVen
					}while(opcionVen != 0); //do vendedor

				case 0:
					break;

				default:
					System.out.println("Elige una opcion valida.\n");
					break;
			}// Switch principal
		} while(login != 0);//do principal
	}//main()
}//clase