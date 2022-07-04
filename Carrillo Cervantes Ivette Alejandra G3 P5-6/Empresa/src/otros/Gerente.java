package otros;

import altos.Empleado;

/**
 *
 * @author Edgar
 */

// Clase Gerente -> publica
// Hereda de Empleado
public class Gerente extends Empleado{
    
    // Atributos privados de gerente
    private String area;
    private int numSubordinados;
    
    // Método constructor -> Utiliza la palabra reservada Super, pues utiliza el constructor de Empleado
    public Gerente(String Nombre, String Apellido) {
        super(Nombre, Apellido);
    }

    // Métodos de acceso
    public String getArea() {
        return area;
    }

    public void setArea(String area) {
        this.area = area;
    }

    public int getNumSubordinados() {
        return numSubordinados;
    }

    public void setNumSubordinados(int numSubordinados) {
        this.numSubordinados = numSubordinados;
    }


    public double getSalarioSubordinado(Operativo operativo){
        return operativo.getsalarioBase();
    }
   
}