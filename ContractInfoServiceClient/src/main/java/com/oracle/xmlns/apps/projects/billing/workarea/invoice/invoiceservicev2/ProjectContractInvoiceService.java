
package com.oracle.xmlns.apps.projects.billing.workarea.invoice.invoiceservicev2;

import java.util.List;
import javax.jws.Oneway;
import javax.jws.WebMethod;
import javax.jws.WebParam;
import javax.jws.WebResult;
import javax.jws.WebService;
import javax.xml.bind.annotation.XmlSeeAlso;
import javax.xml.datatype.XMLGregorianCalendar;
import javax.xml.ws.RequestWrapper;
import javax.xml.ws.ResponseWrapper;
import com.oracle.xmlns.adf.svc.types.ObjAttrHints;
import com.oracle.xmlns.adf.svc.types.ServiceViewInfo;


/**
 * This class was generated by the JAX-WS RI.
 * JAX-WS RI 2.2.9-b130926.1035
 * Generated source version: 2.2
 * 
 */
@WebService(name = "ProjectContractInvoiceService", targetNamespace = "http://xmlns.oracle.com/apps/projects/billing/workarea/invoice/invoiceServiceV2/")
@XmlSeeAlso({
    com.oracle.xmlns.adf.svc.errors.ObjectFactory.class,
    com.oracle.xmlns.adf.svc.types.ObjectFactory.class,
    com.oracle.xmlns.apps.projects.billing.workarea.invoice.invoiceservicev2.ObjectFactory.class,
    com.oracle.xmlns.apps.projects.billing.workarea.invoice.invoiceservicev2.types.ObjectFactory.class,
    com.oracle.xmlns.oracleas.schema.oracle_fault_11_0.ObjectFactory.class,
    sdo.commonj.ObjectFactory.class,
    sdo.commonj.java.ObjectFactory.class,
    sdo.commonj.xml.ObjectFactory.class
})
public interface ProjectContractInvoiceService {


    /**
     * 
     * @param invoice
     * @return
     *     returns com.oracle.xmlns.apps.projects.billing.workarea.invoice.invoiceservicev2.TiebackOutputResult
     * @throws ServiceException
     */
    @WebMethod(action = "http://xmlns.oracle.com/apps/projects/billing/workarea/invoice/invoiceServiceV2/tieback")
    @WebResult(name = "result", targetNamespace = "http://xmlns.oracle.com/apps/projects/billing/workarea/invoice/invoiceServiceV2/types/")
    @RequestWrapper(localName = "tieback", targetNamespace = "http://xmlns.oracle.com/apps/projects/billing/workarea/invoice/invoiceServiceV2/types/", className = "com.oracle.xmlns.apps.projects.billing.workarea.invoice.invoiceservicev2.types.Tieback")
    @ResponseWrapper(localName = "tiebackResponse", targetNamespace = "http://xmlns.oracle.com/apps/projects/billing/workarea/invoice/invoiceServiceV2/types/", className = "com.oracle.xmlns.apps.projects.billing.workarea.invoice.invoiceservicev2.types.TiebackResponse")
    public TiebackOutputResult tieback(
        @WebParam(name = "Invoice", targetNamespace = "http://xmlns.oracle.com/apps/projects/billing/workarea/invoice/invoiceServiceV2/types/")
        List<TiebackInput> invoice)
        throws ServiceException
    ;

    /**
     * 
     * @param invoice
     */
    @WebMethod(action = "http://xmlns.oracle.com/apps/projects/billing/workarea/invoice/invoiceServiceV2/tiebackAsync")
    @Oneway
    @RequestWrapper(localName = "tiebackAsync", targetNamespace = "http://xmlns.oracle.com/apps/projects/billing/workarea/invoice/invoiceServiceV2/types/", className = "com.oracle.xmlns.apps.projects.billing.workarea.invoice.invoiceservicev2.types.TiebackAsync")
    public void tiebackAsync(
        @WebParam(name = "Invoice", targetNamespace = "http://xmlns.oracle.com/apps/projects/billing/workarea/invoice/invoiceServiceV2/types/")
        List<TiebackInput> invoice);

    /**
     * 
     * @param viewName
     * @param localeName
     * @return
     *     returns com.oracle.xmlns.adf.svc.types.ObjAttrHints
     * @throws ServiceException
     */
    @WebMethod(action = "http://xmlns.oracle.com/apps/projects/billing/workarea/invoice/invoiceServiceV2/getDfltObjAttrHints")
    @WebResult(name = "result", targetNamespace = "http://xmlns.oracle.com/apps/projects/billing/workarea/invoice/invoiceServiceV2/types/")
    @RequestWrapper(localName = "getDfltObjAttrHints", targetNamespace = "http://xmlns.oracle.com/apps/projects/billing/workarea/invoice/invoiceServiceV2/types/", className = "com.oracle.xmlns.apps.projects.billing.workarea.invoice.invoiceservicev2.types.GetDfltObjAttrHints")
    @ResponseWrapper(localName = "getDfltObjAttrHintsResponse", targetNamespace = "http://xmlns.oracle.com/apps/projects/billing/workarea/invoice/invoiceServiceV2/types/", className = "com.oracle.xmlns.apps.projects.billing.workarea.invoice.invoiceservicev2.types.GetDfltObjAttrHintsResponse")
    public ObjAttrHints getDfltObjAttrHints(
        @WebParam(name = "viewName", targetNamespace = "http://xmlns.oracle.com/apps/projects/billing/workarea/invoice/invoiceServiceV2/types/")
        String viewName,
        @WebParam(name = "localeName", targetNamespace = "http://xmlns.oracle.com/apps/projects/billing/workarea/invoice/invoiceServiceV2/types/")
        String localeName)
        throws ServiceException
    ;

