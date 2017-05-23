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
package org.apache.fineract.infrastructure.creditbureau.data;

public class OrganisationCreditbureauData {

	private final long organisationCreditBureauId;

	private final String alias;

	private final long creditbureauId;

	private final String creditbureauName;

	private final String creditbureauProduct;

	private final String creditbureauCountry;

	private final String creditbureauSummary;

	private final boolean is_active;

	private OrganisationCreditbureauData(final long organisationCreditBureauId, final String alias,
			final long creditbureauId, final String creditbureauName, final String creditbureauProduct,
			final String creditbureauCountry, final String creditbureauSummary, final boolean is_active) {
		this.organisationCreditBureauId = organisationCreditBureauId;
		this.alias = alias;
		this.creditbureauId = creditbureauId;
		this.creditbureauName = creditbureauName;
		this.creditbureauProduct = creditbureauProduct;
		this.creditbureauCountry = creditbureauCountry;
		this.creditbureauSummary = creditbureauSummary;
		this.is_active = is_active;
	}

	public static OrganisationCreditbureauData instance(final long organisationCreditBureauId, final String alias,
			final long creditbureauId, final String creditbureauName, final String creditbureauProduct,
			final String creditbureauCountry, final String creditbureauSummary, final boolean is_active) {
		return new OrganisationCreditbureauData(organisationCreditBureauId, alias, creditbureauId, creditbureauName,
				creditbureauProduct, creditbureauCountry, creditbureauSummary, is_active);
	}

	public long getOrganisationCreditBureauId() {
		return this.organisationCreditBureauId;
	}

	public String getCreditbureauName() {
		return this.creditbureauName;
	}

	public String getCreditbureauProduct() {
		return this.creditbureauProduct;
	}

	public String getCreditbureauCountry() {
		return this.creditbureauCountry;
	}

	public String getCreditbureauSummary() {
		return this.creditbureauSummary;
	}

	public String getAlias() {
		return this.alias;
	}

	public long getCreditbureauId() {
		return this.creditbureauId;
	}

	public boolean isIs_active() {
		return this.is_active;
	}

}
