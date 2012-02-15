package de.offis.health.icardea.cied.txt.parser;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

import org.apache.log4j.Logger;
import org.bouncycastle.jce.provider.symmetric.AES.OFB;

import de.offis.health.icardea.cied.hl7.oru.ORU_EGM;
import de.offis.health.icardea.cied.hl7.oru.ORU_MSH;
import de.offis.health.icardea.cied.hl7.oru.ORU_OBR;
import de.offis.health.icardea.cied.hl7.oru.ORU_OBX;
import de.offis.health.icardea.cied.hl7.oru.ORU_PID;
import de.offis.health.icardea.cied.hl7.oru.ORU_PV1;
import de.offis.health.icardea.cied.hl7.processing.HL7_Base64_Image;
import de.offis.health.icardea.cied.hl7.processing.HL7_ORU_Creator;
import de.offis.health.icardea.cied.tools.HL7Generator;
import de.offis.health.icardea.cied.tools.HL7Tools;
import de.offis.health.icardea.common.exception.PropertyFileNotFoundException;
import de.offis.health.icardea.common.exception.PropertyNotFoundException;
import de.offis.health.icardea.common.filenamefilter.PDFFilenameFilter;
import de.offis.health.icardea.config.AppConfig;
import de.offis.health.icardea.text.tools.SimpleTextFileReader;
import de.offis.health.icardea.tools.GlobalTools;

/**
 * This class allows convert a SJM text file into HL7 with HAPI.
 * @author MYang
 */
public class TXT2HL7_HAPI_Parser {
	
	private static Logger logger = Logger.getLogger(TXT2HL7_HAPI_Parser.class);
	String fileTimestamp = GlobalTools.date2String(new java.util.Date(), "yyyy-MM-dd_HH-mm-ss");
	
	/**
	 * This class is aimed to abstract the required information in PDF files one page by one
	 */
	int observationSubID_EPISODE=0;
	
	public boolean txtParsing(File txtFile, File txt_HL7_Directory) {
		boolean parsing_flag=false;
		try {
			/**
			 * Step 4. Parsing each FollowupSummaryData.txt
			 */
			if (txt2hl7(txtFile, txt_HL7_Directory)){
				parsing_flag=true;
			}
			else{
				logger.info("Move not fully parsed file '" + 
						txtFile.getName() + 
				"' to unknown directory.");
				GlobalTools.moveFile(txtFile.getAbsolutePath(),
						AppConfig.getProperty("DIRECTORY_SJM_UNKNOWN_PDF_REPORT"),
						fileTimestamp + "_notFullyParsed_" + txtFile.getName() );
			}
		} catch (Exception ex) {
			logger.info("Error in SJM Txt Parsing"+
					GlobalTools.getExceptionTraceLog(ex));
		}
		return parsing_flag;
	}
	
	public boolean generateHL7(ORU_MSH oru_msh, 
			ORU_PID oru_pid, 
			ORU_OBR oru_obr, 
			ArrayList<ORU_OBX> obx_list, 
			ArrayList<ORU_EGM> egm_list, 
			File hl7Directory,
			String filename
	) throws Exception{
		
		String fileTimestamp = GlobalTools.date2String(new java.util.Date(), "yyyy-MM-dd_HH-mm-ss");
		boolean inXML=AppConfig.getProperty("LOCAL_HL7_FILEFORMAT_inXML").equals("Yes");
		
		String new_filepath=hl7Directory.getAbsolutePath()+GlobalTools.FILESEPARATOR;
		logger.debug("HL7v2.5 ORU message is exported to directory: " + new_filepath);
		
		if (GlobalTools.createDirectory(new_filepath)) {
			
			HL7_ORU_Creator hl7_oru_creator = new HL7_ORU_Creator(oru_msh, oru_pid, oru_obr, obx_list, egm_list);
			HL7Tools.hl7writing(inXML, hl7_oru_creator.createMessage(), new_filepath, 
					fileTimestamp + "_" + filename.substring(0,filename.lastIndexOf(".")));
			return true;
		}
		else {
			logger.error("Folder " +new_filepath+ " could not be built");
			return(false);
		}
	}
	
