package tr.com.srdc.icardea.ihe.idco;

import org.junit.AfterClass;
import org.junit.BeforeClass;
import org.junit.Test;
import tr.com.srdc.icardea.ihe.idco.observationcreator.ObservationCreator;
import tr.com.srdc.icardea.ihe.idco.observationprocessor.ObservationProcessor;

public class IHEIDCOIntegrationTest {
	private static ObservationProcessor processor = null;

	@Test
	public void testADTMessage() throws java.lang.Exception {
		String fileName = "idco/adt-a01.hl7";
		ObservationCreator obsCreator = new ObservationCreator("localhost", 1011);
		obsCreator.run(false, false, fileName);
	}

	//@Test
	public void testIHEIDCOObservationServerFullMessage() throws java.lang.Exception {
		String fileName = "idco/fullMessageOriginal.txt";
		ObservationCreator obsCreator = new ObservationCreator("localhost", 1011);
		obsCreator.run(false, false, fileName);
	}

	//@Test
	/*public void testIHEIDCOObservationServerXMLMessage() throws java.lang.Exception {
		// TODO: Eger message size buyukse parse etmiyor...
		System.out.println(" $$$$ Sending HL7_ORU.xml....");
		System.out.println(" $$$$ If the message size is large, most probably it can not parse the message....");
		String fileName = "idco/HL7_ORU.xml";
		ObservationCreator obsCreator = new ObservationCreator("localhost", 1011);
		obsCreator.run(true, true, fileName);
		System.out.println(" $$$$ Sent....");
	}*/

	//@Test
	public void testHL7EDI() throws java.lang.Exception {
		String fileName = "idco/VTCareplan/VT_Scenario_Step_9.hl7";
		ObservationCreator obsCreator = new ObservationCreator("localhost", 1011);
		obsCreator.run(true, false, fileName);
	}

	//@Test
	public void test1() throws java.lang.Exception {
		String fileName = "idco/VTCareplan/VT_Scenario_Step_7.hl7.xml";
		ObservationCreator obsCreator = new ObservationCreator("localhost", 1011);
		obsCreator.run(true, true, fileName);
	}

	//@Test
	public void test2() throws java.lang.Exception {
		String fileName = "idco/VTCareplan/VT_Scenario_Step_9.hl7";
		ObservationCreator obsCreator = new ObservationCreator("localhost", 1011);
		obsCreator.run(true, false, fileName);
	}

	//@Test
	public void test3() throws java.lang.Exception {
		String fileName = "idco/VTCareplan/VT_Scenario_Step_12.hl7";
		ObservationCreator obsCreator = new ObservationCreator("localhost", 1011);
		obsCreator.run(true, false, fileName);
	}

	//@Test
	public void test4() throws java.lang.Exception {
		String fileName = "idco/VTCareplan/VT_Scenario_Step_15.hl7";
		ObservationCreator obsCreator = new ObservationCreator("localhost", 1011);
		obsCreator.run(true, false, fileName);
	}

	//@Test
	public void test5() throws java.lang.Exception {
		String fileName = "idco/VTCareplan/VT_Scenario_Step_16.hl7";
		ObservationCreator obsCreator = new ObservationCreator("localhost", 1011);
		obsCreator.run(true, false, fileName);
	}

	//@Test
	public void test6() throws java.lang.Exception {
		String fileName = "idco/VTCareplan/VT_Scenario_Step_18-1.hl7";
		ObservationCreator obsCreator = new ObservationCreator("localhost", 1011);
		obsCreator.run(true, false, fileName);
	}

	//@Test
	public void test6_2() throws java.lang.Exception {
		String fileName = "idco/VTCareplan/VT_Scenario_Step_18-2.hl7";
		ObservationCreator obsCreator = new ObservationCreator("localhost", 1011);
		obsCreator.run(true, false, fileName);
	}

	//@Test
	public void test7() throws java.lang.Exception {
		String fileName = "idco/VTCareplan/VT_Scenario_Step_19.hl7";
		ObservationCreator obsCreator = new ObservationCreator("localhost", 1011);
		obsCreator.run(true, false, fileName);
	}

	//@Test
	public void test8() throws java.lang.Exception {
		String fileName = "idco/VTCareplan/VT_Scenario_Step_20.hl7";
		ObservationCreator obsCreator = new ObservationCreator("localhost", 1011);
		obsCreator.run(true, false, fileName);
	}

	/*@BeforeClass
	public static void setup() {
		processor = new ObservationProcessor(1011, true);
		processor.listen();
		System.out.println(" $$$$ Processor initialized....");
	}

	@AfterClass
	public static void teardown() {
		processor.close();	
		System.out.println(" $$$$ Processor closed....");
	}*/

	public static void main(String args[]) {
		org.junit.runner.JUnitCore.main("tr.com.srdc.icardea.ihe.idco.IHEIDCOIntegrationTest");
	}
}