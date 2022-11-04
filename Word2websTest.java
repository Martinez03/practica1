package segundaFaseEnPractica1;

import static org.junit.Assert.*;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;

public class Word2websTest {

	@Before
	public void setUp() throws Exception {
	}

	@After
	public void tearDown() throws Exception {
	}

	@Test
	public void testWord2Webs() {
		
		UnorderedCircularLinked<String> prueba = new UnorderedCircularLinked<>();
		
		Webs.getWebs().cargarLista("C:/Users/Pablo/Documents/UNI/2_año/EDA/datuak-2022-2023/index-2022-2023.txt");
		PalabrasClave.getPalabrasClave().cargarListaPalabras("C:/Users/Pablo/Documents/UNI/2_año/EDA/datuak-2022-2023/words.txt");
		Webs.getWebs().getLista().word2Webs("weight").visualizarNodos();//se devuelve por pantalla los nombres de las webs
		Webs.getWebs().getLista().word2Webs("abanga").visualizarNodos();
		Webs.getWebs().getLista().word2Webs("wrtwhkcbicob").visualizarNodos();//no hay ninguna web
			
		prueba = Webs.getWebs().getLista().word2Webs("hola");
		prueba.addToRear("funciona");
		prueba.addToFront("funciona2");
		prueba.visualizarNodos();
	}

}
