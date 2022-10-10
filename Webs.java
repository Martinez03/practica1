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
	public void cargarListaLigada(String nomF) 
	{
		String[] array;
		int id;
		String listaIds = null;
		String[] listaIdsSep;
		Web pWeb;
		Web pWeb2;

		try {      
			Scanner entrada = new Scanner(new FileReader(nomF));
			String linea;   
				while (entrada.hasNext()){ 
					linea = entrada.nextLine();
					array = linea.split("\\s-*> ");
					id = Integer.parseInt(array[0]);
					//System.out.println(id);
					try {
						listaIds = array[1];
						
					
					
						listaIdsSep = listaIds.split("\\s+###\\s+");
						pWeb = Webs.getWebs().getLista().id2Web(id);
							for (int i = 0;i < listaIdsSep.length; i++)
							{
								pWeb2 = Webs.getWebs().getLista().id2Web(Integer.parseInt(listaIdsSep[i]));
								pWeb.getListaWebs().anadirWeb(pWeb2);
								//System.out.println(listaIdsSep[i]);
								
							}
							}
							
					catch(ArrayIndexOutOfBoundsException e)
					{
								
					}
							
					}
			entrada.close(); 
		}
		catch(IOException e) 
		{
			e.printStackTrace();
		}
	
	
	}
	

}
