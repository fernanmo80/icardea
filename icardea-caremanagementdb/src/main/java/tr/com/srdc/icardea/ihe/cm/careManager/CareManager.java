/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package tr.com.srdc.icardea.ihe.cm.careManager;

import java.io.InputStream;

import java.math.BigInteger;
import java.security.Security;
import java.text.DateFormat;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.Enumeration;
import java.util.Hashtable;
import java.util.List;
import java.util.ResourceBundle;
import javax.xml.bind.*;
import org.apache.log4j.Logger;
import org.hl7.v3.BL;
import org.hl7.v3.CD;
import org.hl7.v3.CE;
import org.hl7.v3.EnFamily;
import org.hl7.v3.EnGiven;
import org.hl7.v3.II;
import org.hl7.v3.INT;
import org.hl7.v3.IVLTS;
import org.hl7.v3.IVXBTS;
import org.hl7.v3.ObjectFactory;
import org.hl7.v3.PN;
import org.hl7.v3.QUPCIN043100UV01QUQIMT020001UV01ControlActProcess;
import org.hl7.v3.QUPCMT040300UV01CareProvisionCode;
import org.hl7.v3.QUPCMT040300UV01CareProvisionReason;
import org.hl7.v3.QUPCMT040300UV01CareRecordTimePeriod;
import org.hl7.v3.QUPCMT040300UV01ClinicalStatementTimePeriod;
import org.hl7.v3.QUPCMT040300UV01IncludeCarePlanAttachment;
import org.hl7.v3.QUPCMT040300UV01MaximumHistoryStatements;
import org.hl7.v3.QUPCMT040300UV01ParameterList;
import org.hl7.v3.QUPCMT040300UV01PatientAdministrativeGender;
import org.hl7.v3.QUPCMT040300UV01PatientBirthTime;
import org.hl7.v3.QUPCMT040300UV01PatientId;
import org.hl7.v3.QUPCMT040300UV01PatientName;
import org.hl7.v3.TS;

/**
 * 
 * @author ibrahim
 */
public class CareManager {

	private Hashtable careProvisionCodes;
	private Hashtable careProvisionCodes2QueryId;
	private boolean atnatls;
	private boolean atnalog;
	public static Logger logger = Logger.getLogger(CareManager.class);
	
	private void sslSetup() {
		if (atnatls) {
			// Properties for SSL Security Provider
			System.out.println(" $$$$ SECURE COMMUNICATION .....");
			String protocolProp = "java.protocol.handler.pkgs";
			String sunSSLProtocol = "com.sun.net.ssl.internal.www.protocol";
			String sslStoreProp = "javax.net.ssl.trustStore";
			String truststoreFile = ResourceBundle.getBundle("icardea")
					.getString("tomcat.home") + "conf/.truststore";

			// Enable SSL communication
			System.setProperty(protocolProp, sunSSLProtocol);
			Security.addProvider(new com.sun.net.ssl.internal.ssl.Provider());
			System.setProperty(sslStoreProp, truststoreFile);
			System.setProperty("javax.net.ssl.trustStorePassword", "srdcpass");
		}
	}

