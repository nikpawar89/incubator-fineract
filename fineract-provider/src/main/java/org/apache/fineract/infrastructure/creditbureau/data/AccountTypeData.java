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

import java.math.BigDecimal;

public class AccountTypeData {

	private String institutionName;

	private String accountNumber;

	private BigDecimal disbursementAmount;

	private BigDecimal lastPayment;

	private BigDecimal installmentAmount;

	private String accountType;

	private BigDecimal currentBalance;

	private AccountTypeData(String institutionName, String accountNumber, BigDecimal disbursementAmount,
			BigDecimal lastPayment, BigDecimal installmentAmount, String accountType, BigDecimal currentBalance) {
		this.institutionName = institutionName;
		this.accountNumber = accountNumber;
		this.disbursementAmount = disbursementAmount;
		this.lastPayment = lastPayment;
		this.installmentAmount = installmentAmount;
		this.accountType = accountType;
		this.currentBalance = currentBalance;
	}

	public static AccountTypeData instance(String institutionName, String accountNumber, BigDecimal disbursementAmount,
			BigDecimal lastPayment, BigDecimal installmentAmount, String accountType, BigDecimal currentBalance) {

		return new AccountTypeData(institutionName, accountNumber, disbursementAmount, lastPayment, installmentAmount,
				accountType, currentBalance);

	}

	public String getInstitutionName() {
		return this.institutionName;
	}

	public void setInstitutionName(String institutionName) {
		this.institutionName = institutionName;
	}

	public String getAccountNumber() {
		return this.accountNumber;
	}

	public void setAccountNumber(String accountNumber) {
		this.accountNumber = accountNumber;
	}

	public BigDecimal getDisbursementAmount() {
		return this.disbursementAmount;
	}

	public void setDisbursementAmount(BigDecimal disbursementAmount) {
		this.disbursementAmount = disbursementAmount;
	}

	public BigDecimal getLastPayment() {
		return this.lastPayment;
	}

	public void setLastPayment(BigDecimal lastPayment) {
		this.lastPayment = lastPayment;
	}

	public BigDecimal getInstallmentAmount() {
		return this.installmentAmount;
	}

	public void setInstallmentAmount(BigDecimal installmentAmount) {
		this.installmentAmount = installmentAmount;
	}

	public String getAccountType() {
		return this.accountType;
	}

	public void setAccountType(String accountType) {
		this.accountType = accountType;
	}

	public BigDecimal getCurrentBalance() {
		return this.currentBalance;
	}

	public void setCurrentBalance(BigDecimal currentBalance) {
		this.currentBalance = currentBalance;
	}

}
