package ejercicio1;

// Carrillo Cervantes Ivette Alejandra
// Programación Orientada a Objetos - Grupo 3

public abstract class DispositivoMovil extends Computadora{
    
    // * * * * Atributos * * * *
    
    public int duracionBateriaHr;
    public int memoriaGB;
        
    // * * * * Método constructor * * * *
    
    DispositivoMovil(String marca, double precio, int memoriaRam, String modelo, int duracionBateriaHr, int memoriaGB){
        super(marca, precio, memoriaRam, modelo);
        this.duracionBateriaHr = duracionBateriaHr;
        this.memoriaGB = memoriaGB;
    }
    
    // * * * * Métodos de acceso * * * *
    
    public int getDuracionBateriaHr(){
        return duracionBateriaHr;
    }
    
    public void setDuracionBateriaHr(int duracionBateriaHr){
        this.duracionBateriaHr = duracionBateriaHr;
    }
    
    public int getMemoriaGB(){
        return memoriaGB;
    }
    
    public void setMemoriaGB(int memoriaGB){
        this.memoriaGB = memoriaGB;
    }
    
    // * * * * Otros métodos * * * *
    
    public void sonar(){
        System.out.println("Ring Ring");
    }
}