	public ORU_MSH oru_msh(String txtContent) 
	throws Exception, PropertyNotFoundException {
		MSHParser mshParser = new MSHParser(AppConfig.getProperty("SJM_TXTPARSER_LANGUAGE_SETTING"));
		mshParser.setTxtContent(txtContent);
		
		ORU_MSH oru_msh=new ORU_MSH();
		try {
			oru_msh.setFieldSeparator(mshParser.getMSH_fieldSeparator());
			oru_msh.setEncodingCharacters(mshParser.getMSH_encodingCharacters());
			oru_msh.setSendingApplication(mshParser.getMSH_sendingApplication());
			oru_msh.setSendingFacility(mshParser.getMSH_sendingFacility());
			oru_msh.setReceivingApplication(mshParser.getMSH_receivingApplication());
			oru_msh.setReceivingFacility(mshParser.getMSH_receivingFacility());
			oru_msh.setMessageType_messagecode(mshParser.getMSH_messageType_messagecode());
			oru_msh.setMessageType_triggerevent(mshParser.getMSH_messageType_triggerevent());
			oru_msh.setMessageType_message_structure_id(mshParser.getMSH_messageType_message_structure_id());
			oru_msh.setMessageControlID(mshParser.getMSH_messageControlID());
			oru_msh.setProcessingID(mshParser.getMSH_processingID());
			oru_msh.setVersionID(mshParser.getMSH_versionID());
		} catch (PropertyNotFoundException ex) {
			logger.error("Error in MSH Parsing"+
					GlobalTools.getExceptionTraceLog(ex));
		}
		return oru_msh;
	}
	
	public ORU_PID oru_pid(String txtContent, File txtFile) 
	throws Exception, PropertyNotFoundException {
		
		PIDParser pidParser=new PIDParser(AppConfig.getProperty("SJM_TXTPARSER_LANGUAGE_SETTING"));
		pidParser.setTxtContent(txtContent);
		
		ORU_PID oru_pid=new ORU_PID();
		try {
			oru_pid.setSetID(pidParser.getPID_setID());
			oru_pid.setPatientIdentifierList_idNumber(pidParser.getPID_patientIdentifierList_idNumber(txtFile));
			oru_pid.setPatientIdentifierList_assigningAuthority(pidParser.getPID_patientIdentifierList_assigningAuthority());
			oru_pid.setPatientIdentifierList_patientIdentifierTypeCode(pidParser.getPID_patientIdentifierList_patientIdentifierTypeCode());
			oru_pid.setPatientIdentifierList_idNumber2(pidParser.getPID_patientIdentifierList_idNumber2()); //PIX Patient ID
			oru_pid.setPatientIdentifierList_assigningAuthority2(pidParser.getPID_patientIdentifierList_assigningAuthority2()); //iCARDEA
			oru_pid.setPatientIdentifierList_patientIdentifierTypeCode2(pidParser.getPID_patientIdentifierList_patientIdentifierTypeCode2()); //SS
			
			oru_pid.setPatientName_familyName(pidParser.getPID_patientName_familyName());
			oru_pid.setPatientName_givenName(pidParser.getPID_patientName_givenName());
			oru_pid.setPatientName_secondName(pidParser.getPID_patientName_secondName());
			oru_pid.setPatientName_suffix(pidParser.getPID_patientName_suffix());
			oru_pid.setData_timeOfBorth_dataofbirth(pidParser.getPID_data_timeOfBorth_dataofbirth());
			oru_pid.setAdministrativeSex(pidParser.getPID_administrativeSex());
			oru_pid.setPatientAddress_street(pidParser.getPID_patientAddress_street());
			oru_pid.setPatientAddress_city(pidParser.getPID_patientAddress_city());
			oru_pid.setPatientAddress_postalCode(pidParser.getPID_patientAddress_postalCode());
			oru_pid.setPatientAddress_state_province(pidParser.getPID_patientAddress_state_province());
			oru_pid.setPatientAddress_country(pidParser.getPID_patientAddress_country());
		} catch (PropertyNotFoundException ex) {
			logger.error("Error in PID Parsing"+
					GlobalTools.getExceptionTraceLog(ex));
		}
		return oru_pid;
	}
	
