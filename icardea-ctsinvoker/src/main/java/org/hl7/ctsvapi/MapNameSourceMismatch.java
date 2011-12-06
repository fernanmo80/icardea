
package org.hl7.ctsvapi;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for MapNameSourceMismatch complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="MapNameSourceMismatch">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="fromCodeSystem_id" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *         &lt;element name="mapSourceCodeSystem_id" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "MapNameSourceMismatch", propOrder = {
    "fromCodeSystemId",
    "mapSourceCodeSystemId"
})
public class MapNameSourceMismatch {

    @XmlElement(name = "fromCodeSystem_id", required = true, nillable = true)
    protected String fromCodeSystemId;
    @XmlElement(name = "mapSourceCodeSystem_id", required = true, nillable = true)
    protected String mapSourceCodeSystemId;

    /**
     * Gets the value of the fromCodeSystemId property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getFromCodeSystemId() {
        return fromCodeSystemId;
    }

    /**
     * Sets the value of the fromCodeSystemId property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setFromCodeSystemId(String value) {
        this.fromCodeSystemId = value;
    }

    /**
     * Gets the value of the mapSourceCodeSystemId property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getMapSourceCodeSystemId() {
        return mapSourceCodeSystemId;
    }

    /**
     * Sets the value of the mapSourceCodeSystemId property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setMapSourceCodeSystemId(String value) {
        this.mapSourceCodeSystemId = value;
    }

}
