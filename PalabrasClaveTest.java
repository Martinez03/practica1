package Practica1;

import org.junit.Test;

public class PalabrasClaveTest {

	

	@Test
	public void testCargarListaPalabras() 
	{
		
		PalabrasClave.getPalabrasClave().cargarListaPalabras("C:/Users/Pablo/Documents/UNI/2_año/EDA/datuak-2022-2023/words.txt");
		PalabrasClave.getPalabrasClave().getLista().imprimirLista();
	}

}
