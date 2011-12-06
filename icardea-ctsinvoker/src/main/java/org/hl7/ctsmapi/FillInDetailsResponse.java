
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
 *         &lt;element name="fillInDetailsReturn" type="{urn://cts.hl7.org/types}CD"/>
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
    "fillInDetailsReturn"
})
@XmlRootElement(name = "fillInDetailsResponse")
public class FillInDetailsResponse {

    @XmlElement(required = true)
    protected CD fillInDetailsReturn;

    /**
     * Gets the value of the fillInDetailsReturn property.
     * 
     * @return
     *     possible object is
     *     {@link CD }
     *     
     */
    public CD getFillInDetailsReturn() {
        return fillInDetailsReturn;
    }

    /**
     * Sets the value of the fillInDetailsReturn property.
     * 
     * @param value
     *     allowed object is
     *     {@link CD }
     *     
     */
    public void setFillInDetailsReturn(CD value) {
        this.fillInDetailsReturn = value;
    }

}
