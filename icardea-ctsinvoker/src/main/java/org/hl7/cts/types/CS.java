
package org.hl7.cts.types;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for CS complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="CS">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="code" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *         &lt;element name="originalText" type="{urn://cts.hl7.org/types}ED"/>
 *         &lt;element name="codingRationale" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "CS", propOrder = {
    "code",
    "originalText",
    "codingRationale"
})
public class CS {

    @XmlElement(required = true, nillable = true)
    protected String code;
    @XmlElement(required = true, nillable = true)
    protected ED originalText;
    @XmlElement(required = true, nillable = true)
    protected String codingRationale;

    /**
     * Gets the value of the code property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getCode() {
        return code;
    }

    /**
     * Sets the value of the code property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setCode(String value) {
        this.code = value;
    }

    /**
     * Gets the value of the originalText property.
     * 
     * @return
     *     possible object is
     *     {@link ED }
     *     
     */
    public ED getOriginalText() {
        return originalText;
    }

    /**
     * Sets the value of the originalText property.
     * 
     * @param value
     *     allowed object is
     *     {@link ED }
     *     
     */
    public void setOriginalText(ED value) {
        this.originalText = value;
    }

    /**
     * Gets the value of the codingRationale property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getCodingRationale() {
        return codingRationale;
    }

    /**
     * Sets the value of the codingRationale property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setCodingRationale(String value) {
        this.codingRationale = value;
    }

}
