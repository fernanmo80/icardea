/**
 * 
 */
package de.offis.health.icardea.cied.tools;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.PrintWriter;

import ca.uhn.hl7v2.HL7Exception;
import ca.uhn.hl7v2.model.Message;
import ca.uhn.hl7v2.parser.DefaultXMLParser;
import ca.uhn.hl7v2.parser.EncodingNotSupportedException;
import ca.uhn.hl7v2.parser.GenericParser;
import ca.uhn.hl7v2.parser.Parser;
import ca.uhn.hl7v2.parser.PipeParser;
import ca.uhn.hl7v2.parser.XMLParser;
import de.offis.health.icardea.tools.GlobalTools;

/**
 * @author ATh
 *
 */
public class HL7Tools {

	public static Message readFromFile(String filename) throws IOException, EncodingNotSupportedException, HL7Exception
	{
		StringBuilder messageBuffer = null;
		Message message = null;
		//FIXME IO Handling
		//TODO check if better HAPI Reader exists
		// i not sure if this reader works correct because of the readLine and \r
//			if (filename == null) {
//				throw IOException("Missing Filename");
//			} else 
			{
				BufferedReader bf =null;
				
					bf = new BufferedReader(new InputStreamReader(
							new FileInputStream(filename)));
					
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
				}
				
				Parser p = new GenericParser();
				message = p.parse(messageBuffer.toString());
			

		return message;
	}
	
	static public boolean hl7writing(boolean inXML, Message in, String pathname,
			String filename) throws IOException, HL7Exception{
		//TODO check if it ok to use printwriter for HL7
		if ( filename!=null){
			//TODO usage of local parser no creation of the a new one
			if (!inXML) {
				in.setParser(new PipeParser());
				filename+=".hl7";
			} else {
				in.setParser(new DefaultXMLParser());
				filename=filename+".xml";
			}
		}else {
			//TODO no filename error OR creation of filename via date
			return false;
		}
		//To avoid read write racing conflicts first write to *.tmp and rename after writer finished
		File file=new File(pathname);
		if (!file.isDirectory()) {
			GlobalTools.createDirectory(file.getAbsolutePath());
		}
		PrintWriter pw = new PrintWriter(new FileWriter(pathname
				+ filename+".tmp"));

//		logger.info("Store Message to "+ new_pathname+ new_filename);
//		logger.debug("Writing message:\n"+in.encode() );
		pw.print(in.encode());
		pw.close();
		return GlobalTools.moveFile(pathname
				+ filename+".tmp", pathname, filename);

	}
	

	public static String getPipeString(Message message) throws HL7Exception  {
		Parser parser = new PipeParser();	
		return parser.encode(message);
	}
	
	public  static String getXMLString(Message message) throws HL7Exception {
		XMLParser xmlParser = new DefaultXMLParser();
	
		return xmlParser.encode(message);
	}

	
	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}

}
