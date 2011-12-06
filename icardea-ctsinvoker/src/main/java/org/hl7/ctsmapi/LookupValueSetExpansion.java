
package org.hl7.ctsmapi;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlRootElement;
import javax.xml.bind.annotation.XmlType;
import org.hl7.cts.types.BL;
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
 *         &lt;element name="vocabularyDomain_name" type="{urn://cts.hl7.org/types}ST"/>
 *         &lt;element name="applicationContext_code" type="{urn://cts.hl7.org/types}ST"/>
 *         &lt;element name="language_code" type="{urn://cts.hl7.org/types}ST"/>
 *         &lt;element name="expandAll" type="{urn://cts.hl7.org/types}BL"/>
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
    "vocabularyDomainName",
    "applicationContextCode",
    "languageCode",
    "expandAll",
    "timeout",
    "sizeLimit"
})
@XmlRootElement(name = "lookupValueSetExpansion")
public class LookupValueSetExpansion {

    @XmlElement(name = "vocabularyDomain_name", required = true)
    protected ST vocabularyDomainName;
    @XmlElement(name = "applicationContext_code", required = true)
    protected ST applicationContextCode;
    @XmlElement(name = "language_code", required = true)
    protected ST languageCode;
    @XmlElement(required = true)
    protected BL expandAll;
    protected int timeout;
    protected int sizeLimit;

    /**
     * Gets the value of the vocabularyDomainName property.
     * 
     * @return
     *     possible object is
     *     {@link ST }
     *     
     */
    public ST getVocabularyDomainName() {
        return vocabularyDomainName;
    }

    /**
     * Sets the value of the vocabularyDomainName property.
     * 
     * @param value
     *     allowed object is
     *     {@link ST }
     *     
     */
    public void setVocabularyDomainName(ST value) {
        this.vocabularyDomainName = value;
    }

    /**
     * Gets the value of the applicationContextCode property.
     * 
     * @return
     *     possible object is
     *     {@link ST }
     *     
     */
    public ST getApplicationContextCode() {
        return applicationContextCode;
    }

    /**
     * Sets the value of the applicationContextCode property.
     * 
     * @param value
     *     allowed object is
     *     {@link ST }
     *     
     */
    public void setApplicationContextCode(ST value) {
        this.applicationContextCode = value;
    }

    /**
     * Gets the value of the languageCode property.
     * 
     * @return
     *     possible object is
     *     {@link ST }
     *     
     */
    public ST getLanguageCode() {
        return languageCode;
    }

    /**
     * Sets the value of the languageCode property.
     * 
     * @param value
     *     allowed object is
     *     {@link ST }
     *     
     */
    public void setLanguageCode(ST value) {
        this.languageCode = value;
    }

    /**
     * Gets the value of the expandAll property.
     * 
     * @return
     *     possible object is
     *     {@link BL }
     *     
     */
    public BL getExpandAll() {
        return expandAll;
    }

    /**
     * Sets the value of the expandAll property.
     * 
     * @param value
     *     allowed object is
     *     {@link BL }
     *     
     */
    public void setExpandAll(BL value) {
        this.expandAll = value;
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
