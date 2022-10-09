package Practica1;

import static org.junit.Assert.*;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;

public class WebsTest {

	
	@Before
	public void setUp() throws Exception 
	{
		
	}

	@After
	public void tearDown() throws Exception {
	}

	@Test
	public void testGetWebs() {
		fail("Not yet implemented");
	}

	@Test
	public void testGetLista() {
		fail("Not yet implemented");
	}
	
	@Test
	public void testCargarListaLigada() {
		Webs.getWebs().cargarLista("C:/Users/Pablo/Documents/UNI/2_año/EDA/datuak-2022-2023/index-2022-2023.txt");
		Webs.getWebs().cargarListaLigada("C:/Users/Pablo/Documents/UNI/2_año/EDA/datuak-2022-2023/pld-arcs-1-N-2022-2023.txt");
		Webs.getWebs().getLista().enlacesSalientes("0-360.com");
		Webs.getWebs().getLista().enlacesSalientes("0-5.co.il");  //ListaVacia
		Webs.getWebs().getLista().enlacesSalientes("tchibo.ch");
		Webs.getWebs().getLista().enlacesSalientes("tchin-tchine.com");  //ListaVacia
		
		
		
		
	}

}
