package com.educacionit.test;
import java.util.ArrayList;
import com.educacionit.modelos.*;

public class AppPrincipal {

	//ArrayList
	public static ArrayList<SeleccionDeFutbol> integrantes = new ArrayList<SeleccionDeFutbol>();
	
	
	
	
	public static void main(String[] args) {
		//Instanciamos objetos
		Entrenador delBosque = new Entrenador ("21E256", 1, "Vicente", "Del Bosque", 65);
		Futbolista iniesta = new Futbolista ("interior derecho", 8, 2, "Andres", "Iniesta", 32);
		Masajista raulMartinez = new Masajista ("Licenciado en Fisioterapia", 10, 3, "Raul", "Martinez", 45);
		
		//Agregamos todos los objetos a nuestro ArrayList
		integrantes.add(delBosque);
		integrantes.add(iniesta);
		integrantes.add(raulMartinez);
		
		//Concentracion
		//For each: Sirve para iterar colecciones de objetos
		System.out.println("Todos los integrantes comienzan la concentracion (todos ejecutan el mismo metodo)\n");
		for (SeleccionDeFutbol integrante : integrantes) {
			System.out.println(integrante.getNombre() + " " + integrante.getApellidos());
			integrante.Concentrarse();
		}
		
		//Viaje
		System.out.println("\n Todos los integrantes viajan (todos ejecutan el mismo metodo)\n");
		for (SeleccionDeFutbol integrante : integrantes) {
			System.out.println(integrante.getNombre() + " " + integrante.getApellidos());
			integrante.Viajar();
			
		}
		
		
		SeleccionDeFutbol sc = new SeleccionDeFutbol (23, "Española", "gallega", 59);
		
		//Entrenamiento (de entrenador)
		System.out.println("\n Entrenamiento solamente el entrenador y el jugador poseen este metodo");
		System.out.println(delBosque.getNombre() + " " + delBosque.getApellidos());
		delBosque.dirigirEntrenamiento();
		System.out.println(iniesta.getNombre() + " " + iniesta.getApellidos());
		iniesta.entrenar();
		
		//Masaje
		System.out.println("\n Solo el masajista puede dar masajes");
		raulMartinez.darMasaje();
		
		//Partido de futbol
		System.out.println("\n Partido de Futbol: Solo entrenador y futbolista");
		System.out.println(delBosque.getNombre() + " " + delBosque.getApellidos());
		delBosque.dirigirPartido();
		
		System.out.println(iniesta.getNombre() + " " + iniesta.getApellidos());
		iniesta.jugarPartido();
		
		
	
		
		
		
		
		
		
		
		
		

	}

}
