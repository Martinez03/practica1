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
	public void testCargarListaLigada() {
		Webs.getWebs().cargarLista("C:/Users/Pablo/Documents/UNI/2_año/EDA/datuak-2022-2023/index-2022-2023.txt");
		pWeb = Webs.getWebs().getLista().id2Web(9);
		pWeb.cargarListaLigada("C:/Users/Pablo/Documents/UNI/2_año/EDA/datuak-2022-2023/pld-arcs-1-N-2022-2023.txt");
	}

}
