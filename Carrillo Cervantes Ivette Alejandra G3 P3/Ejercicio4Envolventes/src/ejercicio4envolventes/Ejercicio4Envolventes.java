package ejercicio4envolventes;

/**
 * @author Carrillo Cervantes Ivette Alejandra
 * Programación Orientada a Objetos - Grupo 3
 */
public class Ejercicio4Envolventes {
    
    	public static void main(String args[]){

            Integer entero1 = new Integer(83);
            // Se escribio correctamente "Integer"
            Integer entero2 = 50; // No es necesario poner "new Integer"
            System.out.println("\nInteger 1: "+entero1);
            System.out.println("Integer 2: "+entero2);
            
            // Se cambio Float por Double
            Double flotante1 = new Double(24.333);
            System.out.println("\nDouble: "+flotante1);
            System.out.println("¿La magnitud de Double es muy grande? " +flotante1.isInfinite());
            
            // Falto la palabra reservada new
            Integer entero3 = new Integer("1234");
            Float flotante2 = new Float("12.664");
            System.out.println("\nInteger 3: "+entero3);
            System.out.println("Float: "+flotante2);

            Integer envolvente = new Integer (83);
            System.out.println("\nEnvolvente 1: "+envolvente);
            System.out.println("Convertimos Envolvente 1 en:");
            byte b = envolvente.byteValue();
            System.out.println("Byte: "+b);
            // Se inicializó la variable 'e'
            short e = envolvente.shortValue();
            System.out.println("short: "+e);
            double d = envolvente.doubleValue();
            System.out.println("double: "+d);
            
            Float envolvente2 = new Float(10.32);
            System.out.println("\nEnvolvente 2: "+envolvente2);
            System.out.println("Convertimos Envolvente 2 en:");
            short s2 = envolvente2.shortValue();
            System.out.println("short: "+s2); 

            int otro = Integer.parseInt("10");
            double d3 = Double.parseDouble("50.25");
            System.out.println("\nParse"); 
            System.out.println("Int: "+otro); 
            System.out.println("Double: "+d3); 

            Integer wrap = Integer.valueOf("1100");
            Double wrap2 = Double.valueOf("3.141519");
            System.out.println("\nValueOf"); 
            System.out.println("Integer: "+wrap); 
            System.out.println("Double: "+wrap2); 
            
            /*********************************************************************************************/

            System.out.println("\nEl entero 1 se comparo con el entero 2: "+entero1.compareTo(entero2));
            System.out.println("El entero 1 se comparo con envolvente: "+entero1.compareTo(envolvente));
            System.out.println("El entero 2 se comparo con el entero 1: "+entero2.compareTo(entero1)+"\n");
	}
    
}
