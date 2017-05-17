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
package org.apache.fineract.CreditCheck.equifax.services.eport.ws.schemas._1;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for MFIAdditionalIdentityInfoType complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="MFIAdditionalIdentityInfoType">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="MFIVoterID" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="MFIPANCardID" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="MFIRationCard" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="MFIUID" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="MFIOtherID" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "MFIAdditionalIdentityInfoType", propOrder = {
    "mfiVoterID",
    "mfipanCardID",
    "mfiRationCard",
    "mfiuid",
    "mfiOtherID"
})
public class MFIAdditionalIdentityInfoType {

    @XmlElement(name = "MFIVoterID")
    protected String mfiVoterID;
    @XmlElement(name = "MFIPANCardID")
    protected String mfipanCardID;
    @XmlElement(name = "MFIRationCard")
    protected String mfiRationCard;
    @XmlElement(name = "MFIUID")
    protected String mfiuid;
    @XmlElement(name = "MFIOtherID")
    protected String mfiOtherID;

    /**
     * Gets the value of the mfiVoterID property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getMFIVoterID() {
        return mfiVoterID;
    }

    /**
     * Sets the value of the mfiVoterID property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setMFIVoterID(String value) {
        this.mfiVoterID = value;
    }

    /**
     * Gets the value of the mfipanCardID property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getMFIPANCardID() {
        return mfipanCardID;
    }

    /**
     * Sets the value of the mfipanCardID property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setMFIPANCardID(String value) {
        this.mfipanCardID = value;
    }

    /**
     * Gets the value of the mfiRationCard property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getMFIRationCard() {
        return mfiRationCard;
    }

    /**
     * Sets the value of the mfiRationCard property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setMFIRationCard(String value) {
        this.mfiRationCard = value;
    }

    /**
     * Gets the value of the mfiuid property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getMFIUID() {
        return mfiuid;
    }

    /**
     * Sets the value of the mfiuid property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setMFIUID(String value) {
        this.mfiuid = value;
    }

    /**
     * Gets the value of the mfiOtherID property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getMFIOtherID() {
        return mfiOtherID;
    }

    /**
     * Sets the value of the mfiOtherID property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setMFIOtherID(String value) {
        this.mfiOtherID = value;
    }

}
