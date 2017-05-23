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
 * Java class for EnquirySummaryType complex type.
 * 
 * <p>
 * The following schema fragment specifies the expected content contained within
 * this class.
 * 
 * <pre>
 * &lt;complexType name="EnquirySummaryType">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="Purpose" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="Total" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="Past30Days" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="Past12Months" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="Past24Months" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="Recent" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
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
@XmlType(name = "EnquirySummaryType", propOrder = { "purpose", "total", "past30Days", "past12Months", "past24Months",
		"recent" })
public class EnquirySummaryType {

	@XmlElement(name = "Purpose")
	protected String purpose;
	@XmlElement(name = "Total")
	protected String total;
	@XmlElement(name = "Past30Days")
	protected String past30Days;
	@XmlElement(name = "Past12Months")
	protected String past12Months;
	@XmlElement(name = "Past24Months")
	protected String past24Months;
	@XmlElement(name = "Recent")
	protected String recent;
	@XmlAttribute(name = "seq")
	protected Integer seq;
	@XmlAttribute(name = "ReportedDate")
	@XmlSchemaType(name = "date")
	protected XMLGregorianCalendar reportedDate;

	/**
	 * Gets the value of the purpose property.
	 * 
	 * @return possible object is {@link String }
	 * 
	 */
	public String getPurpose() {
		return purpose;
	}

	/**
	 * Sets the value of the purpose property.
	 * 
	 * @param value
	 *            allowed object is {@link String }
	 * 
	 */
	public void setPurpose(String value) {
		this.purpose = value;
	}

	/**
	 * Gets the value of the total property.
	 * 
	 * @return possible object is {@link String }
	 * 
	 */
	public String getTotal() {
		return total;
	}

	/**
	 * Sets the value of the total property.
	 * 
	 * @param value
	 *            allowed object is {@link String }
	 * 
	 */
	public void setTotal(String value) {
		this.total = value;
	}

	/**
	 * Gets the value of the past30Days property.
	 * 
	 * @return possible object is {@link String }
	 * 
	 */
	public String getPast30Days() {
		return past30Days;
	}

	/**
	 * Sets the value of the past30Days property.
	 * 
	 * @param value
	 *            allowed object is {@link String }
	 * 
	 */
	public void setPast30Days(String value) {
		this.past30Days = value;
	}

	/**
	 * Gets the value of the past12Months property.
	 * 
	 * @return possible object is {@link String }
	 * 
	 */
	public String getPast12Months() {
		return past12Months;
	}

	/**
	 * Sets the value of the past12Months property.
	 * 
	 * @param value
	 *            allowed object is {@link String }
	 * 
	 */
	public void setPast12Months(String value) {
		this.past12Months = value;
	}

	/**
	 * Gets the value of the past24Months property.
	 * 
	 * @return possible object is {@link String }
	 * 
	 */
	public String getPast24Months() {
		return past24Months;
	}

	/**
	 * Sets the value of the past24Months property.
	 * 
	 * @param value
	 *            allowed object is {@link String }
	 * 
	 */
	public void setPast24Months(String value) {
		this.past24Months = value;
	}

	/**
	 * Gets the value of the recent property.
	 * 
	 * @return possible object is {@link String }
	 * 
	 */
	public String getRecent() {
		return recent;
	}

	/**
	 * Sets the value of the recent property.
	 * 
	 * @param value
	 *            allowed object is {@link String }
	 * 
	 */
	public void setRecent(String value) {
		this.recent = value;
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
