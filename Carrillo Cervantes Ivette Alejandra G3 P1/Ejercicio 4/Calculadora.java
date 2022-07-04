// Carrillo Cervantes Ivette Alejandra
// Programación Orientada a Objetos - Grupo 3

// Clase Calculadora
public class Calculadora {

	// Todas los métodos retornan el resultado de la operación correspondiente
	
	// Método suma
	public static int suma(int a, int b){
		int sum;
		sum = a + b;
		return sum;
	}

	// Método resta
	public static int resta(int a, int b){
		int res;
		res = a - b;
		return res;
	}

	// Método multiplicación
	public static int multiplicacion(int a, int b){
		int mul;
		mul = a * b;
		return mul;
	}

	// Método división
	public static int division(int a, int b){
		int div;
		div = a / b;
		return div;
	}

	// Método módulo
	public static int modulo(int a, int b){
		int mod;
		mod = a%b;
		return mod;
	}
}