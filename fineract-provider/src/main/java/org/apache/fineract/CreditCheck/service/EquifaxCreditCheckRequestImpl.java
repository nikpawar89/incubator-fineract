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

package org.apache.fineract.CreditCheck.service;

import java.io.StringReader;
import java.io.StringWriter;
import java.math.BigDecimal;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.GregorianCalendar;
import java.util.List;

import javax.xml.bind.JAXBContext;
import javax.xml.bind.JAXBException;
import javax.xml.bind.Marshaller;
import javax.xml.bind.Unmarshaller;
import javax.xml.datatype.DatatypeConfigurationException;
import javax.xml.datatype.DatatypeFactory;
import javax.xml.datatype.XMLGregorianCalendar;
import javax.xml.namespace.QName;
import javax.xml.ws.BindingProvider;

import org.apache.fineract.CreditCheck.data.AccountTypeData;
import org.apache.fineract.CreditCheck.data.EquifaxReportData;
import org.apache.fineract.CreditCheck.equifax.services.eport.servicedefs._1.CreditReportWSInquiryPortType;
import org.apache.fineract.CreditCheck.equifax.services.eport.ws.schemas._1.AccountDetailsType;
import org.apache.fineract.CreditCheck.equifax.services.eport.ws.schemas._1.AccountType;
import org.apache.fineract.CreditCheck.equifax.services.eport.ws.schemas._1.AdditionalNameTypeDetails;
import org.apache.fineract.CreditCheck.equifax.services.eport.ws.schemas._1.CreditReportSummaryType;
import org.apache.fineract.CreditCheck.equifax.services.eport.ws.schemas._1.FamilyInfo;
import org.apache.fineract.CreditCheck.equifax.services.eport.ws.schemas._1.IDAndContactType;
import org.apache.fineract.CreditCheck.equifax.services.eport.ws.schemas._1.IDType;
import org.apache.fineract.CreditCheck.equifax.services.eport.ws.schemas._1.IdentificationType;
import org.apache.fineract.CreditCheck.equifax.services.eport.ws.schemas._1.InquiryCommonInputPhoneType;
import org.apache.fineract.CreditCheck.equifax.services.eport.ws.schemas._1.InquiryPhoneType;
import org.apache.fineract.CreditCheck.equifax.services.eport.ws.schemas._1.InquiryRequestType;
import org.apache.fineract.CreditCheck.equifax.services.eport.ws.schemas._1.InquiryResponseType;
import org.apache.fineract.CreditCheck.equifax.services.eport.ws.schemas._1.MaritalStatusOptions;
import org.apache.fineract.CreditCheck.equifax.services.eport.ws.schemas._1.ReportFormatOptions;
import org.apache.fineract.CreditCheck.equifax.services.eport.ws.schemas._1.ReportType;
import org.apache.fineract.CreditCheck.equifax.services.eport.ws.schemas._1.RequestBodyType;
import org.apache.fineract.CreditCheck.equifax.services.eport.ws.schemas._1.RequestHeaderType;
import org.apache.fineract.CreditCheck.equifax.services.eport.ws.schemas._1.ScoreType;
import org.apache.fineract.CreditCheck.equifax.services.eport.ws.schemas._1.StateCodeOptions;
import org.springframework.stereotype.Service;
//import javax.xml.ws.*;

@Service
public class EquifaxCreditCheckRequestImpl implements EquifaxCreditCheckRequest
{
    
    public static  void init(){ 
        System.setProperty( "com.sun.xml.bind.v2.bytecode.ClassTailor.noOptimize", "true");
    }

   
    public static void revert(){ 
        System.getProperties().remove("com.sun.xml.bind.v2.bytecode.ClassTailor.noOptimize");
    }   
  
   /* 
    @Override
    public void processRequest()
    {
        String PROD_URL = "https://eport.equifax.co.in/creditreportws/CreditReportWSInquiry/v1.0";
        String UAT_URL = "https://eportuat.equifax.co.in/creditreportws/CreditReportWSInquiry/v1.0?wsdl";
        String TRAIN_URL = "https://eporttrain.equifax.co.in/creditreportws/CreditReportWSInquiry/v1.0";
        invokeEquifaxWSService(TRAIN_URL);
    }*/
    
    

