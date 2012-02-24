package de.offis.health.icardea.cied.pdf.parser;

import java.io.File;
import java.io.IOException;
import java.io.InputStream;
import java.util.ArrayList;
import java.util.List;
import java.util.Properties;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

import javax.mail.MessagingException;

import org.apache.log4j.Logger;

import ca.uhn.hl7v2.HL7Exception;

import de.offis.health.icardea.cied.hl7.oru.ORU_EGM;
import de.offis.health.icardea.cied.hl7.oru.ORU_MSH;
import de.offis.health.icardea.cied.hl7.oru.ORU_OBR;
import de.offis.health.icardea.cied.hl7.oru.ORU_OBX;
import de.offis.health.icardea.cied.hl7.oru.ORU_PID;

import de.offis.health.icardea.cied.hl7.processing.HL7_Base64_Image;
import de.offis.health.icardea.cied.hl7.processing.HL7_ORU_Creator;

import de.offis.health.icardea.cied.pdf.extractor.PDFApachePDFBoxExtractor;
import de.offis.health.icardea.cied.pdf.interfaces.PDFExtractor;
import de.offis.health.icardea.cied.pdf.interfaces.PDFParser;

import de.offis.health.icardea.cied.tools.HL7Generator;
import de.offis.health.icardea.cied.tools.HL7Tools;
import de.offis.health.icardea.cied.tools.IEEE11073NomenclatureProperties;

import de.offis.health.icardea.common.exception.InvalidParameterValueException;
import de.offis.health.icardea.common.exception.PropertyFileNotFoundException;
import de.offis.health.icardea.common.exception.PropertyNotFoundException;
import de.offis.health.icardea.config.AppConfig;
import de.offis.health.icardea.tools.GlobalTools;

public class PDF2HL7_HAPI_Parser {
	
	private static Logger logger = Logger.getLogger(PDF2HL7_HAPI_Parser.class);
	String fileTimestamp = GlobalTools.date2String(new java.util.Date(), "yyyy-MM-dd_HH-mm-ss");
	
	/**
	 * This class is aimed to abstract the required information in PDF files one page by one
	 */
	int observationSubID_EPISODE=0;
	
	public boolean pdfParsing(PDFExtractor pdfExtractor, File pdfFile, File medtronic_HL7_Directory) {
		boolean parsing_flag=false;
		try {
			//Step 4. Parsing each PDF file in directory for Medtronic ICD reports
			if (pdf2hl7(pdfFile, pdfExtractor, medtronic_HL7_Directory)){
				parsing_flag=true;
			}
			else{
				logger.info("Move not fully parsed file '" + 
						pdfFile.getName() + 
				"' to unknown directory.");
				GlobalTools.moveFile(pdfFile.getAbsolutePath(),//medtronic_PDF_Directory.getAbsolutePath()+GlobalTools.FILESEPARATOR+pdfFile.getName(), 
						AppConfig.getProperty("DIRECTORY_MEDTRONIC_UNKNOWN_PDF_REPORT"),
						fileTimestamp + "_notFullyParsed_" + pdfFile.getName() );
			}
		} catch (PropertyNotFoundException e) {
			e.printStackTrace();
		} catch (Exception e) {
			e.printStackTrace();
		}
		return parsing_flag;
	}
	
