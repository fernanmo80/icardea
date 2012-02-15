package de.offis.health.icardea.cied.hl7.processing;
/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
import ca.uhn.hl7v2.HL7Exception;
import ca.uhn.hl7v2.app.Connection;
import ca.uhn.hl7v2.app.ConnectionHub;
import ca.uhn.hl7v2.app.Initiator;
import ca.uhn.hl7v2.llp.LLPException;
import ca.uhn.hl7v2.llp.MinLowerLayerProtocol;
import ca.uhn.hl7v2.model.DataTypeException;
import ca.uhn.hl7v2.model.Message;
import ca.uhn.hl7v2.model.Varies;
import ca.uhn.hl7v2.model.v251.datatype.NM;
import ca.uhn.hl7v2.model.v251.datatype.CWE;
import ca.uhn.hl7v2.model.v251.datatype.DTM;
import ca.uhn.hl7v2.model.v251.datatype.CE;
import ca.uhn.hl7v2.model.v251.datatype.ED;
import ca.uhn.hl7v2.model.v251.datatype.ST;
import ca.uhn.hl7v2.model.v251.group.ORU_R01_ORDER_OBSERVATION;
import ca.uhn.hl7v2.model.v251.message.ORU_R01;
import ca.uhn.hl7v2.model.v251.segment.MSH;
import ca.uhn.hl7v2.model.v251.segment.NTE;
import ca.uhn.hl7v2.model.v251.segment.OBR;
import ca.uhn.hl7v2.model.v251.segment.OBX;
import ca.uhn.hl7v2.model.v251.segment.PID;
import ca.uhn.hl7v2.model.v251.segment.PV1;
import ca.uhn.hl7v2.parser.DefaultXMLParser;
import ca.uhn.hl7v2.parser.GenericParser;
import ca.uhn.hl7v2.parser.Parser;
import ca.uhn.hl7v2.parser.PipeParser;
import ca.uhn.hl7v2.parser.XMLParser;
import java.io.BufferedReader;
import java.io.IOException;
import java.text.DateFormat;
import java.text.SimpleDateFormat;
import java.util.Date;
import org.apache.log4j.Logger;

import java.io.ByteArrayOutputStream;
import java.io.File;
import java.io.FileInputStream;
import java.io.InputStreamReader;
import java.io.OutputStream;
import javax.mail.MessagingException;
import javax.mail.internet.MimeUtility;

import java.io.* ;
import java.util.Properties;
/**
 *
 * @author MYangng
 */
public class ObservationCreator {
	/**
	 * Logger object
	 */
	private static Logger logger = Logger.getLogger(ObservationCreator.class);
	
	private int port;
	private String host;


	public ObservationCreator(String host, int port) {
		this.host = host;
		this.port = port;
	}
	File myFile = new File("");
	String route_path=myFile.getAbsolutePath().replaceAll("\\\\", "/");

	//String properties_path="HL7_ORU_Segment.properties";
	String properties_path= this.getClass().getResource("").getPath().toString(); 
	String sjm_pdf_path="/SJM_EGM_PDF/";
	//String sjM_xml_path="/SJM_EGM_PDF/";
	//String sjM_hl7_path="/SJM_EGM_PDF/";

	//String new_route_path=route_path.replaceAll("\\\\", "/");
	//String new_pdf_path=sjm_pdf_path.replaceAll("\\\\", "/");

	PropertiesReadandWrite propertiesReadandWrite = new PropertiesReadandWrite();
	Properties hl7_oru_segment_properties = new Properties();

	public void run(boolean inXML, String fileName) {

		
		try {
			//File f = new File("HL7_ORU_Segment.properties");
			//properties_path= this.getClass().getResource("").getPath().toString(); 
			//System.out.println(properties_path);
			hl7_oru_segment_properties = propertiesReadandWrite.getProperties(properties_path+"HL7_ORU_Segment.properties");

			Message message = null;
			if (fileName == null) {
				message = createMessage(); // Medtronic
			} else {
				BufferedReader bf = new BufferedReader(new InputStreamReader(new FileInputStream(fileName)));
				StringBuilder messageBuffer = new StringBuilder();
				String line = "";
				while ((line = bf.readLine()) != null) {
					messageBuffer.append(line).append("\r");

				}
				Parser p = new GenericParser();
				message = p.parse(messageBuffer.toString());

				//  populateOBXSegment((ORU_R01)message, 292, "ED", "", "", "", "", "", "", "F", "20100913081040",
				//          "", "", "", "icardea-caremanagementdb/resources/idco/b.pdf", "", "");
			}
			String messageString = null;
			if (!inXML) {
				messageString = convertToDelimitedString(message);
			} else {
				messageString = convertToXMLString(message);
			}
			
			logger.info(messageString);
			
			send(message, inXML);
		} catch (Exception ex) {
			ex.printStackTrace();
		}
	}

