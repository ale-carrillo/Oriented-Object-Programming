/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package guia;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;

public class ClaseFileReader {
    public static void main(String [] args){
        String texto = "";
        try{
            BufferedReader br;
            FileReader fr= new FileReader("leer.txt");
            br = new BufferedReader(fr);
            System.out.println("El texto contenido en el archivo leer.txt es: ");
            String linea = br.readLine();
            while(linea!=null){
                System.out.println(linea);
                linea=br.readLine();
            }
            
        }catch (IOException ioe){
            System.out.println("Error ");
        }catch(Exception e){
            System.out.println("Error ");
            e.printStackTrace();
        }
    }
}