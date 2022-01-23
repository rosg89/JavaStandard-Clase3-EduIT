package com.educacionit.modelos;

public class Masajista extends SeleccionDeFutbol {
	private String Titulacion;
	private int aniosExperiencia;
	
	
	//Constructor
	public Masajista(String titulacion, int aniosExperiencia) {
		super();
		Titulacion = titulacion;
		this.aniosExperiencia = aniosExperiencia;
	}
	
	
	//Constructor vacio
	public Masajista() {
		
	}
	
	
	//Constructor desde la superclase
	public Masajista(String Titulacion, int aniosExperiencia, int id, String nombre, String apellidos, int edad) {
		super(id, nombre, apellidos, edad);
		this.Titulacion = Titulacion;
		this.aniosExperiencia = aniosExperiencia;
	}


	//Metodos
	public void darMasaje() {
			System.out.println("Estoy dando masajes (clase hija)");
	}


	//Getter y Setter
	public String getTitulacion() {
		return Titulacion;
	}

	public void setTitulacion(String titulacion) {
		Titulacion = titulacion;
	}

	public int getAniosExperiencia() {
		return aniosExperiencia;
	}

	public void setAniosExperiencia(int aniosExperiencia) {
		this.aniosExperiencia = aniosExperiencia;
	}
	
	
	
	
	
	

}
