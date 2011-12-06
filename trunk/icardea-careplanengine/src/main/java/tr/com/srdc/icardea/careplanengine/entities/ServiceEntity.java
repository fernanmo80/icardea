package tr.com.srdc.icardea.careplanengine.entities;

/**
 * <p></p>
 *
 * @poseidon-object-id [I8b7250m109bbca6579mm7158]
 */
public class ServiceEntity {
    private String OWLS;
    private String WSDLURL;
    private String securityProfileURL;

    /**
     *
     */
    public ServiceEntity() {

        // TODO Auto-generated constructor stub
    }

    /**
     * @param wsdlurl
     * @param owls
     * @param securityProfileURL
     */
    public ServiceEntity(String wsdlurl, String owls, String securityProfileURL) {

        // TODO Auto-generated constructor stub
        WSDLURL                 = wsdlurl;
        OWLS                    = owls;
        this.securityProfileURL = securityProfileURL;
    }

    /**
     * @return Returns the oWLS.
     */
    public String getOWLS() {
        return OWLS;
    }

    /**
     * @param owls The oWLS to set.
     */
    public void setOWLS(String owls) {
        OWLS = owls;
    }

    /**
     * @return Returns the securityProfileURL.
     */
    public String getSecurityProfileURL() {
        return securityProfileURL;
    }

    /**
     * @param securityProfileURL The securityProfileURL to set.
     */
    public void setSecurityProfileURL(String securityProfileURL) {
        this.securityProfileURL = securityProfileURL;
    }

    /**
     * @return Returns the wSDLURL.
     */
    public String getWSDLURL() {
        return WSDLURL;
    }

    /**
     * @param wsdlurl The wSDLURL to set.
     */
    public void setWSDLURL(String wsdlurl) {
        WSDLURL = wsdlurl;
    }
}


//~ Formatted by Jindent --- http://www.jindent.com
