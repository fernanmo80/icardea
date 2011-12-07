package tr.com.srdc.icardea.cts;
import org.hl7.ctsvapi.*;
import org.hl7.ctsmapi.*;
import org.hl7.cts.types.*;

import java.security.Security;
import java.util.Vector;
import java.util.List;
import java.util.ResourceBundle;
import org.apache.log4j.Level;
import org.apache.log4j.Logger;

public class CTSInvoker {

	private String serviceAddress = "https://localhost:8443/ctsWS/services/";
	private static CTSInvoker instance = null;
	
	private CTSInvoker() {
		
	}
	
	public static CTSInvoker getInstance() {
		if(instance == null) {
			instance = new CTSInvoker();
		}
		
		return instance; 
	}

	private void setServiceAddress() {
		ResourceBundle properties = ResourceBundle.getBundle("icardea");
		serviceAddress = properties.getString("cts.endpoint");
	}
	
	private void sslSetup() {
		boolean atnatls = new Boolean(ResourceBundle.getBundle("icardea")
				.getString("atna.tls")).booleanValue();
		if (atnatls) {
			// Properties for SSL Security Provider
			System.out.println(" $$$$ SECURE COMMUNICATION .....");
			String protocolProp = "java.protocol.handler.pkgs";
			String sunSSLProtocol = "com.sun.net.ssl.internal.www.protocol";
			String sslStoreProp = "javax.net.ssl.trustStore";
			String certPath = ResourceBundle.getBundle("icardea").getString("icardea.home") + "/icardea-caremanager-ws/src/test/resources/jssecacerts";

			// Enable SSL communication
			System.setProperty(protocolProp, sunSSLProtocol);
			Security.addProvider(new com.sun.net.ssl.internal.ssl.Provider());
			System.setProperty(sslStoreProp, certPath);
			System.setProperty("javax.net.ssl.trustStorePassword", "srdcpass");
		}
	}
	
	public String translateCode(String fromCS, String fromCode, String toCS) throws Exception {
		sslSetup();
		setServiceAddress();
		Logger.getLogger(CTSInvoker.class).info("Service Address:"+serviceAddress+" From Code System:"+ fromCS + " From Code:"+fromCode + " To Code System:"+toCS);
		tr.com.srdc.icardea.cts.messageruntime.RuntimeOperationsServiceStub stub =
                    new tr.com.srdc.icardea.cts.messageruntime.RuntimeOperationsServiceStub(serviceAddress + "RuntimeOperationsService/");
		org.hl7.ctsmapi.TranslateCode input =new org.hl7.ctsmapi.TranslateCode();
		ST st = new ST();
		st.setV(fromCS);
		input.setParm1(st);
		CD cd = new CD();
		cd.setCode(fromCode);
		//cd.setCodeSystem(fromCS);
		input.setParm2(cd);
		ST st2 = new ST();
		st2.setV(toCS);
		input.setParm3(st2);
		TranslateCodeResponse response = stub.translateCode(input);
		return response.getTranslateCodeReturn().getCode();
	}

	public boolean validateCode(String codeSystem, String code) throws Exception {
		sslSetup();
		setServiceAddress();
		tr.com.srdc.icardea.cts.messageruntime.RuntimeOperationsServiceStub stub =
                    new tr.com.srdc.icardea.cts.messageruntime.RuntimeOperationsServiceStub(serviceAddress + "RuntimeOperationsService/");
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
		ValidateCodeResponse response = stub.validateCode(input);
		return (response.getValidateCodeReturn().getNErrors().getV() == 0);
	}

	public Vector<String> getSupportedMaps() throws Exception {
		sslSetup();
		setServiceAddress();
		tr.com.srdc.icardea.cts.codemapping.CodeMappingOperationsServiceStub stub =
			new tr.com.srdc.icardea.cts.codemapping.CodeMappingOperationsServiceStub(serviceAddress + "CodeMappingOperationsService/");
		org.hl7.ctsvapi.GetSupportedMaps getSupportedMaps16=new org.hl7.ctsvapi.GetSupportedMaps();
		org.hl7.ctsvapi.GetSupportedMapsResponse result = stub.getSupportedMaps(getSupportedMaps16);
		List<CodeMap> list = result.getGetSupportedMapsReturn();
		Vector<String> resultVector = new Vector();
		for(int i=0;i<list.size();i++) {
			CodeMap codeMap = (CodeMap)list.get(i);
			String from  = codeMap.getFromCodeSystemId();
			String to  = codeMap.getToCodeSystemId();
			resultVector.addElement(from + ":" + to);
		}
		return resultVector;
	}

	public Vector<String> getSupportedCodeSystems() throws Exception {
		sslSetup();
		setServiceAddress();
		tr.com.srdc.icardea.cts.vocabruntime.VocabRuntimeOperationsServiceStub stub =
			new tr.com.srdc.icardea.cts.vocabruntime.VocabRuntimeOperationsServiceStub(serviceAddress + "VocabRuntimeOperationsService/");
		org.hl7.ctsvapi.GetSupportedCodeSystems input = new org.hl7.ctsvapi.GetSupportedCodeSystems();
		input.setSizeLimit(0);
		org.hl7.ctsvapi.GetSupportedCodeSystemsResponse response = stub.getSupportedCodeSystems(input);
		List<CodeSystemIdAndVersions> list = response.getGetSupportedCodeSystemsReturn();
		Vector<String> resultVector = new Vector();
		for(int i=0;i<list.size();i++) {
			CodeSystemIdAndVersions codeMap = (CodeSystemIdAndVersions)list.get(i);
			resultVector.addElement(codeMap.getCodeSystemId());
		}
		return resultVector;
	}

	public static void main(String argv[]) {
		try {
			System.out.println(CTSInvoker.getInstance().translateCode("ICD10","F79","SNOMEDCT"));
			/*System.out.println(" $$$ Translating: "+ argv[0] + "-" + argv[1] + " to " 
					+ argv[2] + ":\n" + CTSInvoker.getInstance().translateCode(argv[0], argv[1], argv[2]));
			System.out.println(" $$$ Supported Code Systems:\n"+CTSInvoker.getInstance().getSupportedCodeSystems());
			System.out.println(" $$$ Supported Maps:\n"+CTSInvoker.getInstance().getSupportedMaps());
			System.out.println(" $$$ Validating: "+ argv[0] + "-" + argv[1] + ":\n" + CTSInvoker.getInstance().validateCode(argv[0], argv[1]));*/
		} catch(Exception ex) {
			ex.printStackTrace();
		}
	}
}
