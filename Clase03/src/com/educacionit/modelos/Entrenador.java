package com.educacionit.modelos;

public class Entrenador extends SeleccionDeFutbol {
	private String IdFederacion;
	
	
	
	
	//Constructor
	public Entrenador(String idFederacion) {
		super();
		IdFederacion = idFederacion;
	}
	
	//Constructor vacio
	public Entrenador() {
		
	}
	
	
	//Metodo desde la superclase
	public Entrenador(String IdFederacion, int id, String nombre, String apellidos, int edad) {
		super(id, nombre, apellidos, edad);
		this.IdFederacion = IdFederacion;

	}

	
	//Metodos
	public void dirigirPartido() {
		System.out.println("Estoy dirigiendo un partido (clase hija)");
	}
	
	public void dirigirEntrenamiento() {
		System.out.println("Estoy dirigiendo un entrenamiento (clase hija)");
		
	}

	
	//Getter y Setter
	public String getIdFederacion() {
		return IdFederacion;
	}

	public void setIdFederacion(String idFederacion) {
		IdFederacion = idFederacion;
	}
	
	
	
	
	
	
	

}
