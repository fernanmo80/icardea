/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package tr.com.srdc.icardea.ihe.idco.observationprocessor;

import java.net.ServerSocket;
import java.net.Socket;
import java.security.Security;
import java.util.ResourceBundle;

import javax.net.ssl.SSLServerSocket;
import javax.net.ssl.SSLServerSocketFactory;

import org.apache.log4j.Logger;

import com.sun.net.ssl.internal.ssl.Provider;

public class ObservationProcessor {

	private int port;
	public static Logger logger = Logger.getLogger(ObservationProcessor.class);
	private ServerSocket server = null;

	public ObservationProcessor(int port) {
		this.port = port;
	}

	public void listen() {
		try {
			boolean atnatls = new Boolean(ResourceBundle.getBundle("icardea")
					.getString("atna.tls")).booleanValue();

			if (atnatls) {
				logger.info("Starting to listen secure port:" + port);
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
						.createServerSocket(port);

			} else {
				logger.info("Starting to listen port:" + port);
				server = new ServerSocket(port);
			}
			logger.info("Waiting for incoming connections...");
			while (true) {
				Socket socket = server.accept();
				logger.info("Registering application");
				ReceiverApplication handler = new ReceiverApplication(socket);
				handler.start();
			}

		} catch (Exception ex) {
			ex.printStackTrace();
		}
	}

	public static void main(String argv[]) {
		ObservationProcessor observationProcessor = new ObservationProcessor(
				1011);
		observationProcessor.listen();
	}

	public void close() {
		logger.info("ServerSocket over Port: " + server.getLocalPort()
				+ " is closing...");
		try {
			server.close();
		} catch (java.io.IOException ex) {
			ex.printStackTrace();
		}
	}
}