	public CareManager() {
		this.atnatls = new Boolean(ResourceBundle.getBundle("icardea")
				.getString("atna.tls")).booleanValue();
		this.atnalog = new Boolean(ResourceBundle.getBundle("icardea")
				.getString("atna.log")).booleanValue();
		sslSetup();
		/* FORTH-START */
		careProvisionCodes2QueryId = new Hashtable();
		/* FORTH-END */
		careProvisionCodes = new Hashtable();

		careProvisionCodes.put("9279-1", "RESPIRATION RATE");
		careProvisionCodes.put("8867-4", "HEART BEAT");
		careProvisionCodes.put("2710-2", "OXYGEN SATURATION");
		careProvisionCodes.put("8480-6", "INTRAVASCULAR SYSTOLIC");
		careProvisionCodes.put("8462-4", "INTRAVASCULAR DIASTOLIC");
		careProvisionCodes.put("8310-5", "BODY TEMPERATURE");
		careProvisionCodes.put("8302-2", "BODY HEIGHT (MEASURED)");
		careProvisionCodes.put("8306-3", "BODY HEIGHT^LYING");
		careProvisionCodes.put("8287-5", "CIRCUMFRENCE.OCCIPITAL-FRONTAL");
		careProvisionCodes.put("3141-9", "BODY WEIGHT (MEASURED)");

		careProvisionCodes.put("COBSCAT", "All Vital Signs");
		careProvisionCodes.put("MEDCCAT", "All problem entries");
		careProvisionCodes.put("CONDLIST", "All Concern Entries");
		careProvisionCodes.put("PROBLIST", "All Problem Concerns");
		careProvisionCodes.put("INTOLIST", "All Allergy Concerns");
		careProvisionCodes.put("RISKLIST", "All Risks");
		careProvisionCodes.put("LABCAT", "All Lab Results");
		careProvisionCodes.put("DICAT", "All Imaging Results");
		careProvisionCodes.put("RXCAT", "All Medications");
		careProvisionCodes.put("MEDLIST", "All Medications");
		careProvisionCodes.put("CURMEDLIST", "All active medications");
		careProvisionCodes.put("DISCHMEDLIST", "Discharge Medications");
		careProvisionCodes.put("HISTMEDLIST", "All Historical Medications");
		careProvisionCodes.put("IMMUCAT", "All Immunizations");
		careProvisionCodes.put("PSVCCAT", "All professional service entries");
		/* FORTH-START */
		careProvisionCodes2QueryId.put("9279-1", "1");
		careProvisionCodes2QueryId.put("COBSCAT", "2");
		careProvisionCodes2QueryId.put("MEDCCAT", "3");
		careProvisionCodes2QueryId.put("CONDLIST", "4");
		careProvisionCodes2QueryId.put("PROBLIST", "5");
		careProvisionCodes2QueryId.put("INTOLIST", "6");
		careProvisionCodes2QueryId.put("RISKLIST", "7");
		careProvisionCodes2QueryId.put("LABCAT", "8");
		careProvisionCodes2QueryId.put("DICAT", "9");
		careProvisionCodes2QueryId.put("RXCAT", "10");
		careProvisionCodes2QueryId.put("MEDLIST", "11");
		careProvisionCodes2QueryId.put("CURMEDLIST", "12");
		careProvisionCodes2QueryId.put("DISCHMEDLIST", "13");
		careProvisionCodes2QueryId.put("HISTMEDLIST", "14");
		careProvisionCodes2QueryId.put("IMMUCAT", "15");
		careProvisionCodes2QueryId.put("PSVCCAT", "16");
		/* FORTH-END */
	}

