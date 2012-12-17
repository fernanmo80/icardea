package de.offis.health.icardea.cied.txt.parser;

import java.io.File;
import java.util.ArrayList;
import java.util.List;
import org.apache.log4j.Logger;
import de.offis.health.icardea.common.filenamefilter.SJM_TXTFilenameFilter;
import de.offis.health.icardea.config.AppConfig;
import de.offis.health.icardea.tools.GlobalTools;

/**
 * This class allows processing a SJM text file for parsing.
 * @author MYang
 */

public class TXTProcessing {
	
	private static Logger logger = Logger.getLogger(TXTProcessing.class);
	private List<String> sjmTxtunknown = new ArrayList<String>();
	
	public void execution(File sjm_Txt_Directory, File sjm_HL7_Directory) throws Exception {
		logger.debug("DIRECTORY for SJM TXT Report is " + sjm_Txt_Directory.getAbsolutePath());
		ArrayList<File> sjmTXTList=new ArrayList<File>();
		
		if (sjm_Txt_Directory.isDirectory()){
			/**
			 * Step 1. Find the location of all FollowupSummaryData.txt
			 */
			sjmTXTList=getTxtList(sjm_Txt_Directory, 0, sjmTXTList);
			for (int i = 0; i < sjmTXTList.size(); i++) {
				logger.info("SJM File txt "+sjmTXTList.get(i).getAbsolutePath());
			}
			if(sjmTXTList!= null) {
				//if there is any *.txt file under SJM_TXT_Directory
				logger.debug("Start parsing TXT into HL7v2.5 Messages");
				/**
				 * Step 2. Processing all FollowupSummaryData.txt
				 */
				processingTxtFiles(sjmTXTList, sjm_HL7_Directory);
			} else {
				logger.debug("No TXT Files in current directory "+ sjm_Txt_Directory.getAbsolutePath());
			}
		}
		else {
			logger.warn("Alert!!! Directory "+ sjm_Txt_Directory.getAbsolutePath()+" does not exist,please check it !");
		}
	}
	
	/**
	 * This function is aimed to get all FollowupSummaryData.txt from directory for SJM ICD report
	 */
	private ArrayList<File> getTxtList(File directory, int level, ArrayList<File> sjmTXTList) {
		//Level defines the deep of the directory
		File[] subtxtList=null;
		/*
		String preStr = ""; 
		for (int i = 0; i < level; i++) {
			preStr += "-"; 
		} 
		 */
		File[] childs = directory.listFiles(); 
		for (int i = 0; i < childs.length; i++) { 
			//logger.info(preStr + childs[i].getName());
			subtxtList=null;
			if (childs[i].isDirectory()) { 
				subtxtList=childs[i].listFiles(new SJM_TXTFilenameFilter());
				if (subtxtList!=null) {
					for (int j = 0; j < subtxtList.length; j++) {
						sjmTXTList.add(subtxtList[j]);
					}
				}
				getTxtList(childs[i], level + 1, sjmTXTList); 
			}
		}
		return sjmTXTList;
	}
	
	/**
	 * This function is aimed to processing all FollowupSummaryData.txt in directory for SJM ICD report
	 */
	private void processingTxtFiles (ArrayList<File> sjmTXTList,
			File sjm_HL7_Directory) throws Exception {
		//Step 2. Processing all FollowupSummaryData.txt
		TXTValidation txtValidation=null;
		TXT2HL7_HAPI_Parser txt2hl7_hapi=null;
		
		try {
			txtValidation=new TXTValidation();
			txt2hl7_hapi=new TXT2HL7_HAPI_Parser();
			File targerDir=null;
			/*
			for (int i=0; i<sjmTXTList.size(); i++) {
				logger.info("List numbers are "+ sjmTXTList.get(i).getAbsolutePath());
			}
			*/
			
			for (int i=0; i<sjmTXTList.size(); i++) {//(File txtFile : sjmTXTList) {
				
				String fileTimestamp = GlobalTools.date2String(new java.util.Date(), "yyyy-MM-dd_HH-mm-ss");
				File txtFile=sjmTXTList.get(i);
				logger.debug("Start Parsing: "+txtFile.getAbsolutePath());
				//Step 3. Checking each FollowupSummaryData.txt
				if (txtValidation.checkPDF(txtFile)) {
					//Step 4. Parsing each FollowupSummaryData.txt
					//boolean startTxtParsingFlag=true;
					//if (startTxtParsingFlag) {
					if (txt2hl7_hapi.txtParsing(txtFile, sjm_HL7_Directory)){
						/*If parsing from TXT to HL7 with HAPI is finished*/
						logger.info("Move supported file '" + 
								txtFile.getParentFile().getAbsolutePath() + "' to processed directory: "+
								AppConfig.getProperty("DIRECTORY_SJM_PROCESSED_TXT_REPORT")+
								txtFile.getParentFile().getParentFile().getName()+GlobalTools.FILESEPARATOR + txtFile.getParentFile().getName());
						//startTxtParsingFlag=false;
						
						targerDir=new File((AppConfig.getProperty("DIRECTORY_SJM_PROCESSED_TXT_REPORT")+txtFile.getParentFile().getParentFile().getName()));
						if (!targerDir.isDirectory()) {
							logger.info("Directory "+targerDir.getAbsolutePath()+ " does not exit ! Build directory "+targerDir);
							GlobalTools.createDirectory(targerDir.getAbsolutePath());
						}
						
						GlobalTools.moveFile(txtFile.getParentFile().getAbsolutePath(),//+GlobalTools.FILESEPARATOR+txtFile.getName(),
								AppConfig.getProperty("DIRECTORY_SJM_PROCESSED_TXT_REPORT"),
								txtFile.getParentFile().getParentFile().getName()+GlobalTools.FILESEPARATOR+fileTimestamp + "_processed_" + txtFile.getParentFile().getName());
						
						//fileOperation fileOperation=new fileOperation();
						//fileOperation.cutGeneralFile(txtFile.getParentFile().getAbsolutePath(), AppConfig.getProperty("DIRECTORY_SJM_PROCESSED_TXT_REPORT"));

					}
					else {
						logger.warn("Paring txt file "+ txtFile.getAbsolutePath() +" failed");
					}
					//}
				}
				else {
					this.sjmTxtunknown.add(txtFile.getName());
					logger.info("Move unsupported file '" + 
							txtFile.getName() + 
					"' to unknown directory.");
					//Check it
					/*GlobalTools.moveFile(AppConfig.getProperty("DIRECTORY_SJM_PROCESSED_TXT_REPORT")+txtFile.getName(), 
							AppConfig.getProperty("DIRECTORY_SJM_UNKNOWN_REPORT"), 
							fileTimestamp + "_processed_" + txtFile.getName());
							*/
				}
			}
		} catch (Exception ex) {
			logger.error(GlobalTools.getExceptionTraceLog(ex));
			throw ex;
		} finally {
		}
	} 
}