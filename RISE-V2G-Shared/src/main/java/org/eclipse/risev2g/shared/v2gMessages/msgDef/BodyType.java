/*******************************************************************************
 *  Copyright (c) 2016 Dr.-Ing. Marc Mültin.
 *  All rights reserved. This program and the accompanying materials
 *  are made available under the terms of the Eclipse Public License v1.0
 *  which accompanies this distribution, and is available at
 *  http://www.eclipse.org/legal/epl-v10.html
 *
 *  Contributors:
 *    Dr.-Ing. Marc Mültin - initial API and implementation and initial documentation
 *******************************************************************************/
//
// Diese Datei wurde mit der JavaTM Architecture for XML Binding(JAXB) Reference Implementation, v2.2.8-b130911.1802 generiert 
// Siehe <a href="http://java.sun.com/xml/jaxb">http://java.sun.com/xml/jaxb</a> 
// Änderungen an dieser Datei gehen bei einer Neukompilierung des Quellschemas verloren. 
// Generiert: 2014.10.07 um 04:55:05 PM CEST 
//


package org.eclipse.risev2g.shared.v2gMessages.msgDef;

import javax.xml.bind.JAXBElement;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElementRef;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java-Klasse für BodyType complex type.
 * 
 * <p>Das folgende Schemafragment gibt den erwarteten Content an, der in dieser Klasse enthalten ist.
 * 
 * <pre>
 * &lt;complexType name="BodyType">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element ref="{urn:iso:15118:2:2013:MsgBody}BodyElement" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "BodyType", namespace = "urn:iso:15118:2:2013:MsgBody", propOrder = {
    "bodyElement"
})
public class BodyType {

    @XmlElementRef(name = "BodyElement", namespace = "urn:iso:15118:2:2013:MsgBody", type = JAXBElement.class, required = false)
    protected JAXBElement<? extends BodyBaseType> bodyElement;

    /**
     * Ruft den Wert der bodyElement-Eigenschaft ab.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link ServiceDiscoveryReqType }{@code >}
     *     {@link JAXBElement }{@code <}{@link WeldingDetectionReqType }{@code >}
     *     {@link JAXBElement }{@code <}{@link SessionStopReqType }{@code >}
     *     {@link JAXBElement }{@code <}{@link MeteringReceiptReqType }{@code >}
     *     {@link JAXBElement }{@code <}{@link SessionStopResType }{@code >}
     *     {@link JAXBElement }{@code <}{@link CertificateInstallationResType }{@code >}
     *     {@link JAXBElement }{@code <}{@link PaymentServiceSelectionReqType }{@code >}
     *     {@link JAXBElement }{@code <}{@link ServiceDiscoveryResType }{@code >}
     *     {@link JAXBElement }{@code <}{@link PowerDeliveryReqType }{@code >}
     *     {@link JAXBElement }{@code <}{@link ServiceDetailReqType }{@code >}
     *     {@link JAXBElement }{@code <}{@link CertificateInstallationReqType }{@code >}
     *     {@link JAXBElement }{@code <}{@link ChargingStatusResType }{@code >}
     *     {@link JAXBElement }{@code <}{@link PreChargeResType }{@code >}
     *     {@link JAXBElement }{@code <}{@link ChargeParameterDiscoveryReqType }{@code >}
     *     {@link JAXBElement }{@code <}{@link PaymentDetailsResType }{@code >}
     *     {@link JAXBElement }{@code <}{@link ChargingStatusReqType }{@code >}
     *     {@link JAXBElement }{@code <}{@link PaymentServiceSelectionResType }{@code >}
     *     {@link JAXBElement }{@code <}{@link PaymentDetailsReqType }{@code >}
     *     {@link JAXBElement }{@code <}{@link ServiceDetailResType }{@code >}
     *     {@link JAXBElement }{@code <}{@link CableCheckResType }{@code >}
     *     {@link JAXBElement }{@code <}{@link ChargeParameterDiscoveryResType }{@code >}
     *     {@link JAXBElement }{@code <}{@link CurrentDemandReqType }{@code >}
     *     {@link JAXBElement }{@code <}{@link BodyBaseType }{@code >}
     *     {@link JAXBElement }{@code <}{@link CertificateUpdateReqType }{@code >}
     *     {@link JAXBElement }{@code <}{@link MeteringReceiptResType }{@code >}
     *     {@link JAXBElement }{@code <}{@link WeldingDetectionResType }{@code >}
     *     {@link JAXBElement }{@code <}{@link CableCheckReqType }{@code >}
     *     {@link JAXBElement }{@code <}{@link AuthorizationResType }{@code >}
     *     {@link JAXBElement }{@code <}{@link PowerDeliveryResType }{@code >}
     *     {@link JAXBElement }{@code <}{@link SessionSetupReqType }{@code >}
     *     {@link JAXBElement }{@code <}{@link AuthorizationReqType }{@code >}
     *     {@link JAXBElement }{@code <}{@link PreChargeReqType }{@code >}
     *     {@link JAXBElement }{@code <}{@link CertificateUpdateResType }{@code >}
     *     {@link JAXBElement }{@code <}{@link SessionSetupResType }{@code >}
     *     {@link JAXBElement }{@code <}{@link CurrentDemandResType }{@code >}
     *     
     */
    public JAXBElement<? extends BodyBaseType> getBodyElement() {
        return bodyElement;
    }

