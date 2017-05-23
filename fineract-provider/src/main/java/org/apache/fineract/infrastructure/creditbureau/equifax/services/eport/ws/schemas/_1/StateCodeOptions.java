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

import javax.xml.bind.annotation.XmlEnum;
import javax.xml.bind.annotation.XmlType;

/**
 * <p>
 * Java class for StateCodeOptions.
 * 
 * <p>
 * The following schema fragment specifies the expected content contained within
 * this class.
 * <p>
 * 
 * <pre>
 * &lt;simpleType name="StateCodeOptions">
 *   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *     &lt;maxLength value="2"/>
 *     &lt;enumeration value="AN"/>
 *     &lt;enumeration value="AP"/>
 *     &lt;enumeration value="AR"/>
 *     &lt;enumeration value="AS"/>
 *     &lt;enumeration value="BR"/>
 *     &lt;enumeration value="CH"/>
 *     &lt;enumeration value="CG"/>
 *     &lt;enumeration value="DN"/>
 *     &lt;enumeration value="DD"/>
 *     &lt;enumeration value="DL"/>
 *     &lt;enumeration value="GA"/>
 *     &lt;enumeration value="GJ"/>
 *     &lt;enumeration value="HR"/>
 *     &lt;enumeration value="HP"/>
 *     &lt;enumeration value="JK"/>
 *     &lt;enumeration value="JH"/>
 *     &lt;enumeration value="KA"/>
 *     &lt;enumeration value="KL"/>
 *     &lt;enumeration value="LD"/>
 *     &lt;enumeration value="MP"/>
 *     &lt;enumeration value="MH"/>
 *     &lt;enumeration value="MN"/>
 *     &lt;enumeration value="ML"/>
 *     &lt;enumeration value="MZ"/>
 *     &lt;enumeration value="NL"/>
 *     &lt;enumeration value="OR"/>
 *     &lt;enumeration value="PY"/>
 *     &lt;enumeration value="PB"/>
 *     &lt;enumeration value="RJ"/>
 *     &lt;enumeration value="SK"/>
 *     &lt;enumeration value="TN"/>
 *     &lt;enumeration value="TR"/>
 *     &lt;enumeration value="UP"/>
 *     &lt;enumeration value="UL"/>
 *     &lt;enumeration value="WB"/>
 *     &lt;enumeration value="TG"/>
 *   &lt;/restriction>
 * &lt;/simpleType>
 * </pre>
 * 
 */
@XmlType(name = "StateCodeOptions")
@XmlEnum
public enum StateCodeOptions {

	AN, AP, AR, AS, BR, CH, CG, DN, DD, DL, GA, GJ, HR, HP, JK, JH, KA, KL, LD, MP, MH, MN, ML, MZ, NL, OR, PY, PB, RJ, SK, TN, TR, UP, UL, WB, TG;

	public String value() {
		return name();
	}

	public static StateCodeOptions fromValue(String v) {
		return valueOf(v);
	}

}
