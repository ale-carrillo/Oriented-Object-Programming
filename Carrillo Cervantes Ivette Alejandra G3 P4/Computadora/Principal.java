// Carrillo Cervantes Ivette Alejandra
// Programación Orientada a Objetos - Grupo 3

import java.util.ArrayList;
import java.util.Scanner;
import java.lang.String;

public class Principal{

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		int opcion;
		boolean salir = false;
		String nombre;
		String marca;
		String color;
		int memoriaRam;
		double precio;
		boolean descuento;
		String eliminar;
		String modificar;
		int opModificar;

		// Se crea una lista donde se van a introducir los objetos
		ArrayList<Computadora> computadoras = new ArrayList<Computadora>();

		System.out.println("\nSe crearon las siguientes computadoras: ");
		Computadora computadora1 = new Computadora("Computadora1", "Lenovo", "negra", 8, 18499.99, true);
		Computadora computadora2 = new Computadora("Computadora2", "hp", "rojo", 12, 24700.00, true);
		Computadora computadora3 = new Computadora("Computadora3", "hp", "gris", 6, 14800.99, true);

		System.out.println("\n * * * * * * * * * * * * * * * * * *");
		computadora1.imprimirComputadora();
		computadora1.descuento(20, 200);
		computadoras.add(computadora1);
		System.out.println("\n * * * * * * * * * * * * * * * * * *");
		computadora2.imprimirComputadora();
		computadora2.descuento(500);
		computadoras.add(computadora2);
		System.out.println("\n * * * * * * * * * * * * * * * * * *");
		computadora3.imprimirComputadora();		
		computadora3.descuento();
		computadoras.add(computadora3);

		System.out.println("");

