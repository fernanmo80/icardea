
package org.hl7.ctsmapi;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;
import org.hl7.cts.types.ST;


/**
 * <p>Java class for UnknownVocabularyDomain complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="UnknownVocabularyDomain">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="vocabularyDomain_name" type="{urn://cts.hl7.org/types}ST"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "UnknownVocabularyDomain", propOrder = {
    "vocabularyDomainName"
})
public class UnknownVocabularyDomain {

    @XmlElement(name = "vocabularyDomain_name", required = true, nillable = true)
    protected ST vocabularyDomainName;

    /**
     * Gets the value of the vocabularyDomainName property.
     * 
     * @return
     *     possible object is
     *     {@link ST }
     *     
     */
    public ST getVocabularyDomainName() {
        return vocabularyDomainName;
    }

    /**
     * Sets the value of the vocabularyDomainName property.
     * 
     * @param value
     *     allowed object is
     *     {@link ST }
     *     
     */
    public void setVocabularyDomainName(ST value) {
        this.vocabularyDomainName = value;
    }

}
