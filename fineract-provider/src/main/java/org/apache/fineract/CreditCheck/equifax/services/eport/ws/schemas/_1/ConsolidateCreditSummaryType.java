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
 * For CCR ConsolidateCreditSummary Implementation
 * 
 * <p>Java class for ConsolidateCreditSummaryType complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="ConsolidateCreditSummaryType">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="OverAll" type="{http://services.equifax.com/eport/ws/schemas/1.0}OverAllType" minOccurs="0"/>
 *         &lt;element name="Retail" type="{http://services.equifax.com/eport/ws/schemas/1.0}RetailsType" minOccurs="0"/>
 *         &lt;element name="Microfinance" type="{http://services.equifax.com/eport/ws/schemas/1.0}MicrofinanceType" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "ConsolidateCreditSummaryType", propOrder = {
    "overAll",
    "retail",
    "microfinance"
})
public class ConsolidateCreditSummaryType {

    @XmlElement(name = "OverAll")
    protected OverAllType overAll;
    @XmlElement(name = "Retail")
    protected RetailsType retail;
    @XmlElement(name = "Microfinance")
    protected MicrofinanceType microfinance;

    /**
     * Gets the value of the overAll property.
     * 
     * @return
     *     possible object is
     *     {@link OverAllType }
     *     
     */
    public OverAllType getOverAll() {
        return overAll;
    }

    /**
     * Sets the value of the overAll property.
     * 
     * @param value
     *     allowed object is
     *     {@link OverAllType }
     *     
     */
    public void setOverAll(OverAllType value) {
        this.overAll = value;
    }

    /**
     * Gets the value of the retail property.
     * 
     * @return
     *     possible object is
     *     {@link RetailsType }
     *     
     */
    public RetailsType getRetail() {
        return retail;
    }

    /**
     * Sets the value of the retail property.
     * 
     * @param value
     *     allowed object is
     *     {@link RetailsType }
     *     
     */
    public void setRetail(RetailsType value) {
        this.retail = value;
    }

    /**
     * Gets the value of the microfinance property.
     * 
     * @return
     *     possible object is
     *     {@link MicrofinanceType }
     *     
     */
    public MicrofinanceType getMicrofinance() {
        return microfinance;
    }

    /**
     * Sets the value of the microfinance property.
     * 
     * @param value
     *     allowed object is
     *     {@link MicrofinanceType }
     *     
     */
    public void setMicrofinance(MicrofinanceType value) {
        this.microfinance = value;
    }

}
