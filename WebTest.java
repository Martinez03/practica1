package Practica1;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;

public class WebTest {
	Web pWeb;

	@Before
	public void setUp() throws Exception {
	}

	@After
	public void tearDown() throws Exception {
	}

	@Test
	public void testCargarListaPalabrasClave() 
	{
		Webs.getWebs().cargarLista("C:/Users/Pablo/Documents/UNI/2_a?o/EDA/datuak-2022-2023/index-2022-2023.txt");
		PalabrasClave.getPalabrasClave().cargarListaPalabras("C:/Users/Pablo/Documents/UNI/2_a?o/EDA/datuak-2022-2023/words.txt");
		Webs.getWebs().getLista().id2Web(15).cargarListaPalabrasClave();
		Webs.getWebs().getLista().id2Web(15).getListaPalabras().imprimirLista();
	}

		
}
