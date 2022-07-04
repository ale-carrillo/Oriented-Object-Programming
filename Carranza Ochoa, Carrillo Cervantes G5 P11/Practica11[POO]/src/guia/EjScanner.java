/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package guia;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;

/**
 *
 * @author aleja
 */
public class EjScanner {
     public static void main(String[] args)
	{
		File archivo = new File("archivo.txt");
		Scanner lector;
		try{
			lector= new Scanner(archivo);
			lector.useDelimiter("/");
                        
			while(lector.hasNext())
			{
				System.out.println(lector.next());
			}
			lector.close();
		} catch(FileNotFoundException e)
		{
			e.printStackTrace();
		}
	}   
}
