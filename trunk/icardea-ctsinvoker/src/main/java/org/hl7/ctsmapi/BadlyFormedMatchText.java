
package org.hl7.ctsmapi;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;
import org.hl7.cts.types.ST;


/**
 * <p>Java class for BadlyFormedMatchText complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="BadlyFormedMatchText">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="matchText" type="{urn://cts.hl7.org/types}ST"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "BadlyFormedMatchText", propOrder = {
    "matchText"
})
public class BadlyFormedMatchText {

    @XmlElement(required = true, nillable = true)
    protected ST matchText;

    /**
     * Gets the value of the matchText property.
     * 
     * @return
     *     possible object is
     *     {@link ST }
     *     
     */
    public ST getMatchText() {
        return matchText;
    }

    /**
     * Sets the value of the matchText property.
     * 
     * @param value
     *     allowed object is
     *     {@link ST }
     *     
     */
    public void setMatchText(ST value) {
        this.matchText = value;
    }

}
