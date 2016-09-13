
package org.apache.fineract.CreditCheck.equifax.services.eport.ws.schemas._1;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for voterRequest complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="voterRequest">
 *   &lt;complexContent>
 *     &lt;extension base="{http://services.equifax.com/eport/ws/schemas/1.0}request">
 *       &lt;sequence>
 *         &lt;element name="voterId" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/extension>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "voterRequest", propOrder = {
    "voterId"
})
public class VoterRequest
    extends Request
{

    protected String voterId;

    /**
     * Gets the value of the voterId property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getVoterId() {
        return voterId;
    }

    /**
     * Sets the value of the voterId property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setVoterId(String value) {
        this.voterId = value;
    }

}
