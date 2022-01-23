package com.educacionit.modelos;

public class Futbolista extends SeleccionDeFutbol {
	private int Dorsal;
	private String Demarcacion;
	
	

	//Constructor
	public Futbolista(int dorsal, String demarcacion) {
		Dorsal = dorsal;
		Demarcacion = demarcacion;
	}
	
	//Constructor vacio
	public Futbolista() {
		
	}
	
	
	//Constructor desde la superclase
	public Futbolista(String Demarcacion, int Dorsal, int id, String nombre, String apellidos, int edad) {
		super(id, nombre, apellidos, edad);
		this.Demarcacion = Demarcacion;
		this.Dorsal = Dorsal;
		
	}

	
	//Metodos
	public void jugarPartido() {
		System.out.println("Estoy jugando un partido (clase hija)");
		
	}
	
	public void entrenar() {
		System.out.println("Estoy entrenando (clase hija)");
		
	}

	
	//Getter y Setter
	public int getDorsal() {
		return Dorsal;
	}

	public void setDorsal(int dorsal) {
		Dorsal = dorsal;
	}

	public String getDemarcacion() {
		return Demarcacion;
	}

	public void setDemarcacion(String demarcacion) {
		Demarcacion = demarcacion;
	}
	
	
	
	
	
	
	

}
