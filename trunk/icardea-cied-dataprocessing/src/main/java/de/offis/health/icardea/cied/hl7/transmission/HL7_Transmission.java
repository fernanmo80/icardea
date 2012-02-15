package de.offis.health.icardea.cied.hl7.transmission;

import java.io.File;
import java.io.IOException;
import java.net.Socket;
import java.net.UnknownHostException;

import com.sun.net.ssl.internal.ssl.Provider;

import java.security.Security;
import java.text.DateFormat;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;
import java.util.ResourceBundle;

import javax.net.ssl.SSLSocket;
import javax.net.ssl.SSLSocketFactory;
import javax.sql.rowset.serial.SerialArray;

import org.apache.log4j.Logger;

import ca.uhn.hl7v2.HL7Exception;
import ca.uhn.hl7v2.app.Connection;
import ca.uhn.hl7v2.app.ConnectionHub;
import ca.uhn.hl7v2.app.Initiator;
import ca.uhn.hl7v2.llp.LLPException;
import ca.uhn.hl7v2.llp.MinLowerLayerProtocol;
import ca.uhn.hl7v2.model.Message;
import ca.uhn.hl7v2.parser.DefaultXMLParser;
import ca.uhn.hl7v2.parser.EncodingNotSupportedException;
import ca.uhn.hl7v2.parser.PipeParser;

import de.offis.health.icardea.cied.hl7.pix.HL7_PIX_Integration;
import de.offis.health.icardea.cied.hl7.processing.HL7_ORU_Creator;
import de.offis.health.icardea.cied.hl7.processing.HL7_ORU_Sending;
import de.offis.health.icardea.cied.tools.Audit;
import de.offis.health.icardea.cied.tools.HL7Tools;
import de.offis.health.icardea.common.exception.PropertyNotFoundException;
import de.offis.health.icardea.common.filenamefilter.HL7FilenameFilter;
import de.offis.health.icardea.config.AppConfig;
import de.offis.health.icardea.tools.GlobalTools;

public class HL7_Transmission {

	private static Logger logger = Logger.getLogger(HL7_Transmission.class);
	static private int connectionCounter=0;
	//FIXME configuration for max connection error
	static private int MAX_CONNECTION_ERROR=200;


	public boolean execution(File hl74Transmission_Directory, File hl7afterTransmission_Directory) 
	throws PropertyNotFoundException, HL7Exception {
		String targetFileDirectory =hl7afterTransmission_Directory.getAbsolutePath()+GlobalTools.FILESEPARATOR;
		File[] hl7Files_PIX = null;
		boolean execution_flag=false;
		if (hl74Transmission_Directory.isDirectory()){
			hl7Files_PIX = hl74Transmission_Directory.listFiles(new HL7FilenameFilter());

			//logger.debug("Filepath.........: " + hl74Transmission_Directory.getAbsolutePath().toString());
			if (hl7Files_PIX.length>0) {
				for (int i = 0; i < hl7Files_PIX.length; i++)
				{
					execution_flag=sendingToCarePlanner(hl7Files_PIX[i], targetFileDirectory);
				}
			}
			else{
				logger.debug("No HL7 file waiting for transmittion");
				execution_flag=true;
			}
		}
		else {
			logger.warn("Directory "+hl74Transmission_Directory.getAbsolutePath()+" does not exist!");
		}
		return execution_flag;
	}

