package practica6y7;

/**
 *
 * @author Alejandra Carrillo
 */

public class Militar{
    
    // * * * * * * * Atributos de clase Militar * * * * * *
    
    private int matricula;
    private String nombreM;	
    private String gradomil;  
    private static int militares = 0;
    
    // * * * * * * Métodos constructores * * * * * *
    
    public Militar(){
        this.militares ++;
    }
    
    public Militar(int matricula, String nombreM, String gradomil){
        this.matricula = matricula;
        this.nombreM = nombreM;
        this.gradomil = gradomil;
        militares ++;
    }

    // * * * * * * Métodos de acceso * * * * * *
    
    public void setMatricula(int matricula){
        this.matricula = matricula;
    }
    public int getMatricula(){
        return matricula;
    }
    
    public void setNombreM(String nombreM){
        this.nombreM = nombreM;
    }
    public String getNombreM(){
        return nombreM;
    }

    public void setGradomil(String gradomil){
        this.gradomil = gradomil;
    }
    public String getGradomil(){
        return gradomil;
    }
    
    // * * * * * * Otros métodos * * * * * * *
    
    public static int numMilitares(){
        return militares;
    }
        
    public static void imprimirMilitares(Militar militar, int n){
        System.out.println("    MILITAR "+n);
        System.out.println("  Matricula: "+militar.getMatricula());
        System.out.println("  Nombre del militar: "+militar.getNombreM());
        System.out.println("  Grado militar: "+militar.getGradomil());
        System.out.println(".  .  .  .  .  .  .  .  .  .  .  .  .  .\n");
    }
}
