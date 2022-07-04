package practica6y7;

import java.util.LinkedList;
import java.util.List;
import java.util.Scanner;

/**
 *
 * @author Alejandra Carrillo
 */

public class Principal {

    public static void main(String[] args) {
        
        List<Division> listaDivision = new LinkedList<>();    
        Scanner sc = new Scanner(System.in);
        int op;
        
        do{
            System.out.println("\n__________________________________________________________\n");
            System.out.println("\t\t\tMENÚ\n");
            System.out.println("  1. Crear División con Batallones y Militares\n  2. Ver totales\n  3. Mostrar todas las Divisiones\n  4. Salir");
            System.out.print(" -> Elige una opción: ");
            op = sc.nextInt();
            
            switch(op){
            
                case 1:
                    // Crear División con Batallones y Militares
                    System.out.println("\n* * * * * * * * * * * * * * * * * * * * * * * * * * * * *");
                    System.out.println("\n\t\tDATOS DE LA DIVISION");
                    sc.nextLine();
                    System.out.print("\nNombre: ");
                    String nombreD = sc.nextLine();
                    System.out.print("Zona: ");
                    String zonaD = sc.nextLine();
                    System.out.print("¿Cuantos batallones quieres crear en la division \""+nombreD+"\"? ");
                    int numBatallones = sc.nextInt();
                    
                    List<Batallon> listaBatallon = new LinkedList<>();
                    for (int i = 0; i < numBatallones; i++) {        
                        List<Militar> listaMilitar = new LinkedList<>(); 
                        System.out.println("\n.. ____ .. ____ .. ____ .. ____ .. ____ .. ____ .. ____ ..\n");
                        System.out.println("\tDATOS DEL BATALLON "+(i+1));
                        System.out.print("\nClave identificador del batallon: ");
                        int identificador = sc.nextInt();
                        System.out.print("Categoria: ");
                        sc.nextLine();
                        String categoria = sc.nextLine();
                        System.out.print("Ubicación: ");
                        String ubicacion = sc.nextLine();
                        System.out.print("¿Cuantos militares quieres crear en el batallon con clave\""+identificador+"\"? ");
                        int numMilitares = sc.nextInt();
                        
                        for (int j = 0; j < numMilitares; j++) {
                            System.out.println("\n. __ . __ . __ . __ . __ . __ . __ . __ . __ . __ . __ .\n");
                            System.out.print("  DATOS DEL MILITAR "+(j+1)+"\n");
                            System.out.print("\nMatricula: ");
                            int matricula = sc.nextInt();
                            System.out.print("Nombre del militar: ");
                            sc.nextLine();
                            String nombreM = sc.nextLine();
                            System.out.print("Grado: ");
                            String gradomil = sc.nextLine();
                            Militar militar = new Militar(matricula, nombreM, gradomil);
                            listaMilitar.add(militar);
                        }
                        
                        Batallon batallon = new Batallon(identificador, categoria, ubicacion, listaMilitar);
                        listaBatallon.add(batallon);
                    }
                    Division division = new Division(nombreD, zonaD, listaBatallon);
                    listaDivision.add(division);
                    
                    break;
                    
                case 2:
                    // Ver el número totales de Batallones, Divisiones y Militares
                    System.out.println("\n* * * * * * * * * * * * * * * * * * * * * * * * * * * * *");
                    System.out.println("\n\tVER TOTALES\n");
                    System.out.println("El número total de Divisiones creadas es de: "+Division.numDivisiones());
                    System.out.println("El número total de Batallones creados es de: "+Batallon.numBatallones());
                    System.out.println("El número total de Militares creados es de: "+Militar.numMilitares());
                    break;
                    
                case 3:
                    // Ver todas las divisiones creadas
                    System.out.println("\n* * * * * * * * * * * * * * * * * * * * * * * * * * * * *");
                    System.out.println("\n\tVER DIVISIONES\n");
                    if(listaDivision.isEmpty()){
                        System.out.println("NO HAY DIVISIONES CREADAS ):");
                    }else{
                        for(Division div: listaDivision){
                            Division.imprimirDivision(div);
                        }                        
                    }
                    break;
                    
                case 4:
                    // Opción para salir del programa
                    System.out.println("\tSALIR");
                    break;
                    
                default:
                    break;
            }
        
        }while(op!=4);
    }   
}