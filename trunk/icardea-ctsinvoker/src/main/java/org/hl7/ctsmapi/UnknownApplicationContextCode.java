
package org.hl7.ctsmapi;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;
import org.hl7.cts.types.ST;


/**
 * <p>Java class for UnknownApplicationContextCode complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="UnknownApplicationContextCode">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="applicationContext_code" type="{urn://cts.hl7.org/types}ST"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "UnknownApplicationContextCode", propOrder = {
    "applicationContextCode"
})
public class UnknownApplicationContextCode {

    @XmlElement(name = "applicationContext_code", required = true, nillable = true)
    protected ST applicationContextCode;

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

}
