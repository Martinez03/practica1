package Practica1;


import java.util.ArrayList;
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
		System.out.println(this.lista.get(x).getNombre());
		return this.lista.get(x).getNombre();
	}
	
	public Web id2Web (int x) 
	{
		return this.lista.get(x);
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
				System.out.println(pWeb.getNombre());
			}
		}
		return pLista;
	}
	
	
	 
	



}
