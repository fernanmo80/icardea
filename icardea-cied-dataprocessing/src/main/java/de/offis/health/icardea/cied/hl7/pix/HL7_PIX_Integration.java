package de.offis.health.icardea.cied.hl7.pix;

import java.io.BufferedReader;
import java.io.Closeable;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.List;

import org.apache.log4j.Logger;

import com.sun.mail.handlers.image_gif;

import ca.uhn.hl7v2.HL7Exception;
import ca.uhn.hl7v2.llp.LLPException;
import ca.uhn.hl7v2.model.Message;
import ca.uhn.hl7v2.model.v25.message.ORU_R01;
import ca.uhn.hl7v2.model.v25.message.RSP_K21;
import ca.uhn.hl7v2.model.v25.message.RSP_K23;
import ca.uhn.hl7v2.model.v25.segment.PID;
import ca.uhn.hl7v2.parser.EncodingNotSupportedException;
import ca.uhn.hl7v2.parser.PipeParser;
import ca.uhn.hl7v2.util.Terser;
import de.offis.health.icardea.cied.tools.HL7Tools;
import de.offis.health.icardea.common.exception.PropertyNotFoundException;
import de.offis.health.icardea.common.filenamefilter.HL7FilenameFilter;
import de.offis.health.icardea.config.AppConfig;
import de.offis.health.icardea.tools.GlobalTools;

public class HL7_PIX_Integration {
	
	private static Logger logger = Logger.getLogger(HL7_PIX_Integration.class);
	
	private File[] originalhl7Files = null;
	private List<File> hl74PIXFileList = null;
	
