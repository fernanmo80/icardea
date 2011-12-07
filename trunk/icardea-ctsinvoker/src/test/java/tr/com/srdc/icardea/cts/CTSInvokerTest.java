package tr.com.srdc.icardea.cts;

import static org.junit.Assert.*;

import java.rmi.RemoteException;
import java.util.List;
import java.util.Vector;

import org.apache.axis2.AxisFault;
import org.hl7.cts.types.BL;
import org.hl7.cts.types.CD;
import org.hl7.cts.types.ST;
import org.hl7.ctsmapi.TranslateCodeResponse;
import org.hl7.ctsmapi.ValidateCodeResponse;
import org.hl7.ctsvapi.CodeMap;
import org.hl7.ctsvapi.CodeSystemIdAndVersions;
import org.junit.Test;

import tr.com.srdc.icardea.cts.messageruntime.NoApplicableValueSet;
import tr.com.srdc.icardea.cts.messageruntime.UnableToTranslate;
import tr.com.srdc.icardea.cts.messageruntime.UnexpectedError;
import tr.com.srdc.icardea.cts.messageruntime.UnknownApplicationContextCode;
import tr.com.srdc.icardea.cts.messageruntime.UnknownCodeSystem;
import tr.com.srdc.icardea.cts.messageruntime.UnknownVocabularyDomain;
import tr.com.srdc.icardea.cts.vocabruntime.TimeoutError;

public class CTSInvokerTest {

	private static String serviceAddress = "https://localhost:8443/ctsWS/services/";

	private static String codeSystem = "ICD10";
	private static String code = "F79";
	private static String codeSystem2 = "SNOMEDCT";

	public CTSInvokerTest() {
		super();
		// TODO Auto-generated constructor stub
	}

	@Test
	public void test1() {
		try {
			System.out.println(" $$$ Translating: " + "GLIMS" + "-" + "ZL-003"
					+ " to " + "LNC" + ":\n"
					+ CTSInvoker.getInstance().translateCode("GLIMS", "ZL-003", "LNC"));
		} catch (Exception ex) {
			ex.printStackTrace();
		}
	}
	
	@Test
	public void test2() {
		try {
			System.out.println(" $$$ Translating: " + "GLIMS" + "-" + "ZL-090"
					+ " to " + "SNOMEDCT" + ":\n"
					+ CTSInvoker.getInstance().translateCode("GLIMS", "ZL-090", "SNOMEDCT"));
		} catch (Exception ex) {
			ex.printStackTrace();
		}
	}
	
	@Test
	public void test3() {
		try {
			System.out.println(" $$$ Translating: " + "GLIMS" + "-" + "ZL-099"
					+ " to " + "LNC" + ":\n"
					+ CTSInvoker.getInstance().translateCode("GLIMS", "ZL-099", "LNC"));
		} catch (Exception ex) {
			ex.printStackTrace();
		}
	}
	
	@Test
	public void test4() {
		try {
			System.out.println(" $$$ Translating: " + "GLIMS" + "-" + "ZL-098"
					+ " to " + "LNC" + ":\n"
					+ CTSInvoker.getInstance().translateCode("GLIMS", "ZL-098", "LNC"));
		} catch (Exception ex) {
			ex.printStackTrace();
		}
	}

