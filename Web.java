package Practica1;

import java.io.FileReader;
import java.io.IOException;
import java.util.Scanner;

public class Web {
	private String nombre;
	private int id;
	private ListaWebs listaWebs;
	private ListaPalabrasClaves listaPalabras;
	
	public Web (String pNombre,int pId) 
	{
		this.id = pId;
		this.nombre = pNombre;
		this.listaWebs = new ListaWebs();
		this.listaPalabras = new ListaPalabrasClaves();
	}

	public String getNombre() {
		return nombre;
	}

	public int getId() {
		return id;
	}

	public ListaWebs getListaWebs() {
		return this.listaWebs;
	}
	
	public void cargarListaPalabrasClave() 
	{
		
		this.listaPalabras =  listaPalabras.web2Words(this.nombre);
	}
	
	

	
	
	
}
