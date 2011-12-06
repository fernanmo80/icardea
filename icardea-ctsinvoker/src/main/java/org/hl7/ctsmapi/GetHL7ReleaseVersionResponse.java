
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
 *         &lt;element name="getHL7ReleaseVersionReturn" type="{urn://cts.hl7.org/types}ST"/>
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
    "getHL7ReleaseVersionReturn"
})
@XmlRootElement(name = "getHL7ReleaseVersionResponse")
public class GetHL7ReleaseVersionResponse {

    @XmlElement(required = true)
    protected ST getHL7ReleaseVersionReturn;

    /**
     * Gets the value of the getHL7ReleaseVersionReturn property.
     * 
     * @return
     *     possible object is
     *     {@link ST }
     *     
     */
    public ST getGetHL7ReleaseVersionReturn() {
        return getHL7ReleaseVersionReturn;
    }

    /**
     * Sets the value of the getHL7ReleaseVersionReturn property.
     * 
     * @param value
     *     allowed object is
     *     {@link ST }
     *     
     */
    public void setGetHL7ReleaseVersionReturn(ST value) {
        this.getHL7ReleaseVersionReturn = value;
    }

}
