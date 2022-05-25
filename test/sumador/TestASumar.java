package sumador;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;


class TestASumar {

	
	
	 @Test
	    public void testUnaCifra() {
	        ASumar sumi = new ASumar();
	        String resultado = sumi.sumativo("5");
	        assertEquals("5 = 5",resultado );
	    }
	 
	 @Test
	 public void testCifraNegativa() {
	        ASumar sumi = new ASumar();
	        String resultado = sumi.negativo("-5");
	        assertEquals("Negativo. Siempre negativo",resultado );
	    }
	 
	 @Test
	 public void total() {  
	        ASumar sumi = new ASumar();
	        int resultado = sumi.total("155");
	        assertEquals(11, resultado);
	 }

}
