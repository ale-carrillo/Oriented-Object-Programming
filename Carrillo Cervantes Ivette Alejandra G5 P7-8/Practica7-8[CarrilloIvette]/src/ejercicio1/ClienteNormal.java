package ejercicio1;

// Carrillo Cervantes Ivette Alejandra
// Programación Orientada a Objetos - Grupo 3

public class ClienteNormal extends Comprador implements CompradorAcciones{
    
    // * * * * Método Constructor * * * *
    
    public ClienteNormal(String nombre, int edad, String tipoCliente) {
        super(nombre, edad, tipoCliente);
    }
    
    // * * * * Otros métodos * * * *
    
    @Override
    public void hablar(){
        System.out.println("Hola, soy un Cliente Común en la tienda!! ");
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
