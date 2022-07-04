package ejercicio1;

// Carrillo Cervantes Ivette Alejandra
// Programación Orientada a Objetos - Grupo 3

public class Tablet extends DispositivoMovil{
    
    // * * * * Atributos * * * *
    
    public boolean lapiz;
        
    // * * * * Método constructor * * * *
    
    Tablet(String marca, double precio, int memoriaRam, String modelo, int duracionBateriaHr, int memoriaGB, boolean lapiz){
        super(marca, precio, memoriaRam, modelo, duracionBateriaHr, memoriaGB);
        this.lapiz = lapiz;
    }
    
    // * * * * Métodos de acces o * * * *
    
    public boolean getLapiz(){
        return lapiz;
    }
    
    public void setLapiz(boolean lapiz){
        this.lapiz = lapiz;
    }
}
