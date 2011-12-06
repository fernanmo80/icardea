
package org.hl7.ctsmapi;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlRootElement;
import javax.xml.bind.annotation.XmlType;


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
 *         &lt;element name="validateTranslationReturn" type="{urn://hl7.org/CTSMAPI}ValidateCodeReturn"/>
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
    "validateTranslationReturn"
})
@XmlRootElement(name = "validateTranslationResponse")
public class ValidateTranslationResponse {

    @XmlElement(required = true)
    protected ValidateCodeReturn validateTranslationReturn;

    /**
     * Gets the value of the validateTranslationReturn property.
     * 
     * @return
     *     possible object is
     *     {@link ValidateCodeReturn }
     *     
     */
    public ValidateCodeReturn getValidateTranslationReturn() {
        return validateTranslationReturn;
    }

    /**
     * Sets the value of the validateTranslationReturn property.
     * 
     * @param value
     *     allowed object is
     *     {@link ValidateCodeReturn }
     *     
     */
    public void setValidateTranslationReturn(ValidateCodeReturn value) {
        this.validateTranslationReturn = value;
    }

}
