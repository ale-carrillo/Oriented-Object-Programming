package ejercicio1;

// Carrillo Cervantes Ivette Alejandra
// Programación Orientada a Objetos - Grupo 3

public class PC extends Computadora{
    
    //  * * * * Atributos * * * *
    public boolean accesorios;
    
    // * * * * Método Constructor * * * *
    
    PC(String marca, double precio, int memoriaRam, String modelo, boolean accesorios){
        super(marca, precio, memoriaRam, modelo);
        this.accesorios = accesorios;
    } 

    public boolean isAccesorios() {
        return accesorios;
    }

    @Override
    public int getMemoriaRam() {
        return memoriaRam;
    }

    @Override
    public String getModelo() {
        return modelo;
    }

    @Override
    public String getMarca() {
        return marca;
    }

    @Override
    public double getPrecio() {
        return precio;
    }
    
    // * * * * Métodos de acceso * * * * 
    
    public boolean getAccesorios(){
        return accesorios;
    }
    
    public void setAccesorios(boolean accesorios){
        this.accesorios = accesorios;
    }
}
