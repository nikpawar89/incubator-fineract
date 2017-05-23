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
 * Java class for AdditionalNameTypeDetails complex type.
 * 
 * <p>
 * The following schema fragment specifies the expected content contained within
 * this class.
 * 
 * <pre>
 * &lt;complexType name="AdditionalNameTypeDetails">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="AdditionalName" minOccurs="0">
 *           &lt;simpleType>
 *             &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *               &lt;maxLength value="200"/>
 *               &lt;pattern value="([a-z A-Z.,])+"/>
 *             &lt;/restriction>
 *           &lt;/simpleType>
 *         &lt;/element>
 *         &lt;element name="AdditionalNameType" type="{http://services.equifax.com/eport/ws/schemas/1.0}AdditionalNameValType" minOccurs="0"/>
 *       &lt;/sequence>
 *       &lt;attribute name="seq" type="{http://www.w3.org/2001/XMLSchema}int" />
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "AdditionalNameTypeDetails", propOrder = { "additionalName", "additionalNameType" })
public class AdditionalNameTypeDetails {

	@XmlElement(name = "AdditionalName")
	protected String additionalName;
	@XmlElement(name = "AdditionalNameType")
	protected String additionalNameType;
	@XmlAttribute(name = "seq")
	protected Integer seq;

	/**
	 * Gets the value of the additionalName property.
	 * 
	 * @return possible object is {@link String }
	 * 
	 */
	public String getAdditionalName() {
		return additionalName;
	}

	/**
	 * Sets the value of the additionalName property.
	 * 
	 * @param value
	 *            allowed object is {@link String }
	 * 
	 */
	public void setAdditionalName(String value) {
		this.additionalName = value;
	}

	/**
	 * Gets the value of the additionalNameType property.
	 * 
	 * @return possible object is {@link String }
	 * 
	 */
	public String getAdditionalNameType() {
		return additionalNameType;
	}

	/**
	 * Sets the value of the additionalNameType property.
	 * 
	 * @param value
	 *            allowed object is {@link String }
	 * 
	 */
	public void setAdditionalNameType(String value) {
		this.additionalNameType = value;
	}

	/**
	 * Gets the value of the seq property.
	 * 
	 * @return possible object is {@link Integer }
	 * 
	 */
	public Integer getSeq() {
		return seq;
	}

	/**
	 * Sets the value of the seq property.
	 * 
	 * @param value
	 *            allowed object is {@link Integer }
	 * 
	 */
	public void setSeq(Integer value) {
		this.seq = value;
	}

}
