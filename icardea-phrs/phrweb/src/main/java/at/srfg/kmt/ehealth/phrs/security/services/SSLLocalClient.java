/*
 * Project :iCardea
 * File : SSLClient.java
 * Encoding : UTF-8
 * Date : Jan 16, 2012
 * User : Mihai Radulescu, 
 * config: bmulreni
 */
package at.srfg.kmt.ehealth.phrs.security.services;

import com.sun.net.ssl.internal.ssl.Provider;
import java.security.Security;
import at.srfg.kmt.ehealth.phrs.presentation.services.ConfigurationService;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import java.util.ResourceBundle;


final class SSLLocalClient {
    private final static Logger LOGGER = LoggerFactory.getLogger(SSLLocalClient.class);
    private static final String HANDLER_PKGS =
            "java.protocol.handler.pkgs";
    private static final String SUN_SSL_PROTOCOL =
            "com.sun.net.ssl.internal.www.protocol";
    private static final String SSL_STORE_PROTOCOL =
            "javax.net.ssl.trustStore";
    private static final String SSL_STORE_PASSWORD =
            "javax.net.ssl.trustStorePassword";

    public static void sslSetup(String trustStore, String trustStorePassword,String keyStore, String keyStorePassword) {

        LOGGER.debug("sslSetup trustStore=" + trustStore + " p=" + trustStorePassword+" keyStore "+keyStore+" pass "+keyStorePassword);
        System.setProperty("java.protocol.handler.pkgs", "com.sun.net.ssl.internal.www.protocol");

        final Provider provider = new Provider();
        Security.addProvider(provider);

        System.setProperty("javax.net.ssl.trustStore", trustStore);
        System.setProperty("javax.net.ssl.trustStorePassword", trustStorePassword);
        System.setProperty("javax.net.ssl.keyStore", keyStore);
        System.setProperty("javax.net.ssl.keyStorePassword", keyStorePassword);

        LOGGER.debug("The SSL comunication was enabled");
    }


    /**
     javax.net.ssl.trustStore=srfg-phrs-web-keystore.ks
     javax.net.ssl.trustStorePassword=icardea
     */
    public static void sslSetupLocal() {

        System.setProperty("javax.net.ssl.keyStore", ResourceBundle.getBundle("icardea").getString("icardea.home") + "/icardea-caremanagementdb/src/test/resources/sampleSSL/client.ks");
        System.setProperty("javax.net.ssl.keyStorePassword", "client");

        System.setProperty("javax.net.ssl.trustStore", ResourceBundle.getBundle("icardea").getString("icardea.home") + "/icardea-caremanagementdb/src/test/resources/sampleSSL/client.ts");
        System.setProperty("javax.net.ssl.trustStorePassword", "srdcpass");

//        ConfigurationService config = ConfigurationService.getInstance();
//        String trustStoreFilePath = config.getProperty("javax.net.ssl.trustStore","srfg-phrs-core-truststore.ks");
//        String trustStoreFilePassword = config.getProperty("javax.net.ssl.trustStorePassword","icardea");
//        String keystoreFilePath = config.getProperty("javax.net.ssl.trustStore","srfg-phrs-core-keystore.ks");
//        String keystoreFilePassword = config.getProperty("javax.net.ssl.trustStorePassword","icardea");
//        SSLLocalClient.sslSetup(trustStoreFilePath, trustStoreFilePassword,keystoreFilePath, keystoreFilePassword);

    }

    /**
     *
     * @param configSettings - this is no longer necessary
     */
    public static void sslSetup(int configSettings) {
       sslSetupLocal();
    }
    public static void sslSetup() {
        sslSetupLocal();
    }
}
