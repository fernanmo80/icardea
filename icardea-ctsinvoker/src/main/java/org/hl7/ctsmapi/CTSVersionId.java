
package org.hl7.ctsmapi;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;
import org.hl7.cts.types.INT;


/**
 * <p>Java class for CTSVersionId complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="CTSVersionId">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="major" type="{urn://cts.hl7.org/types}INT"/>
 *         &lt;element name="minor" type="{urn://cts.hl7.org/types}INT"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "CTSVersionId", propOrder = {
    "major",
    "minor"
})
public class CTSVersionId {

    @XmlElement(required = true, nillable = true)
    protected INT major;
    @XmlElement(required = true, nillable = true)
    protected INT minor;

    /**
     * Gets the value of the major property.
     * 
     * @return
     *     possible object is
     *     {@link INT }
     *     
     */
    public INT getMajor() {
        return major;
    }

    /**
     * Sets the value of the major property.
     * 
     * @param value
     *     allowed object is
     *     {@link INT }
     *     
     */
    public void setMajor(INT value) {
        this.major = value;
    }

    /**
     * Gets the value of the minor property.
     * 
     * @return
     *     possible object is
     *     {@link INT }
     *     
     */
    public INT getMinor() {
        return minor;
    }

    /**
     * Sets the value of the minor property.
     * 
     * @param value
     *     allowed object is
     *     {@link INT }
     *     
     */
    public void setMinor(INT value) {
        this.minor = value;
    }

}
