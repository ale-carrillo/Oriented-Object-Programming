package Guia;

// Carranza Ochoa José David
// Carrillo Cervantes Ivette Alejandra

public class HiloT extends Thread{
    public HiloT(String nombre){
        super(nombre);
    }
    
    public void run(){
        for (int i = 0; i < 5; i++) {
            System.out.println("Iteración: "+(i+1)+" de "+ getName());
        }
        System.out.println("Termina el "+getName());
    }
    public static void main(String[] args) {
        new HiloT("Primer hilo").start();
        new HiloT("Segundo hilo").start();
        System.out.println("Termina el hilo principal");
    }    
}
