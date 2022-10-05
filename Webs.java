package Practica1;

import java.io.FileReader;
import java.io.IOException;
import java.util.Scanner;

public class Webs 
{
	private ListaWebs lista;
	private static Webs miWebs = new Webs();
	
	private Webs()
	{
		this.lista = new ListaWebs();
	}
	
	public static Webs getWebs() 
	{
		return Webs.miWebs;
	}

	public ListaWebs getLista() {
		return this.lista;
	}
	
	public void cargarLista(String nomF) { 
		String[] array;
		int id;
		String nombre;
		Web pWeb;
		
		try {      
			Scanner entrada = new Scanner(new FileReader(nomF));
			String linea;
			while (entrada.hasNext()) {         
				linea = entrada.nextLine();
				array = linea.split(":");
				id = Integer.parseInt(array[0]);    
				nombre = array[1];
				pWeb = new Web(nombre, id);
				this.lista.anadirWeb(pWeb);	
			}     
			entrada.close();   
			}   
		catch(IOException e) 
		{
			e.printStackTrace();
		}
		}
	
	

}