	public void careManagementDataQuery(String careProvisionCode,
			String careProvisionReason, String careRecordTimePeriodBegin,
			String careRecordTimePeriodEnd,
			String clinicalStatementTimePeriodBegin,
			String clinicalStatementTimePeriodEnd,
			String includeCarePlanAttachment, String maximumHistoryStatements,
			String patientAdministrativeGender, String patientBirthTime,
			String patientID, String patientName, String patientSurname,
			String destination) throws java.lang.Exception {
		String fileName = "pcc9/PCC-9-Input.xml";
		// WS-ADDRESSING NOTE: If you specify a value for wsaReplyTo then, the
		// CareManager inserts
		// WS-Adressing values to SOAP Header. If you specify it as null or
		// empty, then WS-Addressing
		// is not used.
		// String wsaReplyTo =
		// "http://localhost:8080/icardea-caremanager-ws/services/QUPC_AR004030UV_Service";

		ResourceBundle properties = ResourceBundle.getBundle("icardea");

		String endpoint = "";
		boolean useAddressing = false;
		String wsaReplyTo = null;

		if (destination.equalsIgnoreCase("EHR")) {
			endpoint = properties.getString("ehr.pcc9.endpoint");
			useAddressing = properties.getString("use.ws.addressing.for.ehr")
					.equals("true");
			if (useAddressing) {
				wsaReplyTo = properties.getString("pcc10.endpoint");
			}
		} else if (destination.equalsIgnoreCase("PHR")) {
			endpoint = properties.getString("phr.pcc9.endpoint");
			useAddressing = properties.getString("use.ws.addressing.for.phr")
					.equals("true");
			if (useAddressing) {
				wsaReplyTo = properties.getString("pcc10.endpoint");
			}
		}

		System.out.println("Endpoint:" + endpoint + " Use Addressing:"
				+ useAddressing);

		JAXBContext context = JAXBContext.newInstance("org.hl7.v3");
		Unmarshaller unmarshaller = context.createUnmarshaller();
		InputStream is = this.getClass().getClassLoader()
				.getResourceAsStream(fileName);
		org.hl7.v3.QUPCIN043100UV01 query = (org.hl7.v3.QUPCIN043100UV01) unmarshaller
				.unmarshal(is);

		DateFormat dateFormat = new SimpleDateFormat("yyyyMMddHHmmss");
		Date date = new Date();
		String creationTime = dateFormat.format(date);

		/* FORTH-START */
		// String messageID = UUID.randomUUID().toString();
		String messageID = (String) careProvisionCodes2QueryId
				.get(careProvisionCode);
		/* FORTH-END */
		TS ts = new TS();
		ts.setValue(creationTime);
		query.setCreationTime(ts);
		II ii = new II();
		ii.setExtension(messageID);
		query.setId(ii);

		QUPCIN043100UV01QUQIMT020001UV01ControlActProcess controlAct = query
				.getControlActProcess();
		controlAct.getId().add(ii);

		ObjectFactory objectFactory = new ObjectFactory();
		List<QUPCMT040300UV01ParameterList> parameters = controlAct
				.getQueryByParameter().getValue().getParameterList();
		QUPCMT040300UV01ParameterList parameterList = new QUPCMT040300UV01ParameterList();
		parameters.add(parameterList);

		QUPCMT040300UV01PatientId patientIdParameter = objectFactory
				.createQUPCMT040300UV01PatientId();
		ii = new II();
		ii.setExtension(patientID);
		ii.setRoot("1.2.826.0.1.3680043.2.44.248240.1");
		patientIdParameter.setValue(ii);
		parameterList.setPatientId(patientIdParameter);

		if (careProvisionCode != null) {
			if (careProvisionCode.indexOf(":") != -1) {
				careProvisionCode = careProvisionCode.split(":")[0].trim();
			}
			if (careProvisionCodes.get(careProvisionCode) == null) {
				throw new Exception("Undefined care provision code: "
						+ careProvisionCode);
			}

			QUPCMT040300UV01CareProvisionCode value = new QUPCMT040300UV01CareProvisionCode();
			CD cd = new CD();
			cd.setCode(careProvisionCode);
			value.setValue(cd);
			JAXBElement<QUPCMT040300UV01CareProvisionCode> careProvisionParameter = objectFactory
					.createQUPCMT040300UV01ParameterListCareProvisionCode(value);
			parameterList.setCareProvisionCode(careProvisionParameter);
		}

		if (careProvisionReason != null) {
			QUPCMT040300UV01CareProvisionReason value = new QUPCMT040300UV01CareProvisionReason();
			CD cd = new CD();
			cd.setCode(careProvisionReason);
			value.setValue(cd);
			parameterList.getCareProvisionReason().add(value);
		}

		if (clinicalStatementTimePeriodBegin != null
				&& clinicalStatementTimePeriodEnd != null) {
			IVLTS ivlts = new IVLTS();
			IVXBTS ivxbts = new IVXBTS();
			ivxbts.setValue(clinicalStatementTimePeriodBegin);
			JAXBElement<IVXBTS> ivltsLow = objectFactory.createIVLTSLow(ivxbts);
			ivxbts = new IVXBTS();
			ivxbts.setValue(clinicalStatementTimePeriodEnd);
			JAXBElement<IVXBTS> ivltsHigh = objectFactory
					.createIVLTSHigh(ivxbts);
			ivlts.getRest().add(ivltsLow);
			ivlts.getRest().add(ivltsHigh);
			QUPCMT040300UV01ClinicalStatementTimePeriod period = new QUPCMT040300UV01ClinicalStatementTimePeriod();
			period.setValue(ivlts);

			JAXBElement<QUPCMT040300UV01ClinicalStatementTimePeriod> timePeriodParamenter = objectFactory
					.createQUPCMT040300UV01ParameterListClinicalStatementTimePeriod(period);
			parameterList.setClinicalStatementTimePeriod(timePeriodParamenter);
		}

		if (includeCarePlanAttachment != null) {
			QUPCMT040300UV01IncludeCarePlanAttachment icpa = new QUPCMT040300UV01IncludeCarePlanAttachment();
			BL bl = new BL();
			bl.setValue(new Boolean(includeCarePlanAttachment));
			icpa.setValue(bl);
			JAXBElement<QUPCMT040300UV01IncludeCarePlanAttachment> icpaParameter = objectFactory
					.createQUPCMT040300UV01ParameterListIncludeCarePlanAttachment(icpa);
			parameterList.setIncludeCarePlanAttachment(icpaParameter);
		}

		if (maximumHistoryStatements != null) {
			QUPCMT040300UV01MaximumHistoryStatements maxHistory = new QUPCMT040300UV01MaximumHistoryStatements();
			INT hl7int = new INT();
			hl7int.setValue(new BigInteger(maximumHistoryStatements));
			maxHistory.setValue(hl7int);
			JAXBElement<QUPCMT040300UV01MaximumHistoryStatements> maxHistoryParameter = objectFactory
					.createQUPCMT040300UV01ParameterListMaximumHistoryStatements(maxHistory);
			parameterList.setMaximumHistoryStatements(maxHistoryParameter);
		}

		if (patientAdministrativeGender != null) {
			QUPCMT040300UV01PatientAdministrativeGender gender = new QUPCMT040300UV01PatientAdministrativeGender();
			CE ce = new CE();
			ce.setCode(patientAdministrativeGender);
			gender.setValue(ce);
			JAXBElement<QUPCMT040300UV01PatientAdministrativeGender> genderParameter = objectFactory
					.createQUPCMT040300UV01ParameterListPatientAdministrativeGender(gender);
			parameterList.setPatientAdministrativeGender(genderParameter);
		}

		if (patientBirthTime != null) {
			QUPCMT040300UV01PatientBirthTime birthTime = new QUPCMT040300UV01PatientBirthTime();
			ts = new TS();
			ts.setValue(patientBirthTime);
			birthTime.setValue(ts);
			JAXBElement<QUPCMT040300UV01PatientBirthTime> birthTimeParameter = objectFactory
					.createQUPCMT040300UV01ParameterListPatientBirthTime(birthTime);
			parameterList.setPatientBirthTime(birthTimeParameter);
		}

		if (patientName != null && patientSurname != null) {
			QUPCMT040300UV01PatientName name = new QUPCMT040300UV01PatientName();
			PN pn = new PN();
			EnGiven given = new EnGiven();
			EnFamily family = new EnFamily();
			given.setContent(patientName);
			family.setContent(patientSurname);

			pn.getContent().add(objectFactory.createENGiven(given));
			pn.getContent().add(objectFactory.createENFamily(family));

			name.setValue(pn);

			JAXBElement<QUPCMT040300UV01PatientName> nameParameter = objectFactory
					.createQUPCMT040300UV01ParameterListPatientName(name);
			parameterList.setPatientName(nameParameter);
		}

		if (careRecordTimePeriodBegin != null
				&& careRecordTimePeriodEnd != null) {
			QUPCMT040300UV01CareRecordTimePeriod period = new QUPCMT040300UV01CareRecordTimePeriod();

			IVLTS ivlts = new IVLTS();
			IVXBTS ivxbts = new IVXBTS();
			ivxbts.setValue(careRecordTimePeriodBegin);
			JAXBElement<IVXBTS> ivltsLow = objectFactory.createIVLTSLow(ivxbts);
			ivxbts = new IVXBTS();
			ivxbts.setValue(careRecordTimePeriodEnd);
			JAXBElement<IVXBTS> ivltsHigh = objectFactory
					.createIVLTSHigh(ivxbts);
			ivlts.getRest().add(ivltsLow);
			ivlts.getRest().add(ivltsHigh);
			period.setValue(ivlts);

			JAXBElement<QUPCMT040300UV01CareRecordTimePeriod> timePeriodParamenter = objectFactory
					.createQUPCMT040300UV01ParameterListCareRecordTimePeriod(period);
			parameterList.setCareRecordTimePeriod(timePeriodParamenter);
		}

		QUPC_AR004040UV_ServiceStub stub = new QUPC_AR004040UV_ServiceStub(
				endpoint);
		org.hl7.v3.MCCIIN000002UV01 ack = stub.qUPC_AR004040UV_QUPC_IN043100UV(
				query, wsaReplyTo);
		logger.info("Ack TypeCode:'"
				+ ack.getAcknowledgement().get(0).getTypeCode().value() + "'");

		// TODO: ATNA
		if (atnalog) {
			// Send ATNA Message: PCC-9 subscription message
			// +"careProvisionCode"+ is sent to "+destination+" for
			// "+patientID+"
			// "+patientName+" "+patientSurname from Hospital Information System
		}
	}

