package altos;

/**
 *
 * @author Edgar
 */

// Clase Directivo -> publica
// Hereda de Empleado
public class Directivo extends Empleado{
    
    // Atributo salarioAdicional;
    private double salarioAdicional;
    
    // Método constructor -> Utiliza la palabra reservada Super, pues utiliza el constructor de Empleado
    public Directivo(String Nombre, String Apellido){
        super(Nombre, Apellido);
    }
    
    // Métodos de acceso tipo friendly.
    void setSalarioAdicional(double salarioAdicional){
        this.salarioAdicional=salarioAdicional;
    }
    double getSalarioAdicional(){
        return this.salarioAdicional;
    }
    
    void setSalarioOtro(Empleado empleado,int SalarioBase){
        empleado.setSalarioBase(SalarioBase);
    }
    
    double getSalarioOtro(Empleado empleado){
        return empleado.getsalarioBase();
    }   
    
}