	public boolean execution(File original_HL7_Directory, File traget_HL7_Directory, File pix_Processed_HL7_Directory) throws PropertyNotFoundException, IOException{
		String targetFileDirectory=traget_HL7_Directory.getAbsolutePath()+GlobalTools.FILESEPARATOR;
		String pixProcessedHl7Directory=pix_Processed_HL7_Directory.getAbsolutePath()+GlobalTools.FILESEPARATOR;
		if (original_HL7_Directory.isDirectory()){
			this.originalhl7Files = original_HL7_Directory.listFiles(new HL7FilenameFilter());
			hl74PIXFileList=new ArrayList<File>();
			logger.debug("Filepath for HL7 waiting for PIX Integration: " + original_HL7_Directory.getAbsolutePath().toString());
			for (int i = 0; i < this.originalhl7Files.length; i++)
			{
				this.hl74PIXFileList.add(this.originalhl7Files[i]);
			}
			if (hl74PIXFileList.size()>0){
				//Here is the PIX function for the Serial number as CIED Identify
				pix4CIED (hl74PIXFileList, "CIED", "U",targetFileDirectory, pixProcessedHl7Directory);
			}
			else{
				logger.debug("No HL7 file waiting for PIX Integration");
			}
		}
		return false;
	}
	
	
	/**
	 * This method 
	 * 
	 */
	private void pix4CIED (List<File> hl7withPIXFileList, String assigningAuthority4PIX, String identifierTypeCode, String targetFileDirectory, String pixProcessedHl7Directory) {
		
		for (File hl7File : hl7withPIXFileList)
		{
			String filename=hl7File.getName();
			int numPatientIdentifierList=0;
			String patientIDtoPIX=null;
			String patientIDfromPIX=null;
			
			String patient_family_name=null;
			String patient_given_name=null;
			String patient_second_name=null;
			try {
				Message msg=HL7Tools.readFromFile(hl7File.getAbsolutePath());
				ORU_R01 oru_msg=(ORU_R01) msg;
				PID pidSegment = oru_msg.getPATIENT_RESULT().getPATIENT().getPID();
				/*
				 * Search for the Device Type and Serial Number
				 * "U" Model and Serial Number of Device
				 * "SS" Patient Social Security Number
				 * "PI" Patient internal identifier
				 * More Code please find in Data Definition Tables from
				 * http://www.hl7.org/special/committees/vocab/V26_Appendix_A.pdf
				 * Page A-76
				 */
				patientIDtoPIX=getPatientIDfromHL7ORU(msg, identifierTypeCode);
				if (patientIDtoPIX==null) {
					logger.warn("Could not find Identifier Type Code "+identifierTypeCode+" in HL7 message" );
				}
				else{
					//Get Patient ID from PIX Manager with original ID
					//patientIDfromPIX=this.getPatientIDfromPIX(patientIDtoPIX);
					
					//QBP^Q23 PIX QUERY – PATIENT IDENTIFIER QUERY
					//RSP_K23 rspMsg_k23=this.getRsp_K23(patientIDtoPIX);
					
					//QBP^Q22 PDQ QUERY – PATIENT DEMOGRAPHICS QUERY
					RSP_K21 rspMsg_k22=this.getRsp_K22(patientIDtoPIX);
					
					if (rspMsg_k22==null) {
						logger.warn("Could not get ID from PIX Manager for Patient ID "+patientIDtoPIX+". Try to connect with PIX manager later.");
					}
					else {
						/*
						 * extend the Patient Identifier List with the PID for and from PIX Manager;
						 */
						Terser terser = new Terser(rspMsg_k22);
						
						patientIDfromPIX=terser.get("/QUERY_RESPONSE(0)/.PID-3-1");
						logger.debug("patientIDfromPIX is "+patientIDfromPIX);
						
						patient_family_name=terser.get("/QUERY_RESPONSE(0)/.PID-5-1");
						patient_given_name=terser.get("/QUERY_RESPONSE(0)/.PID-5-2");
						patient_second_name=terser.get("/QUERY_RESPONSE(0)/.PID-5-3");
						
						logger.debug("patient_family_name is " +patient_family_name);
						logger.debug("patient_given_name is "+patient_given_name);
						logger.debug("patient_second_name is "+patient_second_name);
						
						numPatientIdentifierList = pidSegment.getPatientIdentifierList().length;
						//pidSegment.getPatientIdentifierList(numPatientIdentifierList).getIDNumber().parse(patientIDtoPIX);
						//pidSegment.getPatientIdentifierList(numPatientIdentifierList).getAssigningAuthority().parse(assigningAuthority4PIX);
						//pidSegment.getPatientIdentifierList(numPatientIdentifierList).getIdentifierTypeCode().parse(identifierTypeCode);
						
						if(patientIDfromPIX!=null) {
							pidSegment.getPatientIdentifierList(numPatientIdentifierList).getIDNumber().parse(patientIDfromPIX);
							pidSegment.getPatientIdentifierList(numPatientIdentifierList).getAssigningAuthority().parse(AppConfig.getProperty("QUERY_NAMESPACE"));
							pidSegment.getPatientIdentifierList(numPatientIdentifierList).getIdentifierTypeCode().parse(AppConfig.getProperty("QUERY_IDENTIFIERTYPECODE"));
							
							if(patient_family_name!=null) {
								pidSegment.getPatientName(0).getFamilyName().parse(patient_family_name);
							}
							
							if(patient_given_name!=null) {
								pidSegment.getPatientName(0).getGivenName().parse(patient_given_name);
							}
							
							if(patient_second_name!=null) {
								pidSegment.getPatientName(0).getGivenName().parse(patient_second_name);
							}
							
							if(HL7Tools.hl7writing(false, msg, targetFileDirectory, filename.substring(0,filename.lastIndexOf("."))+"_pix")) 
							{
								/*
								 *Move the HL7 message which could be found mapped PIX ID into the pixProcessedHl7Directory
								 */
								GlobalTools.moveFile(hl7File.getAbsolutePath(), 
										pixProcessedHl7Directory, 
										filename.substring(0,filename.lastIndexOf("."))+"_before_mapped_PIX"+filename.substring(filename.lastIndexOf(".")));
							}
							else {
								logger.warn("Error for generate "+filename.substring(0,filename.lastIndexOf("."))+"_pix"+ " into "+targetFileDirectory);
							}
						}
						else {
							logger.warn("Could not fetch corresponding Patient ID in PIX Manager for iCARDEA ID "+patientIDtoPIX);
							/*
							 *Move the HL7 message which could not be found mapped PIX ID into the pixProcessedHl7Directory
							 */
							GlobalTools.moveFile(hl7File.getAbsolutePath(), 
									pixProcessedHl7Directory, 
									filename.substring(0,filename.lastIndexOf("."))+"_before_no_PIX"+filename.substring(filename.lastIndexOf(".")));
						}
					}
				}
			} catch (Exception e) {
				// TODO Auto-generated catch block
				logger.error("Exception!!!!!!!!!!!");//e.printStackTrace();
			}
		}
	}

