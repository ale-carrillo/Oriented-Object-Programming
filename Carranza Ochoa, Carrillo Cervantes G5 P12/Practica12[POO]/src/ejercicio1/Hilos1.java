package ejercicio1;

// Carranza Ochoa José David
// Carrillo Cervantes Ivette Alejandra

public class Hilos1 {
       
     public static void main(String[] args) {
         System.out.println("Inicio del programa (hilo) principal");
       
         MiHilo2 prueba1 = MiHilo2.crearYComenzar("#1");
         MiHilo2 prueba2 = MiHilo2.crearYComenzar("#2");
         MiHilo2 prueba3 = MiHilo2.crearYComenzar("#3");
         System.out.println("Hilo principal finalizado");
     }
}
