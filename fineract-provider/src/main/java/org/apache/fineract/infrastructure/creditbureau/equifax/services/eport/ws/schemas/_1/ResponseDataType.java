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
 * Java class for ResponseDataType complex type.
 * 
 * <p>
 * The following schema fragment specifies the expected content contained within
 * this class.
 * 
 * <pre>
 * &lt;complexType name="ResponseDataType">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="Status" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="Desc" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="RuleVersionId" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="ResponseEntities" type="{http://services.equifax.com/eport/ws/schemas/1.0}ResponseEntitiesType" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "ResponseDataType", propOrder = { "status", "desc", "ruleVersionId", "responseEntities" })
public class ResponseDataType {

	@XmlElement(name = "Status")
	protected String status;
	@XmlElement(name = "Desc")
	protected String desc;
	@XmlElement(name = "RuleVersionId")
	protected String ruleVersionId;
	@XmlElement(name = "ResponseEntities")
	protected ResponseEntitiesType responseEntities;

	/**
	 * Gets the value of the status property.
	 * 
	 * @return possible object is {@link String }
	 * 
	 */
	public String getStatus() {
		return status;
	}

	/**
	 * Sets the value of the status property.
	 * 
	 * @param value
	 *            allowed object is {@link String }
	 * 
	 */
	public void setStatus(String value) {
		this.status = value;
	}

	/**
	 * Gets the value of the desc property.
	 * 
	 * @return possible object is {@link String }
	 * 
	 */
	public String getDesc() {
		return desc;
	}

	/**
	 * Sets the value of the desc property.
	 * 
	 * @param value
	 *            allowed object is {@link String }
	 * 
	 */
	public void setDesc(String value) {
		this.desc = value;
	}

	/**
	 * Gets the value of the ruleVersionId property.
	 * 
	 * @return possible object is {@link String }
	 * 
	 */
	public String getRuleVersionId() {
		return ruleVersionId;
	}

	/**
	 * Sets the value of the ruleVersionId property.
	 * 
	 * @param value
	 *            allowed object is {@link String }
	 * 
	 */
	public void setRuleVersionId(String value) {
		this.ruleVersionId = value;
	}

	/**
	 * Gets the value of the responseEntities property.
	 * 
	 * @return possible object is {@link ResponseEntitiesType }
	 * 
	 */
	public ResponseEntitiesType getResponseEntities() {
		return responseEntities;
	}

	/**
	 * Sets the value of the responseEntities property.
	 * 
	 * @param value
	 *            allowed object is {@link ResponseEntitiesType }
	 * 
	 */
	public void setResponseEntities(ResponseEntitiesType value) {
		this.responseEntities = value;
	}

}
