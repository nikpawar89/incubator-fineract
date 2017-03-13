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

import java.sql.Blob;

public class CreditResponse {
	private final double outstandingLoanAmount;
	private final int numberOfActiveLoans;
	private final int loansInBadStanding;
	private final int numberOfMissedEMI;
	private final double totalEMIperMonth;
	private final Blob document;

	public CreditResponse(final double outstandingLoanAmount, final int numberOfActiveLoans,
			final int loansInBadStanding, final int numberOfMissedEMI, final double totalEMIperMonth,
			final Blob document) {
		this.outstandingLoanAmount = outstandingLoanAmount;
		this.numberOfActiveLoans = numberOfActiveLoans;
		this.loansInBadStanding = loansInBadStanding;
		this.numberOfMissedEMI = numberOfMissedEMI;
		this.totalEMIperMonth = totalEMIperMonth;
		this.document = document;
	}

	public double getOutstandingLoanAmount() {
		return this.outstandingLoanAmount;
	}

	public int getNumberOfActiveLoans() {
		return this.numberOfActiveLoans;
	}

	public int getLoansInBadStanding() {
		return this.loansInBadStanding;
	}

	public int getNumberOfMissedEMI() {
		return this.numberOfMissedEMI;
	}

	public double getTotalEMIperMonth() {
		return this.totalEMIperMonth;
	}

	public Blob getDocument() {
		return this.document;
	}

}
