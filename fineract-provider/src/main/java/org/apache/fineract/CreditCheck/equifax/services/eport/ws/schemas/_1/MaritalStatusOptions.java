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
package org.apache.fineract.CreditCheck.equifax.services.eport.ws.schemas._1;

import javax.xml.bind.annotation.XmlEnum;
import javax.xml.bind.annotation.XmlEnumValue;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for MaritalStatusOptions.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * <p>
 * <pre>
 * &lt;simpleType name="MaritalStatusOptions">
 *   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *     &lt;enumeration value="Cohabitating"/>
 *     &lt;enumeration value="Divorced"/>
 *     &lt;enumeration value="Married"/>
 *     &lt;enumeration value="Not Asked"/>
 *     &lt;enumeration value="Not Given"/>
 *     &lt;enumeration value="Other"/>
 *     &lt;enumeration value="Separated"/>
 *     &lt;enumeration value="Single"/>
 *     &lt;enumeration value="To Be Married"/>
 *     &lt;enumeration value="Widowed"/>
 *   &lt;/restriction>
 * &lt;/simpleType>
 * </pre>
 * 
 */
@XmlType(name = "MaritalStatusOptions")
@XmlEnum
public enum MaritalStatusOptions {

    @XmlEnumValue("Cohabitating")
    COHABITATING("Cohabitating"),
    @XmlEnumValue("Divorced")
    DIVORCED("Divorced"),
    @XmlEnumValue("Married")
    MARRIED("Married"),
    @XmlEnumValue("Not Asked")
    NOT_ASKED("Not Asked"),
    @XmlEnumValue("Not Given")
    NOT_GIVEN("Not Given"),
    @XmlEnumValue("Other")
    OTHER("Other"),
    @XmlEnumValue("Separated")
    SEPARATED("Separated"),
    @XmlEnumValue("Single")
    SINGLE("Single"),
    @XmlEnumValue("To Be Married")
    TO_BE_MARRIED("To Be Married"),
    @XmlEnumValue("Widowed")
    WIDOWED("Widowed");
    private final String value;

    MaritalStatusOptions(String v) {
        value = v;
    }

    public String value() {
        return value;
    }

    public static MaritalStatusOptions fromValue(String v) {
        for (MaritalStatusOptions c: MaritalStatusOptions.values()) {
            if (c.value.equals(v)) {
                return c;
            }
        }
        throw new IllegalArgumentException(v);
    }

}
