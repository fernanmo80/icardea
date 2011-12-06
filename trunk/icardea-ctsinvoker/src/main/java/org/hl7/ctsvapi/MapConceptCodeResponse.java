
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
 *         &lt;element name="mapConceptCodeReturn" type="{urn://hl7.org/CTSVAPI}MappedConceptCode"/>
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
    "mapConceptCodeReturn"
})
@XmlRootElement(name = "mapConceptCodeResponse")
public class MapConceptCodeResponse {

    @XmlElement(required = true)
    protected MappedConceptCode mapConceptCodeReturn;

    /**
     * Gets the value of the mapConceptCodeReturn property.
     * 
     * @return
     *     possible object is
     *     {@link MappedConceptCode }
     *     
     */
    public MappedConceptCode getMapConceptCodeReturn() {
        return mapConceptCodeReturn;
    }

    /**
     * Sets the value of the mapConceptCodeReturn property.
     * 
     * @param value
     *     allowed object is
     *     {@link MappedConceptCode }
     *     
     */
    public void setMapConceptCodeReturn(MappedConceptCode value) {
        this.mapConceptCodeReturn = value;
    }

}
