package ejercicio1;

// Carrillo Cervantes Ivette Alejandra
// Programación Orientada a Objetos - Grupo 3

public class Smartphone extends Celular{
        
    // * * * * Atributos * * * *
    
    public String compañia;

    // * * * * Método constructor * * * *
    
    Smartphone(String marca, double precio, int memoriaRam, String modelo, int duracionBateriaHr, int memoriaGB, String tipoCargador, String compañia){
        super(marca, precio, memoriaRam, modelo, duracionBateriaHr, memoriaGB, tipoCargador);
        this.compañia = compañia;
    }
    
    // * * * * Métodos de acceso * * * *
    
    public String getCompañia(){
        return compañia;
    }
    
    public void setCompañia(String compañia){
        this.compañia = compañia;
    }
}
