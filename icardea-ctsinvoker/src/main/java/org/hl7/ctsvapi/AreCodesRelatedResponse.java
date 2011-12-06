
package org.hl7.ctsvapi;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlRootElement;
import javax.xml.bind.annotation.XmlType;


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
 *         &lt;element name="areCodesRelatedReturn" type="{http://www.w3.org/2001/XMLSchema}boolean"/>
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
    "areCodesRelatedReturn"
})
@XmlRootElement(name = "areCodesRelatedResponse")
public class AreCodesRelatedResponse {

    protected boolean areCodesRelatedReturn;

    /**
     * Gets the value of the areCodesRelatedReturn property.
     * 
     */
    public boolean isAreCodesRelatedReturn() {
        return areCodesRelatedReturn;
    }

    /**
     * Sets the value of the areCodesRelatedReturn property.
     * 
     */
    public void setAreCodesRelatedReturn(boolean value) {
        this.areCodesRelatedReturn = value;
    }

}
