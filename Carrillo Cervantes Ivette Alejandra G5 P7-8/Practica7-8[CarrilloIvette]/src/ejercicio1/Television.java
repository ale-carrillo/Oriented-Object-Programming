package ejercicio1;

// Carrillo Cervantes Ivette Alejandra
// Programación Orientada a Objetos - Grupo 3

public class Television extends DispositivoElectronico{
     
    // * * * * Atributos * * * *
       
    public int numCanales;
    public boolean cableTV;
          
    // * * * * Método constructor * * * *
      
    Television(String marca, double precio, int numCanales, boolean cableTV){
        super(marca, precio);
        this.numCanales = numCanales;
        this.cableTV = cableTV;
    }
        
    // * * * * Métodos de acces o * * * *
    
    public int getNumCanales(){
        return numCanales;
    }
    
    public void setNumCanales(int numCanales){
        this.numCanales = numCanales;
    }
    
    public boolean getCable(){
        return cableTV;
    }
    
    public void setCableTV(boolean cableTV){
        this.cableTV = cableTV;
    }
        
    // * * * * Otros métodos * * * *
    
    public void CambiarCanales(){
        System.out.println("Canal 5...");
        System.out.println("Canal 11...");
    }
}