	public static String getPatientIDfromHL7ORU(Message msg, String identifierTypeCode) {
		String patientIDfromHL7=null;
		ORU_R01 oru_msg=(ORU_R01) msg;
		PID pidSegment = oru_msg.getPATIENT_RESULT().getPATIENT().getPID();
		int numPatientIdentifierList = pidSegment.getPatientIdentifierList().length;
		if (numPatientIdentifierList!=0) {
			for (int i=0; i<pidSegment.getPatientIdentifierList().length; i++) {
				/*Looking for the Patient Identifier List including 
				 * the required Identifier Type Code such as 
				 * "U" for Model and Serial Number of Device
				 */
				if (pidSegment.getPatientIdentifierList(i).getIdentifierTypeCode().toString().equals(identifierTypeCode)) {
					patientIDfromHL7=pidSegment.getPatientIdentifierList(i).getIDNumber().getValue();
					//Example Serial Number "model:Secura/serial:PZC600368S";
					logger.debug("Identify sent to PIX"+ " is "+ patientIDfromHL7);
					break;
				}
			}
		} else {
			logger.warn("No Patient Identifier List in HL7 message");
		}
		return patientIDfromHL7;
	}
	
	/*
	 * PIX QUERY – PATIENT IDENTIFIER QUERY
	 * QUERY MESSAGE -patientIDtoPIX
	 * RESPONSE MESSAGE -patientIDfromPIX
	 */
	private String getPatientIDfromPIX(String patientIDtoPIX) {
		/*In iCARDEA PIX Interaction
		 *-Personal Identifier for PIX Consumer
		 *namespace="CIED";
		 *universal_id="bbe3a050-079a-11e0-81e0-0800200c9a66";
		 *universal_type="UUID"; The DCE Universal Unique Identifier
		 *-Domain Returned for PIX Manager
		 *namespace="icardea";
		 *universal_id="www.srdc.com.tr";
		 *universal_type="DNS"; An Internet dotted name. Either in ASCII or as integers
		 */
		String qbp3_namespace=null;
		String qbp3_universal_id=null;
		String qbp3_universal_type=null;
		String qbp3_assigningAuthority=null;
		String qbp3_identifierTypeCode=null;
		
		String qbp4_namespace=null;
		String qbp4_universal_id=null;
		String qbp4_universal_type=null;
		String qbp4_assigningAuthority=null;
		String qbp4_identifierTypeCode=null;
		
		String host_pixManager=null;
		//Default port number
		int port_pixManager=8080;
		
		PID_Consumer pidConsumer=null;
		String patientIDfromPIX=null;
		
		try {
			qbp3_namespace = AppConfig.getProperty("OWN_NAMESPACE");
			qbp3_universal_id = AppConfig.getProperty("OWN_UNIVERSAL_ID");
			qbp3_universal_type = AppConfig.getProperty("OWN_UNIVERSAL_TYPE");
			qbp3_assigningAuthority=qbp3_namespace+"&"+qbp3_universal_id+"&"+qbp3_universal_type;
			qbp3_identifierTypeCode=AppConfig.getProperty("OWN_IDENTIFIERTYPECODE");
			
			qbp4_namespace=AppConfig.getProperty("QUERY_NAMESPACE");
			qbp4_universal_id=AppConfig.getProperty("QUERY_UNIVERSAL_ID");
			qbp4_universal_type=AppConfig.getProperty("QUERY_UNIVERSAL_TYPE");
			qbp4_assigningAuthority=qbp4_namespace+"&"+qbp4_universal_id+"&"+qbp4_universal_type;
			qbp4_identifierTypeCode=AppConfig.getProperty("QUERY_IDENTIFIERTYPECODE");
			
			host_pixManager=AppConfig.getProperty("PIX_HOST");
			port_pixManager=GlobalTools.getIntValue(AppConfig.getProperty("PIX_PORT"));
			
			pidConsumer=new PID_Consumer();
			patientIDfromPIX=pidConsumer.getPIDfromPIX(patientIDtoPIX, 
					qbp3_assigningAuthority, qbp3_identifierTypeCode,
					qbp4_assigningAuthority, qbp4_identifierTypeCode,
					host_pixManager,port_pixManager);
		} catch (PropertyNotFoundException e) {
			logger.error("Attention! Could not get Query QBP information from Properity file");
			e.printStackTrace();
		}
		return patientIDfromPIX;
	}
	
