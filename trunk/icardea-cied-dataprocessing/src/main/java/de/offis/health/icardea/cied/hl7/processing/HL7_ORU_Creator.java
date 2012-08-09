package de.offis.health.icardea.cied.hl7.processing;
//import static org.junit.Assert.assertTrue;

import java.io.BufferedReader;
import java.io.ByteArrayOutputStream;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStream;
import java.io.PrintWriter;
import java.text.DateFormat;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Date;
import javax.mail.MessagingException;
import javax.mail.internet.MimeUtility;
import javax.management.loading.PrivateClassLoader;

import org.apache.log4j.Logger;
import org.bouncycastle.util.encoders.Base64;
import ca.uhn.hl7v2.HL7Exception;
import ca.uhn.hl7v2.llp.LLPException;
import ca.uhn.hl7v2.model.DataTypeException;
import ca.uhn.hl7v2.model.Message;
import ca.uhn.hl7v2.model.Varies;
import ca.uhn.hl7v2.model.v251.datatype.CE;
import ca.uhn.hl7v2.model.v251.datatype.CWE;
import ca.uhn.hl7v2.model.v251.datatype.DTM;
import ca.uhn.hl7v2.model.v251.datatype.ED;
import ca.uhn.hl7v2.model.v251.datatype.NM;
import ca.uhn.hl7v2.model.v251.datatype.ST;
import ca.uhn.hl7v2.model.v251.datatype.TX;
import ca.uhn.hl7v2.model.v251.group.ORU_R01_ORDER_OBSERVATION;
import ca.uhn.hl7v2.model.v251.message.ORU_R01;
import ca.uhn.hl7v2.model.v251.segment.MSH;
import ca.uhn.hl7v2.model.v251.segment.NTE;
import ca.uhn.hl7v2.model.v251.segment.OBR;
import ca.uhn.hl7v2.model.v251.segment.OBX;
import ca.uhn.hl7v2.model.v251.segment.PID;
import ca.uhn.hl7v2.model.v251.segment.PV1;
import ca.uhn.hl7v2.parser.DefaultXMLParser;
import ca.uhn.hl7v2.parser.EncodingNotSupportedException;
import ca.uhn.hl7v2.parser.GenericParser;
import ca.uhn.hl7v2.parser.Parser;
import ca.uhn.hl7v2.parser.PipeParser;
import ca.uhn.hl7v2.parser.XMLParser;
import de.offis.health.icardea.cied.hl7.oru.ORU_EGM;
import de.offis.health.icardea.cied.hl7.oru.ORU_MSH;
import de.offis.health.icardea.cied.hl7.oru.ORU_OBR;
import de.offis.health.icardea.cied.hl7.oru.ORU_OBX;
import de.offis.health.icardea.cied.hl7.oru.ORU_PID;
import de.offis.health.icardea.cied.hl7.oru.ORU_PV1;
import de.offis.health.icardea.cied.hl7.parser.HL7ParserSJMDeviceType1;
import de.offis.health.icardea.cied.pdf.extractor.PDFApachePDFBoxExtractor;
import de.offis.health.icardea.cied.tools.HL7Tools;
import de.offis.health.icardea.common.exception.PropertyNotFoundException;
import de.offis.health.icardea.config.AppConfig;
import de.offis.health.icardea.tools.GlobalTools;
//* @author MYangng
public class HL7_ORU_Creator {
	// extends HL7ParserSJMDeviceType1{
	/**
	 * Logger object
	 */
	private static Logger logger = Logger.getLogger(HL7_ORU_Creator.class);
	
	
	ORU_MSH oru_msh = null;
	ORU_PID oru_pid = null;
	//ORU_PV1 oru_pv1 = null;
	ORU_OBR oru_obr = null;
	ORU_OBX oru_obx = null;
	ArrayList<ORU_OBX> obx_list=null;
	ArrayList<ORU_EGM> egm_list=null;
	//File egmPDFFile=null;
	private boolean inXML=false;
	/**
	 * 
	 * @param oru_msh	MSH Segment get() and set()
	 * @param oru_pid	PID Segment get() and set()
	 * @param oru_pv1	PV1 Segment get() and set()
	 * @param oru_obr	OBR Segment get() and set()
	 * @param obx_list	OBX	Segments 
	 * @param host		IP address for HL7 receiver
	 * @param port		Port Number	for HL7 receiver
	 */
	
	
	/**
	 * 
	 * @param oru_msh	MSH Segment get() and set()
	 * @param oru_pid	PID Segment get() and set()
	 * @param oru_pv1	PV1 Segment get() and set()
	 * @param oru_obr	OBR Segment get() and set()
	 * @param obx_list	OBX	Segments 
	 */
	public HL7_ORU_Creator(ORU_MSH oru_msh, ORU_PID oru_pid, //ORU_PV1 oru_pv1, 
			ORU_OBR oru_obr, ArrayList obx_list, ArrayList egm_list) {
		this.oru_msh = oru_msh;
		this.oru_pid = oru_pid;
		//this.oru_pv1 = oru_pv1;
		this.oru_obr = oru_obr;
		this.obx_list = obx_list;
		this.egm_list= egm_list;
		// this.oru_object=oru_object;
	}
	
