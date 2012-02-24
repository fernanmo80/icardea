package tr.com.srdc.icardea.epsos;

import java.io.InputStream;
import java.net.ServerSocket;
import java.net.Socket;
import java.security.Security;
import java.util.ResourceBundle;

import javax.net.ssl.SSLServerSocket;
import javax.net.ssl.SSLServerSocketFactory;

import org.apache.log4j.Logger;

import com.sun.net.ssl.internal.ssl.Provider;

import tr.com.srdc.epsos.ws.xca.client.query.Test;

public class EPSOSClient {
	private boolean atnatls;
	private String epsosEndpoint;
	private String patientID;
	private String homeCommunityID = "2.16.17.710.813.1000.990.1";
	public static Logger logger = Logger.getLogger(EPSOSClient.class);

	private void sslSetup() {
		if (atnatls) {
			// Properties for SSL Security Provider
			logger.info(" $$$$ SECURE COMMUNICATION .....");
			String protocolProp = "java.protocol.handler.pkgs";
			String sunSSLProtocol = "com.sun.net.ssl.internal.www.protocol";
			String sslStoreProp = "javax.net.ssl.trustStore";
			String truststoreFile = ResourceBundle.getBundle("icardea")
					.getString("tomcat.home") + "conf/.truststore";

			// Enable SSL communication
			System.setProperty(protocolProp, sunSSLProtocol);
			Security.addProvider(new com.sun.net.ssl.internal.ssl.Provider());
			System.setProperty(sslStoreProp, truststoreFile);
			System.setProperty("javax.net.ssl.trustStorePassword", "srdcpass");
		}
	}

	public EPSOSClient(String pid, String homeCommunityID) {
		logger.info(" Initializing EPSOS Client...");
		this.atnatls = new Boolean(ResourceBundle.getBundle("icardea")
				.getString("atna.tls")).booleanValue();
		logger.info(" Is security enabled? -->" + atnatls);
		this.epsosEndpoint = ResourceBundle.getBundle("icardea").getString(
				"epsos.endpoint");
		this.patientID = pid;
		this.homeCommunityID = homeCommunityID;

		logger.info(" Epsos Endpoint:" + epsosEndpoint + " Patient ID:"
				+ pid + " Home Community ID:" + homeCommunityID);
		sslSetup();
			
	}
	
	public EPSOSClient() {
		logger.info(" Initializing EPSOS Client...");
		this.atnatls = new Boolean(ResourceBundle.getBundle("icardea")
				.getString("atna.tls")).booleanValue();
		logger.info(" Is security enabled? -->" + atnatls);
		this.epsosEndpoint = ResourceBundle.getBundle("icardea").getString(
				"epsos.endpoint");
		sslSetup();
		initiateServerSocket();
	}

	private void initiateServerSocket() {
		ServerSocket server = null;
		try {
			if (atnatls) {
				logger.info("Starting to listen secure port:" + 1012);
				String keystoreFile = ResourceBundle.getBundle("icardea")
						.getString("tomcat.home") + "conf/.keystore";
				String keystorePass = "srdcpass";
				String truststoreFile = ResourceBundle.getBundle("icardea")
						.getString("tomcat.home") + "conf/.truststore";
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
				SSLServerSocketFactory sslServerSocketfactory = (SSLServerSocketFactory) SSLServerSocketFactory
						.getDefault();
				server = (SSLServerSocket) sslServerSocketfactory
						.createServerSocket(1012);

			} else {
				logger.info("Starting to listen port:" + 1012);
				server = new ServerSocket(1012);
			}
			logger.info("Waiting for incoming connections...");
			while (true) {
				Socket socket = server.accept();
				InputStream in = socket.getInputStream();
				StringBuffer sb = new StringBuffer();
				int b = 0;
				while ((b = in.read()) != '\n') {
					sb.append((char) b);
				}
				String parts[] = sb.toString().split(":");
				this.patientID = parts[0];
				this.homeCommunityID = parts[1];
				logger.info(" Epsos Endpoint:" + epsosEndpoint + " Patient ID:"
						+ patientID + " Home Community ID:" + homeCommunityID);
				String cda = retrieveDocument();
				logger.info(cda);
				registerDocument(cda);
				logger.info("CDA Document Registered to XDS Reg/Rep...");
			}

		} catch (Exception ex) {
			ex.printStackTrace();
		}
	}

	public String retrieveDocument() {
		// TODO: Burayi secure yap
		// this.epsosEndpoint =
		// "http://localhost:8080/tr-xca/services/RespondingGateway_Service/";
		sslSetup();
		System.out.println(" Retrieving document...");
		Test test = new Test(patientID, homeCommunityID, epsosEndpoint);
		try {
			String cda = test.retrieveDocument(false);
			System.out.println(" Document retrieved...");
			return cda;
		} catch (Exception e) {
			e.printStackTrace();
		}
		return null;
	}

	public void registerDocument(String cda) {
		sslSetup();
		try {
			FORTHListener.Provide_Register("Document01", cda);
		} catch (Exception ex) {
			ex.printStackTrace();
		}
	}

	public static void main(String argv[]) {
		/*String homeCommunityID = "2.16.17.710.813.1000.990.1";
		String patientID = "91982382558";

		EPSOSClient test = new EPSOSClient(patientID, homeCommunityID);
		String cda = test.retrieveDocument();
		test.registerDocument(cda);
		System.out.println(cda);*/
		EPSOSClient test2 = new EPSOSClient();
	}
}
