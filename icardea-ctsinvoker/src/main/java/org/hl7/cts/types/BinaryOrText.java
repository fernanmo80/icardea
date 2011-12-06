
package org.hl7.cts.types;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for binary_or_text complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="binary_or_text">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="itemType" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *         &lt;element name="binaryValue" type="{http://www.w3.org/2001/XMLSchema}base64Binary"/>
 *         &lt;element name="textualValue" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "binary_or_text", propOrder = {
    "itemType",
    "binaryValue",
    "textualValue"
})
public class BinaryOrText {

    @XmlElement(required = true, nillable = true)
    protected String itemType;
    @XmlElement(required = true, nillable = true)
    protected byte[] binaryValue;
    @XmlElement(required = true, nillable = true)
    protected String textualValue;

    /**
     * Gets the value of the itemType property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getItemType() {
        return itemType;
    }

    /**
     * Sets the value of the itemType property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setItemType(String value) {
        this.itemType = value;
    }

    /**
     * Gets the value of the binaryValue property.
     * 
     * @return
     *     possible object is
     *     byte[]
     */
    public byte[] getBinaryValue() {
        return binaryValue;
    }

    /**
     * Sets the value of the binaryValue property.
     * 
     * @param value
     *     allowed object is
     *     byte[]
     */
    public void setBinaryValue(byte[] value) {
        this.binaryValue = ((byte[]) value);
    }

    /**
     * Gets the value of the textualValue property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getTextualValue() {
        return textualValue;
    }

    /**
     * Sets the value of the textualValue property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setTextualValue(String value) {
        this.textualValue = value;
    }

}
