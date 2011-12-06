
package org.hl7.ctsmapi;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlRootElement;
import javax.xml.bind.annotation.XmlType;
import org.hl7.cts.types.CD;


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
 *         &lt;element name="parm1" type="{urn://cts.hl7.org/types}CD"/>
 *         &lt;element name="parm2" type="{urn://cts.hl7.org/types}CD"/>
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
    "parm1",
    "parm2"
})
@XmlRootElement(name = "areEquivalent")
public class AreEquivalent {

    @XmlElement(required = true)
    protected CD parm1;
    @XmlElement(required = true)
    protected CD parm2;

    /**
     * Gets the value of the parm1 property.
     * 
     * @return
     *     possible object is
     *     {@link CD }
     *     
     */
    public CD getParm1() {
        return parm1;
    }

    /**
     * Sets the value of the parm1 property.
     * 
     * @param value
     *     allowed object is
     *     {@link CD }
     *     
     */
    public void setParm1(CD value) {
        this.parm1 = value;
    }

    /**
     * Gets the value of the parm2 property.
     * 
     * @return
     *     possible object is
     *     {@link CD }
     *     
     */
    public CD getParm2() {
        return parm2;
    }

    /**
     * Sets the value of the parm2 property.
     * 
     * @param value
     *     allowed object is
     *     {@link CD }
     *     
     */
    public void setParm2(CD value) {
        this.parm2 = value;
    }

}