    private static void populateUATRetailRequestHeaderType(
                    RequestHeaderType requestHeader) {
            // TODO: Update your value :: Company id  shared by Equifax
            requestHeader.setCustomerId(3); 
            requestHeader.setUserId("STS_CI");
            //requestHeader.setCustRefField("1234");
            // TODO: Update your value :: Member Number shared by Equifax
            requestHeader.setMemberNumber("999AA00223");
            // TODO: Update your value :: password shared by Equifax
            requestHeader.setPassword("G5Y96#9a_L");
            // TODO: Update your value :: desired product code - This is dynamic field based on business requirement
            // requestHeader.setProductCode("PCS");
            // TODO: Update your value :: desired product code - This is dynamic field based on business requirement
            requestHeader.setProductCode("MCS");
            requestHeader.setProductVersion("1.0");
            requestHeader.setReportFormat(ReportFormatOptions.XML);
            // TODO: Update your value :: Security digit shared by equifax 
            requestHeader.setSecurityCode("GG8");
            // TODO: Update your value :: user id shared by Equifax
            

    }

   @Override
   public  EquifaxReportData processRequest() 
    {
        
        String PROD_URL = "https://eport.equifax.co.in/creditreportws/CreditReportWSInquiry/v1.0";
        String UAT_URL = "https://eportuat.equifax.co.in/creditreportws/CreditReportWSInquiry/v1.0?wsdl";
        String TRAIN_URL = "https://eporttrain.equifax.co.in/creditreportws/CreditReportWSInquiry/v1.0";
        
        EquifaxReportData report=new EquifaxReportData();

            java.net.URL endpoint = null;
    try {
        endpoint = new java.net.URL(TRAIN_URL);
    }
    catch (java.net.MalformedURLException e) {
        e.printStackTrace();
    }
    System.out.println("endpoint="+endpoint);
            QName qname = new QName("http://services.equifax.com/eport/servicedefs/1.0", "v1.0");
            // QName qname = new QName("http://stub.ists.mn.com/", "StubIstsImplService");
            javax.xml.ws.Service service = javax.xml.ws.Service.create(endpoint, qname);
            CreditReportWSInquiryPortType inquiryPortType = service.getPort(CreditReportWSInquiryPortType.class);
            BindingProvider bp = (BindingProvider) inquiryPortType;
            bp.getRequestContext().put(BindingProvider.ENDPOINT_ADDRESS_PROPERTY, TRAIN_URL);
            
            
            
            
            
            InquiryRequestType input = new InquiryRequestType();

            RequestHeaderType requestHeader = new RequestHeaderType();
            populateUATRetailRequestHeaderType(requestHeader);
            input.setRequestHeader(requestHeader);

            RequestBodyType requestBody = null;
            // TODO: In case of retails inquiry
             requestBody = constructRetailRequest();

            input.setRequestBody(requestBody);
            try {
                    
                    
                    System.out.println("--------------- REQUEST ------------------------");
                  printRequest(input);
                    System.out.println("--------------- REQUEST END ------------------------");
                    
                    InquiryResponseType responseType = inquiryPortType.getConsumerCreditReport(input);
                    

                    System.out.println("================= RESPONSE =======================");
                    
                    
                     report=  printResponse(responseType);
                    System.out.println("================= RESPONSE END =======================");
            } catch ( JAXBException e) {
                    
                    System.out.print("JAXB conversion");
                    e.printStackTrace();
            }
            
           /* List<EquifaxReportData> list=new ArrayList<EquifaxReportData>();
            list.add(EquifaxReportData.instance(response));
            
           return list;*/
            
            return report;
            
           

    }

