package Practica1;

import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.Scanner;

public class ListaWebs {
	
	private ArrayList<Web> lista;
	
	public ListaWebs()
	{
		this.lista= new ArrayList<Web>();
	}
	private Iterator<Web> getIterador()
 	{
 		return this.lista.iterator();
 		
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
				this.lista.add(pWeb);	
			}     
			entrada.close();   
			}   
		catch(IOException e) 
		{
			e.printStackTrace();
		}
		}
	public String id2String (int x) 
	{
		System.out.println(this.lista.get(x).getNombre());
		return this.lista.get(x).getNombre();
	}
	
	public int string2Id(String s) 
	{
		Web pWeb;
		int id = 0;
		boolean salir = false;
		Iterator <Web> itr = this.getIterador();
		while (!salir && itr.hasNext()) 
			{
				pWeb = itr.next();
				if (pWeb.getNombre().equals(s)) 
				{
					salir = true;
					id = pWeb.getId();
				}
			}
		System.out.println(id);
		return id;
	}
	
	public ListaWebs enlacesSalientes(String s)
	{
		int id = this.string2Id(s);
		Web pWeb = this.lista.get(id);
		return pWeb.getListaWebs();
	}
	 
	



}
