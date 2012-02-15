package de.offis.health.icardea.cied.tools;

import java.io.File;
import java.io.IOException;
import java.util.ArrayList;

import javax.mail.MessagingException;

import org.apache.log4j.Logger;

import ca.uhn.hl7v2.HL7Exception;
import de.offis.health.icardea.cied.hl7.oru.ORU_EGM;
import de.offis.health.icardea.cied.hl7.oru.ORU_MSH;
import de.offis.health.icardea.cied.hl7.oru.ORU_OBR;
import de.offis.health.icardea.cied.hl7.oru.ORU_OBX;
import de.offis.health.icardea.cied.hl7.oru.ORU_PID;
import de.offis.health.icardea.cied.hl7.processing.HL7_ORU_Creator;
import de.offis.health.icardea.config.AppConfig;
import de.offis.health.icardea.tools.GlobalTools;

public class HL7Generator {
	private static Logger logger = Logger.getLogger(HL7Generator.class);
	
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
}