    /**
     * 
     * @return
     *     returns javax.xml.datatype.XMLGregorianCalendar
     * @throws ServiceException
     */
    @WebMethod(action = "http://xmlns.oracle.com/apps/projects/billing/workarea/invoice/invoiceServiceV2/getServiceLastUpdateTime")
    @WebResult(name = "result", targetNamespace = "http://xmlns.oracle.com/apps/projects/billing/workarea/invoice/invoiceServiceV2/types/")
    @RequestWrapper(localName = "getServiceLastUpdateTime", targetNamespace = "http://xmlns.oracle.com/apps/projects/billing/workarea/invoice/invoiceServiceV2/types/", className = "com.oracle.xmlns.apps.projects.billing.workarea.invoice.invoiceservicev2.types.GetServiceLastUpdateTime")
    @ResponseWrapper(localName = "getServiceLastUpdateTimeResponse", targetNamespace = "http://xmlns.oracle.com/apps/projects/billing/workarea/invoice/invoiceServiceV2/types/", className = "com.oracle.xmlns.apps.projects.billing.workarea.invoice.invoiceservicev2.types.GetServiceLastUpdateTimeResponse")
    public XMLGregorianCalendar getServiceLastUpdateTime()
        throws ServiceException
    ;

    /**
     * 
     * @return
     *     returns java.util.List<com.oracle.xmlns.adf.svc.types.ServiceViewInfo>
     * @throws ServiceException
     */
    @WebMethod(action = "http://xmlns.oracle.com/apps/projects/billing/workarea/invoice/invoiceServiceV2/getEntityList")
    @WebResult(name = "result", targetNamespace = "http://xmlns.oracle.com/apps/projects/billing/workarea/invoice/invoiceServiceV2/types/")
    @RequestWrapper(localName = "getEntityList", targetNamespace = "http://xmlns.oracle.com/apps/projects/billing/workarea/invoice/invoiceServiceV2/types/", className = "com.oracle.xmlns.apps.projects.billing.workarea.invoice.invoiceservicev2.types.GetEntityList")
    @ResponseWrapper(localName = "getEntityListResponse", targetNamespace = "http://xmlns.oracle.com/apps/projects/billing/workarea/invoice/invoiceServiceV2/types/", className = "com.oracle.xmlns.apps.projects.billing.workarea.invoice.invoiceservicev2.types.GetEntityListResponse")
    public List<ServiceViewInfo> getEntityList()
        throws ServiceException
    ;

    /**
     * 
     */
    @WebMethod(action = "http://xmlns.oracle.com/apps/projects/billing/workarea/invoice/invoiceServiceV2/getEntityListAsync")
    @Oneway
    @RequestWrapper(localName = "getEntityListAsync", targetNamespace = "http://xmlns.oracle.com/apps/projects/billing/workarea/invoice/invoiceServiceV2/types/", className = "com.oracle.xmlns.apps.projects.billing.workarea.invoice.invoiceservicev2.types.GetEntityListAsync")
    public void getEntityListAsync();

    /**
     * 
     * @param viewName
     * @param localeName
     */
    @WebMethod(action = "http://xmlns.oracle.com/apps/projects/billing/workarea/invoice/invoiceServiceV2/getDfltObjAttrHintsAsync")
    @Oneway
    @RequestWrapper(localName = "getDfltObjAttrHintsAsync", targetNamespace = "http://xmlns.oracle.com/apps/projects/billing/workarea/invoice/invoiceServiceV2/types/", className = "com.oracle.xmlns.apps.projects.billing.workarea.invoice.invoiceservicev2.types.GetDfltObjAttrHintsAsync")
    public void getDfltObjAttrHintsAsync(
        @WebParam(name = "viewName", targetNamespace = "http://xmlns.oracle.com/apps/projects/billing/workarea/invoice/invoiceServiceV2/types/")
        String viewName,
        @WebParam(name = "localeName", targetNamespace = "http://xmlns.oracle.com/apps/projects/billing/workarea/invoice/invoiceServiceV2/types/")
        String localeName);

    /**
     * 
     */
    @WebMethod(action = "http://xmlns.oracle.com/apps/projects/billing/workarea/invoice/invoiceServiceV2/getServiceLastUpdateTimeAsync")
    @Oneway
    @RequestWrapper(localName = "getServiceLastUpdateTimeAsync", targetNamespace = "http://xmlns.oracle.com/apps/projects/billing/workarea/invoice/invoiceServiceV2/types/", className = "com.oracle.xmlns.apps.projects.billing.workarea.invoice.invoiceservicev2.types.GetServiceLastUpdateTimeAsync")
    public void getServiceLastUpdateTimeAsync();

}
