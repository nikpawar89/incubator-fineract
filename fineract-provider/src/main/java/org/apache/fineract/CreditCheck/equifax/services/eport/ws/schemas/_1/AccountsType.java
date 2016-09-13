
package org.apache.fineract.CreditCheck.equifax.services.eport.ws.schemas._1;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for AccountsType complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="AccountsType">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="Retails" type="{http://services.equifax.com/eport/ws/schemas/1.0}RetailAccountType" minOccurs="0"/>
 *         &lt;element name="Microfinances" type="{http://services.equifax.com/eport/ws/schemas/1.0}MicrofinancesType" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "AccountsType", propOrder = {
    "retails",
    "microfinances"
})
public class AccountsType {

    @XmlElement(name = "Retails")
    protected RetailAccountType retails;
    @XmlElement(name = "Microfinances")
    protected MicrofinancesType microfinances;

    /**
     * Gets the value of the retails property.
     * 
     * @return
     *     possible object is
     *     {@link RetailAccountType }
     *     
     */
    public RetailAccountType getRetails() {
        return retails;
    }

    /**
     * Sets the value of the retails property.
     * 
     * @param value
     *     allowed object is
     *     {@link RetailAccountType }
     *     
     */
    public void setRetails(RetailAccountType value) {
        this.retails = value;
    }

    /**
     * Gets the value of the microfinances property.
     * 
     * @return
     *     possible object is
     *     {@link MicrofinancesType }
     *     
     */
    public MicrofinancesType getMicrofinances() {
        return microfinances;
    }

    /**
     * Sets the value of the microfinances property.
     * 
     * @param value
     *     allowed object is
     *     {@link MicrofinancesType }
     *     
     */
    public void setMicrofinances(MicrofinancesType value) {
        this.microfinances = value;
    }

}
