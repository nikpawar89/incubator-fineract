
package org.apache.fineract.CreditCheck.equifax.services.eport.ws.schemas._1;

import javax.xml.bind.annotation.XmlEnum;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for PhoneTypeCode.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * <p>
 * <pre>
 * &lt;simpleType name="PhoneTypeCode">
 *   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *     &lt;enumeration value="H"/>
 *     &lt;enumeration value="M"/>
 *     &lt;enumeration value="P"/>
 *     &lt;enumeration value="F"/>
 *     &lt;enumeration value="T"/>
 *     &lt;enumeration value="E"/>
 *     &lt;enumeration value="X"/>
 *   &lt;/restriction>
 * &lt;/simpleType>
 * </pre>
 * 
 */
@XmlType(name = "PhoneTypeCode")
@XmlEnum
public enum PhoneTypeCode {

    H,
    M,
    P,
    F,
    T,
    E,
    X;

    public String value() {
        return name();
    }

    public static PhoneTypeCode fromValue(String v) {
        return valueOf(v);
    }

}
