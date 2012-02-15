package de.offis.health.icardea.cied.hl7.processing;

import java.io.IOException;
import java.net.Socket;
import java.net.UnknownHostException;

import org.apache.log4j.Logger;

import ca.uhn.hl7v2.HL7Exception;
import ca.uhn.hl7v2.app.Application;
import ca.uhn.hl7v2.app.ApplicationException;
import ca.uhn.hl7v2.app.Connection;
import ca.uhn.hl7v2.app.ConnectionHub;
import ca.uhn.hl7v2.app.Initiator;
import ca.uhn.hl7v2.app.SimpleServer;
import ca.uhn.hl7v2.llp.LLPException;
import ca.uhn.hl7v2.llp.LowerLayerProtocol;
import ca.uhn.hl7v2.llp.MinLowerLayerProtocol;
import ca.uhn.hl7v2.model.Message;
import ca.uhn.hl7v2.parser.DefaultXMLParser;
import ca.uhn.hl7v2.parser.Parser;
import ca.uhn.hl7v2.parser.PipeParser;


/**
 * This class is responsible for the HL7 message sending to defined IP and host.
 * Either *.hl7 or *.xml message could be sent. 
 * It also contains MinLowerLayerProtocol.
 * 
 * @author MYang
 */

public class HL7_ORU_Sending {
	/**
	 * Logger object
	 */
	private static Logger logger = Logger.getLogger(HL7_ORU_Sending.class);
	private int port;
	private String host;
	private Socket socket = null;
	private String targetIpAddress = null;  
	private int targetPort = 0;

	public HL7_ORU_Sending(String host, int port) {
		this.host = host;
		this.port = port;
	}
	
	public boolean send(Message oru, boolean inXML) throws HL7Exception,
	LLPException, IOException, Exception {
		boolean sendingFlag=false;
		ConnectionHub connectionHub = ConnectionHub.getInstance();
		//Parser parser = new PipeParser();
		//Parser parser = new DefaultXMLParser();
		//Connection connection = connectionHub.attach(host, port, parser,
		//		MinLowerLayerProtocol.class);
		Connection connection = null;
		if (inXML) {
			connection = connectionHub.attach(host, port,
					new DefaultXMLParser(), MinLowerLayerProtocol.class);
		} else {
			connection = connectionHub.attach(host, port, new PipeParser(),
					MinLowerLayerProtocol.class);
		}
		
		//The initiator is used to transmit unsolicited messages
		Initiator initiator = connection.getInitiator();
		initiator.setTimeoutMillis(6000);
		Message response = initiator.sendAndReceive(oru);
		
		
		if (response!=null){
			String responseString = (new DefaultXMLParser()).encode(response);
		
			logger.debug("Received response:\n" + responseString);
			sendingFlag=true;
		}
		return sendingFlag;
	}
		//connection.close();
		/*
		logger.info("==============New Connection fot HL7==============");
		ConnectionHub connectionHub = ConnectionHub.getInstance();
		Connection connection = null;
		
		try{
			if (inXML) {
				connection = connectionHub.attach(host, port,
						new DefaultXMLParser(), MinLowerLayerProtocol.class);
			} else {
				connection = connectionHub.attach(host, port, new PipeParser(),
						MinLowerLayerProtocol.class);
			}
			logger.info("Connection status "+connection.isOpen());
			// The initiator is used to transmit unsolicited messages
			
			Initiator initiator = connection.getInitiator();
			initiator.setTimeoutMillis(20000);
			
			//Message response = initiator.sendAndReceive(oru);
			//logger.info("Wating for Message response (ACK) with Message Control ID");
			
			String responseString = null;//"";
			while (responseString==null){
				logger.info("responseString==null");
				Message response =null;
				//while(!connection.isOpen()){#
				logger.info("Connection status "+connection.isOpen());
				while(connection.isOpen()){
				logger.info("Wating for Message response (ACK) with Message Control ID");
					if (connection.isOpen()){
						logger.info("connection now is Open!!!!!!");
					response = initiator.sendAndReceive(oru);
					}
					if (response !=null){
						if (inXML) {
							responseString = (new DefaultXMLParser()).encode(response);
						} else {
							responseString = (new PipeParser()).encode(response);
						}
					}
					break;
				}
			if (responseString!=null){
				logger.info("Received response:\n" + responseString);
				//connection.close();
				break;};
			}
			
			if (responseString!=null){
			//connection.close();
			}
		}
		catch (HL7Exception e) {
			// TODO Auto-generated catch block
			logger.info("Alert for Timeout waiting for response to message with control ID");
			logger.info("Reason is the network problem or the server is shutdown");
			//Thread.sleep(1000); 
			//this.ConnectionErrorHandlers(host, port);
			e.printStackTrace();
		} catch (LLPException e) {
			// TODO Auto-generated catch block
			logger.info("Alert 2");
			e.printStackTrace();
		} catch (IOException e) {
			// TODO Auto-generated catch block
			logger.info("Alert 3");
			e.printStackTrace();
		}
		finally{
			logger.info("Transmittion is finished--------------------");
			}
		logger.info("Connection is closed");
		//
		 * 
		 */
	
	
	public void ConnectionErrorHandlers(String host, int port) {
		logger.info("HL7 transmittion failed");
		/*
		try {
			this.connect(host, port);
		} catch (UnknownHostException e) {  
			logger.error("Host IP address could not defined, connection could not be built. targetIP=" 
					+ host + ", targetPort="+String.valueOf(port));  
			e.printStackTrace();  
		} catch (IOException e) {  
			logger.error("Access is denied, connection could not be built, Please check internet! targetIP="
					+ host + ", targetPort="+String.valueOf(port));  
			e.printStackTrace();  
		}
		*/
	}
	
	private void connect(String targetIpAddress, int targetPort) throws IOException { 
		  
		setTargetIpAddress(targetIpAddress);  
		setTargetPort(targetPort);  
		if(socket == null)  
			socket = new Socket(targetIpAddress, targetPort);  
	}
	
	private void closeSocket() {  
		try {  
			if (!socket.isClosed())  
				socket.close();  
			socket = null;  
		} catch (IOException e) {  
			e.printStackTrace();  
		}  
	}  
	
	/** 
	 * @return the targetIpAddress 
	 */  
	 public String getTargetIpAddress() {  
		 return targetIpAddress;  
	 }  
	 
	 /** 
	  * @param targetIpAddress 
	  *            the targetIpAddress to set 
	  */  
	 public void setTargetIpAddress(String targetIpAddress) {  
		 this.targetIpAddress = targetIpAddress;  
	 }  
	 
	 /** 
	  * @return the targetPort 
	  */  
	 public int getTargetPort() {  
		 return targetPort;  
	 }  
	 
	 /** 
	  * @param targetPort 
	  *            the targetPort to set 
	  */  
	 public void setTargetPort(int targetPort) {  
		 this.targetPort = targetPort;  
	 }  
	 
	 
}