    private RequestBodyType constructRetailRequest() 
    {
            RequestBodyType requestBody = new RequestBodyType();
            requestBody.setInquiryPurpose("0E");
            requestBody.setTransactionAmount(new BigDecimal("200000.0"));
            requestBody.setFirstName("SRIDEVI");// TODO: Update your value
            
            /*requestBody.setMiddleName("M");
            requestBody.setLastName("T");*/
            // TODO:  Update your value
            requestBody.setAddrLine1("HALLI SIRGUPPA SADASHIVANAGAR BELLARY");
            //requestBody.setCity("KANJIRAPALLY");
            requestBody.setState(StateCodeOptions.KA);
            requestBody.setPostal("583103");// TODO: Update your value
            try {
                    requestBody.setDOB(getXMLGregorianCalendarDate());
            } catch (DatatypeConfigurationException e) {
                    // TODO Auto-generated catch block
                    e.printStackTrace();
            }
            // TODO:  Update your value
            requestBody.setMaritalStatus(MaritalStatusOptions.NOT_GIVEN);
            // TODO:  Update your value
    //      requestBody.setGender("M");
            // TODO:  Update your value
    //      requestBody.setPANId("ABCDP0000A");
            // TODO:  Update your value
            // requestBody.setDriverLicense("HR/00/00/400001");
            // TODO:  Update your value
            // requestBody.setVoterId("KL000000000");
            /*GregorianCalendar c = new GregorianCalendar();
            c.set(1962, 01, 05);
            try
            {
            
            XMLGregorianCalendar calender = DatatypeFactory.newInstance().newXMLGregorianCalendar(c);
            requestBody.setDOB(calender);
            
            }
            catch(DatatypeConfigurationException e)
            {
                    System.out.println(e);
            }
            requestBody.setRationCard("03/W/7820489");*/
            
    /*      LandlineType homePhone = new LandlineType();
            // TODO:  Update your value
            homePhone.setPhoneNumber("2987987");
            // TODO:  Update your value
    //      requestBody.setMobilePhone("9000000000");
            requestBody.setHomePhone(homePhone);*/
            
            
            InquiryPhoneType iphonetype=new InquiryPhoneType();
            iphonetype.setNumber("2987987");
            
            InquiryCommonInputPhoneType inquiryCommonInputPhoneType=new InquiryCommonInputPhoneType();
            List<InquiryPhoneType> list=inquiryCommonInputPhoneType.getInquiryPhone();
            list.add(iphonetype);
            requestBody.setInquiryPhones(inquiryCommonInputPhoneType);
            
            
            
            FamilyInfo family=new FamilyInfo();
            List<AdditionalNameTypeDetails> familyList=family.getAdditionalNameInfo();
            AdditionalNameTypeDetails familyName=new AdditionalNameTypeDetails();
            familyName.setAdditionalName("NATHAN");
            familyName.setAdditionalNameType("H");
            familyList.add(familyName);
            requestBody.setFamilyDetails(family);
            requestBody.setRationCard("03/W/7820489");

            return requestBody;
    }

    private XMLGregorianCalendar getXMLGregorianCalendarDate() throws DatatypeConfigurationException{
            SimpleDateFormat date = new SimpleDateFormat("yyyy-MM-dd");
            java.util.Date dob;
            XMLGregorianCalendar dobXml = null;
            try {
                    dob = date.parse("1962-01-05");// TODO: Update your value
                    GregorianCalendar gregory = new GregorianCalendar();
                    gregory.setTime(dob);

                    dobXml = DatatypeFactory.newInstance()
                    .newXMLGregorianCalendar(gregory);
            } catch (ParseException e1) {
                    // TODO Auto-generated catch block
                    e1.printStackTrace();
            }
            return dobXml;
    }

