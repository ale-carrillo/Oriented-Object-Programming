package ejercicio1;

// Carrillo Cervantes Ivette Alejandra
// Programación Orientada a Objetos - Grupo 3

public class Celular extends DispositivoMovil implements Funcionamiento{
    
    // * * * * Atributos * * * *
    
    public String tipoCargador;

    // * * * * Método constructor * * * *
    
    Celular(String marca, double precio, int memoriaRam, String modelo, int duracionBateriaHr, int memoriaGB, String tipoCargador){
        super(marca, precio, memoriaRam, modelo, duracionBateriaHr, memoriaGB);
        this.tipoCargador = tipoCargador;
    }
    
    // * * * * Métodos de acceso * * * *
    
    public String getTipoCargador(){
        return tipoCargador;
    }
    
    public void setTipoCargador(String tipoCargador){
        this.tipoCargador = tipoCargador;
    }
    
    // * * * * Otros métodos * * * *

    @Override
    public void notificacion(){
        System.out.println("Ring Ring");
    }
    @Override
    public void despertador(){
        System.out.println("*suena canción de Shawn Mendez*");
    }
}
