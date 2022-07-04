package ejercicio1;

// Carrillo Cervantes Ivette Alejandra
// Programación Orientada a Objetos - Grupo 3

public class Estudiante extends Comprador implements CompradorAcciones{

    // * * * * Método Constructor * * * *
    
    public Estudiante(String nombre, int edad, String tipoCliente) {
        super(nombre, edad, tipoCliente);
    }
        
    // * * * * Otros métodos * * * *
    
    @Override
    public void hablar(){
        System.out.println("Hola, soy un comprador Estudiante!! ");
    }
    
    @Override
    public void comprar(){
        System.out.println("Quisiera comprar un dispositivo electrónico");
    }
    
    @Override
    public void pagar(){
        System.out.println("Listo. Aquí tiene la cantidad");
    }
}
