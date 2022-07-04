// Carrillo Cervantes Ivette Alejandra
// Programación Orientada a Objetos - Grupo 3

public class Ejercicio3{

	// Método main
	public static void main(String[] args){
		// Se agregó una impresión en pantalla para saber en que clase se esta
		System.out.println("\n-> Clase Ejercicio 3, método main");

		int a;
		a=40;
		System.out.println("a vale: "+a);
		
		// Se llama al método 1 de la clase "Clase1" y se imprime el valor de retorno
		System.out.println(Clase1.metodo1());

		// Se guarda el valor de retorno del método 2 de la clase "Clase1"
		a= Clase1.metodo2();
		
		// Se imprime el valor de a, al ser modificada por el método 2 de la clase "Clase1"
		System.out.println("Ahora 'a' vale: "+a);

		// Se llama al método 1 de la clase "Clase2" y se imprime el valor de retorno
		System.out.println(Clase2.metodo1());

		// Como dentro de esta función si existe la función para imprimir y no tetorna ningún valor, solo se manda a llamar el método
		Clase3.metodo8();
	}
}