	HL7ParserSJMDeviceType1 hl7parsersjmdevicetype1 = new HL7ParserSJMDeviceType1();
	File myFile = new File("");
	String route_path = myFile.getAbsolutePath().replaceAll("\\\\", "/");
	
	public Message createMessage() throws DataTypeException, HL7Exception,
	MessagingException, IOException, Exception {
		ORU_R01 oru = new ORU_R01();
		// /prop = Util.getProps(hl7ConfigFile);
		// hl7_oru_segment_properties.getProperty("");
		String sendingApplication = oru_msh.getSendingApplication();
		String sendingFacility = oru_msh.getSendingFacility();
		String receivingApplication = oru_msh.getReceivingApplication();
		String receivingFacility = oru_msh.getReceivingFacility();
		populateMSHSegment(oru, sendingApplication, sendingFacility,
				receivingApplication, receivingFacility);
		
		String idNumber = oru_pid.getPatientIdentifierList_idNumber();
		String assigningAuthority = oru_pid
		.getPatientIdentifierList_assigningAuthority();
		// String identifierTypeCode
		// =hl7_oru_segment_properties.getProperty("PID_PatientIdentifierList_identifier_type_code");
		String patientIdentifierTypeCode = oru_pid
		.getPatientIdentifierList_patientIdentifierTypeCode();
		String idNumber2 = oru_pid.getPatientIdentifierList_idNumber2();
		String assigningAuthority2 = oru_pid
		.getPatientIdentifierList_assigningAuthority2();
		String patientIdentifierTypeCode2 = oru_pid
		.getPatientIdentifierList_patientIdentifierTypeCode2();
		
		String givenName = oru_pid.getPatientName_givenName();
		String familyName = oru_pid.getPatientName_familyName();
		String secondName = oru_pid.getPatientName_secondName();
		String dateTimeOfBirth = oru_pid.getData_timeOfBorth_dataofbirth();
		String administrativeSex = oru_pid.getAdministrativeSex();
		String street = oru_pid.getPatientAddress_street();
		String city = oru_pid.getPatientAddress_city();
		String province = oru_pid.getPatientAddress_state_province();
		String postalCode = oru_pid.getPatientAddress_postalCode();
		String country = oru_pid.getPatientAddress_country();
		populatePIDSegment(oru, idNumber, assigningAuthority,
				patientIdentifierTypeCode, idNumber2, assigningAuthority2,
				patientIdentifierTypeCode2, givenName, familyName, secondName,
				dateTimeOfBirth, administrativeSex, street, city, province,
				postalCode, country);
		// hl7_oru_segment_properties.getProperty("");
		
		/*
		String patientClass = oru_pv1.getPatient_class();
		String visitID = oru_pv1.getVisitNumber_id_number();
		String attendingDoctorID = oru_pv1.getAttendingDoctor_id_number();
		populatePV1Segment(oru, patientClass, visitID, attendingDoctorID);
		 */
		String fillerOrderNumber = oru_obr
		.getFillerOrderNumber_entityIdentifier();
		// String universalServiceIdentifer
		// =oru_obr.getUniversalServiceIdentifier_identifier();
		String observationDateTime = oru_obr.getObservationData_Time_time();
		String observationEndDateTime = oru_obr
		.getObservationEndData_Time_time();
		String resultRptStatusChangeDateTime = oru_obr
		.getResultsRptStatusChngDate_Time_time();
		String resultStatus = "F"; // oru_obr.getResultStatus();
		
		String universalServiceIdentifer_Identifier = oru_obr
		.getUniversalServiceIdentifier_identifier();
		String universalServiceIdentifer_Text = oru_obr
		.getUniversalServiceIdentifier_text();
		populateOBRSegment(oru, fillerOrderNumber,
				universalServiceIdentifer_Identifier,
				universalServiceIdentifer_Text, observationDateTime,
				observationEndDateTime, resultRptStatusChangeDateTime,
				resultStatus);
		
		//////////////OBX-Segment////////////////
		String valueType = "ST"; // Values: Table 4.12-9
		String observationIdentifier = "257"; // MDC_IDC Nomenclature code value
		String observationIdentifierText = "MDC-IDC_SYSTEM_STATUS"; // MDC_IDC
		// Nomenclature
		// reference
		// id
		String observationIdentifierNameOfCodeSystem = "MDC_IDC";
		String observationValue = "Normal";
		String unitIdentifier = "m"; // Optional, CH07 Figure 7-6, ISO 2955-1983
		String abnormalFlags = "L"; // Optional, CH07 Table 0078
		String observationResultStatus = "F"; // CH07 HL7 Table 0085
		String dateTimeOfObservation = "20100913081040";
		String observationMethodIdentifier = "LastFU"; // Optional, Table
		// 4.12-10
		String observationMethodText = "Since Last Follow-up Aggregate"; // Optional,
		// Table
		// 4.12-10
		String observationSubID = "1";
		String observationValueIdentifier = "";
		String observationNameOfCodingSystem = "";
		
		// IEEE Nomenclature_v0.85
		// hl7_oru_segment_properties.getProperty("");
		if (obx_list!=null) {
			for (int i = 0; i < obx_list.size(); i++) {
				ORU_OBX oru_obx = (ORU_OBX) obx_list.get(i);
				valueType = oru_obx.getValueType();
				observationIdentifier = oru_obx
				.getObservationIdentifier_identifier(); // MDC_IDC
				// Nomenclature code
				// value
				observationIdentifierText = oru_obx.getObservationIdentifier_text(); // MDC_IDC
				// Nomenclature
				// reference
				// id
				observationIdentifierNameOfCodeSystem = oru_obx
				.getObservationIdentifier_nameOfCodingSystem();// "MDC";
				unitIdentifier = oru_obx.getUnits_Identifier();
				abnormalFlags = oru_obx.getAbnormalFlags();
				observationResultStatus = "F";// oru_obx.getObservationResultStatus();
				dateTimeOfObservation = oru_obx.getDateTimeoftheObservation_time();
				observationSubID = oru_obx.getObservationSubID();
				observationValue = oru_obx.getObservationValue();
				observationValueIdentifier = oru_obx
				.getObservationValueIdentifier();
				observationNameOfCodingSystem = oru_obx
				.getObservationNameOfCodingSystem();
				populateOBXSegment(oru, i, valueType, observationIdentifier,
						observationIdentifierText,
						observationIdentifierNameOfCodeSystem, observationValue,
						unitIdentifier, abnormalFlags, observationResultStatus,
						dateTimeOfObservation, "", "", observationSubID, null,
						observationValueIdentifier, observationNameOfCodingSystem);
			}
		}
		else {
			logger.info("Attention Please! No OBX Segment");
		}
		// IEEE Nomenclature_v0.85
		// hl7_oru_segment_properties.getProperty("");
		// ////////////EGM in base64 PDF/////////////////
		/*
		 * valueType = "ED"; String fileName =
		 * hl7_oru_segment_properties.getProperty("OBX_PDF_01_EGM_Filename");
		 * observationResultStatus =hl7_oru_segment_properties.getProperty(
		 * "OBX_PDF_01_EGM_Observation_Result_Status");//"F"; // CH07 HL7 Table
		 * 0085 dateTimeOfObservation =hl7_oru_segment_properties.getProperty(
		 * "OBX_PDF_01_EGM_DateTimeoftheObservation"); populateOBXSegment(oru,
		 * 10, valueType, "", "", "", "", "", "", observationResultStatus,
		 * dateTimeOfObservation, "", "", "", fileName, "", "");
		 */
		// //////////////////////////////////////////////
		
		//base64 PDF
		valueType = "ED";
		
		if (egm_list!=null) {
			valueType = "ED";
			for (int i = 0; i < egm_list.size(); i++) {
				observationResultStatus = "F";
				dateTimeOfObservation = "";
				observationSubID=Integer.toString(i+1);
				//"obx_list.size()+i" EGM in OBX should follow OBX parameter items 
				populateOBXSegment(oru, obx_list.size()+i, valueType, "", "", "", "", "", "", observationResultStatus, dateTimeOfObservation,
						"", "", observationSubID, egm_list.get(i), "", "");
			}
		}
		else{
			logger.info("No EGM PDF file in HL7 message embedded");
		}
		return oru;
	}
	
