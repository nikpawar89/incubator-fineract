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
 * <p>
 * Java class for PrescreenResponseType complex type.
 * 
 * <p>
 * The following schema fragment specifies the expected content contained within
 * this class.
 * 
 * <pre>
 * &lt;complexType name="PrescreenResponseType">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="HeaderData" type="{http://services.equifax.com/eport/ws/schemas/1.0}HeaderDataType" minOccurs="0"/>
 *         &lt;element name="PIIData" type="{http://services.equifax.com/eport/ws/schemas/1.0}PIIDataType" minOccurs="0"/>
 *         &lt;element name="BureauAttributes" type="{http://services.equifax.com/eport/ws/schemas/1.0}BureauAttributesType" minOccurs="0"/>
 *         &lt;element name="NonBureauAttributes" type="{http://services.equifax.com/eport/ws/schemas/1.0}NonBureauAttributesType" minOccurs="0"/>
 *         &lt;element name="ResponseData" type="{http://services.equifax.com/eport/ws/schemas/1.0}ResponseDataType" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "PrescreenResponseType", propOrder = { "headerData", "piiData", "bureauAttributes",
		"nonBureauAttributes", "responseData" })
public class PrescreenResponseType {

	@XmlElement(name = "HeaderData")
	protected HeaderDataType headerData;
	@XmlElement(name = "PIIData")
	protected PIIDataType piiData;
	@XmlElement(name = "BureauAttributes")
	protected BureauAttributesType bureauAttributes;
	@XmlElement(name = "NonBureauAttributes")
	protected NonBureauAttributesType nonBureauAttributes;
	@XmlElement(name = "ResponseData")
	protected ResponseDataType responseData;

	/**
	 * Gets the value of the headerData property.
	 * 
	 * @return possible object is {@link HeaderDataType }
	 * 
	 */
	public HeaderDataType getHeaderData() {
		return headerData;
	}

	/**
	 * Sets the value of the headerData property.
	 * 
	 * @param value
	 *            allowed object is {@link HeaderDataType }
	 * 
	 */
	public void setHeaderData(HeaderDataType value) {
		this.headerData = value;
	}

	/**
	 * Gets the value of the piiData property.
	 * 
	 * @return possible object is {@link PIIDataType }
	 * 
	 */
	public PIIDataType getPIIData() {
		return piiData;
	}

	/**
	 * Sets the value of the piiData property.
	 * 
	 * @param value
	 *            allowed object is {@link PIIDataType }
	 * 
	 */
	public void setPIIData(PIIDataType value) {
		this.piiData = value;
	}

	/**
	 * Gets the value of the bureauAttributes property.
	 * 
	 * @return possible object is {@link BureauAttributesType }
	 * 
	 */
	public BureauAttributesType getBureauAttributes() {
		return bureauAttributes;
	}

	/**
	 * Sets the value of the bureauAttributes property.
	 * 
	 * @param value
	 *            allowed object is {@link BureauAttributesType }
	 * 
	 */
	public void setBureauAttributes(BureauAttributesType value) {
		this.bureauAttributes = value;
	}

	/**
	 * Gets the value of the nonBureauAttributes property.
	 * 
	 * @return possible object is {@link NonBureauAttributesType }
	 * 
	 */
	public NonBureauAttributesType getNonBureauAttributes() {
		return nonBureauAttributes;
	}

	/**
	 * Sets the value of the nonBureauAttributes property.
	 * 
	 * @param value
	 *            allowed object is {@link NonBureauAttributesType }
	 * 
	 */
	public void setNonBureauAttributes(NonBureauAttributesType value) {
		this.nonBureauAttributes = value;
	}

	/**
	 * Gets the value of the responseData property.
	 * 
	 * @return possible object is {@link ResponseDataType }
	 * 
	 */
	public ResponseDataType getResponseData() {
		return responseData;
	}

	/**
	 * Sets the value of the responseData property.
	 * 
	 * @param value
	 *            allowed object is {@link ResponseDataType }
	 * 
	 */
	public void setResponseData(ResponseDataType value) {
		this.responseData = value;
	}

}
