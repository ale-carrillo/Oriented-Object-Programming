// Carrillo Cervantes Ivette Alejandra
// Programación Orientada a Objetos - Grupo 3

import java.util.Scanner;
import java.util.Random;

public class AdivinaNumero {
	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		Random aleatorio = new Random();
		int numeroSecreto;

		// Variable donde se guarda el número aleatorio a adivinar 
		// Este número va de un rango del 0 al 500
		numeroSecreto = aleatorio.nextInt(500); 

		System.out.println("\n\tBienvenido al juego 'ADIVINA EL NÚMERO'");
		int intentos = 0; // Contador que se va incrementando cada intento
		int salir = 0; // Variable para salir del ciclo, también se va incrementando esta variable en cada intento
		// Cuando sean 5 intentos, la variable salir también será 5 y saldrá del ciclo automaticamente

		// Se imprime el número aleatorio generado
		// Esta impresión no debería de ir
		System.out.println("\n// El número es: "+numeroSecreto); 

		// Se cambió las estructuras If-Else por una estructura Do-While
		do{
			// Se imprime el número de intento en el que se encuentra
			System.out.println("\n  -> Intento "+(intentos+1));

			// Se le pide un número al usuario para adivinar
			System.out.print("Escribe el numero: ");
			int numero = sc.nextInt();

			// Si el número ingresado es igual al número por adivinar
			if(numero == numeroSecreto){
				// La variable salir se iguala a 5 y se sale del ciclo do-while
				salir = 5;
				System.out.println("\nFELICIDADES, ADIVINASTE!! (:");
				System.out.println("El número es: "+numeroSecreto);
			}

			// Si el número ingresado es mayor 
			else if(numero > numeroSecreto){
				intentos += 1;
				salir += 1;
				System.out.println("El número que ingresaste es MAYOR ):");
			}
			// Si el número ingresado es menor
			else{
				intentos += 1;
				salir += 1;
				System.out.println("El número que ingresaste es MENOR ):");
			}

			// Si el número de intentos es igual a 5
			if (intentos == 5) {
				System.out.println("\nNO ADIVINASTE!!");
				System.out.println("El número era: "+numeroSecreto);
			}
		}while(salir < 5);
	}
}