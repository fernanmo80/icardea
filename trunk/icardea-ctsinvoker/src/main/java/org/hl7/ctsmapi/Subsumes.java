
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
 *         &lt;element name="parentCode" type="{urn://cts.hl7.org/types}CD"/>
 *         &lt;element name="childCode" type="{urn://cts.hl7.org/types}CD"/>
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
    "parentCode",
    "childCode"
})
@XmlRootElement(name = "subsumes")
public class Subsumes {

    @XmlElement(required = true)
    protected CD parentCode;
    @XmlElement(required = true)
    protected CD childCode;

    /**
     * Gets the value of the parentCode property.
     * 
     * @return
     *     possible object is
     *     {@link CD }
     *     
     */
    public CD getParentCode() {
        return parentCode;
    }

    /**
     * Sets the value of the parentCode property.
     * 
     * @param value
     *     allowed object is
     *     {@link CD }
     *     
     */
    public void setParentCode(CD value) {
        this.parentCode = value;
    }

    /**
     * Gets the value of the childCode property.
     * 
     * @return
     *     possible object is
     *     {@link CD }
     *     
     */
    public CD getChildCode() {
        return childCode;
    }

    /**
     * Sets the value of the childCode property.
     * 
     * @param value
     *     allowed object is
     *     {@link CD }
     *     
     */
    public void setChildCode(CD value) {
        this.childCode = value;
    }

}
