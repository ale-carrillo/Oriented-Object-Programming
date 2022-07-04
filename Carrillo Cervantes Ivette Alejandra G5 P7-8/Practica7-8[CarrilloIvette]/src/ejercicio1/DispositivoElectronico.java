package ejercicio1;

// Carrillo Cervantes Ivette Alejandra
// Programación Orientada a Objetos - Grupo 3

public abstract class DispositivoElectronico {
    
    // * * * * Atributos * * * *
    
    public String marca; 
    public double precio;
    
    // * * * * Método constructor * * * *
    
    public DispositivoElectronico(String marca, double precio){
        this.marca = marca;
        this.precio = precio;
    }
    
    // * * * * Métodos de acceso * * * *
    
    public String getMarca(){
        return marca;
    }
    
    public void setMarca(String marca){
        this.marca = marca;
    }
    
    public double getPrecio(){
        return precio;
    }
    
    public void setPrecio(double precio){
        this.precio = precio;
    }
    
}