	public ORU_OBR oru_obr(String txtContent) 
	throws Exception, PropertyNotFoundException {
		
		OBRParser obrParser=new OBRParser(AppConfig.getProperty("SJM_TXTPARSER_LANGUAGE_SETTING"));
		obrParser.setTxtContent(txtContent);
		
		ORU_OBR oru_obr=new ORU_OBR();
		try {
			oru_obr.setSetID(obrParser.getOBR_setID());
			oru_obr.setPlacerOrderNumber_entityIdentifier(obrParser.getOBR_placerOrderNumber_entityIdentifier());
			oru_obr.setFillerOrderNumber_entityIdentifier(obrParser.getOBR_fillerOrderNumber_entityIdentifier());
			oru_obr.setUniversalServiceIdentifier_identifier(obrParser.getOBR_universalServiceIdentifier_identifier());
			oru_obr.setUniversalServiceIdentifier_text(obrParser.getOBR_universalServiceIdentifier_text());
			oru_obr.setObservationData_Time_time(obrParser.getOBR_observationData_Time_time());
			oru_obr.setObservationEndData_Time_time(obrParser.getOBR_observationEndData_Time_time());
			oru_obr.setResultsRptStatusChngDate_Time_time(obrParser.getOBR_resultsRptStatusChngDate_Time_time());
			oru_obr.setResultStatus(obrParser.getOBR_resultStatus());
		} catch (PropertyNotFoundException ex) {
			logger.error("Error in OBR Parsing"+
					GlobalTools.getExceptionTraceLog(ex));
		}
		return oru_obr;
	}
	
	private boolean txt2hl7(File txtFile, File sjmHL7Directory) throws PropertyFileNotFoundException {
		/**
		 * Step 4. Parsing each FollowupSummaryData.txt
		 */
		observationSubID_EPISODE=0;
		//ORU Segment Object
		ORU_MSH oru_msh = null;
		ORU_PID oru_pid = null;
		ORU_OBR oru_obr = null;
		ArrayList<ORU_OBX> obx_list=null;
		ArrayList<ORU_EGM> egm_list=null;
		
		obx_list = new ArrayList<ORU_OBX>();
		egm_list = new ArrayList<ORU_EGM>();
		boolean retvalue=true;
		try {
			String filename=txtFile.getParentFile().getName()+"_"+txtFile.getName();//this.medtronicPdfprocessedfilename;
			logger.debug("Filename.....: " + filename);
			logger.debug("Generating HL7v2.5 ORU message ...");
			/*########################MSH & PID & OBR Section########################*/
			/**
			 *Step 4-1. Parsing MSH/PID/OBR/OBX
			 */
			try {
				String txtContent=null;
				SimpleTextFileReader txtreaderFileReader=new SimpleTextFileReader();
				if (txtreaderFileReader.loadTextFile(txtFile.getAbsolutePath())){
					txtContent=txtreaderFileReader.getFileContent();
				}
				
				if (txtContent!=null) {
				oru_msh=oru_msh(txtContent);
				oru_pid=oru_pid(txtContent, txtFile);
				oru_obr=oru_obr(txtContent);
				obx_list=obxlist(txtContent, obx_list, txtFile);
				}
				else {
					logger.error("Failed to read contents in file "+ txtFile.getAbsolutePath());
				}
			} catch (Exception ex) {
				logger.error("Error in MSH/PID/OBR/OBX Parsing"+
						GlobalTools.getExceptionTraceLog(ex));
			}
			
			/*########################EGM Base64 Encode Section########################*/
			/**
			 *Step 4-2. Parsing Base64 Encoded EGM in PDF form
			 */
			File sjm_PDF_Directory= new File(txtFile.getParent());
			if (sjm_PDF_Directory.isDirectory()){
				File[] sjmPDFList = sjm_PDF_Directory.listFiles(new PDFFilenameFilter());
				if(sjmPDFList.length != 0){
					//if there is any *.pdf file under Directory
					logger.info("Start encode EGM PDF into HL7v2.5 Messages");
					for (File pdfFile : sjmPDFList) {
						egm_list=egm_List(pdfFile, egm_list);
					}
				} else{
					logger.debug("No PDF Files in current directory "+ sjm_PDF_Directory.getAbsolutePath());
				}
			}
			else {
				logger.warn("Alert!!! Directory "+ sjm_PDF_Directory.getAbsolutePath()+" does not exist,please check it !");
			}
			/*########################Generate HL7########################*/
			/**
			 * Step 4-3. Generate HL7v2 ORU Message in *.hl7 or *.xml form
			 */
			try {
				HL7Generator hl7generator=new HL7Generator();
				retvalue =  hl7generator.generateHL7(oru_msh, 
						oru_pid, 
						oru_obr, 
						obx_list, 
						egm_list, 
						sjmHL7Directory, 
						filename);
			} catch (Exception ex) {
				logger.error("Error in HL7 Generator"+
						GlobalTools.getExceptionTraceLog(ex));
			}
		}
		finally {
			retvalue=true;
		}
		return(retvalue);
	}
	
