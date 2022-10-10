package Practica1;

import static org.junit.Assert.*;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;

public class ListaWebsTest {
	
	
	@Before
	public void setUp() throws Exception 
	{
		Webs.getWebs().cargarLista("C:/Users/Pablo/Documents/UNI/2_año/EDA/datuak-2022-2023/index-2022-2023.txt");
	}

	@After
	public void tearDown() throws Exception {
	}

	
	@Test
	public void testId2Web() 
	{
		
		assertEquals("verseschmiede.com", Webs.getWebs().getLista().id2Web(1902115).getNombre());
		Webs.getWebs().getLista().id2String(999999999);//fuera de rango
	}
	
	@Test
	public void testId2String() 
	{
		
		assertEquals("verseschmiede.com", Webs.getWebs().getLista().id2String(1902115));
		Webs.getWebs().getLista().id2String(999999999);//fuera de rango
	}

	@Test
	public void testString2Id() {
		
		assertEquals(Webs.getWebs().getLista().string2Id("01gif-anime.com"),446);
	}

	@Test
	public void testEnlacesSalientes() 
	{
		
		
		Webs.getWebs().cargarListaLigada("C:/Users/Pablo/Documents/UNI/2_año/EDA/datuak-2022-2023/pld-arcs-1-N-2022-2023.txt");
		Webs.getWebs().getLista().enlacesSalientes("0-360.com").imprimirLista();
		//ImprimirListaParaComprobar
		Webs.getWebs().getLista().enlacesSalientes("0-5.co.il");  //ListaVacia
		Webs.getWebs().getLista().enlacesSalientes("tchibo.ch").imprimirLista();
		//ImprimirLista
		Webs.getWebs().getLista().enlacesSalientes("tchin-tchine.com");  //ListaVacia
		
		
		
	}
	
	@Test
	public void testWord2Webs() 
	{
		PalabrasClave.getPalabrasClave().cargarListaPalabras("C:/Users/Pablo/Documents/UNI/2_año/EDA/datuak-2022-2023/words.txt");
		Webs.getWebs().getLista().word2Webs("weight").imprimirLista();//se devuelve por pantalla los nombres de las webs
		Webs.getWebs().getLista().word2Webs("abanga").imprimirLista();
		
	}
	
	@Test
	public void testOrdenarLista() 
	{
		Webs.getWebs().cargarLista("C:/Users/Pablo/Documents/UNI/2_año/EDA/datuak-2022-2023/prueba.txt");
		Webs.getWebs().getLista().ordenarLista();
		Webs.getWebs().getLista().imprimirLista();
		
	}
	
}
