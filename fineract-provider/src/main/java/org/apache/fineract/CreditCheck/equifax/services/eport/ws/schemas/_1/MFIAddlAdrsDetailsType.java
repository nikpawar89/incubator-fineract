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
import javax.xml.bind.annotation.XmlAttribute;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for MFIAddlAdrsDetailsType complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="MFIAddlAdrsDetailsType">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="MFIAddressline" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="MFIState" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="MFIPostalPIN" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *       &lt;/sequence>
 *       &lt;attGroup ref="{http://services.equifax.com/eport/ws/schemas/1.0}MFIAdditionalAddressAttributes"/>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "MFIAddlAdrsDetailsType", propOrder = {
    "mfiAddressline",
    "mfiState",
    "mfiPostalPIN"
})
public class MFIAddlAdrsDetailsType {

    @XmlElement(name = "MFIAddressline")
    protected String mfiAddressline;
    @XmlElement(name = "MFIState")
    protected String mfiState;
    @XmlElement(name = "MFIPostalPIN")
    protected String mfiPostalPIN;
    @XmlAttribute(name = "seq")
    protected Integer seq;

    /**
     * Gets the value of the mfiAddressline property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getMFIAddressline() {
        return mfiAddressline;
    }

    /**
     * Sets the value of the mfiAddressline property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setMFIAddressline(String value) {
        this.mfiAddressline = value;
    }

    /**
     * Gets the value of the mfiState property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getMFIState() {
        return mfiState;
    }

    /**
     * Sets the value of the mfiState property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setMFIState(String value) {
        this.mfiState = value;
    }

    /**
     * Gets the value of the mfiPostalPIN property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getMFIPostalPIN() {
        return mfiPostalPIN;
    }

    /**
     * Sets the value of the mfiPostalPIN property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setMFIPostalPIN(String value) {
        this.mfiPostalPIN = value;
    }

    /**
     * Gets the value of the seq property.
     * 
     * @return
     *     possible object is
     *     {@link Integer }
     *     
     */
    public Integer getSeq() {
        return seq;
    }

    /**
     * Sets the value of the seq property.
     * 
     * @param value
     *     allowed object is
     *     {@link Integer }
     *     
     */
    public void setSeq(Integer value) {
        this.seq = value;
    }

}
