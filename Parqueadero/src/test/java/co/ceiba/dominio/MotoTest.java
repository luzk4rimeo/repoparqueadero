package co.ceiba.dominio;

import org.junit.Test;
import static org.junit.Assert.*;

import co.ceiba.dominio.Moto;

public class MotoTest {
	
	@Test
	public void canConstructAPersonWithAName() {
		Moto moto = new Moto("abc34b",150.0);
        assertEquals("abc34b",150.0, moto.getClass());
    }

}
