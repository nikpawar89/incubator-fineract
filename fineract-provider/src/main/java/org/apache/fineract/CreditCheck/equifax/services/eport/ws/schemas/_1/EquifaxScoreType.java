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
 * For CCR Scores Implementation
 * 
 * <p>Java class for EquifaxScoreType complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="EquifaxScoreType">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="Retail" type="{http://services.equifax.com/eport/ws/schemas/1.0}RetailType" minOccurs="0"/>
 *         &lt;element name="MFI" type="{http://services.equifax.com/eport/ws/schemas/1.0}MFIType" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "EquifaxScoreType", propOrder = {
    "retail",
    "mfi"
})
public class EquifaxScoreType {

    @XmlElement(name = "Retail")
    protected RetailType retail;
    @XmlElement(name = "MFI")
    protected MFIType mfi;

    /**
     * Gets the value of the retail property.
     * 
     * @return
     *     possible object is
     *     {@link RetailType }
     *     
     */
    public RetailType getRetail() {
        return retail;
    }

    /**
     * Sets the value of the retail property.
     * 
     * @param value
     *     allowed object is
     *     {@link RetailType }
     *     
     */
    public void setRetail(RetailType value) {
        this.retail = value;
    }

    /**
     * Gets the value of the mfi property.
     * 
     * @return
     *     possible object is
     *     {@link MFIType }
     *     
     */
    public MFIType getMFI() {
        return mfi;
    }

    /**
     * Sets the value of the mfi property.
     * 
     * @param value
     *     allowed object is
     *     {@link MFIType }
     *     
     */
    public void setMFI(MFIType value) {
        this.mfi = value;
    }

}
