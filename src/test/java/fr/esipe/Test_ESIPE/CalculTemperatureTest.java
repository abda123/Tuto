/**
 * 
 */
package fr.esipe.Test_ESIPE;

import static org.junit.Assert.*;
import metier.Imetier;
import metier.metierImpl;

import org.junit.Test;

/**
 * @author BALDE Baba-Abdoulaye
 *
 * 30 nov. 2016
 */
public class CalculTemperatureTest {

	@Test
	public void test() {
		 Imetier test= new metierImpl();
		 int  resultat= test.calculTemperature();
		 assertEquals(12, resultat);
	}

}
