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
package org.apache.fineract.infrastructure.creditbureau.service;

import org.apache.fineract.infrastructure.core.api.JsonCommand;
import org.apache.fineract.infrastructure.core.data.CommandProcessingResult;
import org.apache.fineract.infrastructure.core.data.CommandProcessingResultBuilder;
import org.apache.fineract.infrastructure.creditbureau.domain.CreditBureauLpMapping;
import org.apache.fineract.infrastructure.creditbureau.domain.CreditBureauLpMappingRepository;
import org.apache.fineract.infrastructure.creditbureau.domain.OrganisationCreditBureau;
import org.apache.fineract.infrastructure.creditbureau.domain.OrganisationCreditBureauRepository;
import org.apache.fineract.infrastructure.creditbureau.serialization.CBLPCommandFromApiJsonDeserializer;
import org.apache.fineract.infrastructure.security.service.PlatformSecurityContext;
import org.apache.fineract.portfolio.loanproduct.domain.LoanProduct;
import org.apache.fineract.portfolio.loanproduct.domain.LoanProductRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

@Service
public class CreditBureauLpMappingWritePlatformServiceImpl implements CreditBureauLpMappingWritePlatformService
{

    
    private final PlatformSecurityContext context;
    
    private final CreditBureauLpMappingRepository  creditbureauLpMappingRepository;
    
    private final OrganisationCreditBureauRepository orgCbRepository;
    
    private final LoanProductRepository lpRepository;
    
    private final CBLPCommandFromApiJsonDeserializer fromApiJsonDeserializer;
    
    @Autowired
    public CreditBureauLpMappingWritePlatformServiceImpl(final PlatformSecurityContext context,final CreditBureauLpMappingRepository  creditbureauLpMappingRepository,
            final OrganisationCreditBureauRepository orgCbRepository,LoanProductRepository lpRepository,final CBLPCommandFromApiJsonDeserializer fromApiJsonDeserializer )
    {
      this.context=context;
      this.creditbureauLpMappingRepository=creditbureauLpMappingRepository;
      this.orgCbRepository=orgCbRepository;
      this.lpRepository=lpRepository;
      this.fromApiJsonDeserializer=fromApiJsonDeserializer;
      
    }
    
    @Transactional
    @Override
    public CommandProcessingResult addCbLpMapping(Long cb_id,JsonCommand command) {
        this.context.authenticatedUser();
      this.fromApiJsonDeserializer.validateForCreate(command.json(),cb_id);
        
        
        
        final long lpid=command.longValueOfParameterNamed("loan_product_id");
        
        final OrganisationCreditBureau orgcb = this.orgCbRepository.getOne(cb_id);
        
        final LoanProduct lp=this.lpRepository.getOne(lpid);
        
        final CreditBureauLpMapping cb_lp=CreditBureauLpMapping.fromJson(command, orgcb, lp);
        
        this.creditbureauLpMappingRepository.save(cb_lp);
        
        return new CommandProcessingResultBuilder().withCommandId(command.commandId()).withEntityId(cb_lp.getId()).build();

    }

    @Override
    public CommandProcessingResult updateCreditBureauLoanProductMapping(JsonCommand command) {
       
        final Long mappingid=command.longValueOfParameterNamed("creditbureauLoanProductMappingId");
        final boolean is_active=command.booleanPrimitiveValueOfParameterNamed("is_active");
        final CreditBureauLpMapping cblpmapping=this.creditbureauLpMappingRepository.getOne(mappingid);
        cblpmapping.setIs_active(is_active);
        this.creditbureauLpMappingRepository.saveAndFlush(cblpmapping);
        return new CommandProcessingResultBuilder().withCommandId(command.commandId()).withEntityId(cblpmapping.getId()).build();
    }
}
