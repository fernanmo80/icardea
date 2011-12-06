
package org.hl7.ctsmapi;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;
import org.hl7.cts.types.ST;
import org.hl7.cts.types.UID;


/**
 * <p>Java class for ConceptId complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="ConceptId">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="codeSystem_id" type="{urn://cts.hl7.org/types}UID"/>
 *         &lt;element name="concept_code" type="{urn://cts.hl7.org/types}ST"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "ConceptId", propOrder = {
    "codeSystemId",
    "conceptCode"
})
public class ConceptId {

    @XmlElement(name = "codeSystem_id", required = true, nillable = true)
    protected UID codeSystemId;
    @XmlElement(name = "concept_code", required = true, nillable = true)
    protected ST conceptCode;

    /**
     * Gets the value of the codeSystemId property.
     * 
     * @return
     *     possible object is
     *     {@link UID }
     *     
     */
    public UID getCodeSystemId() {
        return codeSystemId;
    }

    /**
     * Sets the value of the codeSystemId property.
     * 
     * @param value
     *     allowed object is
     *     {@link UID }
     *     
     */
    public void setCodeSystemId(UID value) {
        this.codeSystemId = value;
    }

    /**
     * Gets the value of the conceptCode property.
     * 
     * @return
     *     possible object is
     *     {@link ST }
     *     
     */
    public ST getConceptCode() {
        return conceptCode;
    }

    /**
     * Sets the value of the conceptCode property.
     * 
     * @param value
     *     allowed object is
     *     {@link ST }
     *     
     */
    public void setConceptCode(ST value) {
        this.conceptCode = value;
    }

}
