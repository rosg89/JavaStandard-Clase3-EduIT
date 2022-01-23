package com.educacionit.modelos;

public class SeleccionDeFutbol {
	protected int Id;
	protected String Nombre;
	protected String Apellidos;
	protected int Edad;
	
	
	
	
	
	//Constructor
	public SeleccionDeFutbol(int id, String nombre, String apellidos, int edad) {
		Id = id;
		Nombre = nombre;
		Apellidos = apellidos;
		Edad = edad;
	}


	//Constructor vacio
	public SeleccionDeFutbol() {
	
	}

	
	//Metodos
	public void Concentrarse() {
		System.out.println("Me estoy concentrando (clase padre)");
		
	}
	
	public void Viajar() {
		System.out.println("Estoy viajando (clase padre)");
	
	//No se hereda el constructor, ni metodos privados.
	
	
		
		
		
		
		
	
	
	}


	public int getId() {
		return Id;
	}


	public void setId(int id) {
		Id = id;
	}


	public String getNombre() {
		return Nombre;
	}


	public void setNombre(String nombre) {
		Nombre = nombre;
	}


	public String getApellidos() {
		return Apellidos;
	}


	public void setApellidos(String apellidos) {
		Apellidos = apellidos;
	}


	public int getEdad() {
		return Edad;
	}


	public void setEdad(int edad) {
		Edad = edad;
	}



}
