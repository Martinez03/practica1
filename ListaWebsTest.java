package Practica1;

import static org.junit.Assert.*;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;

public class ListaWebsTest {
	
	
	private ListaWebs lista;
	@Before
	public void setUp() throws Exception 
	{
		lista = new ListaWebs();
	}

	@After
	public void tearDown() throws Exception {
	}

	@Test
	public void testListaWebs() {
		//fail("Not yet implemented");
		assertTrue(true);
	}

	@Test
	public void testCargarLista() 
	{
		lista.cargarLista("C:/Users/Pablo/Documents/UNI/2_año/EDA/datuak-2022-2023/index-2022-2023.txt");
		assertTrue(true);
	}

	@Test
	public void testId2String() 
	{
		lista.cargarLista("C:/Users/Pablo/Documents/UNI/2_año/EDA/datuak-2022-2023/index-2022-2023.txt");
		System.out.println(lista.id2String(1902119));
		assertTrue(lista.id2String.equals("versexoenvivo.com");
	}

	@Test
	public void testString2Id() {
		Webs.getWebs().cargarLista("C:/Users/Pablo/Documents/UNI/2_año/EDA/datuak-2022-2023/index-2022-2023.txt");
		System.out.println(lista.string2Id("003.spb.ru"));
		assertTrue(lista.string2Id.equals(124);
	}

	@Test
	public void testEnlacesSalientes() {
		//fail("Not yet implemented");
		Webs.getWebs().cargarLista("C:/Users/Pablo/Documents/UNI/2_año/EDA/datuak-2022-2023/index-2022-2023.txt");
		Webs.getWebs().cargarListaLigada("C:/Users/Pablo/Documents/UNI/2_año/EDA/datuak-2022-2023/pld-arcs-1-N-2022-2023.txt");
		//Primer caso: web con varias webs asociadas
		Webs.getLista().enlacesSalientes("0-200.com");
		//Segundo caso: web con una web asociada
		Webs.getLista().enlacesSalientes("0-311.com");
		//Tercer caso: web sin webs asociadas
		Webs.getLista().enlacesSalientes("0-5.co.il");
	}

}
