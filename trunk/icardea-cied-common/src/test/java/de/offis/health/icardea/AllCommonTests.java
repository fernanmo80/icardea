/**
 * 
 */
package de.offis.health.icardea;

import org.junit.runner.RunWith;
import org.junit.runners.Suite;

/**
 * This class is a TestSuite that will run all tests
 * in the common module added to the suite.
 * 
 *
 */
@RunWith(Suite.class)
@Suite.SuiteClasses({
	de.offis.health.icardea.InitJUnitTestSuite.class,
	de.offis.health.icardea.database.tools.TestDBTools.class,
	de.offis.health.icardea.tools.TestGlobalTools.class,
	de.offis.health.icardea.text.tools.TestSimpleTextFileReader.class
})
public class AllCommonTests {
/*
	public static Test suite() {
		TestSuite suite = new TestSuite(
				"Test for de.offis.health.icardea");
		//$JUnit-BEGIN$
		//$JUnit-END$
		return suite;
	}
*/
}
