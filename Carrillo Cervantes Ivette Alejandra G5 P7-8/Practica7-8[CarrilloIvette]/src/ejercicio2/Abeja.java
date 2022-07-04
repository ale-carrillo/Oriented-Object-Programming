package ejercicio2;

// Carrillo Cervantes Ivette Alejandra
// Programación Orientada a Objetos - Grupo 3

public class Abeja extends Insecto{
    
    // * * * * Método constructor * * * *
    
    Abeja(String nombre, int edad, String habitad){
        super(nombre, edad, habitad);
    }
    
    // * * * * Métodos sobreescritos * * * *
    
    @Override
    public void sonido(){
        System.out.println("ZzzzzZZZzzzzZzZ...");
    }
    
    @Override
    public void pensando(){
        System.out.println(" * * Que linda flor... * * ");
    }

    @Override
    public void trasladarse(){
        System.out.println("*Volando... *");
    }    
    
}