	//String comment = "Comment";
	//populateNTESegment(oru, comment);
	
	
	private void populateNTESegment(ORU_R01 oru, String comment)
	throws HL7Exception {
		NTE nteSegment = oru.getPATIENT_RESULT().getORDER_OBSERVATION()
		.getNTE();
		nteSegment.getSetIDNTE().setValue("1");
		nteSegment.getSourceOfComment().setValue("L");
		nteSegment.getComment(0).setValue(comment);
	}
	
	
	private void populateOBXSegment (ORU_R01 oru, int obxNumber,
			String valueType, String observationIdentifier,
			String observationIdentifierText,
			String observationIdentifierNameOfCodeSystem,
			String observationValue, String unitIdentifier,
			String abnormalFlags, String observationResultStatus,
			String dateTimeOfObservation, String observationMethodIdentifier,
			String observationMethodText, String observationSubID,
			ORU_EGM oru_egm, String observationValueIdentifier,
			String observationNameOfCodingSystem) throws DataTypeException,
			HL7Exception, MessagingException, IOException, Exception {
		int setID = obxNumber + 1;
		byte[] egmPageContent = null;
		
		if (valueType.equals("ED")) {
			observationIdentifier = "18750-0"; // FIX
			observationIdentifierText = oru_egm.getEgmName(); // FIX
			observationIdentifierNameOfCodeSystem = "LN"; // FIX
			
			unitIdentifier = "";
			abnormalFlags = "";
			observationMethodIdentifier = "";
			observationMethodText = "";
			observationSubID = observationSubID;
		}
		
		ORU_R01_ORDER_OBSERVATION orderObservation = oru.getPATIENT_RESULT()
		.getORDER_OBSERVATION();
		OBX obx = orderObservation.getOBSERVATION(obxNumber).getOBX();
		obx.getSetIDOBX().setValue("" + setID);
		obx.getValueType().setValue(valueType);
		obx.getObservationSubID().setValue(observationSubID);
		obx.getUnits().getIdentifier().setValue(unitIdentifier);
		obx.getAbnormalFlags(0).setValue(abnormalFlags);
		obx.getObservationResultStatus().setValue(observationResultStatus);
		obx.getDateTimeOfTheObservation().getTime().setValue(
				dateTimeOfObservation);
		obx.getObservationMethod(0).getIdentifier().setValue(
				observationMethodIdentifier);
		obx.getObservationMethod(0).getText().setValue(observationMethodText);
		
		// obx.getObservationIdentifier().getIdentifier().setValue(observationIdentifier);
		// obx.getObservationIdentifier().getNameOfCodingSystem().setValue(observationIdentifierNameOfCodeSystem);
		// obx.getObservationIdentifier().getText().setValue(observationIdentifierText);
		
		obx.getObservationIdentifier().getCe1_Identifier().setValue(
				observationIdentifier);
		obx.getObservationIdentifier().getCe3_NameOfCodingSystem().setValue(
				observationIdentifierNameOfCodeSystem);
		obx.getObservationIdentifier().getCe2_Text().setValue(
				observationIdentifierText);
		
		obx.getObservationIdentifier().getCe4_AlternateIdentifier()
		.setValue("");
		obx.getObservationIdentifier().getCe5_AlternateText()
		.setValue("");  //????filename
		
		if (valueType.equals("ED")) {
			// set the value of ED with the String
			ED encapsuledData = new ED(oru);
			
			// encapsuledData.getEd1_SourceApplication().getNamespaceID().setValue("Application");
			// encapsuledData.getEd2_TypeOfData().setValue("PDF");
			// encapsuledData.getEd4_Encoding().setValue("Base64");
			encapsuledData.getSourceApplication().getHd1_NamespaceID()
			.setValue("Application");
			encapsuledData.getTypeOfData().setValue("PDF");// ("Application");
			encapsuledData.getEncoding().setValue("Base64");
			
			/*
			 * MimeMultipart mimeMessage = new MimeMultipart(); MimeBodyPart
			 * bodyPart = new MimeBodyPart();
			 * 
			 * FileDataSource fds = new FileDataSource(fileName);
			 * bodyPart.setDataHandler(new DataHandler(fds));
			 * bodyPart.setHeader("MIME-Version", "1.0");
			 * bodyPart.setHeader("Content-Type", "application/pdf");
			 * bodyPart.setHeader("Content-Transfer-Encoding", "base64");
			 * mimeMessage.addBodyPart(bodyPart);
			 * 
			 * ByteArrayOutputStream byte1 = new ByteArrayOutputStream();
			 * mimeMessage.writeTo(byte1);
			 * encapsuledData.getData().setValue(byte1.toString());
			 */
			
			/*
			 * Pay attention to this Bug in original HAPI
			 * encode(fileContent) is right for the Base64 encoding but the code will be split into lines
			 * Base64.encode(fileContent) will format all code in one single line 
			 * which is obligated required by HL7 parsing
			 */
			encapsuledData.getData().setValue(new String(Base64.encode(oru_egm.getEgmContent())));
			obx.getObservationValue(0).setData(encapsuledData);
		} else if (valueType.equals("TX")) {
			TX tx = new TX(oru);
			tx.setValue(observationValue);
			Varies value = obx.getObservationValue(0);
			value.setData(tx);
			
		} else if (valueType.equals("ST")) {
			ST st = new ST(oru);
			st.setValue(observationValue);
			Varies value = obx.getObservationValue(0);
			value.setData(st);
			
		} else if (valueType.equals("CWE")) {
			
			CWE cwe = new CWE(oru);
			obx.getValueType().setValue("CWE");
			cwe.getCwe1_Identifier().setValue(observationValueIdentifier);
			cwe.getCwe2_Text().setValue(observationValue);
			cwe.getCwe3_NameOfCodingSystem().setValue(
					observationNameOfCodingSystem);
			Varies value = obx.getObservationValue(0);
			value.setData(cwe);
			// obx.getObservationValue(0).setData(cwe);
			// CWE cwe = new CWE(oru);
			// cwe.
			// cwe.setValue(observationValue);
			// Varies value = obx.getObservationValue(0);
			// value.setData(cwe);
			
		} else if (valueType.equals("NM")) {
			NM nm = new NM(oru);
			nm.setValue(observationValue);
			Varies value = obx.getObservationValue(0);
			value.setData(nm);
			
		} else if (valueType.equals("DTM")) {
			DTM dtm = new DTM(oru);
			dtm.setValue(observationValue);
			Varies value = obx.getObservationValue(0);
			value.setData(dtm);
			
		} else if (valueType.equals("CE")) {
			CE ce = new CE(oru);
			ce.getIdentifier().setValue(observationValueIdentifier);
			ce.getText().setValue(observationValue);
			ce.getNameOfCodingSystem().setValue(observationNameOfCodingSystem);
			Varies value = obx.getObservationValue(0);
			value.setData(ce);
		}
	}
	