	private Message createMessage() throws DataTypeException, HL7Exception, MessagingException, IOException, Exception {
		ORU_R01 oru = new ORU_R01();
		///prop = Util.getProps(hl7ConfigFile);
		//hl7_oru_segment_properties.getProperty("");
		String sendingApplication = hl7_oru_segment_properties.getProperty("MSH_SendingApplication");
		String sendingFacility = hl7_oru_segment_properties.getProperty("MSH_SendingFacility");
		String receivingApplication = hl7_oru_segment_properties.getProperty("MSH_ReceivingApplication");
		String receivingFacility = hl7_oru_segment_properties.getProperty("CLINIC ID");
		populateMSHSegment(oru, sendingApplication, sendingFacility, receivingApplication, receivingFacility);

		String idNumber =hl7_oru_segment_properties.getProperty("PID_PatientIdentifierList_id_number"); //"MODEL:xxx/SERIAL:xxx";
		String assigningAuthority = hl7_oru_segment_properties.getProperty("PID_PatientIdentifierList_assigning_authority"); // TODO: Validate from list: Table A.1
		//String identifierTypeCode =hl7_oru_segment_properties.getProperty("PID_PatientIdentifierList_identifier_type_code");
		String patientIdentifierTypeCode=hl7_oru_segment_properties.getProperty("PID_PatientIdentifierList_identifier_type_code");
		String idNumber2 =hl7_oru_segment_properties.getProperty("PID_PatientIdentifierList_id_number2"); //"MODEL:xxx/SERIAL:xxx";
		String assigningAuthority2 = hl7_oru_segment_properties.getProperty("PID_PatientIdentifierList_assigning_authority2"); // TODO: Validate from list: Table A.1
		String patientIdentifierTypeCode2=hl7_oru_segment_properties.getProperty("PID_PatientIdentifierList_identifier_type_code2");

		String givenName =hl7_oru_segment_properties.getProperty("PID_Patient_given_name");  //"Jesus";//from Medtronic PDF
		String familyName =hl7_oru_segment_properties.getProperty("PID_Patient_family_name"); //from Medtronic PDF
		String secondName = hl7_oru_segment_properties.getProperty("PID_Patient_second_name"); //from Medtronic PDF
		String dateTimeOfBirth =hl7_oru_segment_properties.getProperty("PID_Date_Time_of_Birth");////from Medtronic PDF
		String administrativeSex =hl7_oru_segment_properties.getProperty("PID_Administrative_Sex");
		String street = hl7_oru_segment_properties.getProperty("PID_Patient_Address_street_address");
		String city = hl7_oru_segment_properties.getProperty("PID_Patient_Address_city");
		String postalCode = hl7_oru_segment_properties.getProperty("PID_Patient_Address_zip_plz");
		String country = hl7_oru_segment_properties.getProperty("PID_Patient_Address_country");
		populatePIDSegment(oru, idNumber, assigningAuthority, patientIdentifierTypeCode, 
				idNumber2, assigningAuthority2, patientIdentifierTypeCode2, givenName,
				familyName, secondName, dateTimeOfBirth, administrativeSex, street, city, postalCode, country);
		//hl7_oru_segment_properties.getProperty("");
		String patientClass = hl7_oru_segment_properties.getProperty("PV1_Patient_Class");
		String visitID = "123456";
		String attendingDoctorID = "DoctorID";
		populatePV1Segment(oru, patientClass, visitID, attendingDoctorID);

		String fillerOrderNumber = hl7_oru_segment_properties.getProperty("OBR_FillerOrderNumber");
		String universalServiceIdentifer =hl7_oru_segment_properties.getProperty("OBR_UniversalServiceIdentifier") ; // TODO: Values: Table 4.12-7
		String observationDateTime = hl7_oru_segment_properties.getProperty("OBR_ObservationDateTime_1"); //"20100913081040";  //from Medtronic PDF
		String observationEndDateTime = hl7_oru_segment_properties.getProperty("OBR_ObservationDateTime_2"); //from Medtronic PDF
		String resultRptStatusChangeDateTime = hl7_oru_segment_properties.getProperty("OBR_ResultsRptStatusChngDateTime"); //from Medtronic PDF
		String resultStatus = hl7_oru_segment_properties.getProperty("OBR_ResultStatus"); // TODO: Values: Table 4.12-8

		String universalServiceIdentifer_Identifier=hl7_oru_segment_properties.getProperty("OBR_UniversalServiceIdentifier_Identifier");
		String universalServiceIdentifer_Text=hl7_oru_segment_properties.getProperty("");
		populateOBRSegment(oru, fillerOrderNumber, universalServiceIdentifer_Identifier,universalServiceIdentifer_Text, observationDateTime,
				observationEndDateTime, resultRptStatusChangeDateTime, resultStatus);



		////////////////////////////////////////////////
		//////////////OBX///////////////////////////////
		////////////////////////////////////////////////
		String valueType = "ST"; // Values: Table 4.12-9
		String observationIdentifier = "257"; // MDC_IDC Nomenclature code value
		String observationIdentifierText = "MDC-IDC_SYSTEM_STATUS"; // MDC_IDC Nomenclature reference id
		String observationIdentifierNameOfCodeSystem = "MDC_IDC";
		String observationValue = "Normal";
		String unitIdentifier = "m"; // Optional, CH07 Figure 7-6, ISO 2955-1983
		String abnormalFlags = "L"; // Optional, CH07 Table 0078
		String observationResultStatus = "F"; // CH07 HL7 Table 0085
		String dateTimeOfObservation = "20100913081040";
		String observationMethodIdentifier = "LastFU"; //Optional, Table 4.12-10
		String observationMethodText = "Since Last Follow-up Aggregate"; // Optional, Table 4.12-10
		String observationSubID = "1";
		String observationValueIdentifier="";
		String observationNameOfCodingSystem="";
		/*
		   populateOBXSegment(oru, 0, valueType, observationIdentifier, observationIdentifierText,
		   observationIdentifierNameOfCodeSystem, observationValue, unitIdentifier,
		   abnormalFlags, observationResultStatus, dateTimeOfObservation,
		   observationMethodIdentifier, observationMethodText, observationSubID, "", "", "");

		//base64 PDF
		valueType = "ED";
		String fileName = "C:/Test/b.pdf";
		//String fileName = "resources/idco/b.pdf";   //Maohua Position for the PDF file
		//String fileName = "D:/yildiray/Documents/Projects/iCARDEA/usefuldocs/RemoteCardiacMonitoringinUSA.pdf";
		observationResultStatus = "F"; // CH07 HL7 Table 0085
		dateTimeOfObservation = "20100913081040";
		populateOBXSegment(oru, 1, valueType, "", "", "", "", "", "", observationResultStatus, dateTimeOfObservation,
		"", "", "", fileName, "", "");
		*/
		//IEEE Nomenclature_v0.85
		//hl7_oru_segment_properties.getProperty("");
		valueType = hl7_oru_segment_properties.getProperty("OBX_1_ValueType");
		observationIdentifier =hl7_oru_segment_properties.getProperty("OBX_1_ObservationIdentifier_identifier"); //"739712"; // MDC_IDC Nomenclature code value
		observationIdentifierText = hl7_oru_segment_properties.getProperty("OBX_1_ObservationIdentifier_text"); //MDC_IDC_EPISODE_DURATION MDC_IDC Nomenclature reference id
		observationIdentifierNameOfCodeSystem = hl7_oru_segment_properties.getProperty("OBX_1_ObservationIdentifier_nameofcodingsystem");//"MDC";
		unitIdentifier =hl7_oru_segment_properties.getProperty("OBX_1_Units_identifier");//"S";// "m"; // Optional, CH07 Figure 7-6, ISO 2955-1983
		abnormalFlags =hl7_oru_segment_properties.getProperty("OBX_1_Abnormal_Flags=1");// "L"; // Optional, CH07 Table 0078
		observationResultStatus = hl7_oru_segment_properties.getProperty("OBX_1_Observation_Result_Status");//"F"; // CH07 HL7 Table 0085
		dateTimeOfObservation = hl7_oru_segment_properties.getProperty("OBX_1_DateTimeoftheObservation");
		observationSubID = hl7_oru_segment_properties.getProperty("OBX_1_Observation_Sub_ID");// "1";
		observationValue = hl7_oru_segment_properties.getProperty("OBX_1_Observation_ObservationValue");//"10800";
		observationValueIdentifier=hl7_oru_segment_properties.getProperty("OBX_1_Observation_Value_Identifier");
		observationNameOfCodingSystem=hl7_oru_segment_properties.getProperty("OBX_1_Observation_Name_Of_CodingSystem");
		populateOBXSegment(oru, 0, valueType, observationIdentifier, observationIdentifierText,
				observationIdentifierNameOfCodeSystem, observationValue, unitIdentifier,
				abnormalFlags, observationResultStatus, dateTimeOfObservation,
				"", "", observationSubID,"", observationValueIdentifier, observationNameOfCodingSystem);

		//IEEE Nomenclature_v0.85
		//hl7_oru_segment_properties.getProperty("");
		valueType = hl7_oru_segment_properties.getProperty("OBX_2_ValueType");
		observationIdentifier =hl7_oru_segment_properties.getProperty("OBX_2_ObservationIdentifier_identifier"); //"739712"; // MDC_IDC Nomenclature code value
		observationIdentifierText = hl7_oru_segment_properties.getProperty("OBX_2_ObservationIdentifier_text"); //MDC_IDC_EPISODE_DURATION MDC_IDC Nomenclature reference id
		observationIdentifierNameOfCodeSystem = hl7_oru_segment_properties.getProperty("OBX_2_ObservationIdentifier_nameofcodingsystem");//"MDC";
		unitIdentifier =hl7_oru_segment_properties.getProperty("OBX_2_Units_identifier");//"S";// "m"; // Optional, CH07 Figure 7-6, ISO 2955-1983
		abnormalFlags =hl7_oru_segment_properties.getProperty("OBX_2_Abnormal_Flags");// "L"; // Optional, CH07 Table 0078
		observationResultStatus = hl7_oru_segment_properties.getProperty("OBX_2_Observation_Result_Status");//"F"; // CH07 HL7 Table 0085
		dateTimeOfObservation = hl7_oru_segment_properties.getProperty("OBX_2_DateTimeoftheObservation");
		observationSubID = hl7_oru_segment_properties.getProperty("OBX_2_Observation_Sub_ID");// "1";
		observationValue = hl7_oru_segment_properties.getProperty("OBX_2_Observation_ObservationValue");//"10800";
		observationValueIdentifier=hl7_oru_segment_properties.getProperty("OBX_2_Observation_Value_Identifier");
		observationNameOfCodingSystem=hl7_oru_segment_properties.getProperty("OBX_2_Observation_Name_Of_CodingSystem");
		populateOBXSegment(oru, 1, valueType, observationIdentifier, observationIdentifierText,
				observationIdentifierNameOfCodeSystem, observationValue, unitIdentifier,
				abnormalFlags, observationResultStatus, dateTimeOfObservation,
				"", "", observationSubID,"", observationValueIdentifier, observationNameOfCodingSystem);

		valueType = hl7_oru_segment_properties.getProperty("OBX_3_ValueType");
		observationIdentifier =hl7_oru_segment_properties.getProperty("OBX_3_ObservationIdentifier_identifier"); // MDC_IDC Nomenclature code value
		observationIdentifierText = hl7_oru_segment_properties.getProperty("OBX_3_ObservationIdentifier_text"); // MDC_IDC Nomenclature reference id
		observationIdentifierNameOfCodeSystem = hl7_oru_segment_properties.getProperty("OBX_3_ObservationIdentifier_nameofcodingsystem");//"MDC";
		unitIdentifier =hl7_oru_segment_properties.getProperty("OBX_3_Units_identifier");//"S";// "m"; // Optional, CH07 Figure 7-6, ISO 2955-1983
		abnormalFlags =hl7_oru_segment_properties.getProperty("OBX_3_Abnormal_Flags");// "L"; // Optional, CH07 Table 0078
		observationResultStatus = hl7_oru_segment_properties.getProperty("OBX_3_Observation_Result_Status");//"F"; // CH07 HL7 Table 0085
		dateTimeOfObservation = hl7_oru_segment_properties.getProperty("OBX_3_DateTimeoftheObservation");
		observationSubID = hl7_oru_segment_properties.getProperty("OBX_3_Observation_Sub_ID");// "1";
		observationValue = hl7_oru_segment_properties.getProperty("OBX_3_Observation_ObservationValue");//"10800";
		observationValueIdentifier=hl7_oru_segment_properties.getProperty("OBX_3_Observation_Value_Identifier");
		observationNameOfCodingSystem=hl7_oru_segment_properties.getProperty("OBX_3_Observation_Name_Of_CodingSystem");
		populateOBXSegment(oru, 2, valueType, observationIdentifier, observationIdentifierText,
				observationIdentifierNameOfCodeSystem, observationValue, unitIdentifier,
				abnormalFlags, observationResultStatus, dateTimeOfObservation,
				"", "", observationSubID,"", observationValueIdentifier, observationNameOfCodingSystem);

		valueType = hl7_oru_segment_properties.getProperty("OBX_4_ValueType");
		observationIdentifier =hl7_oru_segment_properties.getProperty("OBX_4_ObservationIdentifier_identifier"); // MDC_IDC Nomenclature code value
		observationIdentifierText = hl7_oru_segment_properties.getProperty("OBX_4_ObservationIdentifier_text"); // MDC_IDC Nomenclature reference id
		observationIdentifierNameOfCodeSystem = hl7_oru_segment_properties.getProperty("OBX_4_ObservationIdentifier_nameofcodingsystem");//"MDC";
		unitIdentifier =hl7_oru_segment_properties.getProperty("OBX_4_Units_identifier");//"S";// "m"; // Optional, CH07 Figure 7-6, ISO 2955-1983
		abnormalFlags =hl7_oru_segment_properties.getProperty("OBX_4_Abnormal_Flags");// "L"; // Optional, CH07 Table 0078
		observationResultStatus = hl7_oru_segment_properties.getProperty("OBX_4_Observation_Result_Status");//"F"; // CH07 HL7 Table 0085
		dateTimeOfObservation = hl7_oru_segment_properties.getProperty("OBX_4_DateTimeoftheObservation");
		observationSubID = hl7_oru_segment_properties.getProperty("OBX_4_Observation_Sub_ID");// "1";
		observationValue = hl7_oru_segment_properties.getProperty("OBX_4_Observation_ObservationValue");//"10800";
		observationValueIdentifier=hl7_oru_segment_properties.getProperty("OBX_4_Observation_Value_Identifier");
		observationNameOfCodingSystem=hl7_oru_segment_properties.getProperty("OBX_4_Observation_Name_Of_CodingSystem");
		populateOBXSegment(oru, 3, valueType, observationIdentifier, observationIdentifierText,
				observationIdentifierNameOfCodeSystem, observationValue, unitIdentifier,
				abnormalFlags, observationResultStatus, dateTimeOfObservation,
				"", "", observationSubID,"", observationValueIdentifier, observationNameOfCodingSystem);

		valueType = hl7_oru_segment_properties.getProperty("OBX_5_ValueType");
		observationIdentifier =hl7_oru_segment_properties.getProperty("OBX_5_ObservationIdentifier_identifier"); // MDC_IDC Nomenclature code value
		observationIdentifierText = hl7_oru_segment_properties.getProperty("OBX_5_ObservationIdentifier_text"); // MDC_IDC Nomenclature reference id
		observationIdentifierNameOfCodeSystem = hl7_oru_segment_properties.getProperty("OBX_5_ObservationIdentifier_nameofcodingsystem");//"MDC";
		unitIdentifier =hl7_oru_segment_properties.getProperty("OBX_5_Units_identifier");//"S";// "m"; // Optional, CH07 Figure 7-6, ISO 2955-1983
		abnormalFlags =hl7_oru_segment_properties.getProperty("OBX_5_Abnormal_Flags");// "L"; // Optional, CH07 Table 0078
		observationResultStatus = hl7_oru_segment_properties.getProperty("OBX_5_Observation_Result_Status");//"F"; // CH07 HL7 Table 0085
		dateTimeOfObservation = hl7_oru_segment_properties.getProperty("OBX_5_DateTimeoftheObservation");
		observationSubID = hl7_oru_segment_properties.getProperty("OBX_5_Observation_Sub_ID");// "1";
		observationValue = hl7_oru_segment_properties.getProperty("OBX_5_Observation_ObservationValue");//"10800";
		observationValueIdentifier=hl7_oru_segment_properties.getProperty("OBX_5_Observation_Value_Identifier");
		observationNameOfCodingSystem=hl7_oru_segment_properties.getProperty("OBX_5_Observation_Name_Of_CodingSystem");
		populateOBXSegment(oru, 4, valueType, observationIdentifier, observationIdentifierText,
				observationIdentifierNameOfCodeSystem, observationValue, unitIdentifier,
				abnormalFlags, observationResultStatus, dateTimeOfObservation,
				"", "", observationSubID,"", observationValueIdentifier, observationNameOfCodingSystem);

		valueType = hl7_oru_segment_properties.getProperty("OBX_6_ValueType");
		observationIdentifier =hl7_oru_segment_properties.getProperty("OBX_6_ObservationIdentifier_identifier"); // MDC_IDC Nomenclature code value
		observationIdentifierText = hl7_oru_segment_properties.getProperty("OBX_6_ObservationIdentifier_text"); // MDC_IDC Nomenclature reference id
		observationIdentifierNameOfCodeSystem = hl7_oru_segment_properties.getProperty("OBX_6_ObservationIdentifier_nameofcodingsystem");//"MDC";
		unitIdentifier =hl7_oru_segment_properties.getProperty("OBX_6_Units_identifier");//"S";// "m"; // Optional, CH07 Figure 7-6, ISO 2955-1983
		abnormalFlags =hl7_oru_segment_properties.getProperty("OBX_6_Abnormal_Flags");// "L"; // Optional, CH07 Table 0078
		observationResultStatus = hl7_oru_segment_properties.getProperty("OBX_6_Observation_Result_Status");//"F"; // CH07 HL7 Table 0085
		dateTimeOfObservation = hl7_oru_segment_properties.getProperty("OBX_6_DateTimeoftheObservation");
		observationSubID = hl7_oru_segment_properties.getProperty("OBX_6_Observation_Sub_ID");// "1";
		observationValue = hl7_oru_segment_properties.getProperty("OBX_6_Observation_ObservationValue");//"10800";
		observationValueIdentifier=hl7_oru_segment_properties.getProperty("OBX_6_Observation_Value_Identifier");
		observationNameOfCodingSystem=hl7_oru_segment_properties.getProperty("OBX_6_Observation_Name_Of_CodingSystem");

		populateOBXSegment(oru, 5, valueType, observationIdentifier, observationIdentifierText,
				observationIdentifierNameOfCodeSystem, observationValue, unitIdentifier,
				abnormalFlags, observationResultStatus, dateTimeOfObservation,
				"", "", observationSubID,"", observationValueIdentifier, observationNameOfCodingSystem);

		valueType = hl7_oru_segment_properties.getProperty("OBX_7_ValueType");
		observationIdentifier =hl7_oru_segment_properties.getProperty("OBX_7_ObservationIdentifier_identifier"); // MDC_IDC Nomenclature code value
		observationIdentifierText = hl7_oru_segment_properties.getProperty("OBX_7_ObservationIdentifier_text"); // MDC_IDC Nomenclature reference id
		observationIdentifierNameOfCodeSystem = hl7_oru_segment_properties.getProperty("OBX_7_ObservationIdentifier_nameofcodingsystem");//"MDC";
		unitIdentifier =hl7_oru_segment_properties.getProperty("OBX_7_Units_identifier");//"S";// "m"; // Optional, CH07 Figure 7-6, ISO 2955-1983
		abnormalFlags =hl7_oru_segment_properties.getProperty("OBX_7_Abnormal_Flags");// "L"; // Optional, CH07 Table 0078
		observationResultStatus = hl7_oru_segment_properties.getProperty("OBX_7_Observation_Result_Status");//"F"; // CH07 HL7 Table 0085
		dateTimeOfObservation = hl7_oru_segment_properties.getProperty("OBX_7_DateTimeoftheObservation");
		observationSubID = hl7_oru_segment_properties.getProperty("OBX_7_Observation_Sub_ID");// "1";
		observationValue = hl7_oru_segment_properties.getProperty("OBX_7_Observation_ObservationValue");//"10800";
		observationValueIdentifier=hl7_oru_segment_properties.getProperty("OBX_7_Observation_Value_Identifier");
		observationNameOfCodingSystem=hl7_oru_segment_properties.getProperty("OBX_7_Observation_Name_Of_CodingSystem");
		populateOBXSegment(oru, 6, valueType, observationIdentifier, observationIdentifierText,
				observationIdentifierNameOfCodeSystem, observationValue, unitIdentifier,
				abnormalFlags, observationResultStatus, dateTimeOfObservation,
				"", "", observationSubID,"", observationValueIdentifier, observationNameOfCodingSystem);

		valueType = hl7_oru_segment_properties.getProperty("OBX_8_ValueType");
		observationIdentifier =hl7_oru_segment_properties.getProperty("OBX_8_ObservationIdentifier_identifier"); // MDC_IDC Nomenclature code value
		observationIdentifierText = hl7_oru_segment_properties.getProperty("OBX_8_ObservationIdentifier_text"); // MDC_IDC Nomenclature reference id
		observationIdentifierNameOfCodeSystem = hl7_oru_segment_properties.getProperty("OBX_8_ObservationIdentifier_nameofcodingsystem");//"MDC";
		unitIdentifier =hl7_oru_segment_properties.getProperty("OBX_8_Units_identifier");//"S";// "m"; // Optional, CH07 Figure 7-6, ISO 2955-1983
		abnormalFlags =hl7_oru_segment_properties.getProperty("OBX_8_Abnormal_Flags");// "L"; // Optional, CH07 Table 0078
		observationResultStatus = hl7_oru_segment_properties.getProperty("OBX_8_Observation_Result_Status");//"F"; // CH07 HL7 Table 0085
		dateTimeOfObservation = hl7_oru_segment_properties.getProperty("OBX_8_DateTimeoftheObservation");
		observationSubID = hl7_oru_segment_properties.getProperty("OBX_8_Observation_Sub_ID");// "1";
		observationValue = hl7_oru_segment_properties.getProperty("OBX_8_Observation_ObservationValue");//"10800";
		observationValueIdentifier=hl7_oru_segment_properties.getProperty("OBX_8_Observation_Value_Identifier");
		observationNameOfCodingSystem=hl7_oru_segment_properties.getProperty("OBX_8_Observation_Name_Of_CodingSystem");
		populateOBXSegment(oru, 7, valueType, observationIdentifier, observationIdentifierText,
				observationIdentifierNameOfCodeSystem, observationValue, unitIdentifier,
				abnormalFlags, observationResultStatus, dateTimeOfObservation,
				"", "", observationSubID,"", observationValueIdentifier, observationNameOfCodingSystem);

		valueType = hl7_oru_segment_properties.getProperty("OBX_9_ValueType");
		observationIdentifier =hl7_oru_segment_properties.getProperty("OBX_9_ObservationIdentifier_identifier"); // MDC_IDC Nomenclature code value
		observationIdentifierText = hl7_oru_segment_properties.getProperty("OBX_9_ObservationIdentifier_text"); // MDC_IDC Nomenclature reference id
		observationIdentifierNameOfCodeSystem = hl7_oru_segment_properties.getProperty("OBX_9_ObservationIdentifier_nameofcodingsystem");//"MDC";
		unitIdentifier =hl7_oru_segment_properties.getProperty("OBX_9_Units_identifier");//"S";// "m"; // Optional, CH07 Figure 7-6, ISO 2955-1983
		abnormalFlags =hl7_oru_segment_properties.getProperty("OBX_9_Abnormal_Flags");// "L"; // Optional, CH07 Table 0078
		observationResultStatus = hl7_oru_segment_properties.getProperty("OBX_9_Observation_Result_Status");//"F"; // CH07 HL7 Table 0085
		dateTimeOfObservation = hl7_oru_segment_properties.getProperty("OBX_9_DateTimeoftheObservation");
		observationSubID = hl7_oru_segment_properties.getProperty("OBX_9_Observation_Sub_ID");// "1";
		observationValue = hl7_oru_segment_properties.getProperty("OBX_9_Observation_ObservationValue");//"10800";
		observationValueIdentifier=hl7_oru_segment_properties.getProperty("OBX_9_Observation_Value_Identifier");
		observationNameOfCodingSystem=hl7_oru_segment_properties.getProperty("OBX_9_Observation_Name_Of_CodingSystem");
		populateOBXSegment(oru, 8, valueType, observationIdentifier, observationIdentifierText,
				observationIdentifierNameOfCodeSystem, observationValue, unitIdentifier,
				abnormalFlags, observationResultStatus, dateTimeOfObservation,
				"", "", observationSubID,"", observationValueIdentifier, observationNameOfCodingSystem);

		valueType = hl7_oru_segment_properties.getProperty("OBX_10_ValueType");
		observationIdentifier =hl7_oru_segment_properties.getProperty("OBX_10_ObservationIdentifier_identifier"); // MDC_IDC Nomenclature code value
		observationIdentifierText = hl7_oru_segment_properties.getProperty("OBX_10_ObservationIdentifier_text"); // MDC_IDC Nomenclature reference id
		observationIdentifierNameOfCodeSystem = hl7_oru_segment_properties.getProperty("OBX_10_ObservationIdentifier_nameofcodingsystem");//"MDC";
		unitIdentifier =hl7_oru_segment_properties.getProperty("OBX_10_Units_identifier");//"S";// "m"; // Optional, CH07 Figure 7-6, ISO 2955-1983
		abnormalFlags =hl7_oru_segment_properties.getProperty("OBX_10_Abnormal_Flags");// "L"; // Optional, CH07 Table 0078
		observationResultStatus = hl7_oru_segment_properties.getProperty("OBX_10_Observation_Result_Status");//"F"; // CH07 HL7 Table 0085
		dateTimeOfObservation = hl7_oru_segment_properties.getProperty("OBX_10_DateTimeoftheObservation");
		observationSubID = hl7_oru_segment_properties.getProperty("OBX_10_Observation_Sub_ID");// "1";
		observationValue = hl7_oru_segment_properties.getProperty("OBX_10_Observation_ObservationValue");//"10800";
		observationValueIdentifier=hl7_oru_segment_properties.getProperty("OBX_10_Observation_Value_Identifier");
		observationNameOfCodingSystem=hl7_oru_segment_properties.getProperty("OBX_10_Observation_Name_Of_CodingSystem");
		populateOBXSegment(oru, 9, valueType, observationIdentifier, observationIdentifierText,
				observationIdentifierNameOfCodeSystem, observationValue, unitIdentifier,
				abnormalFlags, observationResultStatus, dateTimeOfObservation,
				"", "", observationSubID,"", observationValueIdentifier, observationNameOfCodingSystem);

		//////////////EGM in base64 PDF/////////////////
		valueType = "ED";
		String fileName = hl7_oru_segment_properties.getProperty("OBX_PDF_01_EGM_Filename");
		observationResultStatus = hl7_oru_segment_properties.getProperty("OBX_PDF_01_EGM_Observation_Result_Status");//"F"; // CH07 HL7 Table 0085
		dateTimeOfObservation = hl7_oru_segment_properties.getProperty("OBX_PDF_01_EGM_DateTimeoftheObservation");
		populateOBXSegment(oru, 10, valueType, "", "", "", "", "", "", observationResultStatus, dateTimeOfObservation,
				"", "", "", fileName, "", "");
		////////////////////////////////////////////////

		String comment = "Comment";
		populateNTESegment(oru, comment);

		return oru;
	}

