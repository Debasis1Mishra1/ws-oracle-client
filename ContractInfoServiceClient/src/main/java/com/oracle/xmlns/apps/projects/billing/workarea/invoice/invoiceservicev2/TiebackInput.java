
package com.oracle.xmlns.apps.projects.billing.workarea.invoice.invoiceservicev2;

import javax.xml.bind.JAXBElement;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElementRef;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for TiebackInput complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="TiebackInput">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="ContractTypeName" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="ContractNumber" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="InvoiceNumber" type="{http://www.w3.org/2001/XMLSchema}long" minOccurs="0"/>
 *         &lt;element name="InvoiceId" type="{http://www.w3.org/2001/XMLSchema}long" minOccurs="0"/>
 *         &lt;element name="RaInvoiceNumber" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="SystemReference" type="{http://www.w3.org/2001/XMLSchema}long" minOccurs="0"/>
 *         &lt;element name="TransferStatusCode" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "TiebackInput", propOrder = {
    "contractTypeName",
    "contractNumber",
    "invoiceNumber",
    "invoiceId",
    "raInvoiceNumber",
    "systemReference",
    "transferStatusCode"
})
public class TiebackInput {

    @XmlElementRef(name = "ContractTypeName", namespace = "http://xmlns.oracle.com/apps/projects/billing/workarea/invoice/invoiceServiceV2/", type = JAXBElement.class, required = false)
    protected JAXBElement<String> contractTypeName;
    @XmlElementRef(name = "ContractNumber", namespace = "http://xmlns.oracle.com/apps/projects/billing/workarea/invoice/invoiceServiceV2/", type = JAXBElement.class, required = false)
    protected JAXBElement<String> contractNumber;
    @XmlElementRef(name = "InvoiceNumber", namespace = "http://xmlns.oracle.com/apps/projects/billing/workarea/invoice/invoiceServiceV2/", type = JAXBElement.class, required = false)
    protected JAXBElement<Long> invoiceNumber;
    @XmlElementRef(name = "InvoiceId", namespace = "http://xmlns.oracle.com/apps/projects/billing/workarea/invoice/invoiceServiceV2/", type = JAXBElement.class, required = false)
    protected JAXBElement<Long> invoiceId;
    @XmlElementRef(name = "RaInvoiceNumber", namespace = "http://xmlns.oracle.com/apps/projects/billing/workarea/invoice/invoiceServiceV2/", type = JAXBElement.class, required = false)
    protected JAXBElement<String> raInvoiceNumber;
    @XmlElementRef(name = "SystemReference", namespace = "http://xmlns.oracle.com/apps/projects/billing/workarea/invoice/invoiceServiceV2/", type = JAXBElement.class, required = false)
    protected JAXBElement<Long> systemReference;
    @XmlElementRef(name = "TransferStatusCode", namespace = "http://xmlns.oracle.com/apps/projects/billing/workarea/invoice/invoiceServiceV2/", type = JAXBElement.class, required = false)
    protected JAXBElement<String> transferStatusCode;

    /**
     * Gets the value of the contractTypeName property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public JAXBElement<String> getContractTypeName() {
        return contractTypeName;
    }

    /**
     * Sets the value of the contractTypeName property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public void setContractTypeName(JAXBElement<String> value) {
        this.contractTypeName = value;
    }

    /**
     * Gets the value of the contractNumber property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public JAXBElement<String> getContractNumber() {
        return contractNumber;
    }

    /**
     * Sets the value of the contractNumber property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public void setContractNumber(JAXBElement<String> value) {
        this.contractNumber = value;
    }

    /**
     * Gets the value of the invoiceNumber property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link Long }{@code >}
     *     
     */
    public JAXBElement<Long> getInvoiceNumber() {
        return invoiceNumber;
    }

    /**
     * Sets the value of the invoiceNumber property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link Long }{@code >}
     *     
     */
    public void setInvoiceNumber(JAXBElement<Long> value) {
        this.invoiceNumber = value;
    }

    /**
     * Gets the value of the invoiceId property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link Long }{@code >}
     *     
     */
    public JAXBElement<Long> getInvoiceId() {
        return invoiceId;
    }

    /**
     * Sets the value of the invoiceId property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link Long }{@code >}
     *     
     */
    public void setInvoiceId(JAXBElement<Long> value) {
        this.invoiceId = value;
    }

    /**
     * Gets the value of the raInvoiceNumber property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public JAXBElement<String> getRaInvoiceNumber() {
        return raInvoiceNumber;
    }

    /**
     * Sets the value of the raInvoiceNumber property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public void setRaInvoiceNumber(JAXBElement<String> value) {
        this.raInvoiceNumber = value;
    }

    /**
     * Gets the value of the systemReference property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link Long }{@code >}
     *     
     */
    public JAXBElement<Long> getSystemReference() {
        return systemReference;
    }

    /**
     * Sets the value of the systemReference property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link Long }{@code >}
     *     
     */
    public void setSystemReference(JAXBElement<Long> value) {
        this.systemReference = value;
    }

    /**
     * Gets the value of the transferStatusCode property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public JAXBElement<String> getTransferStatusCode() {
        return transferStatusCode;
    }

    /**
     * Sets the value of the transferStatusCode property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public void setTransferStatusCode(JAXBElement<String> value) {
        this.transferStatusCode = value;
    }

}
