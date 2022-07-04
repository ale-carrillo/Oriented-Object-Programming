// Carrillo Cervantes Ivette Alejandra
// Programación Orientada a Objetos - Grupo 3

import java.util.Scanner;

public class FigurasGeometricas {
	public static void main(String[] args){

		// Variables a utilizar
		float area;
		int opcion;
		final float PI = 3.14159f;

		Scanner sc = new Scanner(System.in);
		
		// Ciclo while para que se vaya repitiendo el menú
		do{
			// Se imprime el menú de opciones
			System.out.println("____________________________________");
			System.out.println("\n\tMenú de opciones");
			System.out.println("  1.- Area de círculo");
			System.out.println("  2.- Area de triángulo");
			System.out.println("  3.- Area de cuadrado");
			System.out.println("  4.- Salir");
			System.out.print("\nElige una opción: ");
			opcion = sc.nextInt();
			
			switch(opcion){
				case 1:
					// Círculo
					System.out.println("\nSeleccionaste círculo");
					float radio = 15;
					area = PI * radio * radio;
					System.out.println("El area es: "+area);
					break;
				case 2:
					// Triángulo
					System.out.println("\nSeleccionaste Triángulo");
					float base = 8, altura = 5;
					area = (base * altura) / 2;
					System.out.println("El area es: "+area);
					break;
				case 3:
					// Cuadrado
					System.out.println("\nSeleccionaste Cuadrado");
					float lado = 10;
					area = lado * lado;
					System.out.println("El area es: "+area);
					break;
				case 4:
					// Salir
					System.out.println("\nSeleccionaste Salir");
					System.out.println("\tByee (:");
					break;
				default:
					// Ninugno de los anteriores
					System.out.println("Su elección no es correcta");
					continue;
			}
		} while (opcion != 4);
		sc.close();
	}
}