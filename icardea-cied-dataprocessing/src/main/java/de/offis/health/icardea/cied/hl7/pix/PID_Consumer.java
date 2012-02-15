package de.offis.health.icardea.cied.hl7.pix;

import java.io.IOException;
import java.net.Socket;
import java.security.Security;
import java.text.DateFormat;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Date;

import javax.net.ssl.SSLSocket;
import javax.net.ssl.SSLSocketFactory;

import org.apache.log4j.Logger;
import org.apache.log4j.PropertyConfigurator;

import com.sun.net.ssl.internal.ssl.Provider;

import ca.uhn.hl7v2.util.Terser;
import ca.uhn.hl7v2.HL7Exception;
import ca.uhn.hl7v2.app.Connection;
import ca.uhn.hl7v2.app.ConnectionHub;
import ca.uhn.hl7v2.app.Initiator;
import ca.uhn.hl7v2.llp.LLPException;
import ca.uhn.hl7v2.llp.MinLowerLayerProtocol;
import ca.uhn.hl7v2.model.Message;
import ca.uhn.hl7v2.model.v24.message.RSP_K22;
import ca.uhn.hl7v2.model.v25.message.QBP_Q21;
import ca.uhn.hl7v2.model.v25.message.RSP_K21;
import ca.uhn.hl7v2.model.v25.message.RSP_K23;
import ca.uhn.hl7v2.model.v25.segment.QPD;
import ca.uhn.hl7v2.parser.DefaultXMLParser;
import ca.uhn.hl7v2.parser.GenericParser;
import ca.uhn.hl7v2.parser.Parser;
import ca.uhn.hl7v2.parser.PipeParser;

import de.offis.health.icardea.app.CIEDInformationSystemApp;
import de.offis.health.icardea.common.exception.PropertyNotFoundException;
import de.offis.health.icardea.config.AppConfig;
import de.offis.health.icardea.tools.GlobalTools;

public class PID_Consumer {

	private static Logger logger = Logger.getLogger(PID_Consumer.class);
	//private static ConnectionHub connectionHub = null;
	
