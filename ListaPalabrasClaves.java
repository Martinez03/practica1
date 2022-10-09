package Practica1;


import java.util.ArrayList;
import java.util.Iterator;


public class ListaPalabrasClaves 
{
	private ArrayList<PalabraClave> lista;
	
	public  ListaPalabrasClaves()
	{
		this.lista= new ArrayList<PalabraClave>();
	}
	
	
	public ListaPalabrasClaves web2Words(String w)
	{
		ListaPalabrasClaves pLista = new ListaPalabrasClaves();
		PalabraClave pPalabraClave;
		Iterator<PalabraClave> it = this.getIterador();
		while (it.hasNext())
		{
			pPalabraClave = it.next();
			if (w.contains(pPalabraClave.getNombre()))
			{
				pLista.anadirPalabra(pPalabraClave);
				System.out.println(pPalabraClave.getNombre());
			}
			
		}
		return pLista;
		
	}

	private Iterator<PalabraClave> getIterador() {
		
		return this.lista.iterator();
	}
	
	public void anadirPalabra(PalabraClave w)
	{
		this.lista.add(w);
	}
	
	public PalabraClave pos2Word(int w)
	{
		return this.lista.get(w);
	}
	
	

}