    private static EquifaxReportData printResponse(InquiryResponseType responseType)
                    throws JAXBException {
        
      
            JAXBContext jc = JAXBContext.newInstance(org.apache.fineract.CreditCheck.equifax.services.eport.ws.schemas._1.InquiryResponseType.class);
          

            IDAndContactType idAndContactType = responseType.getReportData()
                            .getIDAndContactInfo();
            if (idAndContactType != null) {
                    IdentificationType identificationType = idAndContactType
                                    .getIdentityInfo();
                    if (identificationType != null) {
                            List<IDType> panIds = identificationType.getPANId();

                            for (IDType idType : panIds) {
                                    System.out
                                                    .println("############################### PAN ID ###############################");
                                    System.out.println("idType=" + idType.getIdNumber());
                                    System.out
                                                    .println("######################################################################");
                            }
                    }
            }

            Marshaller marshaller = jc.createMarshaller();
            marshaller.setProperty(Marshaller.JAXB_FORMATTED_OUTPUT, true);

           StringWriter writer=new StringWriter();
            System.out.println("\n\n\n");
            marshaller.marshal(responseType, System.out);
          //  marshaller.marshal(responseType, new File("C:\\equifax\\abc.xml"));
            marshaller.marshal(responseType,writer);
            String response=writer.toString();
            StringReader responseReader = new StringReader(response);
            Unmarshaller unmarshaller = jc.createUnmarshaller();
         /* Response creditReport=(Response)unmarshaller.unmarshal(responseReader);
            
            
            return response;*/
            
            int numberOfAccounts=0;
            int numberOfPasDueAccounts=0;
            BigDecimal totalPastDue=java.math.BigDecimal.ZERO;
            BigDecimal totalBalanceAmount=java.math.BigDecimal.ZERO;
            BigDecimal totalWrittenOfAmount=java.math.BigDecimal.ZERO;
            String scoreValue="";
            
            InquiryResponseType creditReport=(InquiryResponseType)unmarshaller.unmarshal(responseReader);
            ReportType reportData=creditReport.getReportData();
            CreditReportSummaryType reportSummary=reportData.getAccountSummary();
            if(reportSummary.getNoOfActiveAccounts()!=null)
            {
                numberOfAccounts=reportSummary.getNoOfActiveAccounts(); 
            }
            
            if(reportSummary.getNoOfPastDueAccounts()!=null)
            {
                numberOfPasDueAccounts=reportSummary.getNoOfPastDueAccounts();
            }
          
            if(reportSummary.getTotalPastDue()!=null)
            {
                totalPastDue=reportSummary.getTotalPastDue();
            }
            
            if(reportSummary.getTotalBalanceAmount()!=null)
            {
                totalBalanceAmount=reportSummary.getTotalBalanceAmount(); 
            }
           
            if(reportSummary.getTotalWrittenOffAmount()!=null)
            {
                totalWrittenOfAmount=reportSummary.getTotalWrittenOffAmount(); 
            }
           
            if(reportData.getScore()!=null)
            {
                ScoreType score=reportData.getScore();
                 scoreValue=score.getValue();
            }
            
            
             
             AccountDetailsType accountDetails=reportData.getAccountDetails();
             List<AccountType> accounts= accountDetails.getAccount();
             List<AccountTypeData> accountData=new ArrayList<AccountTypeData>();
             
             for(AccountType account:accounts)
             {
                 
                 accountData.add(AccountTypeData.instance(account.getInstitution(), account.getAccountNumber(), account.getDisbursedAmount(), 
                         account.getLastPayment(),account.getInstallmentAmount(), account.getAccountType(), account.getCurrentBalance()));
             }
             
           
             
           return  EquifaxReportData.instance(scoreValue, numberOfAccounts, totalPastDue, totalBalanceAmount,
                     numberOfPasDueAccounts, totalWrittenOfAmount, accountData);
             
             
             
            
            

    }

    
    private static void printRequest(InquiryRequestType requestType)throws JAXBException
    {
         
        
            JAXBContext jc = JAXBContext.newInstance(org.apache.fineract.CreditCheck.equifax.services.eport.ws.schemas._1.InquiryRequestType.class);    
            
        
            Marshaller marshaller = jc.createMarshaller();
            marshaller.setProperty(Marshaller.JAXB_FORMATTED_OUTPUT, true);

            System.out.println("\n\n\n");
            marshaller.marshal(requestType, System.out);

    }
 
}
