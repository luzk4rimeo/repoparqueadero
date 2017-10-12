package co.ceiba.dominio;

import org.junit.Test;
import static org.junit.Assert.*;

import co.ceiba.dominio.Automovil;

public class AutomovilTest {
	 @Test
	    public void canConstructAPersonWithAName() {
		 Automovil auto = new Automovil("IPY735","Campero");
	        assertEquals("IPY735","Campero", auto.getClass());
	    }
}
