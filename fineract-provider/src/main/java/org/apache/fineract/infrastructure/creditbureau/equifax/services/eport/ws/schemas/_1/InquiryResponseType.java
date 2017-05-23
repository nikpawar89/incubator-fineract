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
import javax.xml.bind.annotation.XmlRootElement;
import javax.xml.bind.annotation.XmlType;

//import org.apache.fineract.CreditCheck.equifax.services.eport.ws.schemas._1.r

/**
 * 
 * The Inquiry service request message type definition
 * 
 * 
 * <p>
 * Java class for InquiryResponseType complex type.
 * 
 * <p>
 * The following schema fragment specifies the expected content contained within
 * this class.
 * 
 * <pre>
 * &lt;complexType name="InquiryResponseType">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="InquiryResponseHeader" type="{http://services.equifax.com/eport/ws/schemas/1.0}InquiryResponseHeaderType"/>
 *         &lt;element name="InquiryRequestInfo" type="{http://services.equifax.com/eport/ws/schemas/1.0}RequestBodyType"/>
 *         &lt;element name="ReportData" type="{http://services.equifax.com/eport/ws/schemas/1.0}ReportType"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "InquiryResponseType", propOrder = { "inquiryResponseHeader", "inquiryRequestInfo", "reportData" })
@XmlRootElement(name = "RESPONSE")
public class InquiryResponseType {

	@XmlElement(name = "InquiryResponseHeader", required = true)
	protected InquiryResponseHeaderType inquiryResponseHeader;
	@XmlElement(name = "InquiryRequestInfo", required = true)
	protected RequestBodyType inquiryRequestInfo;
	@XmlElement(name = "ReportData", required = true)
	protected ReportType reportData;

	/**
	 * Gets the value of the inquiryResponseHeader property.
	 * 
	 * @return possible object is {@link InquiryResponseHeaderType }
	 * 
	 */
	public InquiryResponseHeaderType getInquiryResponseHeader() {
		return inquiryResponseHeader;
	}

	/**
	 * Sets the value of the inquiryResponseHeader property.
	 * 
	 * @param value
	 *            allowed object is {@link InquiryResponseHeaderType }
	 * 
	 */
	public void setInquiryResponseHeader(InquiryResponseHeaderType value) {
		this.inquiryResponseHeader = value;
	}

	/**
	 * Gets the value of the inquiryRequestInfo property.
	 * 
	 * @return possible object is {@link RequestBodyType }
	 * 
	 */
	public RequestBodyType getInquiryRequestInfo() {
		return inquiryRequestInfo;
	}

	/**
	 * Sets the value of the inquiryRequestInfo property.
	 * 
	 * @param value
	 *            allowed object is {@link RequestBodyType }
	 * 
	 */
	public void setInquiryRequestInfo(RequestBodyType value) {
		this.inquiryRequestInfo = value;
	}

	/**
	 * Gets the value of the reportData property.
	 * 
	 * @return possible object is {@link ReportType }
	 * 
	 */
	public ReportType getReportData() {
		return reportData;
	}

	/**
	 * Sets the value of the reportData property.
	 * 
	 * @param value
	 *            allowed object is {@link ReportType }
	 * 
	 */
	public void setReportData(ReportType value) {
		this.reportData = value;
	}

}
