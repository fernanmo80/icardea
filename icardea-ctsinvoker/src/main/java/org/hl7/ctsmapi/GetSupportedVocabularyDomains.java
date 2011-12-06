
package org.hl7.ctsmapi;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlRootElement;
import javax.xml.bind.annotation.XmlType;
import org.hl7.cts.types.ST;


/**
 * <p>Java class for anonymous complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType>
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="matchText" type="{urn://cts.hl7.org/types}ST"/>
 *         &lt;element name="matchAlgorithm_code" type="{urn://cts.hl7.org/types}ST"/>
 *         &lt;element name="timeout" type="{http://www.w3.org/2001/XMLSchema}int"/>
 *         &lt;element name="sizeLimit" type="{http://www.w3.org/2001/XMLSchema}int"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "", propOrder = {
    "matchText",
    "matchAlgorithmCode",
    "timeout",
    "sizeLimit"
})
@XmlRootElement(name = "getSupportedVocabularyDomains")
public class GetSupportedVocabularyDomains {

    @XmlElement(required = true)
    protected ST matchText;
    @XmlElement(name = "matchAlgorithm_code", required = true)
    protected ST matchAlgorithmCode;
    protected int timeout;
    protected int sizeLimit;

    /**
     * Gets the value of the matchText property.
     * 
     * @return
     *     possible object is
     *     {@link ST }
     *     
     */
    public ST getMatchText() {
        return matchText;
    }

    /**
     * Sets the value of the matchText property.
     * 
     * @param value
     *     allowed object is
     *     {@link ST }
     *     
     */
    public void setMatchText(ST value) {
        this.matchText = value;
    }

    /**
     * Gets the value of the matchAlgorithmCode property.
     * 
     * @return
     *     possible object is
     *     {@link ST }
     *     
     */
    public ST getMatchAlgorithmCode() {
        return matchAlgorithmCode;
    }

    /**
     * Sets the value of the matchAlgorithmCode property.
     * 
     * @param value
     *     allowed object is
     *     {@link ST }
     *     
     */
    public void setMatchAlgorithmCode(ST value) {
        this.matchAlgorithmCode = value;
    }

    /**
     * Gets the value of the timeout property.
     * 
     */
    public int getTimeout() {
        return timeout;
    }

    /**
     * Sets the value of the timeout property.
     * 
     */
    public void setTimeout(int value) {
        this.timeout = value;
    }

    /**
     * Gets the value of the sizeLimit property.
     * 
     */
    public int getSizeLimit() {
        return sizeLimit;
    }

    /**
     * Sets the value of the sizeLimit property.
     * 
     */
    public void setSizeLimit(int value) {
        this.sizeLimit = value;
    }

}
