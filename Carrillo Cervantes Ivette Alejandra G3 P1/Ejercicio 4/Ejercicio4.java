// Carrillo Cervantes Ivette Alejandra
// Programación Orientada a Objetos - Grupo 3

public class Ejercicio4 {
	// Método main
	public static void main(String[] args) {
		// Se inicializan los valores de "a" y de "b"
		int a = 10;
		int b = 5;
		
		// Se imprime el valor de cada una de las operaciones
		System.out.println("\n_ _ _ _ _ _ CALCULADORA _ _ _ _ _ _");
		System.out.println("\nEl valor de a: "+a);
		System.out.println("El valor de b: "+b);
		System.out.println("\nLa suma entre a+b es: "+ Calculadora.suma(a, b));
		System.out.println("La resta entre a-b es: "+ Calculadora.resta(a, b));
		System.out.println("La multiplicación a*b es: "+ Calculadora.multiplicacion(a, b));
		System.out.println("La división a/b es: "+ Calculadora.division(a, b));
		System.out.println("El módulo a%b es: "+ Calculadora.modulo(a, b));

	}
}