	public void careManagementDataQuery(String patientID,
			String careProvisionCode, String patientName,
			String patientSurname, String destination) throws Exception {
		careManagementDataQuery(careProvisionCode, null, null, null, null,
				null, null, null, null, null, patientID, patientName,
				patientSurname, destination);
	}

	public void subscribeToDataSources(String patientID, String patientName,
			String patientSurname) throws Exception {

		Enumeration keys = careProvisionCodes.keys();
		while (keys.hasMoreElements()) {
			String key = (String) keys.nextElement();
			careManagementDataQuery(patientID, key, patientName,
					patientSurname, "EHR");
			careManagementDataQuery(patientID, key, patientName,
					patientSurname, "PHR");
		}
	}

	public static void main(String argv[]) {

		String patientID = argv[0];
		String patientName = argv[1];
		String patientSurname = argv[2];
		String destination = argv[3];

		for (int i = 4; i < argv.length; i++) {
			String careProvisionCode = argv[i];
			CareManager cm = new CareManager();
			try {
				System.out.println(" Sending subscription:" + patientID
						+ "Careprovision code:" + careProvisionCode);
				cm.careManagementDataQuery(patientID, careProvisionCode,
						patientName, patientSurname, destination);
			} catch (Exception ex) {
				// ex.printStackTrace();
				continue;
			}
		}

	}
}
