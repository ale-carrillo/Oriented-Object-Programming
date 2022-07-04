// Carrillo Cervantes Ivette Alejandra
// Programación Orientada a Objetos - Grupo 3

import java.util.Scanner;
import java.util.Random;

public class Ejercicio2a{
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		Random aleatorio = new Random();
		System.out.println("\n__________________________________________________________________");
		System.out.println("\n\t\t\tArrays\n");
		System.out.print("Ingresa el número de elementos que quieres que tenga tu array: ");		
		int elementos = sc.nextInt();
		int [] array = new int[elementos];

		// Se genera un arreglo
		for (int i=0; i<elementos; i++) {
			array[i] = aleatorio.nextInt(50);
		}
		System.out.println("\nSe generó el siguiente array aleatorio:");
		printArray(array);
		int total = SumaElementos(array, elementos);
		System.out.println("\n -> La suma de todos los elementos, excepto del menor y del mayor es: "+ total);
		System.out.println("\n__________________________________________________________________\n");
	}	

	static int SumaElementos(int arr[], int elementos){
		int suma = 0;
		int menor = arr[0];
		int mayor = arr[0];
		for(int i=0; i<elementos; i++){
			// Si el elemento es menor que el valor de la variable "menor"
			if (arr[i]<menor) {
				menor = arr[i];
			}
			// Si el elemento es mayor que el valor de la variable "mayor"
			if (arr[i]>mayor) {
				mayor = arr[i];
			}
		}
		System.out.println("\nEl elemento menor de la lista es: "+menor);
		System.out.println("El elemento mayor de la lista es: "+mayor);
		for(int i=0; i<elementos; i++){
			// Si el elemento es igual a la variable que contiene el elemento menor o mayor
			if (arr[i]==mayor || arr[i]==menor) {
				continue;
			}
			// Si es diferente, entonces se va sumando en cada iteración
			else{
				suma += arr[i];
			}
		}
		return suma;
	}

    static void printArray(int arr[]){
        int n = arr.length;
        System.out.print("{");
        for (int i=0; i<n; ++i)
            if(i<n-1){
                System.out.print(" "+arr[i]+",");
            } else{
                System.out.print(" "+arr[i]);
            }
        System.out.print("}");   
        System.out.println();
    }
}