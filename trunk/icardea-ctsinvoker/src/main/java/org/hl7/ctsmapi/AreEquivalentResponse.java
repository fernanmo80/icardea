
package org.hl7.ctsmapi;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlRootElement;
import javax.xml.bind.annotation.XmlType;
import org.hl7.cts.types.BL;


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
 *         &lt;element name="areEquivalentReturn" type="{urn://cts.hl7.org/types}BL"/>
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
    "areEquivalentReturn"
})
@XmlRootElement(name = "areEquivalentResponse")
public class AreEquivalentResponse {

    @XmlElement(required = true)
    protected BL areEquivalentReturn;

    /**
     * Gets the value of the areEquivalentReturn property.
     * 
     * @return
     *     possible object is
     *     {@link BL }
     *     
     */
    public BL getAreEquivalentReturn() {
        return areEquivalentReturn;
    }

    /**
     * Sets the value of the areEquivalentReturn property.
     * 
     * @param value
     *     allowed object is
     *     {@link BL }
     *     
     */
    public void setAreEquivalentReturn(BL value) {
        this.areEquivalentReturn = value;
    }

}
