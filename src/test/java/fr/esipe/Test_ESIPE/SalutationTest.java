/**
 * 
 */
package fr.esipe.Test_ESIPE;

import static org.junit.Assert.*;
import metier.Imetier;
import metier.metierImpl;

import org.junit.AfterClass;
import org.junit.Test;

/**
 * @author BALDE Baba-Abdoulaye
 *
 * 30 nov. 2016
 */
public class SalutationTest {

	/**
	 * @throws java.lang.Exception
	 */
	@Test
	public void test() {
		Imetier test = new metierImpl();
		String resultat= test.salutation();
		assertEquals("je suis une chaine de caractere", resultat);
	}

}