	/*
	 * PIX QUERY – PATIENT IDENTIFIER QUERY
	 * QUERY MESSAGE - patientIDtoPIX
	 * RESPONSE MESSAGE – RSP^K23
	 */
	public RSP_K23 getRsp_K23(String patientIDtoPIX) {
		/*In iCARDEA PIX Interaction
		 *-Personal Identifier for PIX Consumer
		 *namespace="CIED";
		 *universal_id="bbe3a050-079a-11e0-81e0-0800200c9a66";
		 *universal_type="UUID"; The DCE Universal Unique Identifier
		 *-Domain Returned for PIX Manager
		 *namespace="icardea";
		 *universal_id="www.srdc.com.tr";
		 *universal_type="DNS"; An Internet dotted name. Either in ASCII or as integers
		 */
		String qbp3_namespace=null;
		String qbp3_universal_id=null;
		String qbp3_universal_type=null;
		String qbp3_assigningAuthority=null;
		String qbp3_identifierTypeCode=null;
		
		String qbp4_namespace=null;
		String qbp4_universal_id=null;
		String qbp4_universal_type=null;
		String qbp4_assigningAuthority=null;
		String qbp4_identifierTypeCode=null;
		
		String host_pixManager=null;
		//Default port number
		int port_pixManager=8080;
		
		PID_Consumer pidConsumer=null;
		RSP_K23 rspMsg_k23=null;
		
		try {
			qbp3_namespace = AppConfig.getProperty("OWN_NAMESPACE");
			qbp3_universal_id = AppConfig.getProperty("OWN_UNIVERSAL_ID");
			qbp3_universal_type = AppConfig.getProperty("OWN_UNIVERSAL_TYPE");
			qbp3_assigningAuthority=qbp3_namespace+"&"+qbp3_universal_id+"&"+qbp3_universal_type;
			qbp3_identifierTypeCode=AppConfig.getProperty("OWN_IDENTIFIERTYPECODE");
			
			qbp4_namespace=AppConfig.getProperty("QUERY_NAMESPACE");
			qbp4_universal_id=AppConfig.getProperty("QUERY_UNIVERSAL_ID");
			qbp4_universal_type=AppConfig.getProperty("QUERY_UNIVERSAL_TYPE");
			qbp4_assigningAuthority=qbp4_namespace+"&"+qbp4_universal_id+"&"+qbp4_universal_type;
			qbp4_identifierTypeCode=AppConfig.getProperty("QUERY_IDENTIFIERTYPECODE");
			
			host_pixManager=AppConfig.getProperty("PIX_HOST");
			port_pixManager=GlobalTools.getIntValue(AppConfig.getProperty("PIX_PORT"));
			
			pidConsumer=new PID_Consumer();
			rspMsg_k23=pidConsumer.rsp_k23(patientIDtoPIX, 
					qbp3_assigningAuthority, qbp3_identifierTypeCode,
					qbp4_assigningAuthority, qbp4_identifierTypeCode,
					host_pixManager,port_pixManager);
		} catch (PropertyNotFoundException e) {
			logger.error("Attention! Could not get Query QBP information from Properity file");
			e.printStackTrace();
		}
		return rspMsg_k23;
	}
	
