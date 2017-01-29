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



import org.joda.time.LocalDate;

public class CreditRequest 
{
    
    
    private final String FirstName;
    private final String LastName;
    private final String gender;
    
    

    private final String ExternalId1;
    private final String ExternalId2;
    private final LocalDate dateOfBirth;
    private final String phonenumber;
    private final String address;
    private final String occupation;
    private final double monthlySalary;
    private final double annualSalary;
    private final String enquiryReason;
    private final String loanid;
    private final String clientId;
    private final String groupId;
    
    public CreditRequest( final String FirstName,
            final String LastName,
            final String gender,
            final String ExternalId1,
            final String ExternalId2,
            final LocalDate dateOfBirth,
            final String phonenumber,
            final String address,
            final String occupation,
            final double monthlySalary,
            final double annualSalary,
            final String enquiryReason,
            final String loanid,
            final String clientId,
            final String groupId )
    {
                this.FirstName=FirstName;
                this.LastName=LastName;
                this.gender=gender;
                this.ExternalId1=ExternalId1;
                this.ExternalId2=ExternalId2;
                this.dateOfBirth=dateOfBirth;
                this.phonenumber=phonenumber;
                this.address=address;
                this.occupation=occupation;
                this.monthlySalary=monthlySalary;
                this.annualSalary=annualSalary;
                this.enquiryReason=enquiryReason;
                this.loanid=loanid;
                this.clientId=clientId;
                this.groupId=groupId;
    }
    
    public String getFirstName() {
        return this.FirstName;
    }
    
    public String getLastName() {
        return this.LastName;
    }
    
    public String getGender() {
        return this.gender;
    }
    
    public String getExternalId1() {
        return this.ExternalId1;
    }
    
    public String getExternalId2() {
        return this.ExternalId2;
    }
    
    public LocalDate getDateOfBirth() {
        return this.dateOfBirth;
    }
    
    public String getPhonenumber() {
        return this.phonenumber;
    }
    
    public String getAddress() {
        return this.address;
    }
    
    public String getOccupation() {
        return this.occupation;
    }
    
    public double getMonthlySalary() {
        return this.monthlySalary;
    }
    
    public double getAnnualSalary() {
        return this.annualSalary;
    }
    
    public String getEnquiryReason() {
        return this.enquiryReason;
    }
    
    public String getLoanid() {
        return this.loanid;
    }
    
    public String getClientId() {
        return this.clientId;
    }
    
    public String getGroupId() {
        return this.groupId;
    }
    
    
    
    
}
