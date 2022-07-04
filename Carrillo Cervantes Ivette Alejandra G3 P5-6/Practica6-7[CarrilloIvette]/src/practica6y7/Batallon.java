package practica6y7;

import java.util.List;

/**
 *
 * @author Alejandra Carrillo
 */

public class Batallon{
    
    // * * * * * * Atributos de clase Batallon * * * * * *
    
    private int claveIdentidicador;
    private String categoria;
    private String ubicacion;
    private List<Militar> militar;
    private static int batallones = 0; 
    
    // * * * * * * Métodos constructores * * * * * *
    
    public Batallon(){
        batallones ++;
    }
    
    public Batallon(int claveIdentificador, String categoria, String ubicacion, List<Militar> militar){
        this.claveIdentidicador = claveIdentificador;
        this.categoria = categoria;
        this.ubicacion = ubicacion;
        this.militar = militar;
        batallones++;
    }

    // * * * * * * Métodos de acceso * * * * * *

    public int getClaveIdentificador(){
        return claveIdentidicador;
    }

    public String getCategoria(){
        return categoria;
    }    

    public String getUbicacion(){
        return ubicacion;
    }  
    
    public int getBatallones(){
        return batallones;
    }

    public List<Militar> getLista(){
        return militar;
    }    
    
    // * * * * * * Otros métodos * * * * * * *
    
    public static int numBatallones(){
        return batallones;
    }
    
    public static void imprimirBatallon(Batallon batallon, int n){
        System.out.println("__  __  __  __  __  __  __  __  __  __  __  __  __  __\n");
        System.out.println("\tDATOS DEL BATALLON "+n+"\n");
        System.out.println("  Clave identificador: "+batallon.getClaveIdentificador());
        System.out.println("  Categoria: "+batallon.getCategoria());
        System.out.println("  Ubicación: "+batallon.getUbicacion());
        System.out.println(". __ . __ . __ . __ . __ . __ . __ . __ . __ .\n");
        List<Militar> listaMilitar = batallon.getLista();
        int a = 0;
        for(Militar militar: listaMilitar){
            a++;
            Militar.imprimirMilitares(militar, a);
        }
    }
}
