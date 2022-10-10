package Practica1;


import org.junit.After;
import org.junit.Before;
import org.junit.Test;

public class PalabraClaveTest {

	@Before
	public void setUp() throws Exception {
	}

	@After
	public void tearDown() throws Exception {
	}

	@Test
	public void testCargarListaWebs() 
	{
		PalabrasClave.getPalabrasClave().cargarListaPalabras("C:/Users/Pablo/Documents/UNI/2_año/EDA/datuak-2022-2023/words.txt");
		Webs.getWebs().cargarLista("C:/Users/Pablo/Documents/UNI/2_año/EDA/datuak-2022-2023/index-2022-2023.txt");
		PalabrasClave.getPalabrasClave().getLista().name2word("weight").cargarListaWebs();
		PalabrasClave.getPalabrasClave().getLista().name2word("weight").getLista().imprimirLista();
	}

}
