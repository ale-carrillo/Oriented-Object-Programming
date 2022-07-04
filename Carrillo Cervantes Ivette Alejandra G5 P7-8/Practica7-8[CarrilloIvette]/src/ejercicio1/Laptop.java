package ejercicio1;

// Carrillo Cervantes Ivette Alejandra
// Programación Orientada a Objetos - Grupo 3

public class Laptop extends DispositivoMovil{
    
    // * * * * Atributos * * * *
    
    public String sistemaOperativo;

    // * * * * Método constructor * * * *
    
    Laptop(String marca, double precio, int memoriaRam, String modelo, int duracionBateriaHr, int memoriaGB, String sistemaOperativo){
        super(marca, precio, memoriaRam, modelo, duracionBateriaHr, memoriaGB);
        this.sistemaOperativo = sistemaOperativo;
    }
    
    // * * * * Métodos constructores * * * *
    
    public String getSistemaOperativo(){
        return sistemaOperativo;
    }
    
    public void setSistemaOperativo(String sistemaOperativo){
        this.sistemaOperativo = sistemaOperativo;
    }
        
}