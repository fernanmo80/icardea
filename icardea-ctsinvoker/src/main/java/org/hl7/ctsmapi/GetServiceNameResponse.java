
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
 *         &lt;element name="getServiceNameReturn" type="{urn://cts.hl7.org/types}ST"/>
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
    "getServiceNameReturn"
})
@XmlRootElement(name = "getServiceNameResponse")
public class GetServiceNameResponse {

    @XmlElement(required = true)
    protected ST getServiceNameReturn;

    /**
     * Gets the value of the getServiceNameReturn property.
     * 
     * @return
     *     possible object is
     *     {@link ST }
     *     
     */
    public ST getGetServiceNameReturn() {
        return getServiceNameReturn;
    }

    /**
     * Sets the value of the getServiceNameReturn property.
     * 
     * @param value
     *     allowed object is
     *     {@link ST }
     *     
     */
    public void setGetServiceNameReturn(ST value) {
        this.getServiceNameReturn = value;
    }

}
