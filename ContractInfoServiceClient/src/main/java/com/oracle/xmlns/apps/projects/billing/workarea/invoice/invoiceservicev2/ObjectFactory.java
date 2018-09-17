
package com.oracle.xmlns.apps.projects.billing.workarea.invoice.invoiceservicev2;

import javax.xml.bind.JAXBElement;
import javax.xml.bind.annotation.XmlElementDecl;
import javax.xml.bind.annotation.XmlRegistry;
import javax.xml.namespace.QName;


/**
 * This object contains factory methods for each 
 * Java content interface and Java element interface 
 * generated in the com.oracle.xmlns.apps.projects.billing.workarea.invoice.invoiceservicev2 package. 
 * <p>An ObjectFactory allows you to programatically 
 * construct new instances of the Java representation 
 * for XML content. The Java representation of XML 
 * content can consist of schema derived interfaces 
 * and classes representing the binding of schema 
 * type definitions, element declarations and model 
 * groups.  Factory methods for each of these are 
 * provided in this class.
 * 
 */
@XmlRegistry
public class ObjectFactory {

    private final static QName _TiebackInputResult_QNAME = new QName("http://xmlns.oracle.com/apps/projects/billing/workarea/invoice/invoiceServiceV2/", "tiebackInputResult");
    private final static QName _TiebackOutput_QNAME = new QName("http://xmlns.oracle.com/apps/projects/billing/workarea/invoice/invoiceServiceV2/", "tiebackOutput");
    private final static QName _TiebackInput_QNAME = new QName("http://xmlns.oracle.com/apps/projects/billing/workarea/invoice/invoiceServiceV2/", "tiebackInput");
    private final static QName _TiebackOutputResult_QNAME = new QName("http://xmlns.oracle.com/apps/projects/billing/workarea/invoice/invoiceServiceV2/", "tiebackOutputResult");
    private final static QName _TiebackInputRaInvoiceNumber_QNAME = new QName("http://xmlns.oracle.com/apps/projects/billing/workarea/invoice/invoiceServiceV2/", "RaInvoiceNumber");
    private final static QName _TiebackInputContractTypeName_QNAME = new QName("http://xmlns.oracle.com/apps/projects/billing/workarea/invoice/invoiceServiceV2/", "ContractTypeName");
    private final static QName _TiebackInputInvoiceNumber_QNAME = new QName("http://xmlns.oracle.com/apps/projects/billing/workarea/invoice/invoiceServiceV2/", "InvoiceNumber");
    private final static QName _TiebackInputInvoiceId_QNAME = new QName("http://xmlns.oracle.com/apps/projects/billing/workarea/invoice/invoiceServiceV2/", "InvoiceId");
    private final static QName _TiebackInputTransferStatusCode_QNAME = new QName("http://xmlns.oracle.com/apps/projects/billing/workarea/invoice/invoiceServiceV2/", "TransferStatusCode");
    private final static QName _TiebackInputSystemReference_QNAME = new QName("http://xmlns.oracle.com/apps/projects/billing/workarea/invoice/invoiceServiceV2/", "SystemReference");
    private final static QName _TiebackInputContractNumber_QNAME = new QName("http://xmlns.oracle.com/apps/projects/billing/workarea/invoice/invoiceServiceV2/", "ContractNumber");
    private final static QName _TiebackOutputResultStatus_QNAME = new QName("http://xmlns.oracle.com/apps/projects/billing/workarea/invoice/invoiceServiceV2/", "ResultStatus");
    private final static QName _TiebackOutputMessageData_QNAME = new QName("http://xmlns.oracle.com/apps/projects/billing/workarea/invoice/invoiceServiceV2/", "MessageData");

    /**
     * Create a new ObjectFactory that can be used to create new instances of schema derived classes for package: com.oracle.xmlns.apps.projects.billing.workarea.invoice.invoiceservicev2
     * 
     */
    public ObjectFactory() {
    }

