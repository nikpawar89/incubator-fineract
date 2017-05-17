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

package org.apache.fineract.CreditCheck.domain;

import javax.persistence.Entity;
import javax.persistence.ManyToOne;
import javax.persistence.OneToOne;
import javax.persistence.Table;

import org.apache.fineract.infrastructure.core.api.JsonCommand;
import org.apache.fineract.infrastructure.core.domain.AbstractPersistableCustom;
import org.apache.fineract.portfolio.loanproduct.domain.LoanProduct;

@Entity
@Table(name = "m_creditbureau_loanproduct_mapping")
public class CreditBureauLpMapping extends AbstractPersistableCustom<Long> {

    private boolean is_creditcheck_mandatory;

    private boolean skip_creditcheck_in_failure;

    private int stale_period;

    private boolean is_active;
    
    @ManyToOne
    private OrganisationCreditBureau organisation_creditbureau;
    
    @OneToOne
    private LoanProduct loan_product;
    
    
  

 /*   @ManyToOne
    private CreditBureau cb;

    @OneToOne
    private LoanProduct loan_product;
    
  
    public static CreditBureauLpMapping fromJson(final JsonCommand command, CreditBureau creditBureau,
            LoanProduct loanProduct)
    {
      final boolean is_creditcheck_mandatory=command.booleanPrimitiveValueOfParameterNamed("is_creditcheck_mandatory");
      final boolean skip_credit_check_in_failure=command.booleanPrimitiveValueOfParameterNamed("skip_credit_check_in_failure");
      final int stale_period=command.integerValueOfParameterNamed("stale_period");
      final boolean is_active=command.booleanPrimitiveValueOfParameterNamed("is_active");
      
      
      
      return new CreditBureauLpMapping(creditBureau,loanProduct,is_creditcheck_mandatory,
              skip_credit_check_in_failure,stale_period,is_active);
        
    }
    
  public CreditBureauLpMapping(CreditBureau cb,LoanProduct loan_product,boolean is_creditcheck_mandatory,
            boolean skip_credit_check_in_failure,int stale_period,boolean is_active )
    {
        this.cb=cb;
        this.loan_product=loan_product;
        this.is_creditcheck_mandatory=is_creditcheck_mandatory;
        this.skip_credit_check_in_failure=skip_credit_check_in_failure;
        this.stale_period=stale_period;
        this.is_active=is_active;
    }*/
    
    public CreditBureauLpMapping()
    {
        
    }
    
    public CreditBureauLpMapping(boolean isCreditCheckMandatory,boolean skipCreditCheckInFailure,int stalePeriod,boolean is_active,
            OrganisationCreditBureau organisation_creditbureau,LoanProduct loan_product)
    {
        this.is_creditcheck_mandatory=isCreditCheckMandatory;
        this.skip_creditcheck_in_failure=skipCreditCheckInFailure;
        this.stale_period=stalePeriod;
        this.is_active=is_active;
        this.organisation_creditbureau=organisation_creditbureau;
        this.loan_product=loan_product;
    }
    
    public static CreditBureauLpMapping fromJson(final JsonCommand command, OrganisationCreditBureau organisation_creditbureau,
            LoanProduct loanProduct)
    {
      final boolean isCreditCheckMandatory=command.booleanPrimitiveValueOfParameterNamed("is_creditcheck_mandatory");
      final boolean skipCreditCheckInFailure=command.booleanPrimitiveValueOfParameterNamed("skip_creditcheck_in_failure");
      final int stalePeriod=command.integerValueOfParameterNamed("stale_period");
      final boolean is_active=command.booleanPrimitiveValueOfParameterNamed("is_active");
      
      
      
      return new CreditBureauLpMapping(isCreditCheckMandatory,skipCreditCheckInFailure,stalePeriod,is_active,
              organisation_creditbureau,loanProduct);
        
    }

    
    public boolean isIs_creditcheck_mandatory() {
        return this.is_creditcheck_mandatory;
    }

    
    public void setIs_creditcheck_mandatory(boolean is_creditcheck_mandatory) {
        this.is_creditcheck_mandatory = is_creditcheck_mandatory;
    }

    
    public boolean isSkip_creditcheck_in_failure() {
        return this.skip_creditcheck_in_failure;
    }

    
    public void setSkip_creditcheck_in_failure(boolean skip_creditcheck_in_failure) {
        this.skip_creditcheck_in_failure = skip_creditcheck_in_failure;
    }

    
    public int getStale_period() {
        return this.stale_period;
    }

    
    public void setStale_period(int stale_period) {
        this.stale_period = stale_period;
    }

    
    public boolean isIs_active() {
        return this.is_active;
    }

    
    public void setIs_active(boolean is_active) {
        this.is_active = is_active;
    }

    
    public OrganisationCreditBureau getOrganisation_creditbureau() {
        return this.organisation_creditbureau;
    }

    
    public void setOrganisation_creditbureau(OrganisationCreditBureau organisation_creditbureau) {
        this.organisation_creditbureau = organisation_creditbureau;
    }

    
    public LoanProduct getLoan_product() {
        return this.loan_product;
    }

    
    public void setLoan_product(LoanProduct loan_product) {
        this.loan_product = loan_product;
    }
    
    

    
   

}
