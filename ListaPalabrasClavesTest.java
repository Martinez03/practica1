package Practica1;

import static org.junit.Assert.*;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;

public class ListaPalabrasClavesTest {

	
	@Before
	public void setUp() throws Exception 
	{
		
	}

	@After
	public void tearDown() throws Exception {
	}

	@Test
	public void testWeb2Words() 
	{
		PalabrasClave.getPalabrasClave().cargarListaPalabras("C:/Users/Pablo/Documents/UNI/2_año/EDA/datuak-2022-2023/words.txt");
		Webs.getWebs().cargarLista("C:/Users/Pablo/Documents/UNI/2_año/EDA/datuak-2022-2023/index-2022-2023.txt");
		Web pWeb = Webs.getWebs().getLista().id2Web(222);
		PalabrasClave.getPalabrasClave().getLista().web2Words(pWeb.getNombre());
	}

	@Test
	public void testAnadirPalabra() {
		
	}

}
