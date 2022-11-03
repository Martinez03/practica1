package segundaFaseEnPractica1;

import java.io.FileReader;
import java.io.IOException;
import java.util.Scanner;

public class PalabrasClave 
{
	private ListaPalabrasClaves lista;
	private static PalabrasClave miPalabrasClave = new PalabrasClave();
	
	private PalabrasClave()
	{
		this.lista = new ListaPalabrasClaves();
	}
	
	public static PalabrasClave getPalabrasClave() 
	{
		return PalabrasClave.miPalabrasClave;
	}
	
	
	public ListaPalabrasClaves getLista() {
		return this.lista;
	}

	public void cargarListaPalabras(String nomF) { 
		String nombre;
		PalabraClave pPalabra = new PalabraClave(null);
		
		try {      
			Scanner entrada = new Scanner(new FileReader(nomF));
			String linea;
			while (entrada.hasNext()) {         
				linea = entrada.nextLine();
				nombre = linea;
				pPalabra = new PalabraClave(nombre);
				this.lista.anadirPalabra(pPalabra);	
			}     
			entrada.close();   
			}   
		catch(IOException e) 
		{
			e.printStackTrace();
		}
		}
	
	


}
