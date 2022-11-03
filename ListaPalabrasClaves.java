package segundaFaseEnPractica1;


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
	
	public PalabraClave name2word(String s) 
	{
		boolean salir = false;
		PalabraClave pPalabraClave = new PalabraClave(null);
		Iterator<PalabraClave> it = this.getIterador();
		while (it.hasNext() && !salir) 
		{
			pPalabraClave = it.next();
			if (s.equals(pPalabraClave.getNombre())) 
			{
				salir = true;
			}
		}
		return pPalabraClave;
	}
	
	public void imprimirLista()
	{
		
		PalabraClave pPalabraClave;
		Iterator <PalabraClave> itr = this.getIterador();
		while (itr.hasNext()) 
		{
			pPalabraClave = itr.next();
			System.out.println(pPalabraClave.getNombre());
		}
	}
	
	

}
