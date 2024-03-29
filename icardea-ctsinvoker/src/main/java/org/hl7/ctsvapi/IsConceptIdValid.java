
package org.hl7.ctsvapi;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
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
 *         &lt;element name="concept_id" type="{urn://hl7.org/CTSVAPI}ConceptId"/>
 *         &lt;element name="activeConceptsOnly" type="{http://www.w3.org/2001/XMLSchema}boolean"/>
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
    "conceptId",
    "activeConceptsOnly"
})
@XmlRootElement(name = "isConceptIdValid")
public class IsConceptIdValid {

    @XmlElement(name = "concept_id", required = true)
    protected ConceptId conceptId;
    protected boolean activeConceptsOnly;

    /**
     * Gets the value of the conceptId property.
     * 
     * @return
     *     possible object is
     *     {@link ConceptId }
     *     
     */
    public ConceptId getConceptId() {
        return conceptId;
    }

    /**
     * Sets the value of the conceptId property.
     * 
     * @param value
     *     allowed object is
     *     {@link ConceptId }
     *     
     */
    public void setConceptId(ConceptId value) {
        this.conceptId = value;
    }

    /**
     * Gets the value of the activeConceptsOnly property.
     * 
     */
    public boolean isActiveConceptsOnly() {
        return activeConceptsOnly;
    }

    /**
     * Sets the value of the activeConceptsOnly property.
     * 
     */
    public void setActiveConceptsOnly(boolean value) {
        this.activeConceptsOnly = value;
    }

}
