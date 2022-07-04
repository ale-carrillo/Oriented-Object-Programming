package guia;

import java.io.Console;

public class EjConsole {
    public static void main(String[] args){
        Console con= System.console();
        if(con!=null)
        {
            System.out.print("Usuario: ");
            String s= con.readLine();
            System.out.println(s);
        }else{
            System.out.println("No hay una conosla adjunta");
        }

        System.out.print("Contraseña: ");
        char [] s2= con.readPassword();
        System.out.println(s2);	

    }
}