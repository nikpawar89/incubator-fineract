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
import org.apache.fineract.infrastructure.creditbureau.domain.CreditBureau;
import org.apache.fineract.infrastructure.creditbureau.domain.CreditBureauRepository;
import org.apache.fineract.infrastructure.creditbureau.domain.OrganisationCreditBureau;
import org.apache.fineract.infrastructure.creditbureau.domain.OrganisationCreditBureauRepository;
import org.apache.fineract.infrastructure.creditbureau.serialization.CBCommandFromApiJsonDeserializer;
import org.apache.fineract.infrastructure.security.service.PlatformSecurityContext;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

@Service
public class OrganisationCreditBureauWritePlatflormServiceImpl implements OrganisationCreditBureauWritePlatflormService
{

  private final PlatformSecurityContext context;
    
  private final OrganisationCreditBureauRepository orgCbRepository;
    
    private final CreditBureauRepository cbRepository;
    
   private final CBCommandFromApiJsonDeserializer fromApiJsonDeserializer;
    
    @Autowired
    public OrganisationCreditBureauWritePlatflormServiceImpl(final PlatformSecurityContext context,final OrganisationCreditBureauRepository orgCbRepository,
            final CreditBureauRepository cbRepository,final CBCommandFromApiJsonDeserializer fromApiJsonDeserializer)
    {
      this.context=context;
      this.orgCbRepository=orgCbRepository;
      this.cbRepository=cbRepository;
       this.fromApiJsonDeserializer=fromApiJsonDeserializer;
      
    }
    
    @Override
    public CommandProcessingResult addOrgCreditBureau(Long ocb_id, JsonCommand command) {
        this.context.authenticatedUser();
         this.fromApiJsonDeserializer.validateForCreate(command.json(),ocb_id);
          
           final CreditBureau cb = this.cbRepository.getOne(ocb_id);
          
        final OrganisationCreditBureau orgcb=OrganisationCreditBureau.fromJson(command, cb);
          
          this.orgCbRepository.save(orgcb);
          
          return new CommandProcessingResultBuilder().withCommandId(command.commandId()).withEntityId(orgcb.getId()).build();
    }
    
    @Transactional
    @Override
    public CommandProcessingResult updateCreditBureau(JsonCommand command)
    {
      //  this.context.authenticatedUser();
       // this.fromApiJsonDeserializer.validateForCreate(command.json());
        
        final long creditbureauID = command.longValueOfParameterNamed("cb_id");
        System.out.println("creditbureauID is "+creditbureauID); 
        
        final boolean is_active=command.booleanPrimitiveValueOfParameterNamed("is_active");
        
        final OrganisationCreditBureau orgcb=orgCbRepository.getOne(creditbureauID);
        
        orgcb.setIs_active(is_active);
        
         orgCbRepository.saveAndFlush(orgcb);
        
        return new CommandProcessingResultBuilder().withCommandId(command.commandId()).withEntityId(orgcb.getId()).build();
        
    }

}
