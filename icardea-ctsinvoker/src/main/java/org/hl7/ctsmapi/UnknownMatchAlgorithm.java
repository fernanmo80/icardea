
package org.hl7.ctsmapi;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;
import org.hl7.cts.types.ST;


/**
 * <p>Java class for UnknownMatchAlgorithm complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="UnknownMatchAlgorithm">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="matchAlgorithm_code" type="{urn://cts.hl7.org/types}ST"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "UnknownMatchAlgorithm", propOrder = {
    "matchAlgorithmCode"
})
public class UnknownMatchAlgorithm {

    @XmlElement(name = "matchAlgorithm_code", required = true, nillable = true)
    protected ST matchAlgorithmCode;

    /**
     * Gets the value of the matchAlgorithmCode property.
     * 
     * @return
     *     possible object is
     *     {@link ST }
     *     
     */
    public ST getMatchAlgorithmCode() {
        return matchAlgorithmCode;
    }

    /**
     * Sets the value of the matchAlgorithmCode property.
     * 
     * @param value
     *     allowed object is
     *     {@link ST }
     *     
     */
    public void setMatchAlgorithmCode(ST value) {
        this.matchAlgorithmCode = value;
    }

}
