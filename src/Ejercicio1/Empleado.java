package Ejercicio1;

public class Empleado {
	
	private final int id;
	private String nombre;
	private int edad;
	private static int cont=1000;
	
	public Empleado() {
		id = cont;
		nombre = "Sin Nombre";
		edad = 0;
		cont++;
	}
	
	public Empleado(int e , String nom) {
		id=cont;
		edad = e;
		nombre = nom;
		cont++;
	}
	
	
	public int getId() {
		return id;
	}
	public String getNombre() {
		return nombre;
	}
	public void setNombre(String nombre) {
		this.nombre = nombre;
	}
	public int getEdad() {
		return edad;
	}
	public void setEdad(int edad) {
		this.edad = edad;
	}


	public String toString() {
		return "ID: "+ id +", Edad: "+ edad +", Nombre: " + nombre ;
	}
}

