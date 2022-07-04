// Carrillo Cervantes Ivette Alejandra
// Programación Orientada a Objetos - Grupo 3


public class Computadora{
	static int numComputadoras;
	String nombre;
	String marca;
	String color;
	int memoriaRam;
	double precio;
	boolean descuento;
	double total1;
	double total2;
	double desc;

	// Constructor 1 -> Vacio
	public Computadora(){
		numComputadoras++;
	}

	// Constructor 2
	public Computadora(String nombre){
		numComputadoras++;
		this.nombre = nombre;
	}

	// Constructor 3
	public Computadora(String nombre, String marca, String color, int memoriaRam, double precio, boolean descuento){
		numComputadoras++;
		this.nombre = nombre;
		this.marca = marca;
		this.color = color;
		this.memoriaRam = memoriaRam;
		this.precio = precio;
		this.descuento = descuento;
	}

	void imprimirComputadora(){
		System.out.println("\tComputadora "+nombre);
		System.out.println(" Marca: "+marca);
		System.out.println(" Color: "+color);
		System.out.println(" memoriaRam: "+memoriaRam+" GB");
		System.out.println(" Precio: "+precio);
		System.out.println(" ¿Tiene Descuento? "+descuento);
	}

	void descuento(int porcentaje, int efectivo){
		System.out.println("\nLa computadora tiene un descuento del "+porcentaje+"% más un descuento de $"+efectivo);
		desc = 100-porcentaje;
		total1 = desc*precio/100;
		total2 = total1-efectivo;
		if (total2<0) {
			System.out.println("Su compra es GRATIS (:");
		}else{
			System.out.println("El total de su compra es: "+total2);
		}
	}

	void descuento(int efectivo){
		System.out.println("\nLa computadora tiene un descuento de: $"+efectivo);
		total1 = precio-efectivo;
		if (total1<0) {
			System.out.println("Su compra es GRATIS (:");
		}else{
			System.out.println("El total de su compra es: "+total1);
		}
	}

	void descuento(){
		System.out.println("\nLa computadora tiene un descuento inicial del 10%");
		total1 = (90*precio)/100;
		if (total1<0) {
			System.out.println("Su compra es GRATIS (:");
		}else{
			System.out.println("El total de su compra es: "+total1);
		}
	}

	public String getNombre(){
		return nombre;
	}
	public void setNombre(String nombre){
		this.nombre = nombre;
	}
	public void setMarca(String marca){
		this.marca = marca;
	}
	public void setColor(String color){
		this.color = color;
	}
	public void setMemoriaRAM(int memoriaRam){
		this.memoriaRam = memoriaRam;
	}
	public void setPrecio(double precio){
		this.precio = precio;
	}
	public void setDescuento(boolean descuento){
		this.descuento = descuento;
	}
	public void setTodo(String nombre, String marca, String color, int memoriaRam, double precio, boolean descuento){
		this.nombre = nombre;
		this.marca = marca;
		this.color = color;
		this.memoriaRam = memoriaRam;
		this.precio = precio;
		this.descuento = descuento;	
	}

}