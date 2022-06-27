package logica;

import java.util.Scanner;

public class Electrodomestico {
	private String nombre;
	private String marca;
	private double consumo;
	
	private Scanner sc=new Scanner(System.in);
	
	//constructor por defecto
	public Electrodomestico() {
		setNombre(nombre);
		setMarca(marca);
		setConsumo(consumo);
		
		
	
	}
	 							
	//constructor especifico
	public Electrodomestico(String nom, String mar, double con) {
		nombre=nom;
		marca=mar;
		consumo=con;
		
	}
	
	
	

	//metodos getters
	public String getNombre() {
		return nombre;
	}
	
	public String getMarca() {
		return marca;
	}
	public double getConsumo() {
		return consumo;
	}
	
	
	
	//metodos setters
	public void setNombre(String nom) {
		nombre=nom;
		System.out.println("ingrese nombre");
		nombre = sc.nextLine();
	
		
		
	}
	public void setMarca(String mar) {
		marca=mar;
		System.out.println("ingrese marca");
		marca = sc.nextLine();
	
		
		
		
	}
	
	public void setConsumo(double con) {
		consumo=con;
		System.out.println("ingrese consumo");
		consumo = sc.nextDouble();
		
		
	}
	
	
	
	
	//metodo toString
	@Override
	public String toString() {
		return("nombre: " + nombre + "\r" + "marca: " + marca + "\r" + "consumo: " + consumo);
	}
}
