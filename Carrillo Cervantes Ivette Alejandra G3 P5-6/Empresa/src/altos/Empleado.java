package altos;
/**
 *
 * @author Edgar
 */

// Clase Empleado -> publica 
// Es la clase padre donde heredan las otras clases

public class Empleado {
    
    // Atributos de la clase
    private String Nombre;
    private String Apellido;
    private double salarioBase;
    private String Puesto;
    
   
    // Método constructor, el cual inicializa el Nombre y Apellido del empleado
    public Empleado(String Nombre, String Apellido){
        this.Nombre=Nombre;
        this.Apellido=Apellido;
    }
       
    // Métodos de acceso
    public double getsalarioBase(){            //es public porque cualquiera puede conocer su propio sueldo
        return this.salarioBase;
    }
    
    void setSalarioBase(double salarioBase){     //es friendly para que solo los que estan dentro del paquete(directivo) lo puedan usar
        this.salarioBase=salarioBase;
    }
    
    protected void setPuesto(String Puesto){     // protected
        this.Puesto=Puesto;
    }
    
    protected String getPuesto(){    // protected
        return this.Puesto;
    }
    
}