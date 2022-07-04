// Carrillo Cervantes Ivette Alejandra
// Programación Orientada a Objetos - Grupo 3

public class Ejercicio1{

	// Declaramos las variables
	static int a;
	static int b;

	// Método 1, tiene como función imprimir una frase
	public static void metodo1(){
		// System.out.println("Práctica 1 y ya reprobé");

		// Cambie la frase por una bonita (:
		System.out.println("Práctica 1 y ya aprobé el semestre (:");
	}

	// Método main
	static public void main(String[] Juan) {
		System.out.println("\nPráctica1 2022-1");
        a=10;
		b=100;
		// System.out.println("resultado "+a+b);

		// Agregué los parentesis (a+b) para que salga en pantalla 
		// el resultado de la suma entre ambas variables
		System.out.println("Resultado: "+(a+b));

		// Se manda a llamar al método 1 de la clase "Ejercicio 1"
		Ejercicio1.metodo1();
	}

}