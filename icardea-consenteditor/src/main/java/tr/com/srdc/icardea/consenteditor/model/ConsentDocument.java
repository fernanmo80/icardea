//
// This file was generated by the JavaTM Architecture for XML Binding(JAXB) Reference Implementation, vhudson-jaxb-ri-2.1-2 
// See <a href="http://java.sun.com/xml/jaxb">http://java.sun.com/xml/jaxb</a> 
// Any modifications to this file will be lost upon recompilation of the source schema. 
// Generated on: 2010.11.23 at 04:13:06 PM EET 
//


package tr.com.srdc.icardea.consenteditor.model;

import java.io.Serializable;
import java.util.ArrayList;
import java.util.List;
import javax.persistence.Basic;
import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Inheritance;
import javax.persistence.InheritanceType;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.OneToMany;
import javax.persistence.Table;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlAttribute;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlRootElement;
import javax.xml.bind.annotation.XmlType;
import org.jvnet.jaxb2_commons.lang.Equals;
import org.jvnet.jaxb2_commons.lang.EqualsStrategy;
import org.jvnet.jaxb2_commons.lang.HashCode;
import org.jvnet.jaxb2_commons.lang.HashCodeStrategy;
import org.jvnet.jaxb2_commons.lang.JAXBEqualsStrategy;
import org.jvnet.jaxb2_commons.lang.JAXBHashCodeStrategy;
import org.jvnet.jaxb2_commons.locator.ObjectLocator;
import org.jvnet.jaxb2_commons.locator.util.LocatorUtils;


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
 *         &lt;element name="consentDocumentMetaData" type="{model.consenteditor.srdc.com.tr}consentDocumentMetaDataType"/>
 *         &lt;element ref="{model.consenteditor.srdc.com.tr}consentRule" maxOccurs="unbounded"/>
 *       &lt;/sequence>
 *       &lt;attribute name="id" type="{model.consenteditor.srdc.com.tr}non_empty_string" />
 *       &lt;attribute name="isCurrent" use="required" type="{model.consenteditor.srdc.com.tr}non_empty_string" />
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "", propOrder = {
    "consentDocumentMetaData",
    "consentRule"
})
@XmlRootElement(name = "consentDocument")
@Entity(name = "ConsentDocument")
@Table(name = "CONSENTDOCUMENT")
@Inheritance(strategy = InheritanceType.JOINED)
public class ConsentDocument
    implements Serializable, Equals, HashCode
{

    @XmlElement(required = true)
    protected ConsentDocumentMetaDataType consentDocumentMetaData;
    @XmlElement(required = true)
    protected List<ConsentRule> consentRule;
    @XmlAttribute(name = "id", namespace = "model.consenteditor.srdc.com.tr")
    protected String id;
    @XmlAttribute(name = "isCurrent", namespace = "model.consenteditor.srdc.com.tr", required = true)
    protected String isCurrent;

    /**
     * Gets the value of the consentDocumentMetaData property.
     * 
     * @return
     *     possible object is
     *     {@link ConsentDocumentMetaDataType }
     *     
     */
    @ManyToOne(targetEntity = ConsentDocumentMetaDataType.class, cascade = {
        CascadeType.ALL
    })
    @JoinColumn(name = "CONSENTDOCUMENTMETADATA_CONS_0")
    public ConsentDocumentMetaDataType getConsentDocumentMetaData() {
        return consentDocumentMetaData;
    }

    /**
     * Sets the value of the consentDocumentMetaData property.
     * 
     * @param value
     *     allowed object is
     *     {@link ConsentDocumentMetaDataType }
     *     
     */
    public void setConsentDocumentMetaData(ConsentDocumentMetaDataType value) {
        this.consentDocumentMetaData = value;
    }

    /**
     * Gets the value of the consentRule property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the consentRule property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getConsentRule().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link ConsentRule }
     * 
     * 
     */
    @OneToMany(targetEntity = ConsentRule.class, cascade = {
        CascadeType.ALL
    })
    @JoinColumn(name = "CONSENTRULE_CONSENTDOCUMENT__0")
    public List<ConsentRule> getConsentRule() {
        if (consentRule == null) {
            consentRule = new ArrayList<ConsentRule>();
        }
        return this.consentRule;
    }

    /**
     * 
     * 
     */
    public void setConsentRule(List<ConsentRule> consentRule) {
        this.consentRule = consentRule;
    }

    /**
     * Gets the value of the id property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    @Id
    @Column(name = "ID")
    public String getId() {
        return id;
    }

    /**
     * Sets the value of the id property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setId(String value) {
        this.id = value;
    }

    /**
     * Gets the value of the isCurrent property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    @Basic
    @Column(name = "ISCURRENT", length = 255)
    public String getIsCurrent() {
        return isCurrent;
    }

    /**
     * Sets the value of the isCurrent property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setIsCurrent(String value) {
        this.isCurrent = value;
    }

    public boolean equals(ObjectLocator thisLocator, ObjectLocator thatLocator, Object object, EqualsStrategy strategy) {
        if (!(object instanceof ConsentDocument)) {
            return false;
        }
        if (this == object) {
            return true;
        }
        final ConsentDocument that = ((ConsentDocument) object);
        {
            ConsentDocumentMetaDataType lhsConsentDocumentMetaData;
            lhsConsentDocumentMetaData = this.getConsentDocumentMetaData();
            ConsentDocumentMetaDataType rhsConsentDocumentMetaData;
            rhsConsentDocumentMetaData = that.getConsentDocumentMetaData();
            if (!strategy.equals(LocatorUtils.property(thisLocator, "consentDocumentMetaData", lhsConsentDocumentMetaData), LocatorUtils.property(thatLocator, "consentDocumentMetaData", rhsConsentDocumentMetaData), lhsConsentDocumentMetaData, rhsConsentDocumentMetaData)) {
                return false;
            }
        }
        {
            List<ConsentRule> lhsConsentRule;
            lhsConsentRule = this.getConsentRule();
            List<ConsentRule> rhsConsentRule;
            rhsConsentRule = that.getConsentRule();
            if (!strategy.equals(LocatorUtils.property(thisLocator, "consentRule", lhsConsentRule), LocatorUtils.property(thatLocator, "consentRule", rhsConsentRule), lhsConsentRule, rhsConsentRule)) {
                return false;
            }
        }
        {
            String lhsId;
            lhsId = this.getId();
            String rhsId;
            rhsId = that.getId();
            if (!strategy.equals(LocatorUtils.property(thisLocator, "id", lhsId), LocatorUtils.property(thatLocator, "id", rhsId), lhsId, rhsId)) {
                return false;
            }
        }
        {
            String lhsIsCurrent;
            lhsIsCurrent = this.getIsCurrent();
            String rhsIsCurrent;
            rhsIsCurrent = that.getIsCurrent();
            if (!strategy.equals(LocatorUtils.property(thisLocator, "isCurrent", lhsIsCurrent), LocatorUtils.property(thatLocator, "isCurrent", rhsIsCurrent), lhsIsCurrent, rhsIsCurrent)) {
                return false;
            }
        }
        return true;
    }

    public boolean equals(Object object) {
        final EqualsStrategy strategy = JAXBEqualsStrategy.INSTANCE;
        return equals(null, null, object, strategy);
    }

    public int hashCode(ObjectLocator locator, HashCodeStrategy strategy) {
        int currentHashCode = 1;
        {
            ConsentDocumentMetaDataType theConsentDocumentMetaData;
            theConsentDocumentMetaData = this.getConsentDocumentMetaData();
            currentHashCode = strategy.hashCode(LocatorUtils.property(locator, "consentDocumentMetaData", theConsentDocumentMetaData), currentHashCode, theConsentDocumentMetaData);
        }
        {
            List<ConsentRule> theConsentRule;
            theConsentRule = this.getConsentRule();
            currentHashCode = strategy.hashCode(LocatorUtils.property(locator, "consentRule", theConsentRule), currentHashCode, theConsentRule);
        }
        {
            String theId;
            theId = this.getId();
            currentHashCode = strategy.hashCode(LocatorUtils.property(locator, "id", theId), currentHashCode, theId);
        }
        {
            String theIsCurrent;
            theIsCurrent = this.getIsCurrent();
            currentHashCode = strategy.hashCode(LocatorUtils.property(locator, "isCurrent", theIsCurrent), currentHashCode, theIsCurrent);
        }
        return currentHashCode;
    }

    public int hashCode() {
        final HashCodeStrategy strategy = JAXBHashCodeStrategy.INSTANCE;
        return this.hashCode(null, strategy);
    }

}