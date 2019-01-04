
package com.cs.tmt.service.api;

import javax.xml.bind.JAXBElement;
import javax.xml.bind.annotation.XmlElementDecl;
import javax.xml.bind.annotation.XmlRegistry;
import javax.xml.namespace.QName;


/**
 * This object contains factory methods for each 
 * Java content interface and Java element interface 
 * generated in the com.cs.tmt.service.api package. 
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

    private final static QName _Employee_QNAME = new QName("http://api.service.tmt.cs.com/", "employee");
    private final static QName _GetInfoDataDetails_QNAME = new QName("http://api.service.tmt.cs.com/", "getInfoDataDetails");
    private final static QName _GetInfoDataDetailsResponse_QNAME = new QName("http://api.service.tmt.cs.com/", "getInfoDataDetailsResponse");
    private final static QName _GetInfoDataVersion_QNAME = new QName("http://api.service.tmt.cs.com/", "getInfoDataVersion");
    private final static QName _GetInfoDataVersionResponse_QNAME = new QName("http://api.service.tmt.cs.com/", "getInfoDataVersionResponse");

    /**
     * Create a new ObjectFactory that can be used to create new instances of schema derived classes for package: com.cs.tmt.service.api
     * 
     */
    public ObjectFactory() {
    }

    /**
     * Create an instance of {@link InfoData }
     * 
     */
    public InfoData createInfoData() {
        return new InfoData();
    }

    /**
     * Create an instance of {@link GetInfoDataDetails }
     * 
     */
    public GetInfoDataDetails createGetInfoDataDetails() {
        return new GetInfoDataDetails();
    }

    /**
     * Create an instance of {@link GetInfoDataDetailsResponse }
     * 
     */
    public GetInfoDataDetailsResponse createGetInfoDataDetailsResponse() {
        return new GetInfoDataDetailsResponse();
    }

    /**
     * Create an instance of {@link GetInfoDataVersion }
     * 
     */
    public GetInfoDataVersion createGetInfoDataVersion() {
        return new GetInfoDataVersion();
    }

    /**
     * Create an instance of {@link GetInfoDataVersionResponse }
     * 
     */
    public GetInfoDataVersionResponse createGetInfoDataVersionResponse() {
        return new GetInfoDataVersionResponse();
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link InfoData }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://api.service.tmt.cs.com/", name = "employee")
    public JAXBElement<InfoData> createEmployee(InfoData value) {
        return new JAXBElement<InfoData>(_Employee_QNAME, InfoData.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link GetInfoDataDetails }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://api.service.tmt.cs.com/", name = "getInfoDataDetails")
    public JAXBElement<GetInfoDataDetails> createGetInfoDataDetails(GetInfoDataDetails value) {
        return new JAXBElement<GetInfoDataDetails>(_GetInfoDataDetails_QNAME, GetInfoDataDetails.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link GetInfoDataDetailsResponse }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://api.service.tmt.cs.com/", name = "getInfoDataDetailsResponse")
    public JAXBElement<GetInfoDataDetailsResponse> createGetInfoDataDetailsResponse(GetInfoDataDetailsResponse value) {
        return new JAXBElement<GetInfoDataDetailsResponse>(_GetInfoDataDetailsResponse_QNAME, GetInfoDataDetailsResponse.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link GetInfoDataVersion }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://api.service.tmt.cs.com/", name = "getInfoDataVersion")
    public JAXBElement<GetInfoDataVersion> createGetInfoDataVersion(GetInfoDataVersion value) {
        return new JAXBElement<GetInfoDataVersion>(_GetInfoDataVersion_QNAME, GetInfoDataVersion.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link GetInfoDataVersionResponse }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://api.service.tmt.cs.com/", name = "getInfoDataVersionResponse")
    public JAXBElement<GetInfoDataVersionResponse> createGetInfoDataVersionResponse(GetInfoDataVersionResponse value) {
        return new JAXBElement<GetInfoDataVersionResponse>(_GetInfoDataVersionResponse_QNAME, GetInfoDataVersionResponse.class, null, value);
    }

}
