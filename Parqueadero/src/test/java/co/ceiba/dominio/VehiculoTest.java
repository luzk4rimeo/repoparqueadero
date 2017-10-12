package co.ceiba.dominio;

import static org.junit.Assert.assertEquals;
import org.junit.Test;
import co.ceiba.dominio.Vehiculo;

public class VehiculoTest {

	@Test
    public void canConstructAPersonWithAName() {
        Vehiculo vehiculo = new Vehiculo("IPY735");
        assertEquals("IPY735", vehiculo.getPlaca());
    }
	
}
