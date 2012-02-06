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
		System.out.println(" Initializing EPSOS Client...");
		this.atnatls = new Boolean(ResourceBundle.getBundle("icardea")
				.getString("atna.tls")).booleanValue();
		System.out.println(" Is security enabled? -->" + atnatls);
		this.epsosEndpoint = ResourceBundle.getBundle("icardea").getString(
				"epsos.endpoint");
		this.patientID = pid;
		this.homeCommunityID = homeCommunityID;

		System.out.println(" Epsos Endpoint:" + epsosEndpoint + " Patient ID:"
				+ pid + " Home Community ID:" + homeCommunityID);
		sslSetup();
	}

	public String retrieveDocument() {
		// TODO: Burayi secure yap
		// this.epsosEndpoint =
		// "http://localhost:8080/tr-xca/services/RespondingGateway_Service/";
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
		try {
			FORTHListener.Provide_Register("Document01", cda);
		} catch (Exception ex) {
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
