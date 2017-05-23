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
import javax.xml.bind.annotation.XmlSchemaType;
import javax.xml.bind.annotation.XmlType;
import javax.xml.datatype.XMLGregorianCalendar;

/**
 * <p>
 * Java class for EmployerDetailsType complex type.
 * 
 * <p>
 * The following schema fragment specifies the expected content contained within
 * this class.
 * 
 * <pre>
 * &lt;complexType name="EmployerDetailsType">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="EmployerName" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="Position" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="Phone" type="{http://services.equifax.com/eport/ws/schemas/1.0}PhoneType" minOccurs="0"/>
 *         &lt;element name="Address" type="{http://services.equifax.com/eport/ws/schemas/1.0}AddressType" minOccurs="0"/>
 *       &lt;/sequence>
 *       &lt;attGroup ref="{http://services.equifax.com/eport/ws/schemas/1.0}SeqDate"/>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "EmployerDetailsType", propOrder = { "employerName", "position", "phone", "address" })
public class EmployerDetailsType {

	@XmlElement(name = "EmployerName")
	protected String employerName;
	@XmlElement(name = "Position")
	protected String position;
	@XmlElement(name = "Phone")
	protected PhoneType phone;
	@XmlElement(name = "Address")
	protected AddressType address;
	@XmlAttribute(name = "seq")
	protected Integer seq;
	@XmlAttribute(name = "ReportedDate")
	@XmlSchemaType(name = "date")
	protected XMLGregorianCalendar reportedDate;

	/**
	 * Gets the value of the employerName property.
	 * 
	 * @return possible object is {@link String }
	 * 
	 */
	public String getEmployerName() {
		return employerName;
	}

	/**
	 * Sets the value of the employerName property.
	 * 
	 * @param value
	 *            allowed object is {@link String }
	 * 
	 */
	public void setEmployerName(String value) {
		this.employerName = value;
	}

	/**
	 * Gets the value of the position property.
	 * 
	 * @return possible object is {@link String }
	 * 
	 */
	public String getPosition() {
		return position;
	}

	/**
	 * Sets the value of the position property.
	 * 
	 * @param value
	 *            allowed object is {@link String }
	 * 
	 */
	public void setPosition(String value) {
		this.position = value;
	}

	/**
	 * Gets the value of the phone property.
	 * 
	 * @return possible object is {@link PhoneType }
	 * 
	 */
	public PhoneType getPhone() {
		return phone;
	}

	/**
	 * Sets the value of the phone property.
	 * 
	 * @param value
	 *            allowed object is {@link PhoneType }
	 * 
	 */
	public void setPhone(PhoneType value) {
		this.phone = value;
	}

	/**
	 * Gets the value of the address property.
	 * 
	 * @return possible object is {@link AddressType }
	 * 
	 */
	public AddressType getAddress() {
		return address;
	}

	/**
	 * Sets the value of the address property.
	 * 
	 * @param value
	 *            allowed object is {@link AddressType }
	 * 
	 */
	public void setAddress(AddressType value) {
		this.address = value;
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

	/**
	 * Gets the value of the reportedDate property.
	 * 
	 * @return possible object is {@link XMLGregorianCalendar }
	 * 
	 */
	public XMLGregorianCalendar getReportedDate() {
		return reportedDate;
	}

	/**
	 * Sets the value of the reportedDate property.
	 * 
	 * @param value
	 *            allowed object is {@link XMLGregorianCalendar }
	 * 
	 */
	public void setReportedDate(XMLGregorianCalendar value) {
		this.reportedDate = value;
	}

}
