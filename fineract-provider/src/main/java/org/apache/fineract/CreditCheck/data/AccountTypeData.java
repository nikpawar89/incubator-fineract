package org.apache.fineract.CreditCheck.data;

import java.math.BigDecimal;

public class AccountTypeData 
{

    private String institutionName;
    
    private String accountNumber;
    
    private BigDecimal disbursementAmount;
    
    private BigDecimal lastPayment;
    
    private BigDecimal installmentAmount;
    
    private String accountType;
    
    private BigDecimal currentBalance;
    
    private AccountTypeData(String institutionName,String accountNumber,BigDecimal disbursementAmount,
            BigDecimal lastPayment, BigDecimal installmentAmount,String accountType,
            BigDecimal currentBalance )
    {
        this.institutionName=institutionName;
        this.accountNumber=accountNumber;
        this.disbursementAmount=disbursementAmount;
        this.lastPayment=lastPayment;
        this.installmentAmount=installmentAmount;
        this.accountType=accountType;
        this.currentBalance=currentBalance;
    }
    
    public static AccountTypeData instance(String institutionName,String accountNumber,BigDecimal disbursementAmount,
            BigDecimal lastPayment, BigDecimal installmentAmount,String accountType,
            BigDecimal currentBalance)
    {
        
        return new AccountTypeData(institutionName,accountNumber,disbursementAmount,
                lastPayment, installmentAmount,accountType,
                currentBalance );
        
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
