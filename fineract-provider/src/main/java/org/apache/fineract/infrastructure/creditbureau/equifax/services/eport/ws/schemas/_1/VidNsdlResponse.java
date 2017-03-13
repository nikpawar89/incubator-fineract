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
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for vidNsdlResponse complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="vidNsdlResponse">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="nsdlRequest" type="{http://services.equifax.com/eport/ws/schemas/1.0}nsdlRequest" minOccurs="0"/>
 *         &lt;element name="nsdlResponse" type="{http://services.equifax.com/eport/ws/schemas/1.0}nsdlResponse" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "vidNsdlResponse", propOrder = {
    "nsdlRequest",
    "nsdlResponse"
})
public class VidNsdlResponse {

    protected NsdlRequest nsdlRequest;
    protected NsdlResponse nsdlResponse;

    /**
     * Gets the value of the nsdlRequest property.
     * 
     * @return
     *     possible object is
     *     {@link NsdlRequest }
     *     
     */
    public NsdlRequest getNsdlRequest() {
        return nsdlRequest;
    }

    /**
     * Sets the value of the nsdlRequest property.
     * 
     * @param value
     *     allowed object is
     *     {@link NsdlRequest }
     *     
     */
    public void setNsdlRequest(NsdlRequest value) {
        this.nsdlRequest = value;
    }

    /**
     * Gets the value of the nsdlResponse property.
     * 
     * @return
     *     possible object is
     *     {@link NsdlResponse }
     *     
     */
    public NsdlResponse getNsdlResponse() {
        return nsdlResponse;
    }

    /**
     * Sets the value of the nsdlResponse property.
     * 
     * @param value
     *     allowed object is
     *     {@link NsdlResponse }
     *     
     */
    public void setNsdlResponse(NsdlResponse value) {
        this.nsdlResponse = value;
    }

}
