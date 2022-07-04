package otros;
import altos.*; // Importa al package "altos"

/**
 *
 * @author Edgar
 */

// Clase Operativo -> public
// Hereda de Empleado
public class Operativo extends Empleado{
    
    // Atributos privados de la clase
    private String turno;
    private int jornadaLaboral;
    
    // Método constructor -> Utiliza la palabra reservada Super, pues utiliza el constructor de Empleado
    public Operativo(String Nombre, String Apellido){
        super(Nombre,Apellido);
    }
    
    // Métodos de acceso
    public String getTurno(){
        return this.turno;
    }
    
    public void setTurno(String turno){
        this.turno=turno;
    }
    
    public int getJornadaLaboral(){
        return this.jornadaLaboral;
    }
    
    public void setJornadaLaboral(int jornadaLaboral){
        this.jornadaLaboral=jornadaLaboral;
    }
    
}