		while(!salir){
			System.out.println("____________________________________________________________");
			System.out.println("\n\t\tMenú de Opciones");

			System.out.println("\n 1) Crear nueva computadora\n 2) Modificar existente");
			System.out.println(" 3) Ver computadoras actuales\n 4) Eliminar computadora\n 5) Salir");

			System.out.print("\n Elige una opción: ");
			opcion = sc.nextInt();

			switch(opcion){
				case 1:
					System.out.println("_ _ _ _ _ _ _ _ _ _ _ _ _ _ _ _ _ _ _ _ _ _ _ _ _");
					System.out.println("\n\tCrear nueva computadora");

					System.out.println("\n 1 -> Crear una computadora con todos sus atributos\n 2 -> Crear una computadora solo con su nombre y los demás atributos inicializarlos en cero");
					System.out.print("\nElige una opción: ");
					int crear = sc.nextInt();

					switch(crear){
						case 1:
							
							System.out.println("\nIngresa los datos de la computadora: ");
							sc.nextLine(); // Limpiamos el buffer

							System.out.print("Nombre: ");
							nombre = sc.nextLine();

							System.out.print("Marca: ");
							marca = sc.nextLine();

							System.out.print("Color: ");
							color = sc.nextLine();

							System.out.print("Memoria RAM: ");
							memoriaRam = sc.nextInt();

							System.out.print("Precio: ");
							precio = sc.nextDouble();

							System.out.print("¿Tiene descuento? (true, false): ");
							descuento = sc.nextBoolean();
							
							Computadora nuevaComputadora = new Computadora(nombre, marca, color, memoriaRam, precio, descuento);
							
							computadoras.add(nuevaComputadora);

							System.out.println("\n\n-> Se creó la siguiente computadora:");
							System.out.println("\n * * * * * * * * * * * * * * * * * *");
							nuevaComputadora.imprimirComputadora();
							break;

						case 2:
							System.out.println("\nIngresa los datos de la computadora: ");
							sc.nextLine(); // Limpiamos el buffer

							System.out.print("Nombre: ");
							nombre = sc.nextLine();
							
							Computadora nuevaComputadora2 = new Computadora(nombre);

							computadoras.add(nuevaComputadora2);
							
							System.out.println("\n\n-> Se creó la siguiente computadora:");
							System.out.println("\n * * * * * * * * * * * * * * * * * *");
							nuevaComputadora2.imprimirComputadora();
							break;
						default:
							break;
					}
					break;

				case 2:
					System.out.println("_ _ _ _ _ _ _ _ _ _ _ _ _ _ _ _ _ _ _ _ _ _ _ _ _");
					System.out.println("\n\tModificar computadora\n");
					System.out.print("-> Escribe el nombre de la computadora que quieras modificar: ");
					sc.nextLine(); // Limpiamos el buffer
					modificar = sc.nextLine();

					int i=0;
					for(Computadora compu: computadoras){
						String nombreGet = compu.getNombre();
						int comparacion = modificar.compareTo(nombreGet);
						if (comparacion == 0) {
							System.out.println("\n 1. Nombre\n 2. Marca\n 3. Color\n 4. Memoria Ram\n 5. Precio\n 6. Descuento\n 7. TODOS");
							System.out.print("\n ¿Qué atributo quieres modificar? ");
							opModificar = sc.nextInt();
							switch(opModificar){
								case 1:
									System.out.print("\n -> Ingresa el nombre modificado: ");
									sc.nextLine(); // Limpiamos el buffer
									String nuevoNombre = sc.nextLine();
									compu.setNombre(nuevoNombre);
									System.out.println("\n *Se modificó el nombre de la computadora "+nombreGet);
									break;
								case 2:
									System.out.print("\n -> Ingresa la marca modificada: ");
									sc.nextLine(); // Limpiamos el buffer
									String nuevoMarca = sc.nextLine();
									compu.setMarca(nuevoMarca);
									System.out.println("\n *Se modificó la marca de la computadora "+nombreGet);
									break;
								case 3:
									System.out.print("\n -> Ingresa el nuevo color: ");
									sc.nextLine(); // Limpiamos el buffer
									String nuevoColor = sc.nextLine();
									compu.setColor(nuevoColor);
									System.out.println("\n *Se modificó el color de la computadora "+nombreGet);
									break;
								case 4:
									System.out.print("\n -> Ingresa la nueva memoria RAM: ");
									sc.nextLine(); // Limpiamos el buffer
									int nuevoRAM = sc.nextInt();
									compu.setMemoriaRAM(nuevoRAM);
									System.out.println("\n *Se modificó la memoria RAM de la computadora "+nombreGet);
									break;
								case 5:
									System.out.print("\n -> Ingresa el nuevo precio: ");
									sc.nextLine(); // Limpiamos el buffer
									double nuevoPrecio = sc.nextDouble();
									compu.setPrecio(nuevoPrecio);
									System.out.println("\n *Se modificó el precio de la computadora "+nombreGet);
									break;
								case 6:
									System.out.print("\n -> ¿Tiene descuento?: ");
									sc.nextLine(); // Limpiamos el buffer
									boolean nuevoDescuento = sc.nextBoolean();
									compu.setDescuento(nuevoDescuento);
									System.out.println("\n *Se modificó el descuento de la computadora "+nombreGet);
									break;
								case 7:
									System.out.println("\nModificar todos los atributos de la computadora");

									System.out.print("  -> Ingresa el nombre modificado: ");
									sc.nextLine(); // Limpiamos el buffer
									String nuevoNombreT = sc.nextLine();

									System.out.print("  -> Ingresa la marca modificada: ");
									String nuevoMarcaT = sc.nextLine();
									
									System.out.print("  -> Ingresa el nuevo color: ");
									String nuevoColorT = sc.nextLine();
									
									System.out.print("  -> Ingresa la nueva memoria RAM: ");
									int nuevoRAMT = sc.nextInt();		
									
									System.out.print("  -> Ingresa el nuevo precio: ");
									double nuevoPrecioT = sc.nextDouble();	
									
									System.out.print("  -> ¿Tiene descuento?: ");
									boolean nuevoDescuentoT = sc.nextBoolean();

									compu.setTodo(nuevoNombreT, nuevoMarcaT, nuevoColorT, nuevoRAMT, nuevoPrecioT, nuevoDescuentoT);

									System.out.println("\n *Se moficiaron todos los atributos de la computadora "+nombreGet);
									break;
								default:
								System.out.println("\nNo existe esa opción ):");
									break;
							}							
							break;
						}
					++i;
					}
					break;

				case 3:
					System.out.println("_ _ _ _ _ _ _ _ _ _ _ _ _ _ _ _ _ _ _ _ _ _ _ _ _");
					System.out.println("\n\tComputadoras actuales");
					System.out.println("\n -> El número de computadoras actuales son: "+Computadora.numComputadoras);
					System.out.println("\n * * * * * * * * * * * * * * * * * *");
					if(computadoras.size()==0){
						System.out.println("-> No hay computadoras creadas ):");
					}else{
						for(Computadora compu: computadoras){
							compu.imprimirComputadora();
							System.out.println("\n * * * * * * * * * * * * * * * * * *");
						}
					}
					break;

				case 4:
					System.out.println("_ _ _ _ _ _ _ _ _ _ _ _ _ _ _ _ _ _ _ _ _ _ _ _ _");
					System.out.println("\n\tEliminar computadora\n");

					System.out.print("-> Escribe el nombre de la computadora que quieras eliminar: ");
					sc.nextLine(); // Limpiamos el buffer
					eliminar = sc.nextLine();

					int i2=0;
					for(Computadora compu: computadoras){
						String nombreGet = compu.getNombre();
						int comparacion = eliminar.compareTo(nombreGet);
						if (comparacion == 0) {
							computadoras.remove(i2);
							System.out.println("   Eliminaste la computadora con nombre: "+nombreGet);
							// El programa ya encontro la computadora
							// a eliminar y se sale del ciclo for
							break;
						}
					++i2;
					}
					Computadora.numComputadoras--;
					break;

				case 5:
				System.out.println("_ _ _ _ _ _ _ _ _ _ _ _ _ _ _ _ _ _ _ _ _ _ _ _ _");
					System.out.println("\n\tSeleccionaste salir\n");
					System.out.println("\n\tByeeee (:");
					salir = true;
					break;
				default:
					System.out.println("\nNo existe esa opción ):");
					break;
			}			
		}
		
	}
}