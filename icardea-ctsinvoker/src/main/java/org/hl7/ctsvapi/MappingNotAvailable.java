
package org.hl7.ctsvapi;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for MappingNotAvailable complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="MappingNotAvailable">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="fromCodeSystem_id" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *         &lt;element name="toCodeSystem_id" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "MappingNotAvailable", propOrder = {
    "fromCodeSystemId",
    "toCodeSystemId"
})
public class MappingNotAvailable {

    @XmlElement(name = "fromCodeSystem_id", required = true, nillable = true)
    protected String fromCodeSystemId;
    @XmlElement(name = "toCodeSystem_id", required = true, nillable = true)
    protected String toCodeSystemId;

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

}
