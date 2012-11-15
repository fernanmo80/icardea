/**
 * 
 */
package de.offis.health.icardea.ppm;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileReader;
import java.io.IOException;
import java.io.InputStreamReader;

import org.apache.log4j.Logger;


import ca.uhn.hl7v2.HL7Exception;
import ca.uhn.hl7v2.app.Application;
import ca.uhn.hl7v2.app.ApplicationException;
import ca.uhn.hl7v2.app.SimpleServer;
import ca.uhn.hl7v2.llp.LowerLayerProtocol;
import ca.uhn.hl7v2.model.Message;
import ca.uhn.hl7v2.model.v25.datatype.CE;
import ca.uhn.hl7v2.model.v25.datatype.CWE;
import ca.uhn.hl7v2.model.v25.datatype.DTM;
import ca.uhn.hl7v2.model.v25.datatype.ED;
import ca.uhn.hl7v2.model.v25.datatype.NM;
import ca.uhn.hl7v2.model.v25.datatype.SN;
import ca.uhn.hl7v2.model.v25.datatype.ST;
import ca.uhn.hl7v2.model.v25.datatype.TX;
import ca.uhn.hl7v2.model.v25.group.ORU_R01_ORDER_OBSERVATION;
import ca.uhn.hl7v2.model.v25.group.ORU_R01_PATIENT;
import ca.uhn.hl7v2.model.v25.message.ORU_R01;
import ca.uhn.hl7v2.model.v25.segment.OBX;
import ca.uhn.hl7v2.parser.EncodingNotSupportedException;
import ca.uhn.hl7v2.parser.GenericParser;
import ca.uhn.hl7v2.parser.Parser;
import ca.uhn.hl7v2.parser.PipeParser;
//import de.offis.health.icardea.tools.GlobalTools;
/**
 * This Class is a Demonstration HL7 Message receiver to handle  
 * 
 * @author thiel
 *
 */
public class HL7ReceiverApplication implements Application {

	private Parser parser=null;
	private static boolean keepAlive=true;
	private static boolean directtesting=true;
	private static Logger logger = Logger.getLogger(HL7ReceiverApplication.class);

	private PPMDataset ppmDataset=null;


	/**
	 * Default constructor assuming using Pipe Parsing HL7 Messages
	 */
	public HL7ReceiverApplication(){
		//		super();

		this(new PipeParser());
		//		logger.debug("Create PipeParsing App");
	}

	/**
	 * Default constructor assuming adding own Parser (e.g. XML) 
	 */
	public HL7ReceiverApplication(Parser inParser){
		//		super();
		parser=inParser;
		if (!init()){
			logger.fatal("Can not init Receiver APP");
			//	throw 
		}

		//		logger.info("Receiver Parsing App:"+inParser.getClass()+" Encoding:"+ inParser.getDefaultEncoding());
	}

	public boolean init() {
		ppmDataset=PPMDataset.getInstance();
		if (ppmDataset== null) return false;
		return true;

	}

	/* (non-Javadoc)
	 * @see ca.uhn.hl7v2.app.Application#canProcess(ca.uhn.hl7v2.model.Message)
	 */
	public boolean canProcess(Message arg0) {
		//  TODO Check message parser compliance
		logger.debug("Can Process Message?\n"+arg0);

		return true;
	}


	/* (non-Javadoc)
	 * @see ca.uhn.hl7v2.app.Application#processMessage(ca.uhn.hl7v2.model.Message)
	 */
	public Message processMessage(Message arg0) throws ApplicationException,
	HL7Exception {
		boolean retValue = true;
		Message retMessage;
		logger.trace("processing Message:\n"+arg0);

		try {
			retValue=useMessage(arg0);
		} catch (IOException e1) {

			logger.error(e1);
			retValue=false;
		} 

		logger.debug("Create ACK Message");
		try {
			if (retValue) {			
				retMessage=arg0.generateACK();
				logger.trace("Return ACK Message:\n"+retMessage);
			}else {
				//TODO HL7 conform error handling
				retMessage=arg0.generateACK("AE",new HL7Exception("Message processing failed"));
				logger.warn("Return ACK Message:\n"+retMessage);
			}

			return( retMessage); //(ACK) DefaultApplication.makeACK((MSH)arg0.get("MSH"));
		} catch (IOException e) {
			logger.fatal("IOException:"+e.getMessage());
			throw new HL7Exception(e);
		}

	}


