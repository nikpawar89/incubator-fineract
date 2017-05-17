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
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for vidUidaiResponse complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="vidUidaiResponse">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="uidaiRequest" type="{http://services.equifax.com/eport/ws/schemas/1.0}uidaiRequest" minOccurs="0"/>
 *         &lt;element name="uidaiResponse" type="{http://services.equifax.com/eport/ws/schemas/1.0}uidaiResponse" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "vidUidaiResponse", propOrder = {
    "uidaiRequest",
    "uidaiResponse"
})
public class VidUidaiResponse {

    protected UidaiRequest uidaiRequest;
    protected UidaiResponse uidaiResponse;

    /**
     * Gets the value of the uidaiRequest property.
     * 
     * @return
     *     possible object is
     *     {@link UidaiRequest }
     *     
     */
    public UidaiRequest getUidaiRequest() {
        return uidaiRequest;
    }

    /**
     * Sets the value of the uidaiRequest property.
     * 
     * @param value
     *     allowed object is
     *     {@link UidaiRequest }
     *     
     */
    public void setUidaiRequest(UidaiRequest value) {
        this.uidaiRequest = value;
    }

    /**
     * Gets the value of the uidaiResponse property.
     * 
     * @return
     *     possible object is
     *     {@link UidaiResponse }
     *     
     */
    public UidaiResponse getUidaiResponse() {
        return uidaiResponse;
    }

    /**
     * Sets the value of the uidaiResponse property.
     * 
     * @param value
     *     allowed object is
     *     {@link UidaiResponse }
     *     
     */
    public void setUidaiResponse(UidaiResponse value) {
        this.uidaiResponse = value;
    }

}