	private void populateNTESegment(ORU_R01 oru, String comment) throws HL7Exception {
		NTE nteSegment = oru.getPATIENT_RESULT().getORDER_OBSERVATION().getNTE();
		nteSegment.getSetIDNTE().setValue("1");
		nteSegment.getSourceOfComment().setValue("L");
		nteSegment.getComment(0).setValue(comment);
	}

	private void populateOBXSegment(ORU_R01 oru, int obxNumber, String valueType, String observationIdentifier,
			String observationIdentifierText, String observationIdentifierNameOfCodeSystem, String observationValue,
			String unitIdentifier, String abnormalFlags, String observationResultStatus, String dateTimeOfObservation,
			String observationMethodIdentifier, String observationMethodText, String observationSubID, String fileName,
			String observationValueIdentifier, String observationNameOfCodingSystem) throws DataTypeException, HL7Exception, MessagingException, IOException, Exception {
		int setID = obxNumber + 1;

		if (valueType.equals("ED")) {
			observationIdentifier = "18750-0"; // FIX
			observationIdentifierText = "Cardiac Electrophysiology Report"; // FIX
			observationIdentifierNameOfCodeSystem = "LN"; // FIX

			unitIdentifier = "";
			abnormalFlags = "";
			observationMethodIdentifier = "";
			observationMethodText = "";
			observationSubID = "";
		}

		ORU_R01_ORDER_OBSERVATION orderObservation = oru.getPATIENT_RESULT().getORDER_OBSERVATION();
		OBX obx = orderObservation.getOBSERVATION(obxNumber).getOBX();
		obx.getSetIDOBX().setValue("" + setID);
		obx.getValueType().setValue(valueType);
		obx.getObservationSubID().setValue(observationSubID);
		obx.getUnits().getIdentifier().setValue(unitIdentifier);
		obx.getAbnormalFlags(0).setValue(abnormalFlags);
		obx.getObservationResultStatus().setValue(observationResultStatus);
		obx.getDateTimeOfTheObservation().getTime().setValue(dateTimeOfObservation);
		obx.getObservationMethod(0).getIdentifier().setValue(observationMethodIdentifier);
		obx.getObservationMethod(0).getText().setValue(observationMethodText);

		//obx.getObservationIdentifier().getIdentifier().setValue(observationIdentifier);
		//obx.getObservationIdentifier().getNameOfCodingSystem().setValue(observationIdentifierNameOfCodeSystem);
		//obx.getObservationIdentifier().getText().setValue(observationIdentifierText);

		obx.getObservationIdentifier().getCe1_Identifier().setValue(observationIdentifier);
		obx.getObservationIdentifier().getCe3_NameOfCodingSystem().setValue(observationIdentifierNameOfCodeSystem);
		obx.getObservationIdentifier().getCe2_Text().setValue(observationIdentifierText);

		obx.getObservationIdentifier().getCe4_AlternateIdentifier().setValue("");
		obx.getObservationIdentifier().getCe5_AlternateText().setValue(fileName);

		if (valueType.equals("ED")) {
			// set the value of ED with the String
			ED encapsuledData = new ED(oru);

			//encapsuledData.getEd1_SourceApplication().getNamespaceID().setValue("Application");
			//encapsuledData.getEd2_TypeOfData().setValue("PDF");
			//encapsuledData.getEd4_Encoding().setValue("Base64");
			encapsuledData.getSourceApplication().getHd1_NamespaceID().setValue("Application");
			encapsuledData.getTypeOfData().setValue("PDF");//("Application");
			encapsuledData.getEncoding().setValue("Base64");

			/*MimeMultipart mimeMessage = new MimeMultipart();
			  MimeBodyPart bodyPart = new MimeBodyPart();

			  FileDataSource fds = new FileDataSource(fileName);
			  bodyPart.setDataHandler(new DataHandler(fds));
			  bodyPart.setHeader("MIME-Version", "1.0");
			  bodyPart.setHeader("Content-Type", "application/pdf");
			  bodyPart.setHeader("Content-Transfer-Encoding", "base64");
			  mimeMessage.addBodyPart(bodyPart);

			  ByteArrayOutputStream byte1 = new ByteArrayOutputStream();
			  mimeMessage.writeTo(byte1);
			  encapsuledData.getData().setValue(byte1.toString());*/
			//String File_Path="C:\\Test\\";
			String File_Type=".pdf";
			File file = new File(properties_path+sjm_pdf_path+fileName+File_Type);
			FileInputStream fin = new FileInputStream(file);
			byte fileContent[] = new byte[(int) file.length()];
			fin.read(fileContent);
			fin.close();

			encapsuledData.getData().setValue(new String(encode(fileContent)));
			obx.getObservationValue(0).setData(encapsuledData);
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
			cwe.getCwe3_NameOfCodingSystem().setValue(observationNameOfCodingSystem);
			Varies value = obx.getObservationValue(0);
			value.setData(cwe);
			//obx.getObservationValue(0).setData(cwe);
			//CWE cwe = new CWE(oru);
			//cwe.
			//cwe.setValue(observationValue);
			//Varies value = obx.getObservationValue(0);
			//value.setData(cwe);

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

	private void populateOBRSegment(ORU_R01 oru, String fillerOrderNumber, String universalServiceIdentifer_Identifier,String universalServiceIdentifer_Text,
			String observationDateTime, String observationEndDateTime,
			String resultRptStatusChangeDateTime, String resultStatus) throws DataTypeException, HL7Exception {
		ORU_R01_ORDER_OBSERVATION orderObservation = oru.getPATIENT_RESULT().getORDER_OBSERVATION();
		OBR obr = orderObservation.getOBR();
		obr.getSetIDOBR().setValue("1");
		obr.getFillerOrderNumber().getEntityIdentifier().setValue(fillerOrderNumber);
		//obr.getUniversalServiceIdentifier().getIdentifier().setValue(universalServiceIdentifer);
		obr.getObservationDateTime().getTime().setValue(observationDateTime);
		obr.getObservationEndDateTime().getTime().setValue(observationEndDateTime);
		obr.getResultsRptStatusChngDateTime().getTime().setValue(resultRptStatusChangeDateTime);
		obr.getResultStatus().setValue(resultStatus);

		obr.getObr4_UniversalServiceIdentifier().getCe1_Identifier().setValue(universalServiceIdentifer_Identifier);
		obr.getObr4_UniversalServiceIdentifier().getCe2_Text().setValue(universalServiceIdentifer_Text);
	}

	private void populatePV1Segment(ORU_R01 oru, String patientClass, String visitID, String attendingDoctorID) throws DataTypeException, HL7Exception {
		PV1 pv1Segment = oru.getPATIENT_RESULT().getPATIENT().getVISIT().getPV1();
		pv1Segment.getSetIDPV1().setValue("1");
		pv1Segment.getPatientClass().setValue(patientClass);
		pv1Segment.getAttendingDoctor(0).getIDNumber().setValue(attendingDoctorID);
		pv1Segment.getVisitNumber().getIDNumber().setValue(visitID);
	}

	private void populatePIDSegment(ORU_R01 oru, String idNumber, String assigningAuthority,
			String patientIdentifierTypeCode, String idNumber2, String assigningAuthority2,
			String patientIdentifierTypeCode2, String givenName, String familyName, String secondName,
			String dateTimeOfBirth, String administrativeSex, String street,
			String city, String postalCode, String country) throws DataTypeException, HL7Exception {
		PID pidSegment = oru.getPATIENT_RESULT().getPATIENT().getPID();

		//pidSegment.getPatientID().getIDNumber().setValue(patientID);
		//pidSegment.getPatientID().getAssigningAuthority().getNamespaceID().setValue(assigningAuthority);
		//pidSegment.getPatientID().getIdentifierTypeCode().setValue(identifierTypeCode);
		pidSegment.getPatientIdentifierList(0).getIDNumber().setValue(idNumber);
		pidSegment.getPatientIdentifierList(0).getAssigningAuthority().getNamespaceID().setValue(assigningAuthority);
		pidSegment.getPatientIdentifierList(0).getIdentifierTypeCode().setValue(patientIdentifierTypeCode);
		pidSegment.getPatientIdentifierList(1).getIDNumber().setValue(idNumber2);
		pidSegment.getPatientIdentifierList(1).getAssigningAuthority().getNamespaceID().setValue(assigningAuthority2);
		pidSegment.getPatientIdentifierList(1).getIdentifierTypeCode().setValue(patientIdentifierTypeCode2);

		pidSegment.getPatientName(0).getGivenName().setValue(givenName);
		pidSegment.getPatientName(0).getFamilyName().getSurname().setValue(familyName);
		pidSegment.getPatientName(0).getSecondAndFurtherGivenNamesOrInitialsThereof().setValue(secondName);

		pidSegment.getDateTimeOfBirth().getTime().setValue(dateTimeOfBirth);
		pidSegment.getAdministrativeSex().setValue(administrativeSex);
		pidSegment.getPatientAddress(0).getStreetAddress().getStreetName().setValue(street);
		pidSegment.getPatientAddress(0).getCity().setValue(city);

		pidSegment.getPatientAddress(0).getZipOrPostalCode().setValue(postalCode);
		pidSegment.getPatientAddress(0).getCountry().setValue(country);

	}

	private void populateMSHSegment(ORU_R01 oru, String sendingApplication, String sendingFacility,
			String receivingApplication, String receivingFacility) throws DataTypeException {
		MSH mshSegment = oru.getMSH();

		mshSegment.getSendingApplication().getNamespaceID().setValue(sendingApplication);
		mshSegment.getSendingFacility().getNamespaceID().setValue(sendingFacility);
		mshSegment.getReceivingApplication().getNamespaceID().setValue(receivingApplication);
		mshSegment.getReceivingFacility().getNamespaceID().setValue(receivingFacility);

		mshSegment.getFieldSeparator().setValue("|");
		mshSegment.getEncodingCharacters().setValue("^~\\&");

		DateFormat dateFormat = new SimpleDateFormat("yyyyMMddHHmmss");
		Date date = new Date();
		mshSegment.getDateTimeOfMessage().getTime().setValue(dateFormat.format(date));
		mshSegment.getMessageType().getMessageCode().setValue("ORU");
		mshSegment.getMessageType().getTriggerEvent().setValue("R01");
		mshSegment.getMessageType().getMessageStructure().setValue("ORU_R01");
		mshSegment.getMessageControlID().setValue("");
		mshSegment.getProcessingID().getProcessingID().setValue("P");
		mshSegment.getVersionID().getVersionID().setValue(hl7_oru_segment_properties.getProperty("MSH_VersionID"));
		mshSegment.getMessageControlID().setValue(hl7_oru_segment_properties.getProperty("MSH_MessageControlID"));
	}

	private static String convertToDelimitedString(Message message) throws HL7Exception, IOException {
		Parser parser = new PipeParser();

		String ackMessageInHL7 = parser.encode(message);
		//System.out.println(ackMessageInHL7);
		   PrintWriter pw = new PrintWriter( new FileWriter("HL7_ORU.hl7" ) );
		   pw.print(ackMessageInHL7);
		   pw.close();

		return parser.encode(message);
	}

	private static String convertToXMLString(Message message) throws HL7Exception, IOException {
		XMLParser xmlParser = new DefaultXMLParser();

		String ackMessageInXML = xmlParser.encode(message);
		//System.out.println(ackMessageInXML);
		   PrintWriter pw = new PrintWriter( new FileWriter("HL7_ORU.xml" ) );
		   pw.print(ackMessageInXML);
		   pw.close();

		return xmlParser.encode(message);
	}

	private void send(Message oru, boolean inXML) throws HL7Exception, LLPException, IOException {
		ConnectionHub connectionHub = ConnectionHub.getInstance();
		Connection connection = null;
		if (inXML) {
			connection = connectionHub.attach(host, port, new DefaultXMLParser(), MinLowerLayerProtocol.class);
		} else {
			connection = connectionHub.attach(host, port, new PipeParser(), MinLowerLayerProtocol.class);
		}
		
		// The initiator is used to transmit unsolicited messages
		Initiator initiator = connection.getInitiator();
		initiator.setTimeoutMillis(100000);
		Message response = initiator.sendAndReceive(oru);
		String responseString = "";
		if (inXML) {
			responseString = (new DefaultXMLParser()).encode(response);
		} else {
			responseString = (new PipeParser()).encode(response);
		}
		logger.info("Received response:\n" + responseString);
		
		connection.close();
	}
	
	public static void main(String argv[]) {
		String ip_offis="134.106.52.156";
		String ip_srdc="195.142.27.185";
		String ip_local="192.168.0.4";
		
		ObservationCreator observationCreator = new ObservationCreator(ip_local, 8080);  //Port Maohua Yang
		//observationCreator.run(false, "C:/Test/Medtronic/iCARDEAhl7message.txt"); // use available HL7 example
		observationCreator.run(false,null);  //generate HL7_ORU.hl7
		observationCreator.run(true,null);   //generate HL7_ORU.xml
	}
}