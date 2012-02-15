/**
 * 
 */
package de.offis.health.icardea;

import org.junit.runner.RunWith;
import org.junit.runners.Suite;

/**
 * This class is a TestSuite that will run all tests
 * added to the suite.
 * 
 *
 */
@RunWith(Suite.class)
@Suite.SuiteClasses({
	de.offis.health.icardea.InitJUnitTestSuite.class,
	de.offis.health.icardea.cied.pdf.extractor.TestPDFApachePDFBoxExtractor.class,
	//de.offis.health.icardea.cied.pdf.extractor.TestPDFICEpdfExtractor.class,
	de.offis.health.icardea.cied.pdf.extractor.TestPDFiText2Extractor.class,
	de.offis.health.icardea.cied.pdf.extractor.TestPDFiText5Extractor.class,
	de.offis.health.icardea.cied.pdf.parser.TestPDFParserMDTDeviceType2.class
})
public class AllDataProcessingTests {
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