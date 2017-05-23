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
import javax.xml.bind.annotation.XmlSeeAlso;
import javax.xml.bind.annotation.XmlType;
import javax.xml.datatype.XMLGregorianCalendar;

/**
 * <p>
 * Java class for response complex type.
 * 
 * <p>
 * The following schema fragment specifies the expected content contained within
 * this class.
 * 
 * <pre>
 * &lt;complexType name="response">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="returnCode" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="returnCodeDesc" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="runDateTime" type="{http://www.w3.org/2001/XMLSchema}dateTime" minOccurs="0"/>
 *         &lt;element name="errorRespMessage" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "response", propOrder = { "returnCode", "returnCodeDesc", "runDateTime", "errorRespMessage" })
@XmlSeeAlso({ VoterResponse.class, UidaiResponse.class, NsdlResponse.class })
public class Response {

	protected String returnCode;
	protected String returnCodeDesc;
	@XmlSchemaType(name = "dateTime")
	protected XMLGregorianCalendar runDateTime;
	protected String errorRespMessage;

	/**
	 * Gets the value of the returnCode property.
	 * 
	 * @return possible object is {@link String }
	 * 
	 */
	public String getReturnCode() {
		return returnCode;
	}

	/**
	 * Sets the value of the returnCode property.
	 * 
	 * @param value
	 *            allowed object is {@link String }
	 * 
	 */
	public void setReturnCode(String value) {
		this.returnCode = value;
	}

	/**
	 * Gets the value of the returnCodeDesc property.
	 * 
	 * @return possible object is {@link String }
	 * 
	 */
	public String getReturnCodeDesc() {
		return returnCodeDesc;
	}

	/**
	 * Sets the value of the returnCodeDesc property.
	 * 
	 * @param value
	 *            allowed object is {@link String }
	 * 
	 */
	public void setReturnCodeDesc(String value) {
		this.returnCodeDesc = value;
	}

	/**
	 * Gets the value of the runDateTime property.
	 * 
	 * @return possible object is {@link XMLGregorianCalendar }
	 * 
	 */
	public XMLGregorianCalendar getRunDateTime() {
		return runDateTime;
	}

	/**
	 * Sets the value of the runDateTime property.
	 * 
	 * @param value
	 *            allowed object is {@link XMLGregorianCalendar }
	 * 
	 */
	public void setRunDateTime(XMLGregorianCalendar value) {
		this.runDateTime = value;
	}

	/**
	 * Gets the value of the errorRespMessage property.
	 * 
	 * @return possible object is {@link String }
	 * 
	 */
	public String getErrorRespMessage() {
		return errorRespMessage;
	}

	/**
	 * Sets the value of the errorRespMessage property.
	 * 
	 * @param value
	 *            allowed object is {@link String }
	 * 
	 */
	public void setErrorRespMessage(String value) {
		this.errorRespMessage = value;
	}

}