	private boolean sendingToCarePlanner(File hl7File, String targetFileDirectory) throws PropertyNotFoundException, HL7Exception {

		String host = AppConfig.getProperty("ADAPTIVE_CARE_PLANNER_HL7_SERVER");
		String filename=null;
		Socket socket = null;
		boolean inXML=AppConfig.getProperty("ADAPTIVE_CARE_PLANNER_HL7_isXML").equals("Yes");
		boolean sendingToCarePlanner_flag=false;
		int port = GlobalTools.getIntValue(AppConfig.getProperty("ADAPTIVE_CARE_PLANNER_HL7_PORT"));
		int portppm=25106;
		boolean toppm=true;
		try {
			 portppm = GlobalTools.getIntValue(AppConfig.getProperty("PPM_HL7_PORT"));
		}catch(PropertyNotFoundException ex){
			portppm=25106;
		}
		Message response=null;
		Connection connection=null;
		Connection connectionppm=null;
		
		ConnectionHub connectionHub=null;
		Initiator initiator=null;
		Initiator initiatorppm=null;
		
		Message oru=null;
		
		boolean isSSL=AppConfig.getProperty("isSSL").equals("Yes");
		boolean atnalog=true;//AppConfig.getProperty("isATNALog").equals("Yes");
		
		String patientID=null;
		String identifierTypeCode="U";
		
		filename=hl7File.getName();
		logger.info("Sending HL7 File '"+hl7File.getAbsolutePath() +"' to Adaptive Care Planner");
		try{
			{
				
				//Parser parser = new PipeParser();
				//Parser parser = new DefaultXMLParser();
				//Connection connection = connectionHub.attach(host, port, parser,
				//		MinLowerLayerProtocol.class);
				
				//ATNA Log
				if (atnalog) {
					/*TODO atna.log.server should be read from main iCARDEA properties 
					instead AppConfig.getProperty
					ResourceBundle properties = ResourceBundle.getBundle("icardea");
					String atnalogServer = properties.getString("atna.log.server");
					*/
					
					Message msg=HL7Tools.readFromFile(hl7File.getAbsolutePath());
					patientID=HL7_PIX_Integration.getPatientIDfromHL7ORU(msg, identifierTypeCode);
					
					String atnalogServer = AppConfig.getProperty("atnalogServer");
					int atnalogPort = GlobalTools.getIntValue(AppConfig.getProperty("atnalogPort"));
					
					String xml = Audit.createMessage("PCD-9", patientID, "", "");
					
					DateFormat ISO8601Local = new SimpleDateFormat ("yyyy-MM-dd'T'HH:mm:ss");
					String dateStr = ISO8601Local.format (new Date());
					Audit a = null;
					try {
						a = new Audit(atnalogServer, atnalogPort);
					} catch (UnknownHostException e) {
						// TODO Auto-generated catch block
						e.printStackTrace();
					}
					a.send_udp(a.create_syslog_xml("CiedDataExposureSystem", xml));
				}

				try {
					connectionHub = ConnectionHub.getInstance();
					connection = null;
					if (isSSL) {
						String keystoreFile = AppConfig.getProperty("keystoreFile");
						String keystorePass = "srdcpass";
						String truststoreFile = AppConfig.getProperty("truststoreFile");
						String truststorePass = "srdcpass";

						// Registering the JSSE provider
						Security.addProvider(new Provider());

						// Specifying the Keystore details
						System.setProperty("javax.net.ssl.keyStore", keystoreFile);
						System.setProperty("javax.net.ssl.keyStorePassword",
								keystorePass);
						System.setProperty("javax.net.ssl.trustStore", truststoreFile);
						System.setProperty("javax.net.ssl.trustStorePassword", truststorePass);
						// Initialize the Server Socket
						SSLSocketFactory sslsocketfactory = (SSLSocketFactory) SSLSocketFactory.getDefault();
						SSLSocket sslsocket = (SSLSocket) sslsocketfactory.createSocket(host, port);
						sslsocket.startHandshake();
						socket = sslsocket;
					}
					else{
						socket = new Socket(host, port);
					}
					if (inXML) {
					
						connection = new Connection(new DefaultXMLParser(), new MinLowerLayerProtocol(), socket);
//						connection = connectionHub.attach(host, port,
//								new DefaultXMLParser(), MinLowerLayerProtocol.class);
						try {
							connectionppm = connectionHub.attach(host, portppm,
									new DefaultXMLParser(),
									MinLowerLayerProtocol.class);
						} catch (Exception e) {
							// TODO: handle exception
							logger.info("no connection to PPM on port:" +portppm);
							toppm=false;
						}
					} else {
						connection = new Connection(new PipeParser(), new MinLowerLayerProtocol(), socket);
//						connection = connectionHub.attach(host, port, new PipeParser(),
//								MinLowerLayerProtocol.class);
						try {
							connectionppm = connectionHub.attach(host, portppm,
									new PipeParser(),
									MinLowerLayerProtocol.class);
						} catch (Exception e) {
							// TODO: handle exception
							logger.info("no connection to PPM on port:" +portppm);
							toppm=false;
						}
					}
					oru = HL7Tools.readFromFile(hl7File.getAbsolutePath());
					if (inXML) {
						oru.setParser(new DefaultXMLParser());
					} else {
						oru.setParser(new PipeParser());
					}
					initiator = connection.getInitiator();
					initiator.setTimeoutMillis(6000);
					
					if (toppm){
						initiatorppm = connectionppm.getInitiator();
						initiatorppm.setTimeoutMillis(6000);
					}
					if (connection!=null){
						if (!connection.isOpen()){
							connectionCounter++;
							logger.error("No Connection to Server:"+host+" on Port:"+port);
							return false;
						}
					}
				} catch (Exception e) {
					// TODO Auto-generated catch block analyse exception and better output for user
					logger.error("Got Exception "+ GlobalTools.getExceptionTraceLog(e));
					if (connection!=null){
						connectionCounter++;
						connection.close();
						return false;
					}
					return false;
				}

				//The initiator is used to transmit unsolicited messages
				if (toppm){
					try{
						response = initiatorppm.sendAndReceive(oru);
					
					if (response!=null){
						logger.info("PPM Transmittion is successful!");
					}
					}catch(Exception ex){
						logger.error("PPM Transmittion is failed!");
					}
					
				}
				
				response = initiator.sendAndReceive(oru);
				
				if (response!=null){
					//sendingToCarePlanner_flag=true;
					if(GlobalTools.moveFile(hl7File.getAbsolutePath(), 
							targetFileDirectory, 
							filename.substring(0,filename.lastIndexOf("."))+
							"_transmitted"+filename.substring(filename.lastIndexOf(".")))) {
						sendingToCarePlanner_flag=true;
						logger.info("Adaptive Careplan Engine Transmittion is successful! Move File "+ filename);
						connectionCounter=0;
					}
				}
			}
		}catch (IOException e){
			connectionCounter++;
			logger.error(connectionCounter + " Transmitions failed! " + GlobalTools.getExceptionTraceLog(e));
			//FIXME correct reaction here 
			if (connectionCounter> MAX_CONNECTION_ERROR) throw new HL7Exception("Server not responding");
			return false;
		} catch (EncodingNotSupportedException e) {
			// TODO Auto-generated catch block
			logger.error(GlobalTools.getExceptionTraceLog(e));
			return false;
		} catch (HL7Exception e) {
			// FIXME Problem of hapi when no ACK is send
			logger.error("Got HL7 Exception "+ GlobalTools.getExceptionTraceLog(e));

			logger.error("##Error Code for Exception:"+e.getErrorCode());
			if (e.getErrorCode()==207){
				logger.info("Got Timeout ACK for ACK Message. Ignoring for Careplaner!");
				if(GlobalTools.moveFile(hl7File.getAbsolutePath(), 
						targetFileDirectory, 
						filename.substring(0,filename.lastIndexOf("."))+
						"_transmitted_withoutACK"+filename.substring(filename.lastIndexOf(".")))) {
					logger.info("Transmittion may successful! Missing ACK! Move File "+ filename);
					connectionCounter=0;
				}
				return true;
			}
			return false;
		} catch (LLPException e) {
			connectionCounter++;
			logger.error(GlobalTools.getExceptionTraceLog(e));
			return(false);
		} catch (Exception e) {
			// FIXME Auto-generated catch block
			e.printStackTrace();
			return false;
		} 
		logger.info("HL7 Transmission is completed");
		if (connection!=null){
			connection.close();
		}
		return sendingToCarePlanner_flag;
	}
}