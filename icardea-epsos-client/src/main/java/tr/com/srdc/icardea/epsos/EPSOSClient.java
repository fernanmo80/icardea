package tr.com.srdc.icardea.epsos;

import java.security.Security;
import java.util.ResourceBundle;

import tr.com.srdc.epsos.ws.xca.client.query.Test;

public class EPSOSClient {
	private boolean atnatls;
	private String epsosEndpoint;
	private String patientID;
	private String homeCommunityID = "2.16.17.710.813.1000.990.1";
	
	private void sslSetup() {
		if (atnatls) {
			// Properties for SSL Security Provider
			System.out.println(" $$$$ SECURE COMMUNICATION .....");
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
		this.atnatls = new Boolean(ResourceBundle.getBundle("icardea")
				.getString("atna.tls")).booleanValue();
		this.epsosEndpoint = ResourceBundle.getBundle("icardea")
				.getString("epsos.endpoint");
		this.patientID = pid;
		this.homeCommunityID = homeCommunityID;
		//sslSetup();
	}
	
	public String retrieveDocument() {
		// TODO: Burayi secure yap
		//this.epsosEndpoint = "http://localhost:8080/tr-xca/services/RespondingGateway_Service/";
		Test test = new Test(patientID, homeCommunityID, epsosEndpoint);
		try {
			return test.retrieveDocument(false);
		} catch (Exception e) {
			e.printStackTrace();
		}
		return null;
	}

	public void registerDocument(String cda) {
		try {
			FORTHListener.Provide_Register("Document01", cda);
		} catch(Exception ex) {
			ex.printStackTrace();
		}
	}

	public static void main(String argv[]) {
		String homeCommunityID = "2.16.17.710.813.1000.990.1";
		String patientID = "91982382558";

		EPSOSClient test = new EPSOSClient(patientID, homeCommunityID);
		String cda = test.retrieveDocument();
		test.registerDocument(cda);
		System.out.println(cda);
	}
}

