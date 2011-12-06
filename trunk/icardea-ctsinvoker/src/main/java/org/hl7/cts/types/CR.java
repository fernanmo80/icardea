
package org.hl7.cts.types;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for CR complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="CR">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="name" type="{urn://cts.hl7.org/types}CV"/>
 *         &lt;element name="value" type="{urn://cts.hl7.org/types}CV"/>
 *         &lt;element name="inverted" type="{urn://cts.hl7.org/types}BL"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "CR", propOrder = {
    "name",
    "value",
    "inverted"
})
public class CR {

    @XmlElement(required = true, nillable = true)
    protected CV name;
    @XmlElement(required = true, nillable = true)
    protected CV value;
    @XmlElement(required = true, nillable = true)
    protected BL inverted;

    /**
     * Gets the value of the name property.
     * 
     * @return
     *     possible object is
     *     {@link CV }
     *     
     */
    public CV getName() {
        return name;
    }

    /**
     * Sets the value of the name property.
     * 
     * @param value
     *     allowed object is
     *     {@link CV }
     *     
     */
    public void setName(CV value) {
        this.name = value;
    }

    /**
     * Gets the value of the value property.
     * 
     * @return
     *     possible object is
     *     {@link CV }
     *     
     */
    public CV getValue() {
        return value;
    }

    /**
     * Sets the value of the value property.
     * 
     * @param value
     *     allowed object is
     *     {@link CV }
     *     
     */
    public void setValue(CV value) {
        this.value = value;
    }

    /**
     * Gets the value of the inverted property.
     * 
     * @return
     *     possible object is
     *     {@link BL }
     *     
     */
    public BL getInverted() {
        return inverted;
    }

    /**
     * Sets the value of the inverted property.
     * 
     * @param value
     *     allowed object is
     *     {@link BL }
     *     
     */
    public void setInverted(BL value) {
        this.inverted = value;
    }

}