    /**
     * Create an instance of {@link TiebackOutputResult }
     * 
     */
    public TiebackOutputResult createTiebackOutputResult() {
        return new TiebackOutputResult();
    }

    /**
     * Create an instance of {@link TiebackInput }
     * 
     */
    public TiebackInput createTiebackInput() {
        return new TiebackInput();
    }

    /**
     * Create an instance of {@link TiebackInputResult }
     * 
     */
    public TiebackInputResult createTiebackInputResult() {
        return new TiebackInputResult();
    }

    /**
     * Create an instance of {@link TiebackOutput }
     * 
     */
    public TiebackOutput createTiebackOutput() {
        return new TiebackOutput();
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link TiebackInputResult }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://xmlns.oracle.com/apps/projects/billing/workarea/invoice/invoiceServiceV2/", name = "tiebackInputResult")
    public JAXBElement<TiebackInputResult> createTiebackInputResult(TiebackInputResult value) {
        return new JAXBElement<TiebackInputResult>(_TiebackInputResult_QNAME, TiebackInputResult.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link TiebackOutput }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://xmlns.oracle.com/apps/projects/billing/workarea/invoice/invoiceServiceV2/", name = "tiebackOutput")
    public JAXBElement<TiebackOutput> createTiebackOutput(TiebackOutput value) {
        return new JAXBElement<TiebackOutput>(_TiebackOutput_QNAME, TiebackOutput.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link TiebackInput }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://xmlns.oracle.com/apps/projects/billing/workarea/invoice/invoiceServiceV2/", name = "tiebackInput")
    public JAXBElement<TiebackInput> createTiebackInput(TiebackInput value) {
        return new JAXBElement<TiebackInput>(_TiebackInput_QNAME, TiebackInput.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link TiebackOutputResult }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://xmlns.oracle.com/apps/projects/billing/workarea/invoice/invoiceServiceV2/", name = "tiebackOutputResult")
    public JAXBElement<TiebackOutputResult> createTiebackOutputResult(TiebackOutputResult value) {
        return new JAXBElement<TiebackOutputResult>(_TiebackOutputResult_QNAME, TiebackOutputResult.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://xmlns.oracle.com/apps/projects/billing/workarea/invoice/invoiceServiceV2/", name = "RaInvoiceNumber", scope = TiebackInput.class)
    public JAXBElement<String> createTiebackInputRaInvoiceNumber(String value) {
        return new JAXBElement<String>(_TiebackInputRaInvoiceNumber_QNAME, String.class, TiebackInput.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://xmlns.oracle.com/apps/projects/billing/workarea/invoice/invoiceServiceV2/", name = "ContractTypeName", scope = TiebackInput.class)
    public JAXBElement<String> createTiebackInputContractTypeName(String value) {
        return new JAXBElement<String>(_TiebackInputContractTypeName_QNAME, String.class, TiebackInput.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link Long }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://xmlns.oracle.com/apps/projects/billing/workarea/invoice/invoiceServiceV2/", name = "InvoiceNumber", scope = TiebackInput.class)
    public JAXBElement<Long> createTiebackInputInvoiceNumber(Long value) {
        return new JAXBElement<Long>(_TiebackInputInvoiceNumber_QNAME, Long.class, TiebackInput.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link Long }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://xmlns.oracle.com/apps/projects/billing/workarea/invoice/invoiceServiceV2/", name = "InvoiceId", scope = TiebackInput.class)
    public JAXBElement<Long> createTiebackInputInvoiceId(Long value) {
        return new JAXBElement<Long>(_TiebackInputInvoiceId_QNAME, Long.class, TiebackInput.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://xmlns.oracle.com/apps/projects/billing/workarea/invoice/invoiceServiceV2/", name = "TransferStatusCode", scope = TiebackInput.class)
    public JAXBElement<String> createTiebackInputTransferStatusCode(String value) {
        return new JAXBElement<String>(_TiebackInputTransferStatusCode_QNAME, String.class, TiebackInput.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link Long }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://xmlns.oracle.com/apps/projects/billing/workarea/invoice/invoiceServiceV2/", name = "SystemReference", scope = TiebackInput.class)
    public JAXBElement<Long> createTiebackInputSystemReference(Long value) {
        return new JAXBElement<Long>(_TiebackInputSystemReference_QNAME, Long.class, TiebackInput.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://xmlns.oracle.com/apps/projects/billing/workarea/invoice/invoiceServiceV2/", name = "ContractNumber", scope = TiebackInput.class)
    public JAXBElement<String> createTiebackInputContractNumber(String value) {
        return new JAXBElement<String>(_TiebackInputContractNumber_QNAME, String.class, TiebackInput.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://xmlns.oracle.com/apps/projects/billing/workarea/invoice/invoiceServiceV2/", name = "RaInvoiceNumber", scope = TiebackOutput.class)
    public JAXBElement<String> createTiebackOutputRaInvoiceNumber(String value) {
        return new JAXBElement<String>(_TiebackInputRaInvoiceNumber_QNAME, String.class, TiebackOutput.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://xmlns.oracle.com/apps/projects/billing/workarea/invoice/invoiceServiceV2/", name = "ContractTypeName", scope = TiebackOutput.class)
    public JAXBElement<String> createTiebackOutputContractTypeName(String value) {
        return new JAXBElement<String>(_TiebackInputContractTypeName_QNAME, String.class, TiebackOutput.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link Long }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://xmlns.oracle.com/apps/projects/billing/workarea/invoice/invoiceServiceV2/", name = "InvoiceNumber", scope = TiebackOutput.class)
    public JAXBElement<Long> createTiebackOutputInvoiceNumber(Long value) {
        return new JAXBElement<Long>(_TiebackInputInvoiceNumber_QNAME, Long.class, TiebackOutput.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link Long }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://xmlns.oracle.com/apps/projects/billing/workarea/invoice/invoiceServiceV2/", name = "InvoiceId", scope = TiebackOutput.class)
    public JAXBElement<Long> createTiebackOutputInvoiceId(Long value) {
        return new JAXBElement<Long>(_TiebackInputInvoiceId_QNAME, Long.class, TiebackOutput.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://xmlns.oracle.com/apps/projects/billing/workarea/invoice/invoiceServiceV2/", name = "TransferStatusCode", scope = TiebackOutput.class)
    public JAXBElement<String> createTiebackOutputTransferStatusCode(String value) {
        return new JAXBElement<String>(_TiebackInputTransferStatusCode_QNAME, String.class, TiebackOutput.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link Long }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://xmlns.oracle.com/apps/projects/billing/workarea/invoice/invoiceServiceV2/", name = "SystemReference", scope = TiebackOutput.class)
    public JAXBElement<Long> createTiebackOutputSystemReference(Long value) {
        return new JAXBElement<Long>(_TiebackInputSystemReference_QNAME, Long.class, TiebackOutput.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://xmlns.oracle.com/apps/projects/billing/workarea/invoice/invoiceServiceV2/", name = "ContractNumber", scope = TiebackOutput.class)
    public JAXBElement<String> createTiebackOutputContractNumber(String value) {
        return new JAXBElement<String>(_TiebackInputContractNumber_QNAME, String.class, TiebackOutput.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://xmlns.oracle.com/apps/projects/billing/workarea/invoice/invoiceServiceV2/", name = "ResultStatus", scope = TiebackOutput.class)
    public JAXBElement<String> createTiebackOutputResultStatus(String value) {
        return new JAXBElement<String>(_TiebackOutputResultStatus_QNAME, String.class, TiebackOutput.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://xmlns.oracle.com/apps/projects/billing/workarea/invoice/invoiceServiceV2/", name = "MessageData", scope = TiebackOutput.class)
    public JAXBElement<String> createTiebackOutputMessageData(String value) {
        return new JAXBElement<String>(_TiebackOutputMessageData_QNAME, String.class, TiebackOutput.class, value);
    }

}
