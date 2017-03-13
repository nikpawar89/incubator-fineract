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
