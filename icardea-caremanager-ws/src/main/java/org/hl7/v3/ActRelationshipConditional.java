//
// This file was generated by the JavaTM Architecture for XML Binding(JAXB) Reference Implementation, v2.0.5-b02-fcs 
// See <a href="http://java.sun.com/xml/jaxb">http://java.sun.com/xml/jaxb</a> 
// Any modifications to this file will be lost upon recompilation of the source schema. 
// Generated on: 2010.08.03 at 01:53:59 PM EEST 
//


package org.hl7.v3;

import javax.xml.bind.annotation.XmlEnum;
import javax.xml.bind.annotation.XmlEnumValue;


/**
 * <p>Java class for ActRelationshipConditional.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * <p>
 * <pre>
 * &lt;simpleType name="ActRelationshipConditional">
 *   &lt;restriction base="{urn:hl7-org:v3}cs">
 *     &lt;enumeration value="BLOCK"/>
 *     &lt;enumeration value="CIND"/>
 *     &lt;enumeration value="CURE"/>
 *     &lt;enumeration value="CURE.ADJ"/>
 *     &lt;enumeration value="DIAG"/>
 *     &lt;enumeration value="MITGT"/>
 *     &lt;enumeration value="MTGT.ADJ"/>
 *     &lt;enumeration value="PRCN"/>
 *     &lt;enumeration value="RCVY"/>
 *     &lt;enumeration value="RSON"/>
 *     &lt;enumeration value="SYMP"/>
 *     &lt;enumeration value="TRIG"/>
 *   &lt;/restriction>
 * &lt;/simpleType>
 * </pre>
 * 
 */
@XmlEnum
public enum ActRelationshipConditional {

    BLOCK("BLOCK"),
    CIND("CIND"),
    CURE("CURE"),
    @XmlEnumValue("CURE.ADJ")
    CURE_ADJ("CURE.ADJ"),
    DIAG("DIAG"),
    MITGT("MITGT"),
    @XmlEnumValue("MTGT.ADJ")
    MTGT_ADJ("MTGT.ADJ"),
    PRCN("PRCN"),
    RCVY("RCVY"),
    RSON("RSON"),
    SYMP("SYMP"),
    TRIG("TRIG");
    private final String value;

    ActRelationshipConditional(String v) {
        value = v;
    }

    public String value() {
        return value;
    }

    public static ActRelationshipConditional fromValue(String v) {
        for (ActRelationshipConditional c: ActRelationshipConditional.values()) {
            if (c.value.equals(v)) {
                return c;
            }
        }
        throw new IllegalArgumentException(v.toString());
    }

}