	private ArrayList<ORU_EGM> egm_List(File pdfFile, ArrayList<ORU_EGM> egmList) {
		ORU_EGM egmObject=new ORU_EGM();
		egmObject.setEgmName(pdfFile.getName());
		egmObject.setEgmPageNumber(0);
		egmObject.setOriginalFile(pdfFile);
		
		byte[] egmContent=null;
		FileInputStream fin;
		try {
			fin = new FileInputStream(pdfFile);
			egmContent = new byte[(int) pdfFile.length()];
			fin.read(egmContent);
			fin.close();
		} catch (FileNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}

		if (egmContent!=null) {
			egmObject.setEgmContent(egmContent);
		}
		else {
			logger.error("PDF file " + pdfFile.getAbsolutePath() + " could not be read");
		}
		egmList.add(egmObject);
		return egmList;
	}
	
	public ArrayList<ORU_OBX> obxlist(String txtContent, ArrayList<ORU_OBX> obx_list, File txtFile)
	throws Exception, PropertyFileNotFoundException, PropertyNotFoundException {
		
		String observationValue=null;
		OBXParser_Nomenclature_SJM obxParser_SJM = new OBXParser_Nomenclature_SJM(AppConfig.getProperty("SJM_TXTPARSER_LANGUAGE_SETTING"));	
		OBXObserValue_SJM obxObserValue=new OBXObserValue_SJM(AppConfig.getProperty("SJM_TXTPARSER_LANGUAGE_SETTING"));
		
		//load the SJM ICD .*txt content inside
		obxObserValue.setTxtContent(txtContent);
		
		//6 Obligated OBX Segments
		/*OBX|1|CWE|720897^MDC_IDC_PG_TYPE^MDC|1|753666^MDC_IDC_ENUM_DEVICE_TYPE_ICD^MDC||||||F|||
		 *OBX|2|ST|720898^MDC_IDC_PG_MODEL^MDC|1|CD2215-36||||||F|||20100322101010
		 *OBX|3|ST|720899^MDC_IDC_PG_SERIAL^MDC|1|9925119||||||F|||20100322101010
		 *OBX|4|CWE|720900^MDC_IDC_PG_MFG^MDC|1|753751^MDC_IDC_ENUM_MFG_STJ^MDC||||||F|||
		 *OBX|5|DTM|721025^MDC_IDC_SESS_DTM^MDC|1|20100322101007||||||F|||20100322101010
		 *OBX|6|CWE|721026^MDC_IDC_SESS_TYPE^MDC|1|754053^MDC_IDC_ENUM_SESS_TYPE_RemoteScheduled^MDC||||||F|||
		 */
		int observation_Sub_ID=1;
		observationValue=obxObserValue.getMDC_IDC_PG_TYPE();
		if (observationValue!=null) {
			obx_list.add(obxParser_SJM.parse_obx_MDC_IDC_PG(observationValue, 720897));
		}
		observationValue=obxObserValue.getMDC_IDC_PG_MODEL(txtFile);
		if (observationValue!=null) {
			obx_list.add(obxParser_SJM.parse_obx_MDC_IDC_PG(observationValue, 720898));
		}
		observationValue=obxObserValue.getMDC_IDC_PG_SERIAL(txtFile);
		if (observationValue!=null) {
			obx_list.add(obxParser_SJM.parse_obx_MDC_IDC_PG(observationValue, 720899));
		}
		
		observationValue=obxObserValue.getMDC_IDC_PG_MFG();
		if (observationValue!=null) {
			obx_list.add(obxParser_SJM.parse_obx_MDC_IDC_PG(observationValue, 720900));
		}
		
		observationValue=obxObserValue.getMDC_IDC_SESS_DTM(txtFile);
		if (observationValue!=null) {
			obx_list.add(obxParser_SJM.parse_obx_MDC_IDC_PG(observationValue, 721025));
		}
		
		observationValue=obxObserValue.getMDC_IDC_SESS_TYPE();
		if (observationValue!=null) {
			obx_list.add(obxParser_SJM.parse_obx_MDC_IDC_PG(observationValue, 721026));
		}
		
		observationValue=obxObserValue.getMDC_IDC_MSMT_BATTERY_VOLTAGE();
		if (observationValue!=null) {
			observation_Sub_ID=1;
			obx_list.add(obxParser_SJM.parse_obx_MDC_IDC_MSMT_BATTERY(observation_Sub_ID, observationValue, 721344));
		}
		
		observationValue=obxObserValue.getMDC_IDC_MSMT_BATTERY_DTM();
		if (observationValue!=null) {
			observation_Sub_ID=1;
			obx_list.add(obxParser_SJM.parse_obx_MDC_IDC_MSMT_BATTERY(observation_Sub_ID ,observationValue, 721216));
		}
		
		observationValue=obxObserValue.getMDC_IDC_MSMT_CAP_CHARGE_TIME();
		if (observationValue!=null) {
			observation_Sub_ID=1;
			obx_list.add(obxParser_SJM.parse_obx_MDC_IDC_MSMT_CAP(observation_Sub_ID ,observationValue, 721728));
		}
		
		observationValue=obxObserValue.getMDC_IDC_MSMT_CAP_CHARGE_DTM();
		if (observationValue!=null) {
			observation_Sub_ID=1;
			obx_list.add(obxParser_SJM.parse_obx_MDC_IDC_MSMT_CAP(observation_Sub_ID ,observationValue, 721664));
		}
		
		
		observationValue=obxObserValue.getMDC_IDC_SET_BRADY_MAX_TRACKING_RATE();
		if (observationValue!=null) {
			observation_Sub_ID=1;
			obx_list.add(obxParser_SJM.parse_obx_MDC_IDC_SET_BRADY(observation_Sub_ID ,observationValue, 731136));
		}
		
		observationValue=obxObserValue.getMDC_IDC_SET_BRADY_MAX_SENSOR_RATE();
		if (observationValue!=null) {
			observation_Sub_ID=1;
			obx_list.add(obxParser_SJM.parse_obx_MDC_IDC_SET_BRADY(observation_Sub_ID ,observationValue, 731200));
		}
		
		observationValue=obxObserValue.getMDC_IDC_SET_BRADY_SAV_DELAY();
		if (observationValue!=null) {
			observation_Sub_ID=1;
			obx_list.add(obxParser_SJM.parse_obx_MDC_IDC_SET_BRADY(observation_Sub_ID ,observationValue, 731264));
		}
		
		observationValue=obxObserValue.getMDC_IDC_SET_BRADY_PAV_DELAY();
		if (observationValue!=null) {
			observation_Sub_ID=1;
			obx_list.add(obxParser_SJM.parse_obx_MDC_IDC_SET_BRADY(observation_Sub_ID ,observationValue, 731328));
		}
		
		observationValue=obxObserValue.getMDC_IDC_SET_LEADCHNL_RA_SENSING_SENSITIVITY();
		if (observationValue!=null) {
			observation_Sub_ID=1;
			obx_list.add(obxParser_SJM.parse_obx_MDC_IDC_SET_LEADCHNL_CHAMBER_SENSING(observation_Sub_ID ,observationValue, 729536));
		}
		
		observationValue=obxObserValue.getMDC_IDC_SET_LEADCHNL_RV_SENSING_SENSITIVITY();
		if (observationValue!=null) {
			observation_Sub_ID=1;
			obx_list.add(obxParser_SJM.parse_obx_MDC_IDC_SET_LEADCHNL_CHAMBER_SENSING(observation_Sub_ID ,observationValue, 729537));
		}
		
		observationValue=obxObserValue.getMDC_IDC_SET_LEADCHNL_LV_SENSING_SENSITIVITY();
		if (observationValue!=null) {
			observation_Sub_ID=1;
			obx_list.add(obxParser_SJM.parse_obx_MDC_IDC_SET_LEADCHNL_CHAMBER_SENSING(observation_Sub_ID ,observationValue, 729538));
		}
		
		observationValue=obxObserValue.getMDC_IDC_SET_LEADCHNL_RA_PACING_AMPLITUDE();
		if (observationValue!=null) {
			observation_Sub_ID=1;
			obx_list.add(obxParser_SJM.parse_obx_MDC_IDC_SET_LEADCHNL_CHAMBER_PACING(observation_Sub_ID ,observationValue, 729984));
		}
		
		observationValue=obxObserValue.getMDC_IDC_SET_LEADCHNL_RV_PACING_AMPLITUDE();
		if (observationValue!=null) {
			observation_Sub_ID=1;
			obx_list.add(obxParser_SJM.parse_obx_MDC_IDC_SET_LEADCHNL_CHAMBER_PACING(observation_Sub_ID ,observationValue, 729985));
		}
		
		observationValue=obxObserValue.getMDC_IDC_SET_LEADCHNL_LV_PACING_AMPLITUDE();
		if (observationValue!=null) {
			observation_Sub_ID=1;
			obx_list.add(obxParser_SJM.parse_obx_MDC_IDC_SET_LEADCHNL_CHAMBER_PACING(observation_Sub_ID ,observationValue, 729986));
		}
		
		observationValue=obxObserValue.getMDC_IDC_SET_LEADCHNL_RA_PACING_PULSEWIDTH();
		if (observationValue!=null) {
			observation_Sub_ID=1;
			obx_list.add(obxParser_SJM.parse_obx_MDC_IDC_SET_LEADCHNL_CHAMBER_PACING(observation_Sub_ID ,observationValue, 730048));
		}
		
		observationValue=obxObserValue.getMDC_IDC_SET_LEADCHNL_RV_PACING_PULSEWIDTH();
		if (observationValue!=null) {
			observation_Sub_ID=1;
			obx_list.add(obxParser_SJM.parse_obx_MDC_IDC_SET_LEADCHNL_CHAMBER_PACING(observation_Sub_ID ,observationValue, 730049));
		}
		
		observationValue=obxObserValue.getMDC_IDC_SET_LEADCHNL_LV_PACING_PULSEWIDTH();
		if (observationValue!=null) {
			observation_Sub_ID=1;
			obx_list.add(obxParser_SJM.parse_obx_MDC_IDC_SET_LEADCHNL_CHAMBER_PACING(observation_Sub_ID ,observationValue, 730050));
		}
		
		//Get episodeList
		Pattern pattern_1 = Pattern.compile("\\d+\\,\\s(Jan|Feb|Mar|Apr|May|Jun|Jul|Aug|Sep|Oct|Nov|Dec)\\s[0-9]{2}.*\\r\\n");
		Matcher matcher_1 = pattern_1.matcher(txtContent);
		List<String> episodeList = new ArrayList<String>();
		List<String> episodeDetailsList = new ArrayList<String>();
		while(matcher_1.find()){
			episodeList.add(matcher_1.group());
		}
		
		//Get episodeDetails(All)
		Pattern pattern_2 = Pattern.compile("Episode Details:\r\n[\\s\\S]*");
		Matcher matcher_2 = pattern_2.matcher(txtContent);
		if (matcher_2.find()) {
			String episodeDetailsAll=matcher_2.group();
			Pattern pattern_3 = Pattern.compile("(\\d+\\,.*)");
			Matcher matcher_3 = pattern_3.matcher(episodeDetailsAll);
			while(matcher_3.find()){
				episodeDetailsList.add(matcher_3.group());
			}	
		}
		
		String id_Episodes=null;
		for (int i=0; i<episodeList.size(); i++) {
			observationSubID_EPISODE=observationSubID_EPISODE+1;
			
			obxObserValue.setTxtContent(episodeList.get(i));
			observationValue=obxObserValue.getMDC_IDC_EPISODE_ID();
			if (observationValue!= null) {
				obx_list.add(obxParser_SJM.parse_obx_MDC_IDC_EPISODE(observationSubID_EPISODE, observationValue, 739536));
			}
			
			observationValue=obxObserValue.getMDC_IDC_EPISODE_DTM();
			if (observationValue!= null) {
				obx_list.add(obxParser_SJM.parse_obx_MDC_IDC_EPISODE(observationSubID_EPISODE, observationValue, 739552));
			}
			
			observationValue=obxObserValue.getMDC_IDC_EPISODE_TYPE();
			if (observationValue!= null) {
				obx_list.add(obxParser_SJM.parse_obx_MDC_IDC_EPISODE(observationSubID_EPISODE, observationValue, 739568));
			}
			
			observationValue=obxObserValue.getMDC_IDC_EPISODE_VENDOR_TYPE();
			if (observationValue!= null) {
				obx_list.add(obxParser_SJM.parse_obx_MDC_IDC_EPISODE(observationSubID_EPISODE, observationValue, 739600));
			}
			
			if (obxObserValue.getMDC_IDC_EPISODE_ID()!=null & episodeDetailsList.get(i)!=null) {
				id_Episodes=obxObserValue.getMDC_IDC_EPISODE_ID();
				if (episodeDetailsList.get(i).matches("^"+id_Episodes+".*")) {
					obxObserValue.setTxtContent(episodeDetailsList.get(i));
					observationValue=obxObserValue.getMDC_IDC_EPISODE_DETECTION_THERAPY_DETAILS();
					if (observationValue!= null) {
						obx_list.add(obxParser_SJM.parse_obx_MDC_IDC_EPISODE(observationSubID_EPISODE, observationValue, 739680));
					}
				}
			}
			
			obxObserValue.setTxtContent(episodeList.get(i));
			observationValue=obxObserValue.getMDC_IDC_EPISODE_DURATION();
			if (observationValue!= null) {
				obx_list.add(obxParser_SJM.parse_obx_MDC_IDC_EPISODE(observationSubID_EPISODE, observationValue, 739712));
			}
		}
		return obx_list;
	}
}