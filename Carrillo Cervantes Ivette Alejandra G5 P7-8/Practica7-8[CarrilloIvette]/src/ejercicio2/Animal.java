package ejercicio2;

// Carrillo Cervantes Ivette Alejandra
// Programación Orientada a Objetos - Grupo 3

public class Animal{
    
    // * * * * Atributos * * * *
    
    public String nombre;
    public int edad;
    public String habitad;
    
    // * * * * Método constructor * * * *
    
    Animal(String nombre, int edad, String habitad){
        this.nombre = nombre;
        this.edad = edad;
        this.habitad = habitad;
    }
    
    // * * * * Métodos de acceso * * * *
    public String getNombre(){
        return nombre;
    }
    
    public int getEdad(){
        return edad;
    }
    
    public String getHabitad(){
        return habitad;
    }
    
    // * * * * Otros métodos * * * *

    public void sonido(){
        System.out.println("*Existen muchos sonidos de animales*");
    }
    
    public void pensando(){
        System.out.println(" * * * * ");
    }

    public void trasladarse(){
        System.out.println("*Depende el modo de transladarse de cada animal*");
    }
  
}
