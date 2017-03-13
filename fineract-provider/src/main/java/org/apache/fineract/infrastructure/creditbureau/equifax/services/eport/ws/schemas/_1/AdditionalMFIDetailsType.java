/**
 * Licensed to the Apache Software Foundation (ASF) under one
 * or more contributor license agreements. See the NOTICE file
 * distributed with this work for additional information
 * regarding copyright ownership. The ASF licenses this file
 * to you under the Apache License, Version 2.0 (the
 * "License"); you may not use this file except in compliance
 * with the License. You may obtain a copy of the License at
 *
 * http://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing,
 * software distributed under the License is distributed on an
 * "AS IS" BASIS, WITHOUT WARRANTIES OR CONDITIONS OF ANY
 * KIND, either express or implied. See the License for the
 * specific language governing permissions and limitations
 * under the License.
 */
package org.apache.fineract.infrastructure.creditbureau.equifax.services.eport.ws.schemas._1;

import java.util.ArrayList;
import java.util.List;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlAttribute;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for AdditionalMFIDetailsType complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="AdditionalMFIDetailsType">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="MFIClientFullname" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="MFIDOB" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="MFIGender" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="MFIIdentification" type="{http://services.equifax.com/eport/ws/schemas/1.0}MFIAdditionalIdentityInfoType" minOccurs="0"/>
 *         &lt;element name="MFIAddress" type="{http://services.equifax.com/eport/ws/schemas/1.0}MFIAdditionalAddressType" minOccurs="0"/>
 *         &lt;element name="Phone" type="{http://services.equifax.com/eport/ws/schemas/1.0}PhoneType" maxOccurs="unbounded" minOccurs="0"/>
 *         &lt;element name="MemberId" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *       &lt;/sequence>
 *       &lt;attGroup ref="{http://services.equifax.com/eport/ws/schemas/1.0}AdditionalMFIDetailsAttributes"/>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "AdditionalMFIDetailsType", propOrder = {
    "mfiClientFullname",
    "mfidob",
    "mfiGender",
    "mfiIdentification",
    "mfiAddress",
    "phone",
    "memberId"
})
public class AdditionalMFIDetailsType {

    @XmlElement(name = "MFIClientFullname")
    protected String mfiClientFullname;
    @XmlElement(name = "MFIDOB")
    protected String mfidob;
    @XmlElement(name = "MFIGender")
    protected String mfiGender;
    @XmlElement(name = "MFIIdentification")
    protected MFIAdditionalIdentityInfoType mfiIdentification;
    @XmlElement(name = "MFIAddress")
    protected MFIAdditionalAddressType mfiAddress;
    @XmlElement(name = "Phone")
    protected List<PhoneType> phone;
    @XmlElement(name = "MemberId")
    protected String memberId;
    @XmlAttribute(name = "id")
    protected Integer id;

    /**
     * Gets the value of the mfiClientFullname property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getMFIClientFullname() {
        return mfiClientFullname;
    }

    /**
     * Sets the value of the mfiClientFullname property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setMFIClientFullname(String value) {
        this.mfiClientFullname = value;
    }

    /**
     * Gets the value of the mfidob property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getMFIDOB() {
        return mfidob;
    }

    /**
     * Sets the value of the mfidob property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setMFIDOB(String value) {
        this.mfidob = value;
    }

    /**
     * Gets the value of the mfiGender property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getMFIGender() {
        return mfiGender;
    }

    /**
     * Sets the value of the mfiGender property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setMFIGender(String value) {
        this.mfiGender = value;
    }

    /**
     * Gets the value of the mfiIdentification property.
     * 
     * @return
     *     possible object is
     *     {@link MFIAdditionalIdentityInfoType }
     *     
     */
    public MFIAdditionalIdentityInfoType getMFIIdentification() {
        return mfiIdentification;
    }

    /**
     * Sets the value of the mfiIdentification property.
     * 
     * @param value
     *     allowed object is
     *     {@link MFIAdditionalIdentityInfoType }
     *     
     */
    public void setMFIIdentification(MFIAdditionalIdentityInfoType value) {
        this.mfiIdentification = value;
    }

    /**
     * Gets the value of the mfiAddress property.
     * 
     * @return
     *     possible object is
     *     {@link MFIAdditionalAddressType }
     *     
     */
    public MFIAdditionalAddressType getMFIAddress() {
        return mfiAddress;
    }

    /**
     * Sets the value of the mfiAddress property.
     * 
     * @param value
     *     allowed object is
     *     {@link MFIAdditionalAddressType }
     *     
     */
    public void setMFIAddress(MFIAdditionalAddressType value) {
        this.mfiAddress = value;
    }

    /**
     * Gets the value of the phone property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the phone property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getPhone().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link PhoneType }
     * 
     * 
     */
    public List<PhoneType> getPhone() {
        if (phone == null) {
            phone = new ArrayList<PhoneType>();
        }
        return this.phone;
    }

    /**
     * Gets the value of the memberId property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getMemberId() {
        return memberId;
    }

    /**
     * Sets the value of the memberId property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setMemberId(String value) {
        this.memberId = value;
    }

    /**
     * Gets the value of the id property.
     * 
     * @return
     *     possible object is
     *     {@link Integer }
     *     
     */
    public Integer getId() {
        return id;
    }

    /**
     * Sets the value of the id property.
     * 
     * @param value
     *     allowed object is
     *     {@link Integer }
     *     
     */
    public void setId(Integer value) {
        this.id = value;
    }

}