	private boolean pdf2hl7(File pdfFile, PDFExtractor pdfExtractor, File medtronicHL7Directory) throws Exception{
		
		//Title for each pages in Medtronic PDF reports 
		ArrayList<String> titleList=new ArrayList<String>();
		ArrayList<String> egmTitleList=new ArrayList<String>();
		
		// TODO 
		/* Attention!
		 * Currently only support English and German version.
		 * To reserve more possibility of multi-languages for further. 
		 * Smart way should be considered in further. 
		 */
		
		String languageTitle=AppConfig.getProperty("PDFPARSER_LANGUAGE_SETTING");
		String device="Device";
		if (languageTitle.equals(null) || languageTitle.equals("en")) {
			device="Device";
			/*
			 * List for OBX Segment
			 */
			titleList.add("Transmission Notes");
			//titleList.add("Current EGM");
			titleList.add("Quick Look");
			//titleList.add("Cardiac Compass");
			titleList.add("Battery and Lead Measurements");
			titleList.add("Lead Performance Trends");
			titleList.add("Parameters");
			titleList.add("VT/VF Counters");
			titleList.add("AT/AF Summary");
			titleList.add("Arrhythmia Episode List");
			titleList.add("Ventricular Sensing Episode List");
			//titleList.add("Ventricular Sensing Episode");
			titleList.add("Rate Drop Response Episode List");
			//titleList.add("Rate Histograms");
			titleList.add("Heart Failure Management Report");
			titleList.add("Rate Histograms");
			titleList.add("Alert Events");
			titleList.add("Patient Information");
			/*
			 * List for EGM
			 */
			egmTitleList.add("Current EGM");
			egmTitleList.add("Episode \\#\\d+");
		}
		else if (languageTitle.equals("de")) {
			device="Gerät";
			/*
			 * List for OBX Segment
			 */
			titleList.add("Anmerkungen zur Übertragung");
			//titleList.add("Current EGM");
			titleList.add("Quick Look");
			//titleList.add("Cardiac Compass");
			titleList.add("Batterie- und Elektrodenmessungen");
			titleList.add("Elektrodentrends");
			titleList.add("Parameter");
			titleList.add("VT/VF-Zähler");
			titleList.add("AT/AF-Zusammenfassung");
			titleList.add("Episodenliste der Arrhythmieepisoden");
			titleList.add("Ventricular Sensing Episode List");
			//titleList.add("Ventricular Sensing Episode");
			titleList.add("Frequenzabfallreaktion-Episodenliste");
			//titleList.add("Rate Histograms");
			titleList.add("Bericht Herzinsuffizienz-Management");
			titleList.add("Frequenzhistogramme");
			titleList.add("Alarmereignisse");
			titleList.add("Angaben zum Patienten");
			/*
			 * List for EGM
			 */
			egmTitleList.add("Aktuelles EGM");
			egmTitleList.add("Episode \\#\\d+");
		}
		
		//Step 4-1. Parsing MSH/PID/OBR/OBX Segments
		/* Set the Sub ID for Episode 
		 * Episode could be listed in more than one pages
		 */
		observationSubID_EPISODE=0;
		//ORU Segment Object
		ORU_MSH oru_msh = null;
		ORU_PID oru_pid = null;
		//ORU_PV1 oru_pv1 = null;
		ORU_OBR oru_obr = null;
		ArrayList<ORU_OBX> obx_list=null;
		
		ArrayList<ORU_EGM> egm_list=null;
		
		boolean retvalue=true;
		try {
			String filename=pdfFile.getName();//this.medtronicPdfprocessedfilename;
			logger.debug("Filename.....: " + filename);
			logger.debug("Generating HL7v2.5 ORU message ...");
			
			//########################MSH & PID & OBR &OBX Segments########################
			oru_msh=oru_msh(pdfExtractor.getText());
			oru_pid=oru_pid(pdfExtractor.getText());
			oru_obr=oru_obr(pdfExtractor.getText());
			
			obx_list = new ArrayList<ORU_OBX>();
			egm_list = new ArrayList<ORU_EGM>();
			
			for (int i=1; i<=pdfExtractor.getNumberOfPages();i++) {
				for (int j=0; j<titleList.size();j++) {
					/*In Medtronic file, the position for each title in every pages is 
					 * as "Title name" following with "\\r\\n\\sDevice:" or "\\r\\n\\sGerät:"
					 *Example: 
					 *"Patient Information
					 *Device: Secura™ DR D234DRG"
					 *Or
					 *"Angaben zum Patienten
					 *Gerät: Secura™ DR D234DRG"
					 *String device is "Device" in English or "Gerät" in German
					 */
					Pattern pattern_title = Pattern.compile(titleList.get(j)+"\\r\\n\\s"+device+":",Pattern.MULTILINE);
					Matcher matcher_title = pattern_title.matcher(pdfExtractor.getText(i));
					
					if (matcher_title.find()) {
						//logger.debug("Parsing Page "+ i+ " under title "+titleList.get(j));
						if (obx_list!=null) {
						}
						
						//return from oru_obx is obx_list, (obx_list is either input or output)
						obx_list=oru_obx(titleList.get(j),pdfExtractor.getText(i), 
								obx_list);
					}
				}
				
				/*
				 * To extract EGM figures from specified page numbers in Medtronic PDF files
				 */
				for (int j=0; j<egmTitleList.size();j++) {
					//setEGMPageList(j, pdfExtractor.getText(i));
					Pattern pattern_EGM = Pattern.compile(egmTitleList.get(j),Pattern.MULTILINE);
					Matcher matcher_EGM = pattern_EGM.matcher(pdfExtractor.getText(i));
					if (matcher_EGM.find()) {
						egm_list=egm_List(i, matcher_EGM.group(), pdfExtractor.getPDFPage(i), pdfFile, egm_list);
					}
				}
			}
			
			/*########################EGM Base64 Encode Section########################*/
			//Step 4-2. Parsing Base64 Encoded EGM in PDF form
			File egmPDFFile=null;
			
			if (GlobalTools.getBooleanValue(AppConfig.getProperty("ENCAPSULATED_BASE64_EGM_PDF"))) {
				HL7_Base64_Image hl7_Base64Image=new HL7_Base64_Image();
				egmPDFFile=hl7_Base64Image.extractEGMImagesFromPDFFiles(pdfFile);
			}
			if (egmPDFFile!=null){
				logger.info("egmPDFFile is "+egmPDFFile.getAbsolutePath());
			}
			
			/*########################Generate HL7########################*/
			//Step 4-3. Generate HL7v2 ORU Message in *.hl7 or *.xml form
			HL7Generator hl7generator=new HL7Generator();
			retvalue =  hl7generator.generateHL7(oru_msh, 
					oru_pid, 
					oru_obr, 
					obx_list, 
					egm_list, 
					medtronicHL7Directory, 
					filename);
		} catch(PropertyNotFoundException ex) {
			logger.error("The accessed property key hasn't been found in the PDF parser property file. ", ex);
			return(false);
		}
		finally {
			//if (pdfParser != null) {
			//pdfParser.dispose();
			//logger.debug("Generate pdfParser.....: ");
			retvalue=true;
			//} // end if
		} // end try..catch..finally
		return(retvalue);
	}
	
