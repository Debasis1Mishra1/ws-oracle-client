package org.premierintl.mainclient;

import java.io.InputStream;
import java.util.ArrayList;
import java.util.List;

import javax.xml.ws.BindingProvider;
import javax.xml.ws.handler.Handler;
import javax.xml.ws.handler.HandlerResolver;
import javax.xml.ws.handler.PortInfo;

import com.oracle.xmlns.apps.projects.billing.workarea.invoice.invoiceservicev2.ProjectContractInvoiceService;
import com.oracle.xmlns.apps.projects.billing.workarea.invoice.invoiceservicev2.ProjectContractInvoiceService_Service;
import com.oracle.xmlns.apps.projects.billing.workarea.invoice.invoiceservicev2.ServiceException;
import com.oracle.xmlns.apps.projects.billing.workarea.invoice.invoiceservicev2.TiebackInput;
import com.oracle.xmlns.apps.projects.billing.workarea.invoice.invoiceservicev2.TiebackOutputResult;

public class MainClient {

	public static void main(String[] args) throws Exception {
		
	ProjectContractInvoiceService_Service projectContractInvoiceService_Service = new ProjectContractInvoiceService_Service();
		
	projectContractInvoiceService_Service.setHandlerResolver( new HandlerResolver() {
        @SuppressWarnings("rawtypes")
		public List<Handler> getHandlerChain(PortInfo portInfo) {
                List<Handler> handlerList = new ArrayList<Handler>();
               handlerList.add(new WSSUsernameTokenSecurityHandler());
               return handlerList;
           }
       });
		
		ProjectContractInvoiceService projectContractInvoiceServiceI = projectContractInvoiceService_Service.getProjectContractInvoiceServiceSoapHttpPort();	
		
		BindingProvider bindingProvider = ((BindingProvider)projectContractInvoiceServiceI);
		//Map<String, Object> bindingProviderMap = bindingProvider.getRequestContext();
	
		String userName = "";
		String pwd = "";
		String excelPath = "";
		if (args.length >=3){
		  userName = args[0];
		  pwd = args[1];
		  excelPath = args[2];
		}
		else{
			throw new Exception("Please enter UserID,Password and ExcelPath");
		}
		
		bindingProvider.getRequestContext().put(BindingProvider.USERNAME_PROPERTY, userName);
		bindingProvider.getRequestContext().put(BindingProvider.PASSWORD_PROPERTY, pwd);
		
		 //Map<String, List<String>> credentials = new HashMap<String,List<String>>();
        //credentials.put(BindingProvider.USERNAME_PROPERTY, Collections.singletonList(""));
	   //credentials.put(BindingProvider.PASSWORD_PROPERTY, Collections.singletonList(""));
      //bindingProviderMap.put(MessageContext.HTTP_REQUEST_HEADERS, credentials);
		
		ExcelReaderI excelReader = new ExcelReaderImpl();
		InputStream inputStream = excelReader.getInputStreamFromPath(excelPath);
		List<TiebackInput> inputList = PremierIntlUtil.INSTANCE.readInvoiceFromExcelFile(excelReader.getWorkBookFromInputStream(inputStream, "xlsx"));
		try {
			
			TiebackOutputResult tiebackOutputResult = projectContractInvoiceServiceI.tieback(inputList);
			System.out.println(tiebackOutputResult.getMessage());
			
		} catch (ServiceException e) {
			System.out.println(e.getMessage());
			//e.printStackTrace();
		}
	}

}
