
package org.hl7.ctsmapi;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;
import org.hl7.cts.types.BL;
import org.hl7.cts.types.CD;
import org.hl7.cts.types.ST;


/**
 * <p>Java class for ValidationDetail complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="ValidationDetail">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="codeInError" type="{urn://cts.hl7.org/types}CD"/>
 *         &lt;element name="isError" type="{urn://cts.hl7.org/types}BL"/>
 *         &lt;element name="error_id" type="{urn://cts.hl7.org/types}ST"/>
 *         &lt;element name="errorText" type="{urn://cts.hl7.org/types}ST"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "ValidationDetail", propOrder = {
    "codeInError",
    "isError",
    "errorId",
    "errorText"
})
public class ValidationDetail {

    @XmlElement(required = true, nillable = true)
    protected CD codeInError;
    @XmlElement(required = true, nillable = true)
    protected BL isError;
    @XmlElement(name = "error_id", required = true, nillable = true)
    protected ST errorId;
    @XmlElement(required = true, nillable = true)
    protected ST errorText;

    /**
     * Gets the value of the codeInError property.
     * 
     * @return
     *     possible object is
     *     {@link CD }
     *     
     */
    public CD getCodeInError() {
        return codeInError;
    }

    /**
     * Sets the value of the codeInError property.
     * 
     * @param value
     *     allowed object is
     *     {@link CD }
     *     
     */
    public void setCodeInError(CD value) {
        this.codeInError = value;
    }

    /**
     * Gets the value of the isError property.
     * 
     * @return
     *     possible object is
     *     {@link BL }
     *     
     */
    public BL getIsError() {
        return isError;
    }

    /**
     * Sets the value of the isError property.
     * 
     * @param value
     *     allowed object is
     *     {@link BL }
     *     
     */
    public void setIsError(BL value) {
        this.isError = value;
    }

    /**
     * Gets the value of the errorId property.
     * 
     * @return
     *     possible object is
     *     {@link ST }
     *     
     */
    public ST getErrorId() {
        return errorId;
    }

    /**
     * Sets the value of the errorId property.
     * 
     * @param value
     *     allowed object is
     *     {@link ST }
     *     
     */
    public void setErrorId(ST value) {
        this.errorId = value;
    }

    /**
     * Gets the value of the errorText property.
     * 
     * @return
     *     possible object is
     *     {@link ST }
     *     
     */
    public ST getErrorText() {
        return errorText;
    }

    /**
     * Sets the value of the errorText property.
     * 
     * @param value
     *     allowed object is
     *     {@link ST }
     *     
     */
    public void setErrorText(ST value) {
        this.errorText = value;
    }

}