	public boolean generateHL7(ORU_MSH oru_msh, 
			ORU_PID oru_pid, 
			ORU_OBR oru_obr, 
			ArrayList<ORU_OBX> obx_list, 
			ArrayList<ORU_EGM> egm_list, 
			File hl7Directory,
			String filename
	) throws Exception, IOException, HL7Exception, MessagingException, Exception {
		
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
			logger.error("Folder could not be built");
			return(false);
		}
	}
	
	public ORU_MSH oru_msh(String pdfContent) 
	throws Exception, PropertyFileNotFoundException, PropertyNotFoundException {
		MSHParser mshParser = new MSHParser(AppConfig.getProperty(PDFParser.PROPERTY_KEY_LANGUAGE_SETTING));
		mshParser.setPdfContent(pdfContent);
		
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
		} catch (PropertyNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		return oru_msh;
	}
	
	public ORU_PID oru_pid(String pdfContent) 
	throws Exception, PropertyFileNotFoundException, PropertyNotFoundException {
		
		PIDParser pidParser=new PIDParser(AppConfig.getProperty(PDFParser.PROPERTY_KEY_LANGUAGE_SETTING));
		pidParser.setPdfContent(pdfContent);
		
		ORU_PID oru_pid=new ORU_PID();
		try { 
			oru_pid.setSetID(pidParser.getPID_setID());
			oru_pid.setPatientIdentifierList_idNumber(pidParser.getPID_patientIdentifierList_idNumber());
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
		} catch (PropertyNotFoundException e) {
			e.printStackTrace();
		}
		return oru_pid;
	}
	
	public ORU_OBR oru_obr(String pdfContent) 
	throws Exception, PropertyFileNotFoundException, PropertyNotFoundException {
		
		OBRParser obrParser=new OBRParser(AppConfig.getProperty(PDFParser.PROPERTY_KEY_LANGUAGE_SETTING));
		obrParser.setPdfContent(pdfContent);
		
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
		} catch (PropertyNotFoundException e) {
			e.printStackTrace();
		}
		return oru_obr;
	}
	
	private ArrayList<ORU_EGM> egm_List(int egmPageNumber, String egmName, byte[] egmContent , File pdfFile, ArrayList<ORU_EGM> egmList) {
		ORU_EGM egmObject=new ORU_EGM();
		egmObject.setEgmPageNumber(egmPageNumber);
		egmObject.setEgmName(egmName+"_P"+Integer.toString(egmPageNumber)); //P means Page
		egmObject.setEgmContent(egmContent);
		egmObject.setOriginalFile(pdfFile);
		egmList.add(egmObject);
		return egmList;
	}
	
	public ArrayList<ORU_OBX> oru_obx(String singlePageTitle, String singlePageContent, ArrayList<ORU_OBX> obx_list)
	throws Exception, PropertyFileNotFoundException, PropertyNotFoundException {
		
		OBXParser_Nomenclature_MDT obxparser_nomenclature_mdt = new OBXParser_Nomenclature_MDT(AppConfig.getProperty("PDFPARSER_LANGUAGE_SETTING"));	
		OBXParser_Nomenclature_ICARDEA obxparser_nomenclature_icardea= new OBXParser_Nomenclature_ICARDEA(AppConfig.getProperty("PDFPARSER_LANGUAGE_SETTING"));	
		
		if (singlePageTitle=="Transmission Notes" || singlePageTitle=="Anmerkungen zur Übertragung") {
			String observationValue=null;
			OBXObserValue_TransmissionNotes obxParser_transmissionnotes=
				new OBXObserValue_TransmissionNotes(AppConfig.getProperty("PDFPARSER_LANGUAGE_SETTING"));
			obxParser_transmissionnotes.setPdfContent(singlePageContent);
			/*
			 * These six OBX Segment is obligated for a complete HL7 message
			 */
			observationValue=obxParser_transmissionnotes.getMDC_IDC_PG_TYPE();
			if (observationValue!=null) {
				obx_list.add(obxparser_nomenclature_mdt.parse_obx_TransmissionNotes(observationValue, 720897));
			}
			
			observationValue=obxParser_transmissionnotes.getMDC_IDC_PG_MODEL();
			if (observationValue!=null) {
				obx_list.add(obxparser_nomenclature_mdt.parse_obx_TransmissionNotes(observationValue, 720898));
			}
			
			observationValue=obxParser_transmissionnotes.getMDC_IDC_PG_SERIAL();
			if (observationValue!=null) {
				obx_list.add(obxparser_nomenclature_mdt.parse_obx_TransmissionNotes(observationValue, 720899));
			}
			
			observationValue=obxParser_transmissionnotes.getMDC_IDC_PG_MFG();
			if (observationValue!=null) {
				obx_list.add(obxparser_nomenclature_mdt.parse_obx_TransmissionNotes(observationValue, 720900));
			}
			
			observationValue=obxParser_transmissionnotes.getMDC_IDC_SESS_DTM();
			if (observationValue!=null) {
				obx_list.add(obxparser_nomenclature_mdt.parse_obx_TransmissionNotes(observationValue, 721025));
			}
			
			observationValue=obxParser_transmissionnotes.getMDC_IDC_SESS_TYPE();
			if (observationValue!=null) {
				obx_list.add(obxparser_nomenclature_mdt.parse_obx_TransmissionNotes(observationValue, 721026));
			}
		}
		
		if (singlePageTitle=="Arrhythmia Episode List" || singlePageTitle=="Episodenliste der Arrhythmieepisoden" ) {	
			String observationValue=null;
			OBXObserValue_ArrhythmiaEpisodeList obxParser_arrhythmiaepisodelist=
				new OBXObserValue_ArrhythmiaEpisodeList(AppConfig.getProperty("PDFPARSER_LANGUAGE_SETTING"));
			
			Pattern pattern = Pattern.compile("AT/AF.+|VF.+|VT.+|VT-NS.+|FVT.+");
			Matcher matcher = pattern.matcher(singlePageContent);
			
			List<String> episodeList = new ArrayList<String>();
			while(matcher.find()){
				episodeList.add(matcher.group());
			}
			
			/*
			 * 1. Total ATP Number (accumulation for ATP in each episode)
			 */
			int total_ATP=0;
			String singleEpisode_ATP=null; 
			for (int i=0; i<episodeList.size(); i++) {
				singleEpisode_ATP=null;
				obxParser_arrhythmiaepisodelist.setPdfContent(episodeList.get(i));
				singleEpisode_ATP=obxParser_arrhythmiaepisodelist.getMDC_IDC_STAT_EPISODE_RECENT_COUNT_ATP();
				if (singleEpisode_ATP!=null) {
					total_ATP=total_ATP+ GlobalTools.getIntValue(singleEpisode_ATP);
				}
			}
			observationValue=Integer.toString(total_ATP);
			obx_list.add(obxparser_nomenclature_mdt.parse_obx_ArrhythmiaEpisodeList(observationValue, 737888));
			
			/*
			 * 2. Details for each episode
			 */
			for (int i=0; i<episodeList.size(); i++) {
				/*
				 * Sequence is from newest episode to early episode
				 *MDC_IDC_EPISODE_ID 739536
				 *MDC_IDC_EPISODE_TYPE 739568
				 *MDC_IDC_EPISODE_DTM 739552
				 *MDC_IDC_EPISODE_DURATION 739712
				 *MDC_IDC_EPISODE_DETECTION_THERAPY_DETAILS 739680
				 *MDC_IDC_EPISODE_THERAPY_RESULT 739696
				 */
				
				obxParser_arrhythmiaepisodelist.setPdfContent(episodeList.get(i));
				
				observationSubID_EPISODE=observationSubID_EPISODE+1;
				observationValue=obxParser_arrhythmiaepisodelist.getMDC_IDC_EPISODE_ID();
				if (observationValue!= null) {
					obx_list.add(obxparser_nomenclature_mdt.parse_obx_ArrhythmiaEpisodeList(observationSubID_EPISODE, observationValue, 739536));
				}
				
				observationValue=obxParser_arrhythmiaepisodelist.getMDC_IDC_EPISODE_TYPE();
				if (observationValue!= null) {
					obx_list.add(obxparser_nomenclature_mdt.parse_obx_ArrhythmiaEpisodeList(observationSubID_EPISODE, observationValue, 739568));
				}
				
				observationValue=obxParser_arrhythmiaepisodelist.getMDC_IDC_EPISODE_DTM();
				if (observationValue!= null) {
					obx_list.add(obxparser_nomenclature_mdt.parse_obx_ArrhythmiaEpisodeList(observationSubID_EPISODE, observationValue, 739552));
				}
				
				observationValue=obxParser_arrhythmiaepisodelist.getMDC_IDC_EPISODE_DURATION();
				if (observationValue!= null) {
					obx_list.add(obxparser_nomenclature_mdt.parse_obx_ArrhythmiaEpisodeList(observationSubID_EPISODE, observationValue, 739712));
				}
				
				observationValue=obxParser_arrhythmiaepisodelist.getMDC_IDC_EPISODE_DETECTION_THERAPY_DETAILS();
				if (observationValue!= null) {
					obx_list.add(obxparser_nomenclature_mdt.parse_obx_ArrhythmiaEpisodeList(observationSubID_EPISODE, observationValue, 739680));
				}
				
				observationValue=obxParser_arrhythmiaepisodelist.getMDC_IDC_EPISODE_THERAPY_RESULT();
				if (observationValue!= null) {
					obx_list.add(obxparser_nomenclature_mdt.parse_obx_ArrhythmiaEpisodeList(observationSubID_EPISODE, observationValue, 739696));
				}
			}
		}
		
		if (singlePageTitle=="Parameters" || singlePageTitle=="Parameter") {
			String observationValue=null;
			int observationSubID=1;
			OBXObserValue_Parameters obxParser_parameters=
				new OBXObserValue_Parameters(AppConfig.getProperty("PDFPARSER_LANGUAGE_SETTING"));
			obxParser_parameters.setPdfContent(singlePageContent);
			
			/*
			 * Example to show how add new parameters
			 */
			observationValue=obxParser_parameters.getICARDEA_IDC_SET_NCAP();
			if (observationValue!= null) { 
				obx_list.add(obxparser_nomenclature_icardea.parse_obx_Parameters(observationSubID, observationValue, 180999));
			}
			
			observationValue=obxParser_parameters.getMDC_IDC_PG_IMPLANT_DT();
			if (observationValue!= null) { 
				obx_list.add(obxparser_nomenclature_mdt.parse_obx_Parameters(observationSubID, observationValue, 720901));
			}
			observationValue=obxParser_parameters.getMDC_IDC_SET_LEADCHNL_RA_PACING_AMPLITUDE();
			if (observationValue!= null) { 
				obx_list.add(obxparser_nomenclature_mdt.parse_obx_Parameters(observationSubID, observationValue, 729984));
			}
			observationValue=obxParser_parameters.getMDC_IDC_SET_LEADCHNL_RV_PACING_AMPLITUDE();
			if (observationValue!= null) { 
				obx_list.add(obxparser_nomenclature_mdt.parse_obx_Parameters(observationSubID, observationValue, 729985));
			}
			observationValue=obxParser_parameters.getMDC_IDC_SET_LEADCHNL_LV_PACING_AMPLITUDE();
			if (observationValue!= null) { 
				obx_list.add(obxparser_nomenclature_mdt.parse_obx_Parameters(observationSubID, observationValue, 729987));
			}
			
			/*
			 * MDC_IDC_SET_BRADY
			 */
			observationValue=obxParser_parameters.getMDC_IDC_ENUM_BRADY_MODE();
			if (observationValue!= null) { 
				obx_list.add(obxparser_nomenclature_mdt.parse_obx_Parameters(observationSubID, observationValue, 730752));
			}
			observationValue=obxParser_parameters.getMDC_IDC_SET_BRADY_LOWRATE();
			if (observationValue!= null) { 
				obx_list.add(obxparser_nomenclature_mdt.parse_obx_Parameters(observationSubID, observationValue, 730880));
			}
			observationValue=obxParser_parameters.getMDC_IDC_SET_BRADY_MAX_TRACKING_RATE();
			if (observationValue!= null) { 
				obx_list.add(obxparser_nomenclature_mdt.parse_obx_Parameters(observationSubID, observationValue, 731136));
			}
			observationValue=obxParser_parameters.getMDC_IDC_SET_BRADY_MAX_SENSOR_RATE();
			if (observationValue!= null) { 
				obx_list.add(obxparser_nomenclature_mdt.parse_obx_Parameters(observationSubID, observationValue, 731200));
			}
			observationValue=obxParser_parameters.getMDC_IDC_SET_BRADY_SAV_DELAY();
			if (observationValue!= null) { 
				obx_list.add(obxparser_nomenclature_mdt.parse_obx_Parameters(observationSubID, observationValue, 731264));
			}
			observationValue=obxParser_parameters.getMDC_IDC_SET_BRADY_PAV_DELAY();
			if (observationValue!= null) { 
				obx_list.add(obxparser_nomenclature_mdt.parse_obx_Parameters(observationSubID, observationValue, 731328));
			}
			observationValue=obxParser_parameters.getMDC_IDC_SET_BRADY_AT_MODE_SWITCH_RATE();
			if (observationValue!= null) { 
				obx_list.add(obxparser_nomenclature_mdt.parse_obx_Parameters(observationSubID, observationValue, 731456));
			}
			
			//Zone Information
			String zone_Cluster=null;
			zone_Cluster=obxParser_parameters.getZoneCluster();
			
			if (zone_Cluster!=null) {
				
				Pattern pattern = Pattern.compile("VF.+|FVT.+|VT.+");
				Matcher matcher = pattern.matcher(zone_Cluster);
				
				List<String> zoneList = new ArrayList<String>();
				while(matcher.find()){
					zoneList.add(matcher.group());
				}
				
				int observationSubID_Zone=1;
				String zoneType="";
				for (int i=0; i<zoneList.size(); i++) {
					obxParser_parameters.setPdfContent(zoneList.get(i));
					
					zoneType=obxParser_parameters.getMDC_IDC_SET_ZONE_TYPE();
					if (zoneType!=null) {
						if (zoneType.equals("VF")) {
							observationValue=obxParser_parameters.getICARDEA_IDC_SET_LIMIT_VF();
							if (observationValue!= null) {
								obx_list.add(obxparser_nomenclature_icardea.parse_obx_Parameters(observationSubID_Zone, observationValue, 180408));
							}
						}
						
						else if (zoneType.equals("FVT")) {
							observationValue=obxParser_parameters.getICARDEA_IDC_SET_LIMIT_FVT();
							if (observationValue!= null) {
								obx_list.add(obxparser_nomenclature_icardea.parse_obx_Parameters(observationSubID_Zone, observationValue, 180407));
							}
						}
						
						else if (zoneType.equals("VT")) {
							observationValue=obxParser_parameters.getICARDEA_IDC_SET_LIMIT_VT();
							if (observationValue!= null) {
								obx_list.add(obxparser_nomenclature_icardea.parse_obx_Parameters(observationSubID_Zone, observationValue, 180406));
							}
						}
					}
				}
				
				observationSubID_Zone=0;
				for (int i=0; i<zoneList.size(); i++) {
					/*
					 *731712: MDC_IDC_SET_ZONE_VENDOR_TYPE
					 *731648: MDC_IDC_SET_ZONE_TYPE
					 *731776: MDC_IDC_SET_ZONE_STATUS
					 *731840: MDC_IDC_SET_ZONE_DETECTION_INTERVAL
					 */
					obxParser_parameters.setPdfContent(zoneList.get(i));
					observationSubID_Zone++;
					observationValue=obxParser_parameters.getMDC_IDC_SET_ZONE_VENDOR_TYPE();
					if (observationValue!= null) {
						obx_list.add(obxparser_nomenclature_mdt.parse_obx_Parameters(observationSubID_Zone, observationValue, 731712));
					}
					observationValue=obxParser_parameters.getMDC_IDC_SET_ZONE_TYPE();
					if (observationValue!= null) {
						obx_list.add(obxparser_nomenclature_mdt.parse_obx_Parameters(observationSubID_Zone, observationValue, 731648));
					}
					observationValue=obxParser_parameters.getMDC_IDC_SET_ZONE_STATUS();
					if (observationValue!= null) {
						obx_list.add(obxparser_nomenclature_mdt.parse_obx_Parameters(observationSubID_Zone, observationValue, 731776));
					}
					observationValue=obxParser_parameters.getMDC_IDC_SET_ZONE_DETECTION_INTERVAL();
					if (observationValue!= null) {
						obx_list.add(obxparser_nomenclature_mdt.parse_obx_Parameters(observationSubID_Zone, observationValue, 731840));
					}
				}
			}
		}
		
		if (singlePageTitle=="VT/VF Counters" || singlePageTitle=="VT/VF-Zähler") {
			String observationValue=null;
			OBXObserValue_VTVFCounters obxParser_vtvfcounters=
				new OBXObserValue_VTVFCounters(AppConfig.getProperty("PDFPARSER_LANGUAGE_SETTING"));
			obxParser_vtvfcounters.setPdfContent(singlePageContent);
			
			String mdc_IDC_STAT_EPISODE_RECENT_COUNT_DTM_START=null;
			String mdc_IDC_STAT_EPISODE_RECENT_COUNT_DTM_END=null;
			
			/*
			 * For all episode (AF, VT, VF and so an), DTM_STRAT and DTM_END are same
			 */
			mdc_IDC_STAT_EPISODE_RECENT_COUNT_DTM_START=obxParser_vtvfcounters.getMDC_IDC_STAT_EPISODE_RECENT_COUNT_DTM_START();
			mdc_IDC_STAT_EPISODE_RECENT_COUNT_DTM_END=obxParser_vtvfcounters.getMDC_IDC_STAT_EPISODE_RECENT_COUNT_DTM_END();
			
			int index=0;
			/*
			 * For VT SVT NS-VT FVT VF AF scenario/episode
			 * VT is essential and with high priority for Careplan Engine
			 * switch_XX such as switch_VT/switch_NSVT is used to filter episode type
			 */
			String switch_VT=AppConfig.getProperty("VT_Moitoring");
			if (switch_VT.toLowerCase().equals("on")) {
				observationValue=obxParser_vtvfcounters.getMDC_IDC_STAT_EPISODE_TYPE_VT();
				if (observationValue!= null) {
					index=index+1;
					obx_list.add(obxparser_nomenclature_mdt.parse_obx_VTVFCounters(index, observationValue, 737952));
					
					observationValue=obxParser_vtvfcounters.getMDC_IDC_STAT_EPISODE_RECENT_COUNT_VT();
					if (observationValue!= null) {
						obx_list.add(obxparser_nomenclature_mdt.parse_obx_VTVFCounters(index, observationValue, 738000));	
					}
					if (mdc_IDC_STAT_EPISODE_RECENT_COUNT_DTM_START!=null) {
						obx_list.add(obxparser_nomenclature_mdt.parse_obx_VTVFCounters(index, mdc_IDC_STAT_EPISODE_RECENT_COUNT_DTM_START, 738017));	
					}
					if (mdc_IDC_STAT_EPISODE_RECENT_COUNT_DTM_END!=null) {
						obx_list.add(obxparser_nomenclature_mdt.parse_obx_VTVFCounters(index, mdc_IDC_STAT_EPISODE_RECENT_COUNT_DTM_END, 738018));	
					}
				}
			}
			
			String switch_SVT=AppConfig.getProperty("SVT_Moitoring");
			if (switch_SVT.toLowerCase().equals("on")) {
				observationValue=obxParser_vtvfcounters.getMDC_IDC_STAT_EPISODE_TYPE_SVT();
				if (observationValue!= null) {
					index=index+1;
					obx_list.add(obxparser_nomenclature_mdt.parse_obx_VTVFCounters(index, observationValue, 737952));
					
					observationValue=obxParser_vtvfcounters.getMDC_IDC_STAT_EPISODE_RECENT_COUNT_SVT();
					if (observationValue!= null) {
						obx_list.add(obxparser_nomenclature_mdt.parse_obx_VTVFCounters(index, observationValue, 738000));	
					}
					if (mdc_IDC_STAT_EPISODE_RECENT_COUNT_DTM_START!=null) {
						obx_list.add(obxparser_nomenclature_mdt.parse_obx_VTVFCounters(index, mdc_IDC_STAT_EPISODE_RECENT_COUNT_DTM_START, 738017));	
					}
					if (mdc_IDC_STAT_EPISODE_RECENT_COUNT_DTM_END!=null) {
						obx_list.add(obxparser_nomenclature_mdt.parse_obx_VTVFCounters(index, mdc_IDC_STAT_EPISODE_RECENT_COUNT_DTM_END, 738018));	
					}
				}
			}
			
			String switch_AF=AppConfig.getProperty("AF_Moitoring");
			if (switch_AF.toLowerCase().equals("on")) {
				observationValue=obxParser_vtvfcounters.getMDC_IDC_STAT_EPISODE_TYPE_AF();
				if (observationValue!= null) {
					index=index+1;
					obx_list.add(obxparser_nomenclature_mdt.parse_obx_VTVFCounters(index, observationValue, 737952));	
					
					observationValue=obxParser_vtvfcounters.getMDC_IDC_STAT_EPISODE_RECENT_COUNT_AF();
					if (observationValue!= null) {
						obx_list.add(obxparser_nomenclature_mdt.parse_obx_VTVFCounters(index, observationValue, 738000));	
					}
					if (mdc_IDC_STAT_EPISODE_RECENT_COUNT_DTM_START!=null) {
						obx_list.add(obxparser_nomenclature_mdt.parse_obx_VTVFCounters(index, mdc_IDC_STAT_EPISODE_RECENT_COUNT_DTM_START, 738017));	
					}
					if (mdc_IDC_STAT_EPISODE_RECENT_COUNT_DTM_END!=null) {
						obx_list.add(obxparser_nomenclature_mdt.parse_obx_VTVFCounters(index, mdc_IDC_STAT_EPISODE_RECENT_COUNT_DTM_END, 738018));	
					}
				}
			}
			
			String switch_NSVT=AppConfig.getProperty("NSVT_Moitoring");
			if (switch_NSVT.toLowerCase().equals("on")) {
				observationValue=obxParser_vtvfcounters.getMDC_IDC_STAT_EPISODE_TYPE_NSVT();
				if (observationValue!= null) {
					index=index+1;
					obx_list.add(obxparser_nomenclature_mdt.parse_obx_VTVFCounters(index, observationValue, 737952));
					
					observationValue=obxParser_vtvfcounters.getMDC_IDC_STAT_EPISODE_RECENT_COUNT_NSVT();
					if (observationValue!= null) {
						obx_list.add(obxparser_nomenclature_mdt.parse_obx_VTVFCounters(index, observationValue, 738000));	
					}
					if (mdc_IDC_STAT_EPISODE_RECENT_COUNT_DTM_START!=null) {
						obx_list.add(obxparser_nomenclature_mdt.parse_obx_VTVFCounters(index, mdc_IDC_STAT_EPISODE_RECENT_COUNT_DTM_START, 738017));	
					}
					if (mdc_IDC_STAT_EPISODE_RECENT_COUNT_DTM_END!=null) {
						obx_list.add(obxparser_nomenclature_mdt.parse_obx_VTVFCounters(index, mdc_IDC_STAT_EPISODE_RECENT_COUNT_DTM_END, 738018));	
					}
				}
			}
			
			String switch_FVT=AppConfig.getProperty("FVT_Moitoring");
			if (switch_FVT.toLowerCase().equals("on")) {
				observationValue=obxParser_vtvfcounters.getMDC_IDC_STAT_EPISODE_TYPE_FVT();
				if (observationValue!= null) {
					index=index+1;
					obx_list.add(obxparser_nomenclature_mdt.parse_obx_VTVFCounters(index, observationValue, 737952));
					
					observationValue=obxParser_vtvfcounters.getMDC_IDC_STAT_EPISODE_RECENT_COUNT_FVT();
					if (observationValue!= null) {
						obx_list.add(obxparser_nomenclature_mdt.parse_obx_VTVFCounters(index, observationValue, 738000));	
					}
					if (mdc_IDC_STAT_EPISODE_RECENT_COUNT_DTM_START!=null) {
						obx_list.add(obxparser_nomenclature_mdt.parse_obx_VTVFCounters(index, mdc_IDC_STAT_EPISODE_RECENT_COUNT_DTM_START, 738017));	
					}
					if (mdc_IDC_STAT_EPISODE_RECENT_COUNT_DTM_END!=null) {
						obx_list.add(obxparser_nomenclature_mdt.parse_obx_VTVFCounters(index, mdc_IDC_STAT_EPISODE_RECENT_COUNT_DTM_END, 738018));	
					}
				}
			}
			
			String switch_VF=AppConfig.getProperty("VF_Moitoring");
			if (switch_VF.toLowerCase().equals("on")) {
				observationValue=obxParser_vtvfcounters.getMDC_IDC_STAT_EPISODE_TYPE_VF();
				if (observationValue!= null) {
					index=index+1;
					obx_list.add(obxparser_nomenclature_mdt.parse_obx_VTVFCounters(index, observationValue, 737952));
					
					observationValue=obxParser_vtvfcounters.getMDC_IDC_STAT_EPISODE_RECENT_COUNT_VF();
					if (observationValue!= null) {
						obx_list.add(obxparser_nomenclature_mdt.parse_obx_VTVFCounters(index, observationValue, 738000));	
					}
					if (mdc_IDC_STAT_EPISODE_RECENT_COUNT_DTM_START!=null) {
						obx_list.add(obxparser_nomenclature_mdt.parse_obx_VTVFCounters(index, mdc_IDC_STAT_EPISODE_RECENT_COUNT_DTM_START, 738017));	
					}
					if (mdc_IDC_STAT_EPISODE_RECENT_COUNT_DTM_END!=null) {
						obx_list.add(obxparser_nomenclature_mdt.parse_obx_VTVFCounters(index, mdc_IDC_STAT_EPISODE_RECENT_COUNT_DTM_END, 738018));	
					}
				}
			}
			
			/*
			String minVT=AppConfig.getProperty("minHL7");
			
			if (!minVT.toLowerCase().equals("yes")) {

				observationValue=obxParser_vtvfcounters.getMDC_IDC_STAT_EPISODE_TYPE_VT();
				if (observationValue!= null) {
					index=index+1;
					obx_list.add(obxparser_nomenclature_mdt.parse_obx_VTVFCounters(index, observationValue, 737952));

					observationValue=obxParser_vtvfcounters.getMDC_IDC_STAT_EPISODE_RECENT_COUNT_VT();
					if (observationValue!= null) {
						obx_list.add(obxparser_nomenclature_mdt.parse_obx_VTVFCounters(index, observationValue, 738000));	
					}
					if (mdc_IDC_STAT_EPISODE_RECENT_COUNT_DTM_START!=null) {
						obx_list.add(obxparser_nomenclature_mdt.parse_obx_VTVFCounters(index, mdc_IDC_STAT_EPISODE_RECENT_COUNT_DTM_START, 738017));	
					}
					if (mdc_IDC_STAT_EPISODE_RECENT_COUNT_DTM_END!=null) {
						obx_list.add(obxparser_nomenclature_mdt.parse_obx_VTVFCounters(index, mdc_IDC_STAT_EPISODE_RECENT_COUNT_DTM_END, 738018));	
					}
				}
				
				observationValue=obxParser_vtvfcounters.getMDC_IDC_STAT_EPISODE_TYPE_SVT();
				if (observationValue!= null) {
					index=index+1;
					obx_list.add(obxparser_nomenclature_mdt.parse_obx_VTVFCounters(index, observationValue, 737952));
					
					observationValue=obxParser_vtvfcounters.getMDC_IDC_STAT_EPISODE_RECENT_COUNT_SVT();
					if (observationValue!= null) {
						obx_list.add(obxparser_nomenclature_mdt.parse_obx_VTVFCounters(index, observationValue, 738000));	
					}
					if (mdc_IDC_STAT_EPISODE_RECENT_COUNT_DTM_START!=null) {
						obx_list.add(obxparser_nomenclature_mdt.parse_obx_VTVFCounters(index, mdc_IDC_STAT_EPISODE_RECENT_COUNT_DTM_START, 738017));	
					}
					if (mdc_IDC_STAT_EPISODE_RECENT_COUNT_DTM_END!=null) {
						obx_list.add(obxparser_nomenclature_mdt.parse_obx_VTVFCounters(index, mdc_IDC_STAT_EPISODE_RECENT_COUNT_DTM_END, 738018));	
					}
				}
				
				observationValue=obxParser_vtvfcounters.getMDC_IDC_STAT_EPISODE_TYPE_AF();
				if (observationValue!= null) {
					index=index+1;
					obx_list.add(obxparser_nomenclature_mdt.parse_obx_VTVFCounters(index, observationValue, 737952));	
					
					observationValue=obxParser_vtvfcounters.getMDC_IDC_STAT_EPISODE_RECENT_COUNT_AF();
					if (observationValue!= null) {
						obx_list.add(obxparser_nomenclature_mdt.parse_obx_VTVFCounters(index, observationValue, 738000));	
					}
					if (mdc_IDC_STAT_EPISODE_RECENT_COUNT_DTM_START!=null) {
						obx_list.add(obxparser_nomenclature_mdt.parse_obx_VTVFCounters(index, mdc_IDC_STAT_EPISODE_RECENT_COUNT_DTM_START, 738017));	
					}
					if (mdc_IDC_STAT_EPISODE_RECENT_COUNT_DTM_END!=null) {
						obx_list.add(obxparser_nomenclature_mdt.parse_obx_VTVFCounters(index, mdc_IDC_STAT_EPISODE_RECENT_COUNT_DTM_END, 738018));	
					}
				}
				
				observationValue=obxParser_vtvfcounters.getMDC_IDC_STAT_EPISODE_TYPE_FVT();
				if (observationValue!= null) {
					index=index+1;
					obx_list.add(obxparser_nomenclature_mdt.parse_obx_VTVFCounters(index, observationValue, 737952));
					
					observationValue=obxParser_vtvfcounters.getMDC_IDC_STAT_EPISODE_RECENT_COUNT_FVT();
					if (observationValue!= null) {
						obx_list.add(obxparser_nomenclature_mdt.parse_obx_VTVFCounters(index, observationValue, 738000));	
					}
					if (mdc_IDC_STAT_EPISODE_RECENT_COUNT_DTM_START!=null) {
						obx_list.add(obxparser_nomenclature_mdt.parse_obx_VTVFCounters(index, mdc_IDC_STAT_EPISODE_RECENT_COUNT_DTM_START, 738017));	
					}
					if (mdc_IDC_STAT_EPISODE_RECENT_COUNT_DTM_END!=null) {
						obx_list.add(obxparser_nomenclature_mdt.parse_obx_VTVFCounters(index, mdc_IDC_STAT_EPISODE_RECENT_COUNT_DTM_END, 738018));	
					}
				}
				
				observationValue=obxParser_vtvfcounters.getMDC_IDC_STAT_EPISODE_TYPE_NSVT();
				if (observationValue!= null) {
					index=index+1;
					obx_list.add(obxparser_nomenclature_mdt.parse_obx_VTVFCounters(index, observationValue, 737952));
					
					observationValue=obxParser_vtvfcounters.getMDC_IDC_STAT_EPISODE_RECENT_COUNT_NSVT();
					if (observationValue!= null) {
						obx_list.add(obxparser_nomenclature_mdt.parse_obx_VTVFCounters(index, observationValue, 738000));	
					}
					if (mdc_IDC_STAT_EPISODE_RECENT_COUNT_DTM_START!=null) {
						obx_list.add(obxparser_nomenclature_mdt.parse_obx_VTVFCounters(index, mdc_IDC_STAT_EPISODE_RECENT_COUNT_DTM_START, 738017));	
					}
					if (mdc_IDC_STAT_EPISODE_RECENT_COUNT_DTM_END!=null) {
						obx_list.add(obxparser_nomenclature_mdt.parse_obx_VTVFCounters(index, mdc_IDC_STAT_EPISODE_RECENT_COUNT_DTM_END, 738018));	
					}
				}
				
				observationValue=obxParser_vtvfcounters.getMDC_IDC_STAT_EPISODE_TYPE_VF();
				if (observationValue!= null) {
					index=index+1;
					obx_list.add(obxparser_nomenclature_mdt.parse_obx_VTVFCounters(index, observationValue, 737952));
					
					observationValue=obxParser_vtvfcounters.getMDC_IDC_STAT_EPISODE_RECENT_COUNT_VF();
					if (observationValue!= null) {
						obx_list.add(obxparser_nomenclature_mdt.parse_obx_VTVFCounters(index, observationValue, 738000));	
					}
					if (mdc_IDC_STAT_EPISODE_RECENT_COUNT_DTM_START!=null) {
						obx_list.add(obxparser_nomenclature_mdt.parse_obx_VTVFCounters(index, mdc_IDC_STAT_EPISODE_RECENT_COUNT_DTM_START, 738017));	
					}
					if (mdc_IDC_STAT_EPISODE_RECENT_COUNT_DTM_END!=null) {
						obx_list.add(obxparser_nomenclature_mdt.parse_obx_VTVFCounters(index, mdc_IDC_STAT_EPISODE_RECENT_COUNT_DTM_END, 738018));	
					}
				}
			}
			else {
				observationValue=obxParser_vtvfcounters.getMDC_IDC_STAT_EPISODE_TYPE_VT();
				if (observationValue!= null) {
					index=index+1;
					obx_list.add(obxparser_nomenclature_mdt.parse_obx_VTVFCounters(index, observationValue, 737952));

					observationValue=obxParser_vtvfcounters.getMDC_IDC_STAT_EPISODE_RECENT_COUNT_VT();
					if (observationValue!= null) {
						obx_list.add(obxparser_nomenclature_mdt.parse_obx_VTVFCounters(index, observationValue, 738000));	
					}
					if (mdc_IDC_STAT_EPISODE_RECENT_COUNT_DTM_START!=null) {
						obx_list.add(obxparser_nomenclature_mdt.parse_obx_VTVFCounters(index, mdc_IDC_STAT_EPISODE_RECENT_COUNT_DTM_START, 738017));	
					}
					if (mdc_IDC_STAT_EPISODE_RECENT_COUNT_DTM_END!=null) {
						obx_list.add(obxparser_nomenclature_mdt.parse_obx_VTVFCounters(index, mdc_IDC_STAT_EPISODE_RECENT_COUNT_DTM_END, 738018));	
					}
				}
			}
			 */
			
			observationValue=obxParser_vtvfcounters.getMDC_IDC_STAT_TACHYTHERAPY_SHOCKS_DELIVERED_RECENT();
			if (observationValue!= null) {
				obx_list.add(obxparser_nomenclature_mdt.parse_obx_VTVFCounters(observationValue, 737824));	
			}
			observationValue=obxParser_vtvfcounters.getMDC_IDC_STAT_TACHYTHERAPY_SHOCKS_ABORTED_RECENT();
			if (observationValue!= null) { 
				obx_list.add(obxparser_nomenclature_mdt.parse_obx_VTVFCounters(observationValue, 737856));
			}
		}
		
		if (singlePageTitle=="Battery and Lead Measurements" || singlePageTitle=="Batterie- und Elektrodenmessungen") {
			String observationValue=null;
			
			OBXObserValue_BatteryandLead obxParser_batteryandlead=
				new OBXObserValue_BatteryandLead(AppConfig.getProperty("PDFPARSER_LANGUAGE_SETTING"));
			obxParser_batteryandlead.setPdfContent(singlePageContent);
			observationValue=obxParser_batteryandlead.getMDC_IDC_MSMT_BATTERY_VOLTAGE();
			if (observationValue!= null) { 
				obx_list.add(obxparser_nomenclature_mdt.parse_obx_BatteryandLeadMeasurements(observationValue,721344));
			}
			observationValue=obxParser_batteryandlead.getMDC_IDC_MSMT_BATTERY_IMPEDANCE();
			if (observationValue!= null) { 
				obx_list.add(obxparser_nomenclature_mdt.parse_obx_BatteryandLeadMeasurements(observationValue, 721408));
			}
			observationValue=obxParser_batteryandlead.getMDC_IDC_MSMT_CAP_CHARGE_DTM();
			if (observationValue!= null) { 
				obx_list.add(obxparser_nomenclature_mdt.parse_obx_BatteryandLeadMeasurements(observationValue, 721664));
			}
			observationValue=obxParser_batteryandlead.getMDC_IDC_MSMT_CAP_CHARGE_TIME();
			if (observationValue!= null) { 
				obx_list.add(obxparser_nomenclature_mdt.parse_obx_BatteryandLeadMeasurements(observationValue, 721728));
			}
			// VV is iCARDEA defined nomenclature items, this parameter is specified by obxparser_nomenclature_icardea
			observationValue=obxParser_batteryandlead.getICARDEA_IDC_SET_VV();
			if (observationValue!= null) { 
				obx_list.add(obxparser_nomenclature_icardea.parse_obx_BatteryandLeadMeasurements(observationValue, 180404));
			}
		}
		
		if (singlePageTitle=="Heart Failure Management Report" || singlePageTitle=="Bericht Herzinsuffizienz-Management") {
			String observationValue=null;
			OBXObserValue_HeartFailureManagementReport obxParser_heartfailuremanagementreport=
				new OBXObserValue_HeartFailureManagementReport(AppConfig.getProperty("PDFPARSER_LANGUAGE_SETTING"));
		}
		
		if (singlePageTitle=="Lead Performance Trends" || singlePageTitle=="Elektrodentrends") {
			
			//logger.info(singlePageContent);
			
			String observationValue=null;
			OBXObserValue_LeadPerformanceTrends obxParser_leadperformancetrends=
				new OBXObserValue_LeadPerformanceTrends(AppConfig.getProperty("PDFPARSER_LANGUAGE_SETTING"));
			obxParser_leadperformancetrends.setPdfContent(singlePageContent);
			/*
			observationValue=obxParser_leadperformancetrends.getMDC_IDC_SET_LEADCHNL_RA_IMPEDANCE_POLARITY();
			if (observationValue!= null) { 
				//obx_list.add(obx_idc_nomenclature.parse_obx_BatteryandLeadMeasurements(observationValue,721344));
			}
			observationValue=obxParser_leadperformancetrends.getMDC_IDC_SET_LEADCHNL_RA_PACING_THRESHOLD_AMPLITUDE();
			if (observationValue!= null) { 
				//logger.info(observationValue);
				//obx_list.add(obx_idc_nomenclature.parse_obx_BatteryandLeadMeasurements(observationValue,721344));
			}
			//observationValue=obxParser_leadperformancetrends.getMDC_IDC_SET_LEADCHNL_RA_PACING_THRESHOLD_PULSEWIDTH();
			if (observationValue!= null) { 
				//logger.info(observationValue);
				//obx_list.add(obx_idc_nomenclature.parse_obx_BatteryandLeadMeasurements(observationValue,721344));
			}
			 */
		}
		
		if (singlePageTitle=="Patient Information" || singlePageTitle=="Angaben zum Patienten") {
			String observationValue=null;
			OBXObserValue_PatientInformation obxParser_patientinformation=
				new OBXObserValue_PatientInformation(AppConfig.getProperty("PDFPARSER_LANGUAGE_SETTING"));
			obxParser_patientinformation.setPdfContent(singlePageContent);
			
			/*Lead 1/2/3 for RA/RV/LV
			 *Current all ICD device is with single/double/triple leads
			 */
			for (int lead_index=1; lead_index<4; lead_index++) {
				observationValue=obxParser_patientinformation.getMDC_IDC_LEAD_MODEL(lead_index);
				if (observationValue!= null) {
					obx_list.add(obxparser_nomenclature_mdt.parse_obx_PatientInformation(lead_index, observationValue, 720961));	
				}
				observationValue=obxParser_patientinformation.getMDC_IDC_LEAD_SERIAL(lead_index);
				if (observationValue!= null) {
					obx_list.add(obxparser_nomenclature_mdt.parse_obx_PatientInformation(lead_index, observationValue, 720962));	
				}
				observationValue=obxParser_patientinformation.getMDC_IDC_LEAD_MFG(lead_index);
				if (observationValue!= null) {
					obx_list.add(obxparser_nomenclature_mdt.parse_obx_PatientInformation(lead_index, observationValue, 720963));	
				}
				observationValue=obxParser_patientinformation.getMDC_IDC_LEAD_IMPLANT_DT(lead_index);
				if (observationValue!= null) {
					obx_list.add(obxparser_nomenclature_mdt.parse_obx_PatientInformation(lead_index, observationValue, 720964));	
				}
				observationValue=obxParser_patientinformation.getMDC_IDC_LEAD_LOCATION(lead_index);
				if (observationValue!= null) {
					obx_list.add(obxparser_nomenclature_mdt.parse_obx_PatientInformation(lead_index, observationValue, 720966));	
				}
			}
		}
		return obx_list;
	}
}