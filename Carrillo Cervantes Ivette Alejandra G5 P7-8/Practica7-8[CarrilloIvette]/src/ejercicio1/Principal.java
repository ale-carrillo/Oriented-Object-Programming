package ejercicio1;

import java.util.HashMap;
import java.util.LinkedList;
import java.util.List;
import java.util.Map;
import java.util.Scanner;

// Carrillo Cervantes Ivette Alejandra
// Programación Orientada a Objetos - Grupo 3

public class Principal {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int opcion;
        int salir;
        int cliente;

        Map<Comprador,List<DispositivoElectronico>> listaClientes = new HashMap<>();
        
        // * * * * Creación de clientes * * * *
        Comprador comprador1 = new ClienteNormal("Hermionie", 16, "Cliente Normal");
        Comprador comprador2 = new ClienteVip("Draco", 17, "Cliente VIP");
        Comprador comprador3 = new Estudiante("Harry", 16, "Cliente Estudiante");
        
        // * * * * Lista en donde se guardará la información de los articulos que compra cada cliente
        List <DispositivoElectronico> listaComprador1 = new LinkedList<>();
        List <DispositivoElectronico> listaComprador2 = new LinkedList<>();
        List <DispositivoElectronico> listaComprador3 = new LinkedList<>();
        
        // * * * * Articulos disponibles en tienda * * * *
        DispositivoElectronico tab = new Tablet("Huawei", 16000, 8, "honor", 16, 4, true);
        DispositivoElectronico lap = new Laptop("HP", 17000, 16, "ASDF18", 12, 249, "Windows");
        DispositivoElectronico tv = new Television("Sony", 6000, 40, false);
        DispositivoElectronico pc = new PC("APPLE", 35000, 16, "5z", true);
        DispositivoElectronico smart = new Smartphone("Huawei", 7500, 4, "9S", 14, 159, "Tipo C", "AT&T");
        
        listaComprador1.add(tab);
        listaComprador2.add(tv);
        listaComprador3.add(pc);
        
        listaClientes.put(comprador1, listaComprador1);
        listaClientes.put(comprador2, listaComprador2);
        listaClientes.put(comprador3, listaComprador3);