	/**
	 * Test method for
	 * {@link tr.com.srdc.icardea.cts.CTSInvoker#translateCode(java.lang.String, java.lang.String, java.lang.String)}
	 * .
	 */
	@Test
	public void testTranslateCode() {
		tr.com.srdc.icardea.cts.messageruntime.RuntimeOperationsServiceStub stub = null;
		try {
			stub = new tr.com.srdc.icardea.cts.messageruntime.RuntimeOperationsServiceStub(
					serviceAddress + "RuntimeOperationsService/");
		} catch (AxisFault e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		org.hl7.ctsmapi.TranslateCode input = new org.hl7.ctsmapi.TranslateCode();
		ST st = new ST();
		st.setV(codeSystem);
		input.setParm1(st);
		CD cd = new CD();
		cd.setCode(code);
		// cd.setCodeSystem(fromCS);
		input.setParm2(cd);
		ST st2 = new ST();
		st2.setV(codeSystem2);
		input.setParm3(st2);
		TranslateCodeResponse response = null;
		try {
			response = stub.translateCode(input);
		} catch (RemoteException e) {
			e.printStackTrace();
			fail("RemoteException");
		} catch (UnknownApplicationContextCode e) {
			e.printStackTrace();
			fail("UnknownApplicationContextCode");
		} catch (UnknownVocabularyDomain e) {
			e.printStackTrace();
			fail("UnknownVocabularyDomain");
		} catch (UnexpectedError e) {
			e.printStackTrace();
			fail("UnexpectedError");
		} catch (UnableToTranslate e) {
			e.printStackTrace();
			fail("UnableToTranslate");
		} catch (UnknownCodeSystem e) {
			e.printStackTrace();
			fail("UnknownCodeSystem");
		}
		assert (!response.getTranslateCodeReturn().getCode().equals(""));
	}

	/**
	 * Test method for
	 * {@link tr.com.srdc.icardea.cts.CTSInvoker#validateCode(java.lang.String, java.lang.String)}
	 * .
	 */
	@Test
	public void testValidateCode() {

		tr.com.srdc.icardea.cts.messageruntime.RuntimeOperationsServiceStub stub = null;
		try {
			stub = new tr.com.srdc.icardea.cts.messageruntime.RuntimeOperationsServiceStub(
					serviceAddress + "RuntimeOperationsService/");
		} catch (AxisFault e) {
			fail("Axis Fault");
		}
		org.hl7.ctsmapi.ValidateCode input = new org.hl7.ctsmapi.ValidateCode();
		CD cd = new CD();
		cd.setCode(code);
		input.setCodeToValidate(cd);
		ST st = new ST();
		st.setV(codeSystem);
		input.setVocabularyDomainName(st);
		BL bl = new BL();
		bl.setV(true);
		input.setActiveConceptsOnly(bl);
		input.setErrorCheckOnly(bl);
		ValidateCodeResponse response = null;
		try {
			response = stub.validateCode(input);
		} catch (RemoteException e) {
			e.printStackTrace();
			fail("RemoteException");
		} catch (UnknownApplicationContextCode e) {
			e.printStackTrace();
			fail("UnknownApplicationContextCode");
		} catch (UnknownVocabularyDomain e) {
			e.printStackTrace();
			fail("UnknownVocabularyDomain");
		} catch (NoApplicableValueSet e) {
			e.printStackTrace();
			fail("NoApplicableValueSet");
		} catch (UnexpectedError e) {
			e.printStackTrace();
			fail("UnexpectedError");
		}

		assert (response.getValidateCodeReturn().getNErrors().getV() == 0);

	}

	/**
	 * Test method for
	 * {@link tr.com.srdc.icardea.cts.CTSInvoker#getSupportedMaps()}.
	 */
	@Test
	public void testGetSupportedMaps() {
		tr.com.srdc.icardea.cts.codemapping.CodeMappingOperationsServiceStub stub = null;
		try {
			stub = new tr.com.srdc.icardea.cts.codemapping.CodeMappingOperationsServiceStub(
					serviceAddress + "CodeMappingOperationsService/");
		} catch (AxisFault e) {
			e.printStackTrace();
			fail("Axis Fault");
		}
		org.hl7.ctsvapi.GetSupportedMaps getSupportedMaps16 = new org.hl7.ctsvapi.GetSupportedMaps();
		org.hl7.ctsvapi.GetSupportedMapsResponse result = null;
		try {
			result = stub.getSupportedMaps(getSupportedMaps16);
		} catch (RemoteException e) {
			e.printStackTrace();
			fail("RemoteException");
		} catch (tr.com.srdc.icardea.cts.codemapping.UnexpectedError e) {
			e.printStackTrace();
			fail("UnexpectedError");
		}
		List<CodeMap> list = result.getGetSupportedMapsReturn();
		Vector<String> resultVector = new Vector();
		for (int i = 0; i < list.size(); i++) {
			CodeMap codeMap = (CodeMap) list.get(i);
			String from = codeMap.getFromCodeSystemId();
			String to = codeMap.getToCodeSystemId();
			resultVector.addElement(from + ":" + to);
		}
		assert (resultVector.size() > 0);
	}

	/**
	 * Test method for
	 * {@link tr.com.srdc.icardea.cts.CTSInvoker#getSupportedCodeSystems()}.
	 */
	@Test
	public void testGetSupportedCodeSystems() {
		tr.com.srdc.icardea.cts.vocabruntime.VocabRuntimeOperationsServiceStub stub = null;
		try {
			stub = new tr.com.srdc.icardea.cts.vocabruntime.VocabRuntimeOperationsServiceStub(
					serviceAddress + "VocabRuntimeOperationsService/");
		} catch (AxisFault e1) {
			e1.printStackTrace();
			fail("Axis Fault");
		}
		org.hl7.ctsvapi.GetSupportedCodeSystems input = new org.hl7.ctsvapi.GetSupportedCodeSystems();
		input.setSizeLimit(0);
		org.hl7.ctsvapi.GetSupportedCodeSystemsResponse response = null;
		try {
			response = stub.getSupportedCodeSystems(input);
		} catch (RemoteException e) {
			e.printStackTrace();
			fail("RemoteException");
		} catch (TimeoutError e) {
			e.printStackTrace();
			fail("TimeoutError");
		} catch (tr.com.srdc.icardea.cts.vocabruntime.UnexpectedError e) {
			e.printStackTrace();
			fail("UnexpectedError");
		}
		List<CodeSystemIdAndVersions> list = response
				.getGetSupportedCodeSystemsReturn();
		Vector<String> resultVector = new Vector();
		for (int i = 0; i < list.size(); i++) {
			CodeSystemIdAndVersions codeMap = (CodeSystemIdAndVersions) list
					.get(i);
			resultVector.addElement(codeMap.getCodeSystemId());
		}
		assert (resultVector.size() > 0);
	}

}
