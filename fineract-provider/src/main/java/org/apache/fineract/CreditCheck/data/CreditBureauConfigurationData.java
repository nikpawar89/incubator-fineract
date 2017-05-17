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


public class CreditBureauConfigurationData 
{
    private final long creditbureauConfigurationId;
    
    private final String configkey;
    
    private final String value;
    
    private final long organisationCreditbureauId;
    
    private final String description;
    
    private CreditBureauConfigurationData(final long creditbureauConfigurationId,final String configkey,final String value,
            final long organisationCreditbureauId,final String description)
    {
       this.creditbureauConfigurationId=creditbureauConfigurationId;
       this.configkey=configkey;
       this.value=value;
       this.organisationCreditbureauId=organisationCreditbureauId;
       this.description=description;
        
    }
    
    public static CreditBureauConfigurationData instance(final long creditbureauConfigurationId,final String configkey,final String value,
            final long organisationCreditbureauId,final String description)
    {
        return new CreditBureauConfigurationData(creditbureauConfigurationId,configkey,value,
                organisationCreditbureauId,description);
    }

    
    public long getCreditbureauConfigurationId() {
        return this.creditbureauConfigurationId;
    }

    
    public String getConfigKey() {
        return this.configkey;
    }

    
    public String getValue() {
        return this.value;
    }

    
    public long getOrganisationCreditbureauId() {
        return this.organisationCreditbureauId;
    }

    
    public String getDescription() {
        return this.description;
    }

    
}
