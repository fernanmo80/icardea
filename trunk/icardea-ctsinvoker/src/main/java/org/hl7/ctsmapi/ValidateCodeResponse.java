
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
 *         &lt;element name="validateCodeReturn" type="{urn://hl7.org/CTSMAPI}ValidateCodeReturn"/>
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
    "validateCodeReturn"
})
@XmlRootElement(name = "validateCodeResponse")
public class ValidateCodeResponse {

    @XmlElement(required = true)
    protected ValidateCodeReturn validateCodeReturn;

    /**
     * Gets the value of the validateCodeReturn property.
     * 
     * @return
     *     possible object is
     *     {@link ValidateCodeReturn }
     *     
     */
    public ValidateCodeReturn getValidateCodeReturn() {
        return validateCodeReturn;
    }

    /**
     * Sets the value of the validateCodeReturn property.
     * 
     * @param value
     *     allowed object is
     *     {@link ValidateCodeReturn }
     *     
     */
    public void setValidateCodeReturn(ValidateCodeReturn value) {
        this.validateCodeReturn = value;
    }

}
