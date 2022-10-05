package Practica1;

import static org.junit.Assert.*;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;

public class WebsTest {

	
	@Before
	public void setUp() throws Exception 
	{
		Webs.getWebs().cargarLista(null);
		
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

}
