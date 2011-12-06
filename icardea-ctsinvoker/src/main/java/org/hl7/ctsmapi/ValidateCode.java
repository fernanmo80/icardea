
package org.hl7.ctsmapi;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlRootElement;
import javax.xml.bind.annotation.XmlType;
import org.hl7.cts.types.BL;
import org.hl7.cts.types.CD;
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
 *         &lt;element name="codeToValidate" type="{urn://cts.hl7.org/types}CD"/>
 *         &lt;element name="applicationContext_code" type="{urn://cts.hl7.org/types}ST"/>
 *         &lt;element name="activeConceptsOnly" type="{urn://cts.hl7.org/types}BL"/>
 *         &lt;element name="errorCheckOnly" type="{urn://cts.hl7.org/types}BL"/>
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
    "codeToValidate",
    "applicationContextCode",
    "activeConceptsOnly",
    "errorCheckOnly"
})
@XmlRootElement(name = "validateCode")
public class ValidateCode {

    @XmlElement(name = "vocabularyDomain_name", required = true)
    protected ST vocabularyDomainName;
    @XmlElement(required = true)
    protected CD codeToValidate;
    @XmlElement(name = "applicationContext_code", required = true)
    protected ST applicationContextCode;
    @XmlElement(required = true)
    protected BL activeConceptsOnly;
    @XmlElement(required = true)
    protected BL errorCheckOnly;

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
     * Gets the value of the codeToValidate property.
     * 
     * @return
     *     possible object is
     *     {@link CD }
     *     
     */
    public CD getCodeToValidate() {
        return codeToValidate;
    }

    /**
     * Sets the value of the codeToValidate property.
     * 
     * @param value
     *     allowed object is
     *     {@link CD }
     *     
     */
    public void setCodeToValidate(CD value) {
        this.codeToValidate = value;
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
     * Gets the value of the activeConceptsOnly property.
     * 
     * @return
     *     possible object is
     *     {@link BL }
     *     
     */
    public BL getActiveConceptsOnly() {
        return activeConceptsOnly;
    }

    /**
     * Sets the value of the activeConceptsOnly property.
     * 
     * @param value
     *     allowed object is
     *     {@link BL }
     *     
     */
    public void setActiveConceptsOnly(BL value) {
        this.activeConceptsOnly = value;
    }

    /**
     * Gets the value of the errorCheckOnly property.
     * 
     * @return
     *     possible object is
     *     {@link BL }
     *     
     */
    public BL getErrorCheckOnly() {
        return errorCheckOnly;
    }

    /**
     * Sets the value of the errorCheckOnly property.
     * 
     * @param value
     *     allowed object is
     *     {@link BL }
     *     
     */
    public void setErrorCheckOnly(BL value) {
        this.errorCheckOnly = value;
    }

}
