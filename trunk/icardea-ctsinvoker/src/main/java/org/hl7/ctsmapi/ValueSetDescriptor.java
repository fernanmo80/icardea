
package org.hl7.ctsmapi;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;
import org.hl7.cts.types.ST;
import org.hl7.cts.types.UID;


/**
 * <p>Java class for ValueSetDescriptor complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="ValueSetDescriptor">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="valueSet_id" type="{urn://cts.hl7.org/types}UID"/>
 *         &lt;element name="valueSet_name" type="{urn://cts.hl7.org/types}ST"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "ValueSetDescriptor", propOrder = {
    "valueSetId",
    "valueSetName"
})
public class ValueSetDescriptor {

    @XmlElement(name = "valueSet_id", required = true, nillable = true)
    protected UID valueSetId;
    @XmlElement(name = "valueSet_name", required = true, nillable = true)
    protected ST valueSetName;

    /**
     * Gets the value of the valueSetId property.
     * 
     * @return
     *     possible object is
     *     {@link UID }
     *     
     */
    public UID getValueSetId() {
        return valueSetId;
    }

    /**
     * Sets the value of the valueSetId property.
     * 
     * @param value
     *     allowed object is
     *     {@link UID }
     *     
     */
    public void setValueSetId(UID value) {
        this.valueSetId = value;
    }

    /**
     * Gets the value of the valueSetName property.
     * 
     * @return
     *     possible object is
     *     {@link ST }
     *     
     */
    public ST getValueSetName() {
        return valueSetName;
    }

    /**
     * Sets the value of the valueSetName property.
     * 
     * @param value
     *     allowed object is
     *     {@link ST }
     *     
     */
    public void setValueSetName(ST value) {
        this.valueSetName = value;
    }

}
