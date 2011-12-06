
package org.hl7.ctsvapi;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for UnknownRelationQualifier complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="UnknownRelationQualifier">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="relationQualifier_code" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "UnknownRelationQualifier", propOrder = {
    "relationQualifierCode"
})
public class UnknownRelationQualifier {

    @XmlElement(name = "relationQualifier_code", required = true, nillable = true)
    protected String relationQualifierCode;

    /**
     * Gets the value of the relationQualifierCode property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getRelationQualifierCode() {
        return relationQualifierCode;
    }

    /**
     * Sets the value of the relationQualifierCode property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setRelationQualifierCode(String value) {
        this.relationQualifierCode = value;
    }

}
