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
import javax.xml.bind.annotation.XmlSchemaType;
import javax.xml.bind.annotation.XmlType;
import javax.xml.datatype.XMLGregorianCalendar;

/**
 * <p>
 * Java class for requestHeader complex type.
 * 
 * <p>
 * The following schema fragment specifies the expected content contained within
 * this class.
 * 
 * <pre>
 * &lt;complexType name="requestHeader">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="custRefField" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="customerId" type="{http://www.w3.org/2001/XMLSchema}int"/>
 *         &lt;element name="memberNumber" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="reportFormat" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="userId" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="requestDate" type="{http://www.w3.org/2001/XMLSchema}dateTime" minOccurs="0"/>
 *         &lt;element name="envName" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "requestHeader", propOrder = { "custRefField", "customerId", "memberNumber", "reportFormat", "userId",
		"requestDate", "envName" })
public class RequestHeader {

	protected String custRefField;
	protected int customerId;
	protected String memberNumber;
	protected String reportFormat;
	protected String userId;
	@XmlSchemaType(name = "dateTime")
	protected XMLGregorianCalendar requestDate;
	protected String envName;

	/**
	 * Gets the value of the custRefField property.
	 * 
	 * @return possible object is {@link String }
	 * 
	 */
	public String getCustRefField() {
		return custRefField;
	}

	/**
	 * Sets the value of the custRefField property.
	 * 
	 * @param value
	 *            allowed object is {@link String }
	 * 
	 */
	public void setCustRefField(String value) {
		this.custRefField = value;
	}

	/**
	 * Gets the value of the customerId property.
	 * 
	 */
	public int getCustomerId() {
		return customerId;
	}

	/**
	 * Sets the value of the customerId property.
	 * 
	 */
	public void setCustomerId(int value) {
		this.customerId = value;
	}

	/**
	 * Gets the value of the memberNumber property.
	 * 
	 * @return possible object is {@link String }
	 * 
	 */
	public String getMemberNumber() {
		return memberNumber;
	}

	/**
	 * Sets the value of the memberNumber property.
	 * 
	 * @param value
	 *            allowed object is {@link String }
	 * 
	 */
	public void setMemberNumber(String value) {
		this.memberNumber = value;
	}

	/**
	 * Gets the value of the reportFormat property.
	 * 
	 * @return possible object is {@link String }
	 * 
	 */
	public String getReportFormat() {
		return reportFormat;
	}

	/**
	 * Sets the value of the reportFormat property.
	 * 
	 * @param value
	 *            allowed object is {@link String }
	 * 
	 */
	public void setReportFormat(String value) {
		this.reportFormat = value;
	}

	/**
	 * Gets the value of the userId property.
	 * 
	 * @return possible object is {@link String }
	 * 
	 */
	public String getUserId() {
		return userId;
	}

	/**
	 * Sets the value of the userId property.
	 * 
	 * @param value
	 *            allowed object is {@link String }
	 * 
	 */
	public void setUserId(String value) {
		this.userId = value;
	}

	/**
	 * Gets the value of the requestDate property.
	 * 
	 * @return possible object is {@link XMLGregorianCalendar }
	 * 
	 */
	public XMLGregorianCalendar getRequestDate() {
		return requestDate;
	}

	/**
	 * Sets the value of the requestDate property.
	 * 
	 * @param value
	 *            allowed object is {@link XMLGregorianCalendar }
	 * 
	 */
	public void setRequestDate(XMLGregorianCalendar value) {
		this.requestDate = value;
	}

	/**
	 * Gets the value of the envName property.
	 * 
	 * @return possible object is {@link String }
	 * 
	 */
	public String getEnvName() {
		return envName;
	}

	/**
	 * Sets the value of the envName property.
	 * 
	 * @param value
	 *            allowed object is {@link String }
	 * 
	 */
	public void setEnvName(String value) {
		this.envName = value;
	}

}
