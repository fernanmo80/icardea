
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
 *         &lt;element name="lookupDesignationReturn" type="{urn://hl7.org/CTSVAPI}StringAndLanguage"/>
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
    "lookupDesignationReturn"
})
@XmlRootElement(name = "lookupDesignationResponse")
public class LookupDesignationResponse {

    @XmlElement(required = true)
    protected StringAndLanguage lookupDesignationReturn;

    /**
     * Gets the value of the lookupDesignationReturn property.
     * 
     * @return
     *     possible object is
     *     {@link StringAndLanguage }
     *     
     */
    public StringAndLanguage getLookupDesignationReturn() {
        return lookupDesignationReturn;
    }

    /**
     * Sets the value of the lookupDesignationReturn property.
     * 
     * @param value
     *     allowed object is
     *     {@link StringAndLanguage }
     *     
     */
    public void setLookupDesignationReturn(StringAndLanguage value) {
        this.lookupDesignationReturn = value;
    }

}