	public static byte[] encode(byte[] b) throws Exception {
		ByteArrayOutputStream baos = new ByteArrayOutputStream();
		OutputStream b64os = MimeUtility.encode(baos, "base64");
		b64os.write(b);
		b64os.close();
		return baos.toByteArray();
	}
	
	private void populateOBRSegment(ORU_R01 oru, String fillerOrderNumber,
			String universalServiceIdentifer_Identifier,
			String universalServiceIdentifer_Text, String observationDateTime,
			String observationEndDateTime,
			String resultRptStatusChangeDateTime, String resultStatus)
	throws DataTypeException, HL7Exception {
		ORU_R01_ORDER_OBSERVATION orderObservation = oru.getPATIENT_RESULT()
		.getORDER_OBSERVATION();
		OBR obr = orderObservation.getOBR();
		obr.getSetIDOBR().setValue(oru_obr.getSetID());
		obr.getFillerOrderNumber().getEntityIdentifier().setValue(
				fillerOrderNumber);
		// obr.getUniversalServiceIdentifier().getIdentifier().setValue(universalServiceIdentifer);
		obr.getObr7_ObservationDateTime().getTime().setValue(observationDateTime);
//		obr.getObservationDateTime().getTime().setValue(observationDateTime);
		obr.getObr8_ObservationEndDateTime().getTime().setValue(observationEndDateTime);
//		obr.getObservationEndDateTime().getTime().setValue(
//				observationEndDateTime);
		
//		obr.getResultsRptStatusChngDateTime().getTime().setValue(
//				resultRptStatusChangeDateTime);
		obr.getResultStatus().setValue(resultStatus);
		
		obr.getObr4_UniversalServiceIdentifier().getCe1_Identifier().setValue(
				universalServiceIdentifer_Identifier);
		obr.getObr4_UniversalServiceIdentifier().getCe2_Text().setValue(
				universalServiceIdentifer_Text);
	}
	/*
	private void populatePV1Segment(ORU_R01 oru, String patientClass,
			String visitID, String attendingDoctorID) throws DataTypeException,
			HL7Exception {
		PV1 pv1Segment = oru.getPATIENT_RESULT().getPATIENT().getVISIT()
		.getPV1();
		pv1Segment.getSetIDPV1().setValue(oru_pv1.getSet_id());
		pv1Segment.getPatientClass().setValue(patientClass);
		pv1Segment.getAttendingDoctor(0).getIDNumber().setValue(
				attendingDoctorID);
		pv1Segment.getVisitNumber().getIDNumber().setValue(visitID);
	}
	 */
	private void populatePIDSegment(ORU_R01 oru, String idNumber,
			String assigningAuthority, String patientIdentifierTypeCode,
			String idNumber2, String assigningAuthority2,
			String patientIdentifierTypeCode2, String givenName,
			String familyName, String secondName, String dateTimeOfBirth,
			String administrativeSex, String street, String city,
			String Province, String postalCode, String country)
	throws DataTypeException, HL7Exception {
		PID pidSegment = oru.getPATIENT_RESULT().getPATIENT().getPID();
		
		// pidSegment.getPatientID().getIDNumber().setValue(patientID);
		// pidSegment.getPatientID().getAssigningAuthority().getNamespaceID().setValue(assigningAuthority);
		// pidSegment.getPatientID().getIdentifierTypeCode().setValue(identifierTypeCode);
		pidSegment.getPatientIdentifierList(0).getIDNumber().setValue(idNumber);
		pidSegment.getPatientIdentifierList(0).getAssigningAuthority()
		.getNamespaceID().setValue(assigningAuthority);
		pidSegment.getPatientIdentifierList(0).getIdentifierTypeCode()
		.setValue(patientIdentifierTypeCode);
		/*
		pidSegment.getPatientIdentifierList(1).getIDNumber()
		.setValue(idNumber2);
		pidSegment.getPatientIdentifierList(1).getAssigningAuthority()
		.getNamespaceID().setValue(assigningAuthority2);
		pidSegment.getPatientIdentifierList(1).getIdentifierTypeCode()
		.setValue(patientIdentifierTypeCode2);
		 */
		pidSegment.getPatientName(0).getGivenName().setValue(givenName);
		pidSegment.getPatientName(0).getFamilyName().getSurname().setValue(
				familyName);
		pidSegment.getPatientName(0)
		.getSecondAndFurtherGivenNamesOrInitialsThereof().setValue(
				secondName);
		
		pidSegment.getDateTimeOfBirth().getTime().setValue(dateTimeOfBirth);
		pidSegment.getAdministrativeSex().setValue(administrativeSex);
		pidSegment.getPatientAddress(0).getStreetAddress().getStreetName()
		.setValue(street);
		pidSegment.getPatientAddress(0).getCity().setValue(city);
		pidSegment.getPatientAddress(0).getStateOrProvince().setValue(Province);
		pidSegment.getPatientAddress(0).getZipOrPostalCode().setValue(
				postalCode);
		pidSegment.getPatientAddress(0).getCountry().setValue(country);
		
	}
	