        do{
            System.out.println("_________________________________________________________\n");
            System.out.println("\t\tTIENDA DE TECNOLOGIA\n");            
            System.out.println("  1. Acceder a perfil");
            System.out.println("  2. Crear perfil nuevo");
            System.out.println("  3. Ver clientes");
            System.out.println("  4. Salir");
            System.out.print(" -> Elige una opción: ");
            salir = sc.nextInt();
            switch(salir){
                case 1:
                    System.out.println("\n__ __ __ __ __ __ __ __ __ __ __ __ __ __ __ __\n");
                    System.out.println("\tACCEDER A PERFIL DE CLIENTE EXISTENTE\n");
                    sc.nextLine();
                    System.out.print(" Ingresa tu nombre con el que estas registrado para acceder: ");
                    String nombre = sc.nextLine();
                    boolean bandera = false;
                    for(Map.Entry<Comprador,List<DispositivoElectronico>> entry: listaClientes.entrySet()){
                        int cadena = entry.getKey().getNombre().compareTo(nombre);
                        if(cadena == 0){
                            entry.getKey().getcliente();
                            List <DispositivoElectronico> listaCompras= entry.getValue();
                            int op;
                            do{
                                System.out.println(" 1. Comprar dispositivo");
                                System.out.println(" 2. Salir");
                                System.out.print(" -> ¿Qué deseas hacer? ");
                                op = sc.nextInt();
                                switch(op){
                                    case 1:
                                        System.out.println(". _ . _ . _ . _ . _ . _ . _ . _ .");
                                        System.out.println("\n\tCOMPRAR DISPOSITIVO");
                                            Principal.agregarDispositivo(listaCompras);
                                            Comprador com = entry.getKey();
                                            com.hablar();
                                            com.comprar();
                                            com.pagar();
                                            System.out.println("_ _ _ _ _ _ _ _ _ _ _ _ _ _ _ _ _ _\n");
                                        break;
                                    case 2:
                                        System.out.println("SALIR");
                                        break;
                                    default:
                                        System.out.println("No hay, no existe esa opción");
                                        break;
                                }
                            }while(op != 2);
                            bandera = true;
                        }
                    }
                    if(!bandera){
                        System.out.println("No se encontró el Cliente ):");
                    }
                    break;
                case 2:
                    System.out.println("\n__ __ __ __ __ __ __ __ __ __ __ __ __ __ __ __\n");
                    System.out.println("\tCREAR UN PERFIL NUEVO\n");;
                    System.out.println("  1. Comprador");
                    System.out.println("  2. Cliente VIP");
                    System.out.println("  3. Estudiante");
                    System.out.print(" -> Elige el tipo de cliente: ");
                    cliente = sc.nextInt();   
                    sc.nextLine();
                    System.out.println("Ingrese sus datos: ");
                    System.out.print("Nombre: ");
                    String nom = sc.nextLine();
                    System.out.print("Edad: ");
                    int edad = sc.nextInt();
                    Comprador compradorN;
                    List <DispositivoElectronico> listaCompradorN;
                    switch(cliente){
                        case 1:
                            compradorN = new ClienteNormal(nom, edad, "Cliente Normal");
                            listaCompradorN = new LinkedList<>();
                            listaClientes.put(compradorN, listaCompradorN);
                            break;
                        case 2:
                            compradorN = new ClienteVip(nom, edad, "Cliente VIP");
                            listaCompradorN = new LinkedList<>();
                            listaClientes.put(compradorN, listaCompradorN);
                            break;
                        case 3:
                            compradorN = new Estudiante(nom, edad, "Cliente Estudiante");
                            listaCompradorN = new LinkedList<>();
                            listaClientes.put(compradorN, listaCompradorN);
                            break;
                        default:
                            System.out.println("No existe esa opcion ):");
                            break;
                    }

                break;
                
                case 3:
                    System.out.println("\n__ __ __ __ __ __ __ __ __ __ __ __ __ __ __ __\n");
                    System.out.println("\tIMPRIMIR CLIENTES\n");
                    Principal.imprimir(listaClientes);
                    break;
                    
                case 4:
                    System.out.println("\n__ __ __ __ __ __ __ __ __ __ __ __ __ __ __ __\n");
                    System.out.println("\tSALIR\n");
                    break;
                    
                default:
                    System.out.println("No hay, no existe esa opción ):");
                    break;
                    
            }
        }while(salir != 4);

    }
    public static void agregarDispositivo(List <DispositivoElectronico> lista){
        int opcion = Principal.dispositivos();
        switch(opcion){
            case 1:
                DispositivoElectronico lap = new Laptop("HP", 17000, 16, "ASDF18", 12, 249, "Windows");
                lista.add(lap);
                break;
            case 2:
                DispositivoElectronico tab = new Tablet("Huawei", 16000, 8, "honor", 16, 4, true);
                lista.add(tab);
                break;
            case 3:
                DispositivoElectronico smart = new Smartphone("Huawei", 7500, 4, "9S", 14, 159, "Tipo C", "AT&T");
                lista.add(smart);
                break;
            case 4:
                DispositivoElectronico pc = new PC("APPLE", 35000, 16, "5z", true);
                lista.add(pc);
                break;
            case 5:
                DispositivoElectronico tv = new Television("Sony", 6000, 40, false);
                lista.add(tv);
                break;
            default:
                System.out.println("No hay, no existe esa opción ):");
                break;
        }
    }
    
    public static int dispositivos(){
        Scanner sc = new Scanner(System.in);
        System.out.println(" 1. Laptop");
        System.out.println(" 2. Tablet");
        System.out.println(" 3. Smartphone");
        System.out.println(" 4. PC");
        System.out.println(" 5. Television");
        System.out.print(" -> ¿Qué deseas comprar? ");
        int opcion = sc.nextInt();
        System.out.println("");
        return opcion;
    }
    
    public static void imprimir(Map<Comprador,List<DispositivoElectronico>> listaClientes){
        for(Map.Entry<Comprador,List<DispositivoElectronico>> entry: listaClientes.entrySet()){
            System.out.println("_ _ _ _ _ _ _ _ _ _ _ _ _ _ _ _");
                System.out.println("Cliente: ");
                System.out.println("Nombre: "+entry.getKey().getNombre());
                System.out.println("Edad: "+entry.getKey().getEdad());
                List <DispositivoElectronico> lista = entry.getValue();
                System.out.println("\n  Dispositivos comprados:");
                for(DispositivoElectronico disp: lista){
                    System.out.println("Marca: "+disp.getMarca());
                    System.out.println("Precio: "+disp.getPrecio());
                }
            }
    }
}