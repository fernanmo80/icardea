
package org.hl7.ctsmapi;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;
import org.hl7.cts.types.INT;


/**
 * <p>Java class for ValidateCodeReturn complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="ValidateCodeReturn">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="nErrors" type="{urn://cts.hl7.org/types}INT"/>
 *         &lt;element name="nWarnings" type="{urn://cts.hl7.org/types}INT"/>
 *         &lt;element name="detail" type="{urn://hl7.org/CTSMAPI}ArrayOfValidationDetail"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "ValidateCodeReturn", propOrder = {
    "nErrors",
    "nWarnings",
    "detail"
})
public class ValidateCodeReturn {

    @XmlElement(required = true, nillable = true)
    protected INT nErrors;
    @XmlElement(required = true, nillable = true)
    protected INT nWarnings;
    @XmlElement(required = true, nillable = true)
    protected ArrayOfValidationDetail detail;

    /**
     * Gets the value of the nErrors property.
     * 
     * @return
     *     possible object is
     *     {@link INT }
     *     
     */
    public INT getNErrors() {
        return nErrors;
    }

    /**
     * Sets the value of the nErrors property.
     * 
     * @param value
     *     allowed object is
     *     {@link INT }
     *     
     */
    public void setNErrors(INT value) {
        this.nErrors = value;
    }

    /**
     * Gets the value of the nWarnings property.
     * 
     * @return
     *     possible object is
     *     {@link INT }
     *     
     */
    public INT getNWarnings() {
        return nWarnings;
    }

    /**
     * Sets the value of the nWarnings property.
     * 
     * @param value
     *     allowed object is
     *     {@link INT }
     *     
     */
    public void setNWarnings(INT value) {
        this.nWarnings = value;
    }

    /**
     * Gets the value of the detail property.
     * 
     * @return
     *     possible object is
     *     {@link ArrayOfValidationDetail }
     *     
     */
    public ArrayOfValidationDetail getDetail() {
        return detail;
    }

    /**
     * Sets the value of the detail property.
     * 
     * @param value
     *     allowed object is
     *     {@link ArrayOfValidationDetail }
     *     
     */
    public void setDetail(ArrayOfValidationDetail value) {
        this.detail = value;
    }

}
