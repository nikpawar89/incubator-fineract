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
 * <p>Java class for uidaiResponse complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="uidaiResponse">
 *   &lt;complexContent>
 *     &lt;extension base="{http://services.equifax.com/eport/ws/schemas/1.0}response">
 *       &lt;sequence>
 *         &lt;element name="uidaiResponse" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="nameResponse" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/extension>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "uidaiResponse", propOrder = {
    "uidaiResponse",
    "nameResponse"
})
public class UidaiResponse
    extends Response
{

    protected String uidaiResponse;
    protected String nameResponse;

    /**
     * Gets the value of the uidaiResponse property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getUidaiResponse() {
        return uidaiResponse;
    }

    /**
     * Sets the value of the uidaiResponse property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setUidaiResponse(String value) {
        this.uidaiResponse = value;
    }

    /**
     * Gets the value of the nameResponse property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getNameResponse() {
        return nameResponse;
    }

    /**
     * Sets the value of the nameResponse property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setNameResponse(String value) {
        this.nameResponse = value;
    }

}
