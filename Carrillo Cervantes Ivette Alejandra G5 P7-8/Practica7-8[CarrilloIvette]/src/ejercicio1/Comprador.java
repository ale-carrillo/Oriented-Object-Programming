package ejercicio1;

// Carrillo Cervantes Ivette Alejandra
// Programación Orientada a Objetos - Grupo 3

public abstract class Comprador {
    
    String nombre;
    int edad;
    String tipoCliente;
    static int numCliente = 0;
    
    Comprador(String nombre, int edad, String tipoCliente){
        this.nombre = nombre;
        this.edad = edad;
        this.tipoCliente = tipoCliente;
        this.numCliente = numCliente ++;     
    }
    
    public String getNombre(){
        return nombre;
    }
    
    public int getEdad(){
        return edad;
    }
    
    public int getcliente(){
        return numCliente;
    }

    public void hablar(){
    }

    public void comprar(){
    }

    public void pagar(){
    }
}