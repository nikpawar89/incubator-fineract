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
import javax.xml.bind.annotation.XmlAttribute;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;

/**
 * <p>
 * Java class for MonthlyDetailType complex type.
 * 
 * <p>
 * The following schema fragment specifies the expected content contained within
 * this class.
 * 
 * <pre>
 * &lt;complexType name="MonthlyDetailType">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="PaymentStatus" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="SuitFiledStatus" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="AssetClassificationStatus" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *       &lt;/sequence>
 *       &lt;attribute name="key" type="{http://www.w3.org/2001/XMLSchema}string" />
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "MonthlyDetailType", propOrder = { "paymentStatus", "suitFiledStatus", "assetClassificationStatus" })
public class MonthlyDetailType {

	@XmlElement(name = "PaymentStatus")
	protected String paymentStatus;
	@XmlElement(name = "SuitFiledStatus")
	protected String suitFiledStatus;
	@XmlElement(name = "AssetClassificationStatus")
	protected String assetClassificationStatus;
	@XmlAttribute(name = "key")
	protected String key;

	/**
	 * Gets the value of the paymentStatus property.
	 * 
	 * @return possible object is {@link String }
	 * 
	 */
	public String getPaymentStatus() {
		return paymentStatus;
	}

	/**
	 * Sets the value of the paymentStatus property.
	 * 
	 * @param value
	 *            allowed object is {@link String }
	 * 
	 */
	public void setPaymentStatus(String value) {
		this.paymentStatus = value;
	}

	/**
	 * Gets the value of the suitFiledStatus property.
	 * 
	 * @return possible object is {@link String }
	 * 
	 */
	public String getSuitFiledStatus() {
		return suitFiledStatus;
	}

	/**
	 * Sets the value of the suitFiledStatus property.
	 * 
	 * @param value
	 *            allowed object is {@link String }
	 * 
	 */
	public void setSuitFiledStatus(String value) {
		this.suitFiledStatus = value;
	}

	/**
	 * Gets the value of the assetClassificationStatus property.
	 * 
	 * @return possible object is {@link String }
	 * 
	 */
	public String getAssetClassificationStatus() {
		return assetClassificationStatus;
	}

	/**
	 * Sets the value of the assetClassificationStatus property.
	 * 
	 * @param value
	 *            allowed object is {@link String }
	 * 
	 */
	public void setAssetClassificationStatus(String value) {
		this.assetClassificationStatus = value;
	}

	/**
	 * Gets the value of the key property.
	 * 
	 * @return possible object is {@link String }
	 * 
	 */
	public String getKey() {
		return key;
	}

	/**
	 * Sets the value of the key property.
	 * 
	 * @param value
	 *            allowed object is {@link String }
	 * 
	 */
	public void setKey(String value) {
		this.key = value;
	}

}
