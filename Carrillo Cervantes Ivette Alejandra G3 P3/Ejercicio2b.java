// Carrillo Cervantes Ivette ALjeandra
// Programación Orientada a Objetos - Grupo 3

import java.util.List;
import java.util.ArrayList;
import java.util.Arrays;

public class Ejercicio2b{
	public static void main(String[] args) {

    /*******************************************************************************************/

        System.out.println("\n________________________________________________________________");
        System.out.println("\n\t\t\tasList()");

        System.out.println("\nSe creó el siguiente arreglo:");
        String [] arrPalabras = {"Hola", "Jelou", "Aloo", "Adios", "Byee"};
        printArrayString(arrPalabras);

        System.out.println("\n...Se creo una lista con los elementos del arreglo...");
		List <String> listaPalabras = Arrays.asList(arrPalabras);

        System.out.println ("\nContenido de la lista: " + listaPalabras);

    /*******************************************************************************************/
        
        System.out.println("\n________________________________________________________________");
        System.out.println("\n\t\t\tcopyOf()");

        System.out.println("\nSe creó el siguiente arreglo: ");
        int [] arrNumeros = {1, 6, 16, 26, 31, 74};
        printArray(arrNumeros);

        System.out.println("\n...Se creó un arreglo nuevo con los elementos del arreglo anterior, modificando el número de elementos a 10...\n");
        int [] arrNumerosCopia = Arrays.copyOf(arrNumeros, 10);

        System.out.println("El núevo arreglo es el siguiente: ");
        printArray(arrNumerosCopia);

    /*******************************************************************************************/

        System.out.println("\n________________________________________________________________");
        System.out.println("\n\t\t\tcopyOfRange()");

        System.out.println("\nSe creó el siguiente arreglo: ");
        double [] arrNumerosDouble = {53.1462, 1.54, 5.165, 45.4854, 13.89, 165.46};
        printArrayDouble(arrNumerosDouble);

        System.out.println("\n...Se creó un arreglo nuevo con los elementos del arreglo anterior, pero en un rango del (1-4)...\n");
        double [] arrNumerosDoubleCopia = Arrays.copyOfRange(arrNumerosDouble, 1, 4);

        System.out.println("El núevo arreglo es el siguiente: ");
        printArrayDouble(arrNumerosDoubleCopia);


    /*******************************************************************************************/

        System.out.println("\n________________________________________________________________");
        System.out.println("\n\t\t\tequals()");

        System.out.println("\nSe crearon los siguientes arreglo: ");
        int [] arr1 = {8, 6, 4, 7, 8, 64, 6, 0, 1};
        int [] arr2 = {8, 6, 4, 7, 8, 64, 6, 0, 1};
        int [] arr3 = {8, 6, 4, 31, 16, 26, 6, 0, 1};
        System.out.print("Arreglo 1: ");
        printArray(arr1);
        System.out.print("Arreglo 2: ");
        printArray(arr2);
        System.out.print("Arreglo 3: ");
        printArray(arr3);

        System.out.println("\n¿El arreglo 1 es igual que el arreglo 2? "+ Arrays.equals(arr1, arr2));
        System.out.println("¿El arreglo 1 es igual que el arreglo 3? "+ Arrays.equals(arr1, arr3));


    /*******************************************************************************************/

        System.out.println("\n________________________________________________________________");
        System.out.println("\n\t\t\tsort()");

        System.out.println("\nSe creó el siguiente arreglo: ");
        String [] asignaturas = {"Estructura de Datos", "Programación Orientada a Objetos", "Cálculo Vectorial", "Probabilidad", "Ecuaciones Diferenciales"};
        printArrayString(asignaturas);

        Arrays.sort(asignaturas);
        System.out.println("\nSe ordeno el arreglo en orden ascendente: ");
        printArrayString(asignaturas);

    /*******************************************************************************************/

        System.out.println("\n________________________________________________________________");
        System.out.println("\n\t\t\ttoString()");

        System.out.println("\nSe crearon los siguientes arreglo: ");
        boolean [] arr1_2 = { true, false, false, true, true, true};
        int [] arr2_2 = {8, 6, 4, 7, 8, 64, 6, 0, 1};
        char [] arr3_2 = {'a', 'b', 'c', 'd', 'e', 'f', 'g', 'h', 'i', 'j'};
        printArrayBoolean(arr1_2);
        printArray(arr2_2);
        printArrayChar(arr3_2);

        System.out.println("\nSe imprimen los arreglos al utilizar el método toString: ");
        System.out.println(Arrays.toString(arr1_2));
        System.out.println(Arrays.toString(arr2_2));
        System.out.println(Arrays.toString(arr3_2));



    /*******************************************************************************************/

        System.out.println("\n________________________________________________________________");
        System.out.println("\n\t\t\tbinarySearch()");

        System.out.println("\nSe creó el siguiente arreglo: ");
        int [] arr1_3 = { 1, 2, 3, 4, 5, 6, 7, 8, 9, 10};
        printArray(arr1_3);

        System.out.println("\n...Se busca el elemento 10 en la lista...\n");
        System.out.println("El elemento 10 se encuentra en la posición: "+Arrays.binarySearch(arr1_3, 10));

    /*******************************************************************************************/

        System.out.println("\n________________________________________________________________");
	}

/*****************************************************************************************************************************/
    
    // Métodos para imprimir el arreglo según sea su tipo de dato
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

    static void printArrayString(String arr[]){
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

    static void printArrayDouble(double arr[]){
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

    static void printArrayBoolean(boolean arr[]){
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

    static void printArrayChar(char arr[]){
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