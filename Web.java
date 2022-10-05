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
	
	public void cargarListaLigada(String nomF) 
	{
		String[] array;
		int id;
		String listaIds;
		String[] listaIdsSep;
		Web pWeb;
		
		try {      
			Scanner entrada = new Scanner(new FileReader(nomF));
			String linea;
			{   
				linea = entrada.nextLine();
				array = linea.split("\s-+\s");
				id = Integer.parseInt(array[0]);
				System.out.println(id);
				listaIds = array[1];
				listaIdsSep = listaIds.split("\s#+\s");
				for (int i = 0;i < listaIdsSep.length; i++)
				{
					pWeb = Webs.getWebs().getLista().id2Web(Integer.parseInt(listaIdsSep[i]));
					this.listaWebs.anadirWeb(pWeb);
					System.out.println(listaIdsSep[i]);
					
				}   
			entrada.close();   
			}
		}
		catch(IOException e) 
		{
			e.printStackTrace();
		}
	}
	
	public void cargarListaPalabrasClave() 
	{
		
		this.listaPalabras =  listaPalabras.web2Words(this.nombre);
	}
	
	

	
	
	
}
