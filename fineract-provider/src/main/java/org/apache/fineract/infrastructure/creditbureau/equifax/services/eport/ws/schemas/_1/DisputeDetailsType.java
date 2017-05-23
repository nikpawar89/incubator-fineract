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
 * Individual Disputes
 * 
 * <p>
 * Java class for DisputeDetailsType complex type.
 * 
 * <p>
 * The following schema fragment specifies the expected content contained within
 * this class.
 * 
 * <pre>
 * &lt;complexType name="DisputeDetailsType">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="AccNum" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="DisputeComments" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *         &lt;element name="Status" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *         &lt;element name="ResolvedDate" type="{http://www.w3.org/2001/XMLSchema}date" minOccurs="0"/>
 *       &lt;/sequence>
 *       &lt;attribute name="type" type="{http://www.w3.org/2001/XMLSchema}string" />
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "DisputeDetailsType", propOrder = { "accNum", "disputeComments", "status", "resolvedDate" })
public class DisputeDetailsType {

	@XmlElement(name = "AccNum")
	protected String accNum;
	@XmlElement(name = "DisputeComments", required = true)
	protected String disputeComments;
	@XmlElement(name = "Status", required = true)
	protected String status;
	@XmlElement(name = "ResolvedDate")
	@XmlSchemaType(name = "date")
	protected XMLGregorianCalendar resolvedDate;
	@XmlAttribute(name = "type")
	protected String type;

	/**
	 * Gets the value of the accNum property.
	 * 
	 * @return possible object is {@link String }
	 * 
	 */
	public String getAccNum() {
		return accNum;
	}

	/**
	 * Sets the value of the accNum property.
	 * 
	 * @param value
	 *            allowed object is {@link String }
	 * 
	 */
	public void setAccNum(String value) {
		this.accNum = value;
	}

	/**
	 * Gets the value of the disputeComments property.
	 * 
	 * @return possible object is {@link String }
	 * 
	 */
	public String getDisputeComments() {
		return disputeComments;
	}

	/**
	 * Sets the value of the disputeComments property.
	 * 
	 * @param value
	 *            allowed object is {@link String }
	 * 
	 */
	public void setDisputeComments(String value) {
		this.disputeComments = value;
	}

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
	 * Gets the value of the resolvedDate property.
	 * 
	 * @return possible object is {@link XMLGregorianCalendar }
	 * 
	 */
	public XMLGregorianCalendar getResolvedDate() {
		return resolvedDate;
	}

	/**
	 * Sets the value of the resolvedDate property.
	 * 
	 * @param value
	 *            allowed object is {@link XMLGregorianCalendar }
	 * 
	 */
	public void setResolvedDate(XMLGregorianCalendar value) {
		this.resolvedDate = value;
	}

	/**
	 * Gets the value of the type property.
	 * 
	 * @return possible object is {@link String }
	 * 
	 */
	public String getType() {
		return type;
	}

	/**
	 * Sets the value of the type property.
	 * 
	 * @param value
	 *            allowed object is {@link String }
	 * 
	 */
	public void setType(String value) {
		this.type = value;
	}

}
