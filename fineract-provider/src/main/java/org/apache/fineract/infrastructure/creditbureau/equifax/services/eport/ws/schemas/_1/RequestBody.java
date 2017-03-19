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
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for requestBody complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="requestBody">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="vidNsdlRequest" type="{http://services.equifax.com/eport/ws/schemas/1.0}nsdlRequest" maxOccurs="unbounded" minOccurs="0"/>
 *         &lt;element name="vidUidaiRequest" type="{http://services.equifax.com/eport/ws/schemas/1.0}uidaiRequest" maxOccurs="unbounded" minOccurs="0"/>
 *         &lt;element name="vidVoterRequest" type="{http://services.equifax.com/eport/ws/schemas/1.0}voterRequest" maxOccurs="unbounded" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "requestBody", propOrder = {
    "vidNsdlRequest",
    "vidUidaiRequest",
    "vidVoterRequest"
})
public class RequestBody {

    @XmlElement(nillable = true)
    protected List<NsdlRequest> vidNsdlRequest;
    @XmlElement(nillable = true)
    protected List<UidaiRequest> vidUidaiRequest;
    @XmlElement(nillable = true)
    protected List<VoterRequest> vidVoterRequest;

    /**
     * Gets the value of the vidNsdlRequest property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the vidNsdlRequest property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getVidNsdlRequest().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link NsdlRequest }
     * 
     * 
     */
    public List<NsdlRequest> getVidNsdlRequest() {
        if (vidNsdlRequest == null) {
            vidNsdlRequest = new ArrayList<NsdlRequest>();
        }
        return this.vidNsdlRequest;
    }

    /**
     * Gets the value of the vidUidaiRequest property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the vidUidaiRequest property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getVidUidaiRequest().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link UidaiRequest }
     * 
     * 
     */
    public List<UidaiRequest> getVidUidaiRequest() {
        if (vidUidaiRequest == null) {
            vidUidaiRequest = new ArrayList<UidaiRequest>();
        }
        return this.vidUidaiRequest;
    }

    /**
     * Gets the value of the vidVoterRequest property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the vidVoterRequest property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getVidVoterRequest().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link VoterRequest }
     * 
     * 
     */
    public List<VoterRequest> getVidVoterRequest() {
        if (vidVoterRequest == null) {
            vidVoterRequest = new ArrayList<VoterRequest>();
        }
        return this.vidVoterRequest;
    }

}