	public String getPIDfromPIX(String patientIDtoPIX, 
			String qbp3_assigningAuthority, String qbp3_identifierTypeCode,
			String qbp4_assigningAuthority, String qbp4_identifierTypeCode,
			String host_pixManager,int port_pixManager) {
		String patientIDfromPIX=null;
		QBP_Q21 qryMsg;
		RSP_K23 rspMsg;
		try {
			qryMsg = this.pdq_q23(patientIDtoPIX, 
					qbp3_assigningAuthority, qbp3_identifierTypeCode,
					qbp4_assigningAuthority, qbp4_identifierTypeCode);
			rspMsg=this.rsp_k23(qryMsg, host_pixManager, port_pixManager);
			
			/*
			//only for test assumed RESPONSE MESSAGE – RSP^K23
			String rspResponse=
				"MSH|^~\\&|NISTManager_SGSFAK|NIST|||20110819140210.757+0100||RSP^K23^RSP_K23|7b9a4a5b-4ea1-43ff-8de4-3ee4433be6cd|P|2.5"+"\r"
				+"MSA|AA|20090831110508|"+"\r"
				+"QAK|TPCBRINFO20090831110506PIX|OK"+"\r"
				+"QPD|PIX Query|20110729105408|model:CD2215-36/serial:9925119^^^&&|^^^CIED&bbe3a050-079a-11e0-81e0-0800200c9a66&UUID"+"\r"
				+"PID|||p12345^^^icardea&www.srdc.com.tr&DNS~12345^^^ORBIS&www.salk.at&DNS~i12345^^^CIED&bbe3a050-079a-11e0-81e0-0800200c9a66&UUID||Schmidt^Andreas||19530311|M|||^^^^||||||||"+"\r";
				
				Parser p = new GenericParser();	
				rspMsg = (RSP_K23) p.parse(rspResponse);
			 */
			
			if (rspMsg!=null) {
				Terser terser = new Terser(rspMsg);
				//patientIDfromPIX = terser.get("/.PID-3-1");
				patientIDfromPIX = terser.get("/QUERY_RESPONSE(0)/.PID-3-1");
				logger.info(rspMsg.encode());
				logger.info(terser.get("/QUERY_RESPONSE(0)/.PID-3-1"));
				logger.info(terser.get("/.PID-5-1"));
				logger.info(terser.get("/QUERY_RESPONSE(0)/.PID-5-2"));
				logger.info(terser.get("/QUERY_RESPONSE(0)/.PID-5-3"));
				logger.debug("PatientID from PIX:"+patientIDfromPIX);
			}
		} catch (HL7Exception e) {
			logger.warn("Could not connect with PIX Manager, please check it!");
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		return patientIDfromPIX;
	}
	
	/*
	 * CREAT PIX QUERY – PATIENT IDENTIFIER QUERY Q23
	 */
	public QBP_Q21 pdq_q23 (String qbp3_idNumber,
			String qbp3_assigningAuthority, String qbp3_identifierTypeCode,
			String qbp4_assigningAuthority, String qbp4_identifierTypeCode)
	throws HL7Exception {
		String qpd3_PersonIdentifier=null;
		String qpd4_DomainReturned=null;
		QBP_Q21 qry = new QBP_Q21();
		
		if (qbp3_idNumber!=null) {
			//a.getMSH().getFieldSeparator().parse("\\|");
			//a.getMSH().getEncodingCharacters().parse("^~\\&");
			Terser.set(qry.getMSH(), 1, 0, 1, 1, "|");
			Terser.set(qry.getMSH(), 2, 0, 1, 1, "^~\\&");
			qry.getMSH().getMsh9_MessageType().parse("QBP^Q23^QBP_Q21");
			// Set UTF-8 character set? Please See:
			// http://wiki.hl7.org/index.php?title=Character_Set_used_in_v2_messages
			qry.getMSH().getCharacterSet(0).setValue("UNICODE UTF-8");
			// Set Sending app identification
			qry.getMSH().getSendingApplication().parse(""); //APP NAME
			qry.getMSH().getSendingFacility().parse(""); //VENDOR NAME
			// Set Receiving app identification
			qry.getMSH().getReceivingApplication().parse("icardea"); //CLINIC APPLICATION
			qry.getMSH().getReceivingFacility().parse(""); //CLINIC ID
			
			qry.getMSH().getMessageControlID().parse(GlobalTools.date2String(new java.util.Date(), "yyyyMMddHHmmssSSS"));
			qry.getMSH().getProcessingID().parse("P");
			qry.getMSH().getVersionID().parse("2.5");
			
			QPD qpd = qry.getQPD();
			qpd.getQpd1_MessageQueryName().parse("IHE PDQ Query");
			//Time stamp&PIX 
			qpd.getQpd2_QueryTag().setValue(GlobalTools.date2String(new java.util.Date(), "yyyyMMddHHmmssSSS")+"PIX"); // A query identifier (Unique name for this query)
			
			/*For QPD-3 Person Identifier
			 *Full sample for QPB-3: P12345^^^91-10030214KP & 2.16.458.1.100000.1.10&ISO^20
			 */
			qpd3_PersonIdentifier=qbp3_idNumber;
			if (qbp3_assigningAuthority!=null) {
				qpd3_PersonIdentifier=qpd3_PersonIdentifier+"^^^"+qbp3_assigningAuthority;
				if (qbp3_identifierTypeCode!=null) {
					qpd3_PersonIdentifier=qpd3_PersonIdentifier+"^"+qbp3_identifierTypeCode;
				}
			}
			else {
				logger.warn("No Assigning Authority in QBP-3");
			}
			qpd.getField(3, 0).parse(qpd3_PersonIdentifier);
			
			/*For QPD-4 Domain Returned
			 *Full sample for QBP-4: ^^^Malaysia&2.16.458.1.100000.1&ISO~^^^VIAMED&2.16.458.1.100000.1.7&ISO
			 */
			if (qbp4_assigningAuthority!=null) {
				qpd4_DomainReturned="^^^"+qbp4_assigningAuthority;
				if (qbp4_identifierTypeCode!=null) {
					qpd4_DomainReturned=qpd4_DomainReturned+"^"+qbp4_identifierTypeCode;
					qpd.getField(4, 0).parse(qpd4_DomainReturned);
				}
			}
			else {
				logger.warn("No Assigning Authority in QBP-4");
			}
			
			qry.getRCP().getRcp1_QueryPriority().setValue("I"); // immediate mode response
			
			logger.debug("QBP^Q23 to PIX Manager\r"+qry.encode());
			//Parser p = new GenericParser();
			//Message message = p.parse(createMessage(ciedSerialNumber));
			//logger.info("RESPONSE MESSAGE – RSP^K23"+"\r"+this.sendAndRecv(message).encode());
		}
		else {
			qry=null;
			logger.warn("No ID Number in QPD-3");
		}
		return qry;
	}
	
	/*
	 * CREAT PDQ QUERY – PATIENT DEMOGRAPHICS QUERY Q22
	 */
	public QBP_Q21 pdq_q22 (String qbp3_idNumber,
			ArrayList<String> qbp3_demographicsFields, String qbp8_domainReturned)
	throws HL7Exception {
		
		QBP_Q21 qry = new QBP_Q21();
		
		if (qbp3_idNumber!=null) {
			//a.getMSH().getFieldSeparator().parse("\\|");
			//a.getMSH().getEncodingCharacters().parse("^~\\&");
			Terser.set(qry.getMSH(), 1, 0, 1, 1, "|");
			Terser.set(qry.getMSH(), 2, 0, 1, 1, "^~\\&");
			qry.getMSH().getMsh9_MessageType().parse("QBP^Q22^QBP_Q21");
			// Set UTF-8 character set? Please See:
			// http://wiki.hl7.org/index.php?title=Character_Set_used_in_v2_messages
			qry.getMSH().getCharacterSet(0).setValue("UNICODE UTF-8");
			// Set Sending app identification
			qry.getMSH().getSendingApplication().parse(""); //APP NAME
			qry.getMSH().getSendingFacility().parse(""); //VENDOR NAME
			// Set Receiving app identification
			qry.getMSH().getReceivingApplication().parse("icardea"); //CLINIC APPLICATION
			qry.getMSH().getReceivingFacility().parse(""); //CLINIC ID
			
			qry.getMSH().getMessageControlID().parse(GlobalTools.date2String(new java.util.Date(), "yyyyMMddHHmmssSSS"));
			qry.getMSH().getProcessingID().parse("P");
			qry.getMSH().getVersionID().parse("2.5");
			
			QPD qpd = qry.getQPD();
			qpd.getQpd1_MessageQueryName().parse("IHE PDQ Query");
			//Time stamp&PIX 
			qpd.getQpd2_QueryTag().setValue(GlobalTools.date2String(new java.util.Date(), "yyyyMMddHHmmssSSS")+"PIX"); // A query identifier (Unique name for this query)

			for (int i=0; i<qbp3_demographicsFields.size();i++) {
				if (qbp3_demographicsFields!=null) {
					qpd.getField(3, i).parse(qbp3_demographicsFields.get(i));
				}
				else {
					logger.warn("No Demographics Fields");
				}
			}
			
			if (qbp8_domainReturned!=null) {
				qpd.getField(8, 0).parse(qbp8_domainReturned);
			}
			else {
				logger.debug("No Domain Returned");
			}
			
			qry.getRCP().getRcp1_QueryPriority().setValue("I"); // immediate mode response
			
			logger.debug("QBP^Q23 to PIX Manager\r"+qry.encode());
		}
		else {
			qry=null;
			logger.warn("No ID Number in QPD-3");
		}
		return qry;
	}
	
	/*
	 * REQUIRE PATIENT DEMOGRAPHICS QUERY
	 * QUERY patientIDtoPIX
	 * RESPONSE MESSAGE – RSP^K22
	 */
	public RSP_K21 rsp_k22 (String patientIDtoPIX,
			ArrayList<String> qbp3_demographicsFields, String qbp8_domainReturned,
			String host_pixManager,int port_pixManager) {
		
		QBP_Q21 qryMsg_q22;
		RSP_K21 rspMsg_k22;
		rspMsg_k22=null;
		try {
			qryMsg_q22 = this.pdq_q22(patientIDtoPIX, 
					qbp3_demographicsFields, qbp8_domainReturned);
			/*
			String q22_demo=
				"MSH|^~\\&|||icardea||||QBP^Q22^QBP_Q21|20110825012938748|P|2.5||||||UNICODE UTF-8"+"\r"
				//+"QPD|PIX Query|20110729105408|@PID.3.1^101~@PID.3.4.1^icardea|||||^^^CIED&bbe3a050-079a-11e0-81e0-0800200c9a66&UUID"+"\r"
				//+"QPD|PIX Query|20110729105408|@PID.5.1.1^Doe~@PID.5.2^John|||||^^^CIED&bbe3a050-079a-11e0-81e0-0800200c9a66&UUID"+"\r"
				+"QPD|PIX Query|20110729105408|@PID.3.1^model:V-193C/serial:43210~@PID.3.4.1^CIED|||||^^^CIED&bbe3a050-079a-11e0-81e0-0800200c9a66&UUID"+"\r"
				+"RCP|I";
			Parser p = new GenericParser();
			qryMsg_q22=(QBP_Q21) p.parse(q22_demo);
			 */
			rspMsg_k22=this.rsp_k22(qryMsg_q22, host_pixManager, port_pixManager);
		} catch (HL7Exception e) {
			logger.warn("Could not connect with PIX Manager, please check it!");
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		return rspMsg_k22;
	}
	
	/*
	 * REQUIRE PATIENT DEMOGRAPHICS QUERY
	 * QUERY available QBP^22
	 * RESPONSE MESSAGE – RSP^K22
	 */
	public RSP_K21 rsp_k22 (Message qry_q22, String host_pixManager, int port_pixManager){
		RSP_K21 rsp_k22 = null;
		try {
			rsp_k22=(RSP_K21) this.sendAndRecv(qry_q22, host_pixManager, port_pixManager);
		} catch (LLPException e) {
			// TODO Auto-generated catch block
			logger.error("LLP Exception!!!!!!!!!!!");// e.printStackTrace();
		} catch (HL7Exception e) {
			// TODO Auto-generated catch block
			logger.error("HL7 Exception!!!!!!!!!!!");// e.printStackTrace();
		} catch (IOException e) {
			// TODO Auto-generated catch block
			logger.error("PIX IO Exception!!!!!!!!!!!");// e.printStackTrace();
		} catch (PropertyNotFoundException e) {
			// TODO Auto-generated catch block
			logger.error("Property Exception!!!!!!!!!!!");// e.printStackTrace();
		} finally{}
		return rsp_k22;
	}
	
	/*
	 * REQUIRE PATIENT DEMOGRAPHICS QUERY
	 * QUERY patientIDtoPIX
	 * RESPONSE MESSAGE – RSP^K23
	 */
	public RSP_K23 rsp_k23 (String patientIDtoPIX,
			String qbp3_assigningAuthority, String qbp3_identifierTypeCode,
			String qbp4_assigningAuthority, String qbp4_identifierTypeCode,
			String host_pixManager,int port_pixManager) {
		
		QBP_Q21 qryMsg;
		RSP_K23 rspMsg;
		rspMsg=null;
		try {
			qryMsg = this.pdq_q23(patientIDtoPIX, 
					qbp3_assigningAuthority, qbp3_identifierTypeCode,
					qbp4_assigningAuthority, qbp4_identifierTypeCode);
			rspMsg=this.rsp_k23(qryMsg, host_pixManager, port_pixManager);
			
			/*
			//only for test assumed RESPONSE MESSAGE – RSP^K23
			String rspResponse=
			"MSH|^~\\&|NISTManager_SGSFAK|NIST|||20110819140210.757+0100||RSP^K23^RSP_K23|7b9a4a5b-4ea1-43ff-8de4-3ee4433be6cd|P|2.5"+"\r"
			+"MSA|AA|20090831110508|"+"\r"
			+"QAK|TPCBRINFO20090831110506PIX|OK"+"\r"
			+"QPD|PIX Query|20110729105408|model:CD2215-36/serial:9925119^^^&&|^^^CIED&bbe3a050-079a-11e0-81e0-0800200c9a66&UUID"+"\r"
			+"PID|||p12345^^^icardea&www.srdc.com.tr&DNS~12345^^^ORBIS&www.salk.at&DNS~i12345^^^CIED&bbe3a050-079a-11e0-81e0-0800200c9a66&UUID||Schmidt^Andreas||19530311|M|||^^^^||||||||"+"\r";

			Parser p = new GenericParser();	
			rspMsg = (RSP_K23) p.parse(rspResponse);
			 */
		} catch (HL7Exception e) {
			logger.warn("Could not connect with PIX Manager, please check it!");
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		return rspMsg;
	}
	
	/*
	 * REQUIRE PATIENT DEMOGRAPHICS QUERY
	 * QUERY available QBP^23
	 * RESPONSE MESSAGE – RSP^K23
	 */
	public RSP_K23 rsp_k23 (Message qry_q23, String host_pixManager, int port_pixManager){
		RSP_K23 rsp_k23 = null;
		try {
			rsp_k23=(RSP_K23) this.sendAndRecv(qry_q23, host_pixManager, port_pixManager);
		} catch (LLPException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (HL7Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (PropertyNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} finally{}
		return rsp_k23;
	}
	
	public Message sendAndRecv(Message msg, String host, int port) throws LLPException, HL7Exception, IOException, PropertyNotFoundException {
		// The connection hub connects to listening servers
		// A connection object represents a socket attached to an PIX Manager server
		/*
		ConnectionHub connectionHub = ConnectionHub.getInstance();
		Connection connection = connectionHub.attach(host, port, new PipeParser(), MinLowerLayerProtocol.class);
		// The initiator is used to transmit unsolicited messages
		Initiator initiator = connection.getInitiator();
		Message response = initiator.sendAndReceive(msg);
		logger.debug("Response from PIX:\r"+ response.encode());
		*/
		Connection connection=null;
		
		boolean isSSL=AppConfig.getProperty("isSSL").equals("Yes");
		Socket socket = null;
		
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
		
		connection = new Connection(new PipeParser(), new MinLowerLayerProtocol(), socket);
		Initiator initiator = connection.getInitiator();
		Message response = initiator.sendAndReceive(msg);
		logger.debug("Response from PIX:\r"+ response.encode());
		return response;
	}
}