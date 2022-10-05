package Practica1;


import java.util.ArrayList;
import java.util.Iterator;


public class ListaPalabrasClaves 
{
	private ArrayList<PalabraClave> lista;
	
	public ListaPalabrasClaves web2Words(String w)
	{
		ListaPalabrasClaves pLista = new ListaPalabrasClaves();
		PalabraClave pPalabraClave;
		Iterator<PalabraClave> it = this.getIterador();
		while (it.hasNext())
		{
			pPalabraClave = it.next();
			if (w.contains(pPalabraClave.getNombre()));
			{
				pLista.anadirPalabra(pPalabraClave);
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
	
	

}
