
package org.hl7.ctsmapi;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;
import org.hl7.cts.types.ST;


/**
 * <p>Java class for UnexpectedError complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="UnexpectedError">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="possible_cause" type="{urn://cts.hl7.org/types}ST"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "UnexpectedError", propOrder = {
    "possibleCause"
})
public class UnexpectedError {

    @XmlElement(name = "possible_cause", required = true, nillable = true)
    protected ST possibleCause;

    /**
     * Gets the value of the possibleCause property.
     * 
     * @return
     *     possible object is
     *     {@link ST }
     *     
     */
    public ST getPossibleCause() {
        return possibleCause;
    }

    /**
     * Sets the value of the possibleCause property.
     * 
     * @param value
     *     allowed object is
     *     {@link ST }
     *     
     */
    public void setPossibleCause(ST value) {
        this.possibleCause = value;
    }

}
