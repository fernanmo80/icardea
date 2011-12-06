
package org.hl7.ctsvapi;

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
 *         &lt;element name="lookupCodeSystemInfoReturn" type="{urn://hl7.org/CTSVAPI}CodeSystemInfo"/>
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
    "lookupCodeSystemInfoReturn"
})
@XmlRootElement(name = "lookupCodeSystemInfoResponse")
public class LookupCodeSystemInfoResponse {

    @XmlElement(required = true)
    protected CodeSystemInfo lookupCodeSystemInfoReturn;

    /**
     * Gets the value of the lookupCodeSystemInfoReturn property.
     * 
     * @return
     *     possible object is
     *     {@link CodeSystemInfo }
     *     
     */
    public CodeSystemInfo getLookupCodeSystemInfoReturn() {
        return lookupCodeSystemInfoReturn;
    }

    /**
     * Sets the value of the lookupCodeSystemInfoReturn property.
     * 
     * @param value
     *     allowed object is
     *     {@link CodeSystemInfo }
     *     
     */
    public void setLookupCodeSystemInfoReturn(CodeSystemInfo value) {
        this.lookupCodeSystemInfoReturn = value;
    }

}