	public boolean useMessage(Message in) throws HL7Exception, IOException {

		String currentOBXIdentifier=null;
		//take from observationProcessor  code SRDC
		logger.trace("Now we can use Message:\n"+in);
		//FIXME different HL7 version 2.5 2.6 etc.
		ORU_R01 oru = (ORU_R01) in;
		ORU_R01_PATIENT pat= oru.getPATIENT_RESULT().getPATIENT();

		String serialnumber=pat.getPID().getPatientIdentifierList(0).getCx1_IDNumber().getValue();
		//FIXME CHeck if it is from MDT
		//		String serialnumber
		ORU_R01_ORDER_OBSERVATION orderObservation = oru.getPATIENT_RESULT().getORDER_OBSERVATION();
		//		String orderDateTime= orderObservation.getOBR().getObr6_RequestedDateTime().encode();
		String orderDateTimeStart= orderObservation.getOBR().getObr7_ObservationDateTime().encode();
		if (orderDateTimeStart==null ) {
			orderDateTimeStart="190001011212"; //FIXME date time aus MSH header, or current date? OR obr9
		}
		if (orderDateTimeStart.length()<8){
			orderDateTimeStart="190001011212"; //FIXME date time aus MSH header, or current date?

		}
		String orderDateTimeEnd= orderObservation.getOBR().getObr8_ObservationEndDateTime().encode();
		if (orderDateTimeEnd==null ) orderDateTimeEnd="299912121212";
		if (orderDateTimeEnd.length()<8)  orderDateTimeEnd="299912121212";


		logger.debug("Order DTM:"+orderDateTimeStart);
		int numberOfOBX = orderObservation.getOBSERVATIONReps();
		logger.debug(" Number of OBX:"+ numberOfOBX);
		String extented="UNKOWN";
		String currentSUBID="";
		boolean isInsub=false;
		for (int i = 0; i < numberOfOBX; i++) {
			logger.debug("Processing OBX Segment " + (i + 1));
			OBX obx = orderObservation.getOBSERVATION(i).getOBX();
			String valueType = obx.getValueType().getValue();
			String observationResultStatus = obx.getObservationResultStatus().getValue(); // CH07 HL7 Table 0085
			String dateTimeOfObservation = obx.getDateTimeOfTheObservation().getTime().getValue();
			logger.debug("OBX Type:"+valueType +" OBS Result:"+observationResultStatus+ " ObsDTM:"+dateTimeOfObservation);

			//			if (obx.getObservationMethod(0) != null && obx.getObservationMethod(0).getIdentifier() != null) {
			//				String observationMethodIdentifier = obx.getObservationMethod(0).getIdentifier().getValue(); //OPTIONAL, Table 4.12-10, a general time interval for which a given aggregate term was calculated
			//			}
			//			if (obx.getObservationMethod(0) != null && obx.getObservationMethod(0).getText() != null) {
			//				String observationMethodText = obx.getObservationMethod(0).getText().getValue(); // OPTIONAL, Table 4.12-10
			//			}
			//			if (obx.getUnits() != null && obx.getUnits().getIdentifier() != null) {
			//				String unitIdentifier = obx.getUnits().getIdentifier().getValue(); // Optional, CH07 Figure 7-6, ISO 2955-1983
			//			}

			//			if (obx.getAbnormalFlags(0) != null) {
			//				String abnormalFlags = obx.getAbnormalFlags(0).getValue(); // OPTIONAL, Table 3.Y.4.1.2-10
			//				observation.setAbnormalFlags(abnormalFlags);
			//			}
			//			if (obx.getEquipmentInstanceIdentifier(0) != null && obx.getEquipmentInstanceIdentifier(0).getEntityIdentifier() != null) {
			//				String equipmentInstanceIdentifier = obx.getEquipmentInstanceIdentifier(0).getEntityIdentifier().getValue();
			//				observation.setEquipmentInstanceIdentifier(equipmentInstanceIdentifier);
			//			}

			String observationValue = "";
			String observationValueIdentifier = "";
			String observationNameOfCodingSystem = "";

			String observationIdentifier = obx.getObservationIdentifier().encode(); // MDC_IDC Nomenclature code value

			observationIdentifier = obx.getObservationIdentifier().getCe1_Identifier()+"^"
					+obx.getObservationIdentifier().getCe2_Text()+"^"
					+obx.getObservationIdentifier().getCe3_NameOfCodingSystem();
			currentOBXIdentifier=obx.getObservationIdentifier().getCe1_Identifier().toString();
			//			if (obx.getObservationIdentifier().getText() != null) {
			//				String observationIdentifierText = obx.getObservationIdentifier().getText().getValue(); // OPTIONAL, MDC_IDC Nomenclature reference id
			//			}
			String observationIdentifierNameOfCodeSystem = obx.getObservationIdentifier().getNameOfCodingSystem().getValue(); // Has value "MDC_IDC"

			String observationSubID = null;
			if (obx.getObservationSubID() != null) {
				observationSubID = obx.getObservationSubID().getValue(); // OPTIONAL, Used for Complex Data Type Observations
			}
			//added to the obervation identifier a sub identifierfor:
			//737952^MDC_IDC_STAT_EPISODE_TYPE^MDC use obx.6.2
			// 731648^MDC_IDC_SET_ZONE_TYPE^MDC (??) use obx.6.2 eg 731648^MDC_IDC_SET_ZONE_TYPE^MDC^FVT
//			logger.info("Current obser ID:"+currentOBXIdentifier+" equal 739568:"+currentOBXIdentifier.equals("739568"));
			
			
			if (currentOBXIdentifier.equals("737952")|currentOBXIdentifier.equals("731648")){
				extented=((CWE)obx.getObservationValue(0).getData()).getCwe2_Text().encode();
				logger.debug("!!!!!!!!!!!!!!!!!!!!Extendet Identifier:"+extented+" subid:"+observationSubID);
				currentSUBID=observationSubID;
				isInsub=true;

			}
//			OBX|65|TX|739536^MDC_IDC_EPISODE_ID^MDC|1|104||||||F 
//			search for
//			OBX|66|CWE|739568^MDC_IDC_EPISODE_TYPE^MDC|1|Epis_VT-NS^VT-NS||||||F

			if (currentOBXIdentifier.equals("739536")){
				int j;
				String epi_id= ((TX)obx.getObservationValue(0).getData()).getValue().toString();
				if (observationSubID!=null){
					OBX obx1=null;
					for ( j=i+1;j<numberOfOBX;j++){
						obx1 = orderObservation.getOBSERVATION(j).getOBX();
						logger.debug("Loop:"+j+" ibid:"+observationSubID +":subid:"+obx1.getObservationSubID()+":obx:"+obx1.getObservationIdentifier().getCe1_Identifier());
						if (obx1.getObservationSubID().toString().equals(observationSubID)){
							if (obx1.getObservationIdentifier().getCe1_Identifier().encode().toString().equals("739568")){
								extented=((CWE)obx1.getObservationValue(0).getData()).getCwe2_Text().encode()+" #"+epi_id;
								logger.debug(" Identifier:"+observationIdentifier);
								currentSUBID=observationSubID;
								isInsub=true;
								break;
							}
						}else{
							extented="";
							break; //other OBX
						}
					}
				}
				logger.debug("####Extendet Location Identifier:"+observationIdentifier+" subid:"+observationSubID+" ext: "+extented);

			}


			//720961^MDC_IDC_LEAD_MODEL^MDC search for 720966^MDC_IDC_LEAD_LOCATION^MDC use that obx.6.2 like Atrial 
			if (currentOBXIdentifier.equals("720961")){
				int j;
				if (observationSubID!=null){
					OBX obx1=null;
					for ( j=i+1;j<numberOfOBX;j++){
						obx1 = orderObservation.getOBSERVATION(j).getOBX();
						logger.debug("Loop:"+j+" ibid:"+observationSubID +":subid:"+obx1.getObservationSubID()+":obx:"+obx1.getObservationIdentifier().getCe1_Identifier());
						if (obx1.getObservationSubID().toString().equals(observationSubID)){
							if (obx1.getObservationIdentifier().getCe1_Identifier().encode().toString().equals("720966")){
								extented=((CWE)obx1.getObservationValue(0).getData()).getCwe2_Text().encode();
								logger.debug("LOCATION Identifier:"+observationIdentifier);
								currentSUBID=observationSubID;
								isInsub=true;
								break;
							}
						}else{
							extented="";
							break; //other OBX
						}
					}
				}
				logger.debug("####Extendet Location Identifier:"+observationIdentifier+" subid:"+observationSubID+" ext: "+extented);

			}
			if (isInsub ){
				if (currentSUBID .equals(observationSubID)){
					observationIdentifier=observationIdentifier+"^"+extented;

				}else{
					isInsub=false;
				}
			}
			
			if (valueType.equals("ST")) {
				observationValue = ((ST) obx.getObservationValue(0).getData()).getValue();
			} else if (valueType.equals("NM")) {
				observationValue = ((NM) obx.getObservationValue(0).getData()).getValue();
				observationValue =observationValue +" "+  obx.getObx6_Units().encode();
			} else if (valueType.equals("TX")) {
				//				logger.info(" *** TX:" + obx.getObservationValue(0).getData() + ":" + observationValueIdentifier);
				if (obx.getObservationValue(0).getData().toString() == null) {
					observationValue = "";
				} else {
					observationValue = ((TX) obx.getObservationValue(0).getData()).getValue();
				}
			} else if (valueType.equals("SN")) {
				SN sn = (SN) obx.getObservationValue(0).getData();
				observationValue = sn.getComparator().getValue() + sn.getNum1().getValue()
						+ sn.getSeparatorSuffix().getValue() + sn.getNum2();
			} else if (valueType.equals("DTM")) {
				observationValue = ((DTM) obx.getObservationValue(0).getData()).getValue();
			} else if (valueType.equals("CE")) {
				observationValue = ((CE) obx.getObservationValue(0).getData()).getCe2_Text().encode();
				if (observationValue.length()==0){
					observationValue = ((CE)obx.getObservationValue(0).getData()).getCe1_Identifier().encode();
				}
				//				observationValueIdentifier = ((CE) obx.getObservationValue(0).getData()).getIdentifier().getValue();
				//				observationNameOfCodingSystem = ((CE) obx.getObservationValue(0).getData()).getNameOfCodingSystem().getValue();
			} else if (valueType.equals("CWE")) {
				observationValue = ((CWE)obx.getObservationValue(0).getData()).getCwe2_Text().encode();
				logger.debug(" *** CWE:" +observationValue+":" +obx.getObservationValue(0).getData() );
				if (observationValue.length()==0){
					observationValue = ((CWE)obx.getObservationValue(0).getData()).getCwe1_Identifier().encode();
					logger.debug(" *** CWE1:" +observationValue);

				}
				//				observationValueIdentifier = ((CWE) obx.getObservationValue(0).getData()).getIdentifier().getValue();
				//				observationNameOfCodingSystem = ((CWE) obx.getObservationValue(0).getData()).getNameOfCodingSystem().getValue();
			} else if (valueType.equals("ED")) {
				//				if (base64String == null) {
				ED ed = (ED) obx.getObservationValue(0).getData();
				observationValue = ed.getData().getValue();
				//	observationValue = ed.getEncoding().getValue();
				observationValue= ed.encode();
				//					if (ObservationProcessor.inXML) {
				//						mimeMessageString = ed.getEncoding().getValue();
				//					}
				//					observation.setBase64String(mimeMessageString);
				//				} else {
				//					observation.setBase64String(base64String);
				////				}
				/*BinaryData binary = BinaryData.createBinaryData();
				binary.setBase64String(mimeMessageString);
				observation.binaryData.add(binary);*/
				logger.info("Processing OBX Segment with ED data type");
			}
			if (dateTimeOfObservation==null){
				dateTimeOfObservation=orderDateTimeStart;
			}else if (dateTimeOfObservation.length()<9){
				dateTimeOfObservation=orderDateTimeStart;
			}
			//			logger.info(serialnumber+":"+observationIdentifier+":"+dateTimeOfObservation+":"+observationValue.substring(0, 200));
			//			System.out.println(serialnumber+"\n"+observationIdentifier+"\n"+
			//					observationValue+"\n"+dateTimeOfObservation+"\n-----------------------------");
			//			ppmDataset.addCIEDData("model:Secura/serial:PZC600368S", "720897^MDC_IDC_PG_TYPE^MDC", "CIED");
			ppmDataset.addCIEDData(serialnumber,observationIdentifier, observationValue,dateTimeOfObservation);
		}



		return true;

	}

