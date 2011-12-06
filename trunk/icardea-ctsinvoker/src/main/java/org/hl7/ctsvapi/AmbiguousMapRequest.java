
package org.hl7.ctsvapi;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for AmbiguousMapRequest complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="AmbiguousMapRequest">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="possible_maps" type="{urn://hl7.org/CTSVAPI}ArrayOf_xsd_string"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "AmbiguousMapRequest", propOrder = {
    "possibleMaps"
})
public class AmbiguousMapRequest {

    @XmlElement(name = "possible_maps", required = true, nillable = true)
    protected ArrayOfXsdString possibleMaps;

    /**
     * Gets the value of the possibleMaps property.
     * 
     * @return
     *     possible object is
     *     {@link ArrayOfXsdString }
     *     
     */
    public ArrayOfXsdString getPossibleMaps() {
        return possibleMaps;
    }

    /**
     * Sets the value of the possibleMaps property.
     * 
     * @param value
     *     allowed object is
     *     {@link ArrayOfXsdString }
     *     
     */
    public void setPossibleMaps(ArrayOfXsdString value) {
        this.possibleMaps = value;
    }

}
