package ejercicio1;

// Carrillo Cervantes Ivette Alejandra
// Programación Orientada a Objetos - Grupo 3

public class Computadora extends DispositivoElectronico{
    public int memoriaRam;
    public String modelo;
    
    // * * * * Método constructor * * * *
       
    Computadora(String marca, double precio, int memoriaRam, String modelo){
        super(marca, precio);
        this.memoriaRam = memoriaRam;
        this.modelo = modelo;
    }
     
    // * * * * Métodos de acceso * * * *
    
    public int getMemoriaRam(){
        return memoriaRam;
    }
    
    public void setMemoriaRam(int memoriaRam){
        this.memoriaRam = memoriaRam;
    }
    
    public String getModelo(){
        return modelo;
    }
    
    public void setModelo(String modelo){
        this.modelo = modelo;
    }
}
