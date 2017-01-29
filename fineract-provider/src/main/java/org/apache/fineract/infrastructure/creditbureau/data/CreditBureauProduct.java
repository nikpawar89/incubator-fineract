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


public class CreditBureauProduct 
{
    
    private final long credit_bureau_product_id;
    
    private final String cb_product_name;
    
    private final long cb_master_id;
    
    
    private CreditBureauProduct(final long credit_bureau_product_id,final String cb_product_name,final long cb_master_id)
    {
    this.credit_bureau_product_id=credit_bureau_product_id;
    this.cb_product_name=cb_product_name;
    this.cb_master_id=cb_master_id;
    }

    public static CreditBureauProduct instance(final long credit_bureau_product_id,final String cb_product_name,final long cb_master_id)
    {
    return new CreditBureauProduct(credit_bureau_product_id,cb_product_name,cb_master_id);
    }
    
    public long getCredit_bureau_product_id() {
        return this.credit_bureau_product_id;
    }

    
    public String getCb_product_name() {
        return this.cb_product_name;
    }

    
    public long getCb_master_id() {
        return this.cb_master_id;
    }
    
    

}
