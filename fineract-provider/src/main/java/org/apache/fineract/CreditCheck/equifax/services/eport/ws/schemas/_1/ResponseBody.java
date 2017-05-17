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

import java.util.ArrayList;
import java.util.List;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for responseBody complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="responseBody">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="vidNsdlResponses" type="{http://services.equifax.com/eport/ws/schemas/1.0}vidNsdlResponse" maxOccurs="unbounded" minOccurs="0"/>
 *         &lt;element name="vidUidaiResponses" type="{http://services.equifax.com/eport/ws/schemas/1.0}vidUidaiResponse" maxOccurs="unbounded" minOccurs="0"/>
 *         &lt;element name="vidVoterResponses" type="{http://services.equifax.com/eport/ws/schemas/1.0}vidVoterResponse" maxOccurs="unbounded" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "responseBody", propOrder = {
    "vidNsdlResponses",
    "vidUidaiResponses",
    "vidVoterResponses"
})
public class ResponseBody {

    @XmlElement(nillable = true)
    protected List<VidNsdlResponse> vidNsdlResponses;
    @XmlElement(nillable = true)
    protected List<VidUidaiResponse> vidUidaiResponses;
    @XmlElement(nillable = true)
    protected List<VidVoterResponse> vidVoterResponses;

    /**
     * Gets the value of the vidNsdlResponses property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the vidNsdlResponses property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getVidNsdlResponses().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link VidNsdlResponse }
     * 
     * 
     */
    public List<VidNsdlResponse> getVidNsdlResponses() {
        if (vidNsdlResponses == null) {
            vidNsdlResponses = new ArrayList<VidNsdlResponse>();
        }
        return this.vidNsdlResponses;
    }

    /**
     * Gets the value of the vidUidaiResponses property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the vidUidaiResponses property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getVidUidaiResponses().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link VidUidaiResponse }
     * 
     * 
     */
    public List<VidUidaiResponse> getVidUidaiResponses() {
        if (vidUidaiResponses == null) {
            vidUidaiResponses = new ArrayList<VidUidaiResponse>();
        }
        return this.vidUidaiResponses;
    }

    /**
     * Gets the value of the vidVoterResponses property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the vidVoterResponses property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getVidVoterResponses().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link VidVoterResponse }
     * 
     * 
     */
    public List<VidVoterResponse> getVidVoterResponses() {
        if (vidVoterResponses == null) {
            vidVoterResponses = new ArrayList<VidVoterResponse>();
        }
        return this.vidVoterResponses;
    }

}
