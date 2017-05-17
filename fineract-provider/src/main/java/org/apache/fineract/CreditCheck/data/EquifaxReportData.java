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

package org.apache.fineract.CreditCheck.data;

import java.math.BigDecimal;
import java.util.List;

public class EquifaxReportData {

    
    private String score;
    
    private int numberOfAccounts;
    
    private BigDecimal totalPastDues;
    
    private BigDecimal totalBalance;
    
    private int numberOfPastDueAccounts;
    
    private BigDecimal totalWrittenOfAmount;
    
    
    private List<AccountTypeData> account;
    
    public EquifaxReportData()
    {
        
    }
    
    
    private EquifaxReportData( String score,int numberOfAccounts,BigDecimal totalPastDues,BigDecimal totalBalance,
            int numberOfPastDueAccounts,BigDecimal totalWrittenOfAmount,List<AccountTypeData> account)
    {
        this.score=score;
        this.numberOfAccounts=numberOfAccounts;
        this.totalPastDues=totalPastDues;
        this.totalBalance=totalBalance;
        this.numberOfPastDueAccounts=numberOfPastDueAccounts;
        this.totalWrittenOfAmount=totalWrittenOfAmount;
        this.account=account;
    }
    
    public static EquifaxReportData instance(String score,int numberOfAccounts,BigDecimal totalPastDues,BigDecimal totalBalance,
            int numberOfPastDueAccounts,BigDecimal totalWrittenOfAmount,List<AccountTypeData> account)
    {
        return new EquifaxReportData(score,numberOfAccounts,totalPastDues,totalBalance,numberOfPastDueAccounts,totalWrittenOfAmount,account);
    }

    
    public String getScore() {
        return this.score;
    }

    
    public void setScore(String score) {
        this.score = score;
    }

    
    public int getNumberOfAccounts() {
        return this.numberOfAccounts;
    }

    
    public void setNumberOfAccounts(int numberOfAccounts) {
        this.numberOfAccounts = numberOfAccounts;
    }

    
    public BigDecimal getTotalPastDues() {
        return this.totalPastDues;
    }

    
    public void setTotalPastDues(BigDecimal totalPastDues) {
        this.totalPastDues = totalPastDues;
    }

    
    public BigDecimal getTotalBalance() {
        return this.totalBalance;
    }

    
    public void setTotalBalance(BigDecimal totalBalance) {
        this.totalBalance = totalBalance;
    }

    
    public int getNumberOfPastDueAccounts() {
        return this.numberOfPastDueAccounts;
    }

    
    public void setNumberOfPastDueAccounts(int numberOfPastDueAccounts) {
        this.numberOfPastDueAccounts = numberOfPastDueAccounts;
    }

    
    public BigDecimal getTotalWrittenOfAmount() {
        return this.totalWrittenOfAmount;
    }

    
    public void setTotalWrittenOfAmount(BigDecimal totalWrittenOfAmount) {
        this.totalWrittenOfAmount = totalWrittenOfAmount;
    }

    
    public List<AccountTypeData> getAccount() {
        return this.account;
    }

    
    public void setAccount(List<AccountTypeData> account) {
        this.account = account;
    }

    
}
