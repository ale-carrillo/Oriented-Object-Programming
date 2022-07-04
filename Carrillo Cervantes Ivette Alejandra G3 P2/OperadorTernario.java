// Carrillo Cervantes Ivette Alejandra
// Programación Orientada a Objetos - Grupo 3

import java.util.Scanner;

public class OperadorTernario {
	public static void main(String[] arg){
		Scanner sc = new Scanner(System.in);

		System.out.println("\n\tOPERADOR TERNARIO");

		System.out.print("\n_____________________________________");
		System.out.print("\n\n\tPRIMER OPERADOR TERNARIO\n");
		System.out.print("\nInserta un número x: ");
		int x = sc.nextInt();
		System.out.print("Inserta un número y: ");
		int y = sc.nextInt();
		int z = (x<=10 && y<=10)?(x>5 && y<5)?200:100:50;
		System.out.println("z = "+z);

		System.out.print("\n_____________________________________");
		System.out.print("\n\n\tSEGUNDO OPERADOR TERNARIO\n");
		System.out.print("\nIngresa tu calificación: ");
		float x2 = sc.nextFloat();
		String z2 = x2>6?x2<7.4?"suficiente":x2<8.4?"buen trabajo":"excelente":"Lo siento, deberás recursar";
		System.out.println(z2);
	}
}