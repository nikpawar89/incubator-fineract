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

public class CreditBureauData {

    private final long creditBureauId;

    private final String creditBureauName;

    private final String country;

    private final String productName;
    
    private final String cbSummary;

    private final long implementationkey;

    private CreditBureauData(final long creditBureauId, final String creditBureauName, final String country, final String productName,
            final String cbSummary, final long implementationkey) {
        this.creditBureauId = creditBureauId;
        this.creditBureauName = creditBureauName;
        this.country = country;
        this.productName = productName;
        this.cbSummary=cbSummary;
        this.implementationkey = implementationkey;

    }

    public static CreditBureauData instance(final long creditbureau_id, final String creditbureau_name, final String country,
            final String product_name, final String cbSummary,final long implementation_key) {

        return new CreditBureauData(creditbureau_id, creditbureau_name, country, product_name,cbSummary, implementation_key);
    }

    
    
    public String getCbSummary() {
        return this.cbSummary;
    }

    public long getCreditBureauId() {
        return this.creditBureauId;
    }

    
    public String getCreditBureauName() {
        return this.creditBureauName;
    }

    
    public String getCountry() {
        return this.country;
    }

    
    public String getProductName() {
        return this.productName;
    }

    
    public long getImplementationkey() {
        return this.implementationkey;
    }

    
}
