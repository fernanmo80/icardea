package tr.com.srdc.icardea.careplanengine.agents.guidelineAgent.handlers;

import java.io.InputStream;
import java.io.OutputStream;
import java.net.Socket;
import java.security.Security;
import java.text.DateFormat;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.ResourceBundle;

import javax.net.ssl.SSLSocket;
import javax.net.ssl.SSLSocketFactory;

import org.apache.log4j.Logger;

import tr.com.srdc.icardea.careplanengine.agents.guidelineAgent.GuidelineAgent;
import tr.com.srdc.icardea.careplanengine.entities.AssignmentEntity;

import com.sun.net.ssl.internal.ssl.Provider;

public class SendHL7Message {

	public static Logger logger = Logger.getLogger(SendHL7Message.class);

	public static void send(GuidelineAgent guidelineAgent) {
		AssignmentEntity assignmentEntity = guidelineAgent
				.getAssignmentEntity();

		String guidelineTitle = assignmentEntity.getGuidelineEntity()
				.getTitle();
		String name = assignmentEntity.getPatientEntity().getName();
		long patientID = assignmentEntity.getPatientEntity().getPcode();
		String patientIDUUID = assignmentEntity.getPatientEntity().getPid();
		Date birthDate = assignmentEntity.getPatientEntity().getBirthDate();
		String gender = assignmentEntity.getPatientEntity().getGender();
		String address = assignmentEntity.getPatientEntity().getAddress();

		DateFormat dateFormat = new SimpleDateFormat("yyyyMMdd");
		String birthDateString = dateFormat.format(birthDate);

		String messageTime = dateFormat.format(new Date());

		String messageToSend = "MSH|^~\\&|iCARDEA|iCARDEA|ORBIS|EHR|"
				+ messageTime
				+ "||DFT^P03|0851077|P|2.2|||AL|NE\r"
				+ "EVN|P03|"
				+ messageTime
				+ "\r"
				+ "PID|||"
				+ patientID
				+ "^^^icardea.pix&1.2.826.0.1.3680043.2.44.248240.1&ISO||"
				+ name.replaceAll(" ", "^")
				+ "||"
				+ birthDateString
				+ "|"
				+ gender
				+ "|||^^Salzburg^^A-5020^Austria\r"
				+ "FT1|1|||"
				+ messageTime
				+ "||CG|73630|||1||||||^^^^407^^^^test location||I|161510004^Heart Disease^SCT|1^SurnameDR^NameDR^^^DR|||783933|1^SurnameDR^NameDR^^^DR|C0282451|"
				+ guidelineTitle + "\r";
		logger.info(" $$$ Sending message to EHR Interoperability Framework:"
				+ messageToSend);
		try {
		send(messageToSend);
		} catch(Exception ex) {
			ex.printStackTrace();
		}
		logger.info(" $$$ Sent message to EHR Interoperability Framework:");

	}

	private static void send(String messageToSend) throws Exception {
		byte SB = 0x0b;
		byte ACK = 0x06;
		byte EB = 0x1c;
		byte CR = 0x0d;

		Socket socket = null;

		boolean atnatls = new Boolean(ResourceBundle.getBundle("icardea")
				.getString("atna.tls")).booleanValue();

		String host = ResourceBundle.getBundle("icardea").getString("eif.host");
		int port = Integer.parseInt(ResourceBundle.getBundle("icardea")
				.getString("eif.port"));

		logger.info(" Sending HL7 message to host:" + host + ":" + port);

		// TODO: For the time being the port is regarded as insecure. In the future 
		// // it will be secure. For this comment the following line.
		atnatls = false;
		if (atnatls) {
			Security.addProvider(new Provider());

			// Specifying the Keystore details
			System.setProperty(
					"javax.net.ssl.keyStore",
					ResourceBundle.getBundle("icardea").getString(
							"icardea.home")
							+ "/icardea-caremanagementdb/src/test/resources/sampleSSL/client.ks");
			System.setProperty("javax.net.ssl.keyStorePassword", "client");
			System.setProperty(
					"javax.net.ssl.trustStore",
					ResourceBundle.getBundle("icardea").getString(
							"icardea.home")
							+ "/icardea-caremanagementdb/src/test/resources/sampleSSL/client.ts");
			System.setProperty("javax.net.ssl.trustStorePassword", "srdcpass");

			SSLSocketFactory sslsocketfactory = (SSLSocketFactory) SSLSocketFactory
					.getDefault();
			socket = (SSLSocket) sslsocketfactory.createSocket(host, port);
		} else {
			socket = new Socket(host, port);
		}
		OutputStream dos = socket.getOutputStream();

		dos.write(SB);
		dos.write(messageToSend.getBytes());
		dos.write(EB);
		dos.write(CR);
		dos.flush();

		InputStream in = socket.getInputStream();
		StringBuffer sb = new StringBuffer();
		int b = 0;
		while ((b = in.read()) != SB) {
		}
		while ((b = in.read()) != EB) {
			sb.append((char) b);
		}
		String receivedMessage = sb.toString();

		logger.info(" $$$ Received from EHR Interoperability Framework:"
				+ receivedMessage);
		while ((b = in.read()) != CR) {
		}
		in.close();
		socket.close();
	}

}