	private void populateMSHSegment(ORU_R01 oru, String sendingApplication,
			String sendingFacility, String receivingApplication,
			String receivingFacility) throws DataTypeException {
		MSH mshSegment = oru.getMSH();
		
		mshSegment.getSendingApplication().getNamespaceID().setValue(
				sendingApplication);
		mshSegment.getSendingFacility().getNamespaceID().setValue(
				sendingFacility);
		mshSegment.getReceivingApplication().getNamespaceID().setValue(
				receivingApplication);
		mshSegment.getReceivingFacility().getNamespaceID().setValue(
				receivingFacility);
		
		mshSegment.getFieldSeparator().setValue(oru_msh.getFieldSeparator());
		mshSegment.getEncodingCharacters().setValue(
				oru_msh.getEncodingCharacters());
		
		DateFormat dateFormat = new SimpleDateFormat("yyyyMMddHHmmss");
		Date date = new Date();
		mshSegment.getDateTimeOfMessage().getTime().setValue(
				dateFormat.format(date));
		mshSegment.getMessageType().getMessageCode().setValue(
				oru_msh.getMessageType_messagecode());
		mshSegment.getMessageType().getTriggerEvent().setValue(
				oru_msh.getMessageType_triggerevent());
		mshSegment.getMessageType().getMessageStructure().setValue(
				oru_msh.getMessageType_message_structure_id());
		mshSegment.getMessageControlID()
		.setValue(oru_msh.getMessageControlID());
		mshSegment.getProcessingID().getProcessingID().setValue(
				oru_msh.getProcessingID());
		mshSegment.getVersionID().getVersionID().setValue(
				oru_msh.getVersionID());
	}
	
	
	//	
	//	public void convertPDFToHL7(String deviceType, String orig_filePathandName,String new_pathname,
	//			String new_filename) throws PropertyNotFoundException, EncodingNotSupportedException, IOException, HL7Exception {
	//		inXML=AppConfig.getProperty("LOCAL_HL7_FILEFORMAT_inXML").equals("Yes");
	//		HL7_ORU_Creator hl7_oru_creator = new HL7_ORU_Creator(oru_msh, oru_pid,
	//				oru_pv1, oru_obr, obx_list, egmPDFFile);
	//		Message message=HL7Tools.readFromFile(orig_filePathandName);
	//		HL7Tools.hl7writing(inXML, message, new_pathname, new_filename);
	//	}
}