	public static void main(String[] args) throws EncodingNotSupportedException, HL7Exception, ApplicationException, IOException{
		System.out.println("Start Test");
		int port=25106;//FIXME config via app
		logger.debug("Now we start PPM receiver");
		GenericParser parser = new GenericParser();
		System.out.println("Start Parser");
		HL7ReceiverApplication app= new HL7ReceiverApplication(parser);
		SimpleServer server = new SimpleServer(port,LowerLayerProtocol.makeLLP(),  new GenericParser());	
		server.registerApplication("*", "*", app);
		logger.info("Start PPM Server on port:"+port); 
		server.start();
		logger.debug("Now we start ");
		//		System.out.println("Start Receiver");

		if (directtesting){

			String oruString =
					"MSH|^~\\&||MED|||20110702111843||ORU^R01^ORU_R01|543210|P|2.5\r"
							+"PID|||model:Secura/serial:PZC600368S^^^MDT^U~PIX_Patient_ID^^^iCARDEA^SS\r"
							+"OBR|1||600368|Remote Follow-up||||20100414091451|||||||||||||||||F\r"
							+"OBX|2|ED|18750-0^Cardiac Electrophysiology Report^LN^^11 - SecuraDR_EGM|1|Application^PDF^^Base64^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PMZOhvkuKwRMwzhCyjcTnwnko5YdytU5OyzQlxu6AeVVK1R2Gt2CgAghHrZe3VNV0dS0wdG82fa5jwkpf502/vQDHE4tywplbmRzdHJlYW0KZW5kb2JqCjYgMCBvYmoKPDwvUGFyZW50IDUgMCBSL0NvbnRlbnRzIDQgMCBSL1R5cGUvUGFnZS9SZXNvdXJjZXM8PC9YT2JqZWN0PDwvaW1nMSAzIDAgUi9pbWcwIDEgMCBSPj4vUHJvY1NldCBbL1BERiAvVGV4dCAvSW1hZ2VCIC9JbWFnZUMgL0ltYWdlSV0vRm9udDw8L0YxIDIgMCBSPj4+Pi9NZWRpYUJveFswIDAgNTk1IDg0Ml0+PgplbmRvYmoKMiAwIG9iago8PC9CYXNlRm9udC9IZWx2ZXRpY2EvVHlwZS9Gb250L0VuY29kaW5nL1dpbkFuc2lFbmNvZGluZy9TdWJ0eXBlL1R5cGUxPj4KZW5kb2JqCjUgMCBvYmoKPDwvSVRYVCgyLjEuNykvVHlwZS9QYWdlcy9Db3VudCAxL0tpZHNbNiAwIFJdPj4KZW5kb2JqCjcgMCBvYmoKPDwvVHlwZS9DYXRhbG9nL1BhZ2VzIDUgMCBSPj4KZW5kb2JqCjggMCBvYmoKPDwvUHJvZHVjZXIoaVRleHQgMi4xLjcgYnkgMVQzWFQpL01vZERhdGUoRDoyMDExMDcxMjE0MDI1NiswMicwMCcpL0NyZWF0aW9uRGF0ZShEOjIwMTEwNzEyMTQwMjU2KzAyJzAwJyk+PgplbmRvYmoKeHJlZgowIDkKMDAwMDAwMDAwMCA2NTUzNSBmIAowMDAwMDAwMDE1IDAwMDAwIG4gCjAwMDAwMTgyNzkgMDAwMDAgbiAKMDAwMDAxMTI4MyAwMDAwMCBuIAowMDAwMDE3ODc1IDAwMDAwIG4gCjAwMDAwMTgzNjcgMDAwMDAgbiAKMDAwMDAxODA4OCAwMDAwMCBuIAowMDAwMDE4NDMwIDAwMDAwIG4gCjAwMDAwMTg0NzUgMDAwMDAgbiAKdHJhaWxlcgo8PC9Sb290IDcgMCBSL0lEIFs8Yzc4ZjYxYmFhODZiNDRkMjVmODA2Njg1YzBjN2E5ZTY+PGYwZTBlNWYzMjIzMGM0ZmU3YmFjODMzZjdkMmYyMTI1Pl0vSW5mbyA4IDAgUi9TaXplIDk+PgpzdGFydHhyZWYKMTg1OTcKJSVFT0YK||||||F";
			//		oruString =
			//		"MSH|^~\\&||MDT|||20110614000000||ORU^R01^ORU_R01|20110614000000|P|2.5\r"+
			//		"PID|||model:Maximo/serial:D284DRG^^^MDT^U~191^^^iCARDEA^SS||Mayr^Jane||19730804000000|F|||^^Salzburg^^A-5020^Austria\r"+
			//		"OBR|1|||REMOTE FOLLOW-UP|||20100726120000||||||||||||||||||F\r"+
			//		"OBX|1|CWE|720897^MDC_IDC_PG_TYPE^MDC|1|CIED^Implantable Cardioverter-Defibrillator||||||F|||20100726120000\r"+
			//		"OBX|2|ST|720898^MDC_IDC_PG_MODEL^MDC|1|Maximo||||||F|||20100726120000\r"+
			//		"OBX|3|ST|720899^MDC_IDC_PG_SERIAL^MDC|1|D284DRG||||||F|||20100726120000\r"+
			//		"OBX|4|CWE|720900^MDC_IDC_PG_MFG^MDC|1|MDT^Medtronic||||||F|||20100726120000\r"+
			//		"OBX|5|DTM|721025^MDC_IDC_SESS_DTM^MDC|1|20100726120000||||||F|||20100726120000\r"+
			//		"OBX|6|CWE|721026^MDC_IDC_SESS_TYPE^MDC|1|Remote^Remote||||||F|||20100726120000\r"+
			//		"OBX|7|CWE|739568^MDC_IDC_EPISODE_TYPE^MDC|1|Epis_VT^VT||||||F|||20100726120000\r"+
			//		"OBX|8|CWE|737984^MDC_IDC_STAT_EPISODE_VENDOR_TYPE^MDC|1|772099^MDT-Epis_Fast_VT^MDC||||||F|||20100726120000\r"+
			//		"OBX|9|NM|737888^MDC_IDC_STAT_TACHYTHERAPY_ATP_DELIVERED_RECENT^MDC|1|3|{seq}|||||F|||20100726120000\r"+
			//		"OBX|10|NM|737824^MDC_IDC_STAT_TACHYTHERAPY_SHOCKS_DELIVERED_RECENT^MDC|1|0|{shocks}|||||F|||20100726120000\r"+
			//		"OBX|11|NM|738000^MDC_IDC_STAT_EPISODE_RECENT_COUNT^MDC|1|1||||||F|||20100726120000\r"+
			//		"OBX|12|CWE|739696^MDC_IDC_EPISODE_THERAPY_RESULT^MDC|1|755137^MDC_IDC_ENUM_EPISODE_THERAPY_RESULT_Successful^MDC||||||F|||20100726120000\r"+
			//		"OBX|13|NM|729984^MDC_IDC_SET_LEADCHNL_RA_PACING_AMPLITUDE^MDC|1|3.50|V|||||F|||20100726120000\r"+
			//		"OBX|14|NM|729985^MDC_IDC_SET_LEADCHNL_RV_PACING_AMPLITUDE^MDC|1|3.50|V|||||F|||20100726120000\r"+
			//		"OBX|15|NM|729987^MDC_IDC_SET_LEADCHNL_LV_PACING_AMPLITUDE^MDC|1|4.00|V|||||F|||20100726120000\r"+
			//		"OBX|16|CWE|722752^MDC_IDC_MSMT_LEADHVCHNL_STATUS^MDC|1|Null||||||F|||20100726120000\r"+
			//		"OBX|17|CWE|720970^MDC_IDC_LEAD_CONNECTION_STATUS^MDC|1|Connected^Connected||||||F|||20100726120000\r";

			BufferedReader bf =null;
			StringBuilder messageBuffer = null;
			bf = new BufferedReader(new InputStreamReader(
					new FileInputStream("C:\\Test\\Medtronic test files\\test.hl7")));

			messageBuffer = new StringBuilder();

			String line = "";
			while ((line = bf.readLine()) != null) {
				messageBuffer.append(line).append("\r");
			}


			try{
				if(bf!=null)
				{
					bf.close();
				}
			}catch (IOException e) {  
				e.printStackTrace();  
			}  

			oruString=messageBuffer.toString();
			ORU_R01 message = (ORU_R01) parser.parse(oruString);
			System.out.println("Message parsed:\n"+oruString);

			//			if (true) return;

			app.useMessage(message)		;	
			System.out.println("FINISH");
		}
		PPMDataset ppm=PPMDataset.getInstance();
		while(keepAlive) 
		{ 

			logger.debug("PPM Server checking pending...");
			ppm.checkPendingData();

			try {
				Thread.sleep(60*1000);//ten minutes 10*60*1000
			} catch (InterruptedException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			} 
		} 

	}
}

