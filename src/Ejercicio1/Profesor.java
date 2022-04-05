package Ejercicio1;

public class Profesor extends Empleado{
	
	private String cargo;
	private int antiguedadDocente;
	
	
	public Profesor(int edad,String nombre,int antiguedad , String cargo) {
		super(edad,nombre);
		antiguedadDocente = antiguedad;
		this.cargo = cargo;
	}
	
	
	public void setAntiguedadDocente(int a) {
		this.antiguedadDocente = a;
	}
	
	public int getantiguedadDocente() {
		return antiguedadDocente;
	}
	public String getCargo() {
		return cargo;
	}
	public void setNombre(String cargo) {
		this.cargo = cargo;
	}

	@Override
	public String toString() {
		return super.toString() + " cargo: " + cargo + ", antiguedadDocente: "+ antiguedadDocente ;
	}
	
	
}