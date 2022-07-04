// Carrillo Cervantes Ivette Alejandra
// Programación Orientada a Objetos - Grupo 3

public class ForEach {
	public static void main(String[] args) {
		int a[] = {5,10,15,20,25,30,35,40,45,50};
		int var = 0;
		int var2 = 10;

		// System.out.println("\n_ _ _ _ _ _ _ _ _ _ _ _ FOR _ _ _ _ _ _ _ _ _ _ _");
		System.out.println("\n_ _ _ _ _ _ _ _ _ _ _ FOR EACH _ _ _ _ _ _ _ _ _ _");
	// ____________________________________________
		System.out.println("\n_ _ _ _ _ _  _ _ _ _ _");
		System.out.println("\n  SUMA DE ELEMENTOS");		

		System.out.println("");
		
		// for (int i=0; i<10;i++){
		// 	var+=a[i];
		// 	System.out.println(var);
		// }

		// Suma cada elemento más el anterior y se imprime
		// int var = 0;
		for (int valor: a){
			var += valor;
			System.out.println(var);
		}

	// ____________________________________________
		System.out.println("\n_ _ _ _ _ _ _ _ _ _ _");
		System.out.println("\n  CAMBIAR VALORES DE ELEMENTOS ");

		System.out.println("");

		// for(int i = 0;i<10;i++){
		// 	a[i]=a[i]*10;
		// 	System.out.println(a[i]);
		// }

		int contador = 0;
		// Se cambian los valores de los elementos del arreglo por el mismo valor multiplicado por 10
		for (int valor: a){
			valor = valor * 10;
			// Se guarda el valor en el arreglo
			a[contador] = valor;
			contador += 1;
			System.out.println(valor);
		}

		// for(int i = 0;i<10;i++){
		// 	// a[i]=a[i]*10;
		// 	System.out.println(a[i]);
		// }

	// ____________________________________________
		System.out.println("\n_ _ _ _ _ _ _ _ _ _ _");
		System.out.println("\n  NUMEROS DIVISIBLES ENTRE 4");

		System.out.println("");
		
		// for(int i=0;i<10;i++){
		// 	if(a[i]%4==0)
		// 		System.out.println(a[i]+ " es divisible entre 4");
		// }

		// Se buscan los números que son divisible entre 4
		for(int divisible: a){
			if (divisible%4==0) {
				System.out.println(divisible+ " es divisible entre 4");
			}
		}
	}
}