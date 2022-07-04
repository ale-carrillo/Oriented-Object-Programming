// Carrillo Cervantes Ivette Alejandra
// Programación Orientada a Objetos - Grupo 3

import java.util.Hashtable;

public class Colecciones2{
	public static void main(String[] args) {
		Hashtable<String, Integer> miTabla = new Hashtable<String, Integer>();
		miTabla.put("uno", 1);
		miTabla.put("dos", 2);
		miTabla.put("cinco", 5);

		System.out.println("\nContiene a cuatros? "+miTabla.containsKey("cuatro"));

		for (String clave: miTabla.keySet()) {
			System.out.println("Clave: "+clave);
		}
		for(Integer valor: miTabla.values()){
			System.out.println("Valor: "+valor);
		}
	}
}