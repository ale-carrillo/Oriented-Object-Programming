// Carrillo Cervantes Ivette Alejandra
// Programación Orientada a Objetos - Grupo 3

import java.util.Scanner;
public class DiasPorMes {
	public static void main(String[] arg){
		Scanner scanner = new Scanner(System.in);

		System.out.print("\nInserta un mes del año (en minúsculas): ");
		String mes = scanner.nextLine();
		int dias;

		// Se agregaron los meses faltantes a la estructura switch
		switch (mes){
			case "enero":
				dias = 31;
				break;
			case "febrero":
				dias = 28;
				break;
			case "marzo":
				dias = 31;
				break;
			case "abril":
				dias = 30;
				break;
			case "mayo":
				dias = 31;
				break;
			case "junio":
				dias = 30;
				break;
			case "julio":
				dias = 31;
				break;
			case "agosto":
				dias = 31;
				break;
			case "septiembre":
				dias = 30;
				break;
			case "octubre":
				dias = 31;
				break;
			case "noviembre":
				dias = 30;
				break;
			case "diciembre":
				dias = 31;
				break;
			default:
				dias = 0;
				break;
		}
		// Se imprime el mes y el número de días que tiene este
		System.out.println("El mes de "+mes+" tiene "+dias+" dias");			
	}
}