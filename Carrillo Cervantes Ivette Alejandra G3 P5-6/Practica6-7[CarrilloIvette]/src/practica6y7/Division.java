package practica6y7;

import java.util.List;

/**
 *
 * @author Alejandra Carrillo
 */

public class Division {
    
    // * * * * * * Atributos de clase Division * * * * * *
    
    private String nombre;
    private String zona; 
    private List<Batallon> batallon;
    private static int divisiones = 0;

    // * * * * * * Métodos constructores * * * * * *
    
    public Division(){
        this.divisiones ++;
    }
    
    public Division(String nombre, String zona, List<Batallon> batallon){
        this.nombre = nombre;
        this.zona = zona;
        this.batallon = batallon;
        divisiones ++;       
    }
    
    // * * * * * * Métodos de acceso * * * * * *

    public String getNombre(){
        return nombre;
    } 

    public String getZona(){
        return zona;
    }  
    
    public List<Batallon> getLista(){
        return batallon;
    }
    
    // * * * * * * Otros métodos * * * * * * *
    
    public static int numDivisiones(){
        return divisiones;
    }
    
    public static void imprimirDivision(Division division){
        System.out.println("_______________________________________________________\n");
        System.out.println("\tDATOS DE LA DIVISION\n");
        System.out.println("  Nombre: "+division.getNombre());
        System.out.println("  Zona: "+division.getZona());
        List<Batallon> listaBatallon = division.getLista();
        int n = 0;
        for(Batallon batallon: listaBatallon){
            n++;
            Batallon.imprimirBatallon(batallon, n);
        }
    }
}
