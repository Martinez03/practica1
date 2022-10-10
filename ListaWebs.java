package Practica1;


import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.Iterator;

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
	public void anadirWeb(Web pWeb) 
	{
		this.lista.add(pWeb);
		
	}
	
	public String id2String (int x) 
	{
		{
			try{
			
			return this.lista.get(x).getNombre();
			}
			catch (IndexOutOfBoundsException e){
				System.out.println("Id no encontrado.");
				return "Id no encontrado.";
				}
		}
	}
	
	public Web id2Web (int x) 
	{
		try{
			
			return this.lista.get(x);
			}
			catch (IndexOutOfBoundsException e){
				System.out.println("Id no encontrado.");
				return null;
				}
	}
	
	public int string2Id(String s) 
	{
		
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
			if (id == -1){
				System.out.println("Web no encontrada.");
			}
			return id;
		}
	}
	
	public ListaWebs enlacesSalientes(String s)
	{
		{
			int id = this.string2Id(s);
			if (id != -1){
				Web pWeb = this.lista.get(id);
				return pWeb.getListaWebs();
			} else {
				System.out.println("Web no encontrada.");
				return Webs.getWebs().getLista();
			}
		}
	}
	public ListaWebs word2Webs(String s)
	{
		ListaWebs pLista = new ListaWebs();
		Web pWeb;
		Iterator<Web> it = this.getIterador();
		while (it.hasNext())
		{
			pWeb = it.next();
			if (pWeb.getNombre().contains(s))
			{
				pLista.anadirWeb(pWeb);
			}
		}
		return pLista;
	}
	
	public void imprimirLista()
	{
		
		Web pWeb;
		Iterator <Web> itr = this.getIterador();
		while (itr.hasNext()) 
		{
			pWeb = itr.next();
			System.out.println(pWeb.getId() + ": " + pWeb.getNombre());
		}
	}
	
	public void ordenarLista() 
	{
		Collections.sort(this.lista, new Comparador());
	}
	
	public int compare(Web s1, Web s2) 
    { 
        return s1.getNombre().compareTo(s2.getNombre()); 
    }
	
	class Comparador implements Comparator<Web> 
	{ 
		  
	    public int compare(Web s1, Web s2) 
	    { 
	        return s1.getNombre().compareTo(s2.getNombre()); 
	    } 
	} 
	 
	



}
