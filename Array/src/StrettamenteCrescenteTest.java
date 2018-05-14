import static org.junit.Assert.*;

import org.junit.Before;
import org.junit.Test;

public class StrettamenteCrescenteTest {

	@Before
	public void setUp() throws Exception {
	}

	//restituisce vero perche gli elementi sono ordinati in modo crescente
	@Test
	public void testStrettamenteCrescente() {
		double[] giaOrdinati= {0,1,2,3,4,5};
		assertTrue(StrettamenteCrescente.strettamenteCrescente(giaOrdinati));
	}
	
	@Test
	public void testNonSonoCrescenti(){
		double[] nonSonoOrdinati= {0,3,2,1,4,5};
		assertFalse(StrettamenteCrescente.strettamenteCrescente(nonSonoOrdinati));
	}
	
	@Test
	public void tuttiUguali(){
		double [] numeriTuttiUguali= {1,1,1,1,1};
		assertFalse(StrettamenteCrescente.strettamenteCrescente(numeriTuttiUguali));
	}
}
