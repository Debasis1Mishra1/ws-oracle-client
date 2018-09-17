package org.grubhub.mainclient;

import java.util.ArrayList;
import java.util.List;
import java.util.Map;

import javax.xml.bind.JAXBElement;
import javax.xml.ws.BindingProvider;
import javax.xml.ws.handler.Handler;
import javax.xml.ws.handler.HandlerResolver;
import javax.xml.ws.handler.PortInfo;

import com.oracle.xmlns.apps.projects.billing.workarea.invoice.invoiceservicev2.ObjectFactory;
import com.oracle.xmlns.apps.projects.billing.workarea.invoice.invoiceservicev2.ProjectContractInvoiceService;
import com.oracle.xmlns.apps.projects.billing.workarea.invoice.invoiceservicev2.ProjectContractInvoiceService_Service;
import com.oracle.xmlns.apps.projects.billing.workarea.invoice.invoiceservicev2.ServiceException;
import com.oracle.xmlns.apps.projects.billing.workarea.invoice.invoiceservicev2.TiebackInput;
import com.oracle.xmlns.apps.projects.billing.workarea.invoice.invoiceservicev2.TiebackOutputResult;

public class MainClient {

	public static void main(String[] args) {
		
		
	//	SecurityPolicyFeature[] securityFeatures = new SecurityPolicyFeature[] { new SecurityPolicyFeature("oracle/wss11_saml_or_username_token_with_message_protection_service_policy") };
		
		ProjectContractInvoiceService_Service projectContractInvoiceService_Service = new ProjectContractInvoiceService_Service();
		
	projectContractInvoiceService_Service.setHandlerResolver( new HandlerResolver() {
           public List<Handler> getHandlerChain(PortInfo portInfo) {
                List<Handler> handlerList = new ArrayList<Handler>();
               handlerList.add(new WSSUsernameTokenSecurityHandler());
               return handlerList;
           }
       });
		
		
		ProjectContractInvoiceService projectContractInvoiceServiceI = projectContractInvoiceService_Service.getProjectContractInvoiceServiceSoapHttpPort();	
		
		BindingProvider bindingProvider = ((BindingProvider)projectContractInvoiceServiceI);
		Map<String, Object> bindingProviderMap = bindingProvider.getRequestContext();
	//	bindingProviderMap.put(BindingProvider.ENDPOINT_ADDRESS_PROPERTY, "https://egup-dev9.fa.us2.oraclecloud.com/fscmService/ProjectContractInvoiceService?WSDL");
//		 System.out.println(((BindingProvider)projectContractInvoiceServiceI).getEndpointReference().toString());
		
		bindingProvider.getRequestContext().put(BindingProvider.USERNAME_PROPERTY, "Nick_Virgilio@premierintl.com");
		bindingProvider.getRequestContext().put(BindingProvider.PASSWORD_PROPERTY, "Vertiv2018");
		
		 //Map<String, List<String>> credentials = new HashMap<String,List<String>>();

	//credentials.put(BindingProvider.USERNAME_PROPERTY, Collections.singletonList("Nick_Virgilio@premierintl.com"));
	//credentials.put(BindingProvider.PASSWORD_PROPERTY, Collections.singletonList("Vertiv2018"));

    //	bindingProviderMap.put(MessageContext.HTTP_REQUEST_HEADERS, credentials);
		
		//TODO - Read CSV rows and then pass the value to TiebackInput
		
		//create TiebackInput object
		ObjectFactory objectFactory = new ObjectFactory();
		JAXBElement<String> contractTypeName = objectFactory.createTiebackInputContractTypeName("Vertiv Projects Contract");
		JAXBElement<String> contractNumber = objectFactory.createTiebackInputContractNumber("0000598067");
		JAXBElement<Long> invoiceNumber = objectFactory.createTiebackInputInvoiceNumber(Long.parseLong("2"));
		JAXBElement<Long> invoiceId = objectFactory.createTiebackInputInvoiceId(Long.parseLong("100000039054352"));
		JAXBElement<String> raInvoiceNumber = objectFactory.createTiebackInputRaInvoiceNumber("13");
		//JAXBElement<Long> systemReference = objectFactory.createTiebackInputSystemReference(Long.parseLong(""));
		JAXBElement<String> transferCode = objectFactory.createTiebackInputTransferStatusCode("A");
		
		TiebackInput tiebackInput = objectFactory.createTiebackInput();
		tiebackInput.setContractTypeName(contractTypeName);
		tiebackInput.setContractNumber(contractNumber);
		tiebackInput.setInvoiceNumber(invoiceNumber);
		tiebackInput.setInvoiceId(invoiceId);
		tiebackInput.setRaInvoiceNumber(raInvoiceNumber);
		//tiebackInput.setSystemReference(systemReference);
		tiebackInput.setTransferStatusCode(transferCode);
		
		List<TiebackInput> tiebackInputList = new ArrayList<TiebackInput>();
		tiebackInputList.add(tiebackInput);
		
		try {
			TiebackOutputResult tiebackOutputResult = projectContractInvoiceServiceI.tieback(tiebackInputList);
			System.out.println(tiebackOutputResult.getMessage());
		} catch (ServiceException e) {
			System.out.println(e.getMessage());
			//e.printStackTrace();
		}
	}

}
