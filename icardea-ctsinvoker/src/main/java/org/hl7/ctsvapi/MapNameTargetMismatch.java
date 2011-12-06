
package org.hl7.ctsvapi;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for MapNameTargetMismatch complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="MapNameTargetMismatch">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="toCodeSystem_id" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *         &lt;element name="mapTargetCodeSystem_id" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "MapNameTargetMismatch", propOrder = {
    "toCodeSystemId",
    "mapTargetCodeSystemId"
})
public class MapNameTargetMismatch {

    @XmlElement(name = "toCodeSystem_id", required = true, nillable = true)
    protected String toCodeSystemId;
    @XmlElement(name = "mapTargetCodeSystem_id", required = true, nillable = true)
    protected String mapTargetCodeSystemId;

    /**
     * Gets the value of the toCodeSystemId property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getToCodeSystemId() {
        return toCodeSystemId;
    }

    /**
     * Sets the value of the toCodeSystemId property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setToCodeSystemId(String value) {
        this.toCodeSystemId = value;
    }

    /**
     * Gets the value of the mapTargetCodeSystemId property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getMapTargetCodeSystemId() {
        return mapTargetCodeSystemId;
    }

    /**
     * Sets the value of the mapTargetCodeSystemId property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setMapTargetCodeSystemId(String value) {
        this.mapTargetCodeSystemId = value;
    }

}