	/*
	 * PIX QUERY – PATIENT IDENTIFIER QUERY
	 * QUERY MESSAGE - patientIDtoPIX
	 * RESPONSE MESSAGE – RSP^K22
	 */
	public RSP_K21 getRsp_K22(String patientIDtoPIX) {
		/*In iCARDEA PIX Interaction
		 *-Personal Identifier for PIX Consumer
		 *namespace="CIED";
		 *universal_id="bbe3a050-079a-11e0-81e0-0800200c9a66";
		 *universal_type="UUID"; The DCE Universal Unique Identifier
		 *-Domain Returned for PIX Manager
		 *namespace="icardea";
		 *universal_id="www.srdc.com.tr";
		 *universal_type="DNS"; An Internet dotted name. Either in ASCII or as integers
		 */
		String qbp3_namespace=null;
		String qbp3_universal_id=null;
		String qbp3_universal_type=null;
		/*
		String qbp4_namespace=null;
		String qbp4_universal_id=null;
		String qbp4_universal_type=null;
		*/
		ArrayList<String> qbp3_demographicsFields=new ArrayList<String>();
		String qbp8_domainReturned=null;
		
		String host_pixManager=null;
		//Default port number
		int port_pixManager=8080;
		
		PID_Consumer pidConsumer=null;
		RSP_K21 rspMsg_k22=null;
		
		try {
			qbp3_namespace = AppConfig.getProperty("OWN_NAMESPACE");
			qbp3_universal_id = AppConfig.getProperty("OWN_UNIVERSAL_ID");
			qbp3_universal_type = AppConfig.getProperty("OWN_UNIVERSAL_TYPE");
			/*
			qbp4_namespace=AppConfig.getProperty("QUERY_NAMESPACE");
			qbp4_universal_id=AppConfig.getProperty("QUERY_UNIVERSAL_ID");
			qbp4_universal_type=AppConfig.getProperty("QUERY_UNIVERSAL_TYPE");
			*/
			
			host_pixManager=AppConfig.getProperty("PIX_HOST");
			port_pixManager=GlobalTools.getIntValue(AppConfig.getProperty("PIX_PORT"));
			
			if (patientIDtoPIX!=null) {
			qbp3_demographicsFields.add("@PID.3.1^"+patientIDtoPIX);
			}
			if (qbp3_namespace!=null) {
			qbp3_demographicsFields.add("@PID.3.4.1^"+qbp3_namespace);
			}
			
			//qbp8_domainReturned is still not clear
			//qbp8_domainReturned="^^^"+qbp3_namespace+"&"+qbp3_universal_id+"&"+qbp3_universal_type;
			
			pidConsumer=new PID_Consumer();
			rspMsg_k22=pidConsumer.rsp_k22(patientIDtoPIX, 
					qbp3_demographicsFields, qbp8_domainReturned,
					host_pixManager,port_pixManager);
		} catch (PropertyNotFoundException e) {
			logger.error("Attention! Could not get Query QBP information from Properity file");
			e.printStackTrace();
		}
		return rspMsg_k22;
	}
}