    /**
     * Legt den Wert der bodyElement-Eigenschaft fest.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link ServiceDiscoveryReqType }{@code >}
     *     {@link JAXBElement }{@code <}{@link WeldingDetectionReqType }{@code >}
     *     {@link JAXBElement }{@code <}{@link SessionStopReqType }{@code >}
     *     {@link JAXBElement }{@code <}{@link MeteringReceiptReqType }{@code >}
     *     {@link JAXBElement }{@code <}{@link SessionStopResType }{@code >}
     *     {@link JAXBElement }{@code <}{@link CertificateInstallationResType }{@code >}
     *     {@link JAXBElement }{@code <}{@link PaymentServiceSelectionReqType }{@code >}
     *     {@link JAXBElement }{@code <}{@link ServiceDiscoveryResType }{@code >}
     *     {@link JAXBElement }{@code <}{@link PowerDeliveryReqType }{@code >}
     *     {@link JAXBElement }{@code <}{@link ServiceDetailReqType }{@code >}
     *     {@link JAXBElement }{@code <}{@link CertificateInstallationReqType }{@code >}
     *     {@link JAXBElement }{@code <}{@link ChargingStatusResType }{@code >}
     *     {@link JAXBElement }{@code <}{@link PreChargeResType }{@code >}
     *     {@link JAXBElement }{@code <}{@link ChargeParameterDiscoveryReqType }{@code >}
     *     {@link JAXBElement }{@code <}{@link PaymentDetailsResType }{@code >}
     *     {@link JAXBElement }{@code <}{@link ChargingStatusReqType }{@code >}
     *     {@link JAXBElement }{@code <}{@link PaymentServiceSelectionResType }{@code >}
     *     {@link JAXBElement }{@code <}{@link PaymentDetailsReqType }{@code >}
     *     {@link JAXBElement }{@code <}{@link ServiceDetailResType }{@code >}
     *     {@link JAXBElement }{@code <}{@link CableCheckResType }{@code >}
     *     {@link JAXBElement }{@code <}{@link ChargeParameterDiscoveryResType }{@code >}
     *     {@link JAXBElement }{@code <}{@link CurrentDemandReqType }{@code >}
     *     {@link JAXBElement }{@code <}{@link BodyBaseType }{@code >}
     *     {@link JAXBElement }{@code <}{@link CertificateUpdateReqType }{@code >}
     *     {@link JAXBElement }{@code <}{@link MeteringReceiptResType }{@code >}
     *     {@link JAXBElement }{@code <}{@link WeldingDetectionResType }{@code >}
     *     {@link JAXBElement }{@code <}{@link CableCheckReqType }{@code >}
     *     {@link JAXBElement }{@code <}{@link AuthorizationResType }{@code >}
     *     {@link JAXBElement }{@code <}{@link PowerDeliveryResType }{@code >}
     *     {@link JAXBElement }{@code <}{@link SessionSetupReqType }{@code >}
     *     {@link JAXBElement }{@code <}{@link AuthorizationReqType }{@code >}
     *     {@link JAXBElement }{@code <}{@link PreChargeReqType }{@code >}
     *     {@link JAXBElement }{@code <}{@link CertificateUpdateResType }{@code >}
     *     {@link JAXBElement }{@code <}{@link SessionSetupResType }{@code >}
     *     {@link JAXBElement }{@code <}{@link CurrentDemandResType }{@code >}
     *     
     */
    public void setBodyElement(JAXBElement<? extends BodyBaseType> value) {
        this.bodyElement = value;
    }

}
