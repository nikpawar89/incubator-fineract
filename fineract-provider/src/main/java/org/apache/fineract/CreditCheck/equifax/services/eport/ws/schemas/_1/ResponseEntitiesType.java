
package org.apache.fineract.CreditCheck.equifax.services.eport.ws.schemas._1;

import java.util.ArrayList;
import java.util.List;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for ResponseEntitiesType complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="ResponseEntitiesType">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="ResponseEntity" type="{http://services.equifax.com/eport/ws/schemas/1.0}ResponseEntityType" maxOccurs="unbounded" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "ResponseEntitiesType", propOrder = {
    "responseEntity"
})
public class ResponseEntitiesType {

    @XmlElement(name = "ResponseEntity")
    protected List<ResponseEntityType> responseEntity;

    /**
     * Gets the value of the responseEntity property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the responseEntity property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getResponseEntity().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link ResponseEntityType }
     * 
     * 
     */
    public List<ResponseEntityType> getResponseEntity() {
        if (responseEntity == null) {
            responseEntity = new ArrayList<ResponseEntityType>();
        }
        return this.responseEntity;
    }

}
