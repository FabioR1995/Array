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
		assertEquals(StrettamenteCrescente.strettamenteCrescente(giaOrdinati),true);
	}
	
	@Test
	public void testNonSonoCrescenti(){
		double[] nonSonoOrdinati= {0,3,2,1,4,5};
		assertEquals(StrettamenteCrescente.strettamenteCrescente(nonSonoOrdinati),false);
	}
	
	@Test
	public void tuttiUguali(){
		double [] numeriTuttiUguali= {1,1,1,1,1};
		assertEquals(StrettamenteCrescente.strettamenteCrescente(numeriTuttiUguali),false);
	}
}
