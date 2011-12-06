package tr.com.srdc.icardea.careplanengine.communication.webservice;



public class Client {

	public final static int NO_MAPPING = 0;
	public final static int XSLT_MAPPING = 1;
	public final static int ONTOLOGY_MAPPING = 2;
	/*private static String sourceXMLInstancePath = null;
	private static String targetXMLInstancePath = null;
	private static String owlsourceInstancePath = null;
	private static String owlresultInstancePath = null;
	private static String owltargetInstancePath = null;
	private static String sourceOwlSchemaPath = null;
	private static String sourceOwlSchemaPathForMapping = null;
	private static String sourceXSDPath = null;
	private static String sourceNodeName = null;
	private static String targetOntURLforNormkit = null;
	private static String reverseTargetOntURLforNormkit = null;
	private static String targetOntURL;
	private static String targetNodeName;
	private static String reverseTargetOntURL;
	private static String reverseTargetNodeName;
	private static String wsXMLInstancePath = null;
	private static String wsOWLInstancePath = null;
	private static String XMLResultInstancePath = null;

	static {
		readThisSideSpecificDataFormat();
	}
	static Logger logger = Logger.getLogger(Client.class);

	private static void generateTemporaryFiles() {
		String directoryPath = System.getProperty("user.dir") + "/logs/";
		SimpleUUIDGen idGenerator = new SimpleUUIDGen();

		sourceXMLInstancePath = directoryPath + idGenerator.nextUUID() + ".xml";
		targetXMLInstancePath = directoryPath + idGenerator.nextUUID() + ".xml";
		owlsourceInstancePath = directoryPath + idGenerator.nextUUID() + ".owl";
		owlresultInstancePath = directoryPath + idGenerator.nextUUID() + ".owl";
		owltargetInstancePath = directoryPath + idGenerator.nextUUID() + ".owl";
		sourceOwlSchemaPath = directoryPath + idGenerator.nextUUID() + ".owl";
		wsXMLInstancePath = directoryPath + idGenerator.nextUUID() + ".xml";
		wsOWLInstancePath = directoryPath + idGenerator.nextUUID() + ".owl";
		XMLResultInstancePath = directoryPath + idGenerator.nextUUID() + ".xml";
		targetOntURLforNormkit = directoryPath + idGenerator.nextUUID() + ".owl";
		reverseTargetOntURLforNormkit = directoryPath + idGenerator.nextUUID() + ".owl";
	}

	public static String invokeWS(GuidelineAgent agent, String _wsdlURL, String xmlInstance, String owlsURL, String _targetXSDPath) {
		return invokeWSWithoutMapping(_wsdlURL, xmlInstance, true);
	}

	public static String invokeWSWithoutMapping(String _wsdlURL, String xmlInstance, boolean isSupposedToBeSecure, String operationName) {
		String wsInvocationResult = "";
		try {
			checkWSSecurityOption(isSupposedToBeSecure);
			SOAPClient client = new SOAPClient(_wsdlURL, xmlInstance);
			if (operationName != null && !operationName.trim().equals("")) {
				wsInvocationResult = client.run(operationName);
			} else {
				wsInvocationResult = client.run();
			}
		} catch (Exception e) {
			e.printStackTrace();
		}

		resetWSSecurityOption();

		return wsInvocationResult;
	}

	private static void checkWSSecurityOption(boolean isSupposedToBeSecure) {
		if (isSupposedToBeSecure && ICARDEAConfigurationUtil.SECURE_WS_ENABLED) {
			if (ICARDEAConfigurationUtil.PRIVACY_OF_WS_ENABLED) {
				System.setProperty("axis.ClientConfigFile", ICARDEAConfigurationUtil.AXIS_CLIENT_CONFIG_FILE_WITH_PRIVACY);
			} else {
				System.setProperty("axis.ClientConfigFile", ICARDEAConfigurationUtil.AXIS_CLIENT_CONFIG_FILE);
			}
		} else {
			resetWSSecurityOption();
		}
	}

	private static void resetWSSecurityOption() {
		System.clearProperty("axis.ClientConfigFile");
	}

	private static void readThisSideSpecificDataFormat() {
		sourceOwlSchemaPathForMapping = ICARDEAConfigurationUtil.SOURCE_OWL_SCHEMA_PATH_FOR_MAPPING;
		sourceXSDPath = ICARDEAConfigurationUtil.SOURCE_XSD_URL;
		sourceNodeName = ICARDEAConfigurationUtil.SOURCE_NODE_NAME;
	}*/

	public static String invokeSensorWS(Object agent, String _wsdlURL, String xmlInstance, String _targetXSDPath, String type) {
		return invokeWSWithoutMapping(_wsdlURL, xmlInstance, true, null);
	}

	public static String invokeMedicalWS(Object agent, String _wsdlURL, String xmlInstance, String owlsURL, String _targetXSDPath) {
		return invokeWSWithoutMapping(_wsdlURL, xmlInstance, true);
	}

	public static String invokeWSWithoutMapping(String _wsdlURL, String xmlInstance, boolean isSupposedToBeSecure) {
		return invokeWSWithoutMapping(_wsdlURL, xmlInstance, isSupposedToBeSecure, null);
	}

	public static String invokeWSWithoutMapping(String _wsdlURL, String xmlInstance, boolean isSupposedToBeSecure, String operationName) {
		String wsInvocationResult = "<Data1><Patient_Data><Id>149202063490</Id></Patient_Data><Observation><Id_OB>";
		int index = _wsdlURL.lastIndexOf("/");
		int index2 = _wsdlURL.lastIndexOf("?");
		String temp = _wsdlURL.substring(index+1, index2);
		temp = temp.replaceAll("Service", "");
		wsInvocationResult+=temp+"</Id_OB><Text_Value>true</Text_Value></Observation></Data1>";
		return wsInvocationResult;
	}
}
