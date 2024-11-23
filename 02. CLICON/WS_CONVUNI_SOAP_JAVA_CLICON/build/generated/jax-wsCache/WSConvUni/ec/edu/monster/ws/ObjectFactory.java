
package ec.edu.monster.ws;

import javax.xml.bind.JAXBElement;
import javax.xml.bind.annotation.XmlElementDecl;
import javax.xml.bind.annotation.XmlRegistry;
import javax.xml.namespace.QName;


/**
 * This object contains factory methods for each 
 * Java content interface and Java element interface 
 * generated in the ec.edu.monster.ws package. 
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

    private final static QName _CmAMm_QNAME = new QName("http://ws.moster.edu.ec/", "cmAMm");
    private final static QName _CmAKmResponse_QNAME = new QName("http://ws.moster.edu.ec/", "cmAKmResponse");
    private final static QName _CmAYardasResponse_QNAME = new QName("http://ws.moster.edu.ec/", "cmAYardasResponse");
    private final static QName _CmAMmResponse_QNAME = new QName("http://ws.moster.edu.ec/", "cmAMmResponse");
    private final static QName _CmAYardas_QNAME = new QName("http://ws.moster.edu.ec/", "cmAYardas");
    private final static QName _CmAM_QNAME = new QName("http://ws.moster.edu.ec/", "cmAM");
    private final static QName _CmAMResponse_QNAME = new QName("http://ws.moster.edu.ec/", "cmAMResponse");
    private final static QName _CmAPiesResponse_QNAME = new QName("http://ws.moster.edu.ec/", "cmAPiesResponse");
    private final static QName _CmAKm_QNAME = new QName("http://ws.moster.edu.ec/", "cmAKm");
    private final static QName _CmAPies_QNAME = new QName("http://ws.moster.edu.ec/", "cmAPies");
    private final static QName _CmAPulgadasResponse_QNAME = new QName("http://ws.moster.edu.ec/", "cmAPulgadasResponse");
    private final static QName _CmAPulgadas_QNAME = new QName("http://ws.moster.edu.ec/", "cmAPulgadas");

    /**
     * Create a new ObjectFactory that can be used to create new instances of schema derived classes for package: ec.edu.monster.ws
     * 
     */
    public ObjectFactory() {
    }

    /**
     * Create an instance of {@link CmAMm }
     * 
     */
    public CmAMm createCmAMm() {
        return new CmAMm();
    }

    /**
     * Create an instance of {@link CmAKmResponse }
     * 
     */
    public CmAKmResponse createCmAKmResponse() {
        return new CmAKmResponse();
    }

    /**
     * Create an instance of {@link CmAYardasResponse }
     * 
     */
    public CmAYardasResponse createCmAYardasResponse() {
        return new CmAYardasResponse();
    }

    /**
     * Create an instance of {@link CmAMmResponse }
     * 
     */
    public CmAMmResponse createCmAMmResponse() {
        return new CmAMmResponse();
    }

    /**
     * Create an instance of {@link CmAYardas }
     * 
     */
    public CmAYardas createCmAYardas() {
        return new CmAYardas();
    }

    /**
     * Create an instance of {@link CmAM }
     * 
     */
    public CmAM createCmAM() {
        return new CmAM();
    }

    /**
     * Create an instance of {@link CmAMResponse }
     * 
     */
    public CmAMResponse createCmAMResponse() {
        return new CmAMResponse();
    }

    /**
     * Create an instance of {@link CmAPiesResponse }
     * 
     */
    public CmAPiesResponse createCmAPiesResponse() {
        return new CmAPiesResponse();
    }

    /**
     * Create an instance of {@link CmAKm }
     * 
     */
    public CmAKm createCmAKm() {
        return new CmAKm();
    }

    /**
     * Create an instance of {@link CmAPies }
     * 
     */
    public CmAPies createCmAPies() {
        return new CmAPies();
    }

    /**
     * Create an instance of {@link CmAPulgadasResponse }
     * 
     */
    public CmAPulgadasResponse createCmAPulgadasResponse() {
        return new CmAPulgadasResponse();
    }

    /**
     * Create an instance of {@link CmAPulgadas }
     * 
     */
    public CmAPulgadas createCmAPulgadas() {
        return new CmAPulgadas();
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link CmAMm }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://ws.moster.edu.ec/", name = "cmAMm")
    public JAXBElement<CmAMm> createCmAMm(CmAMm value) {
        return new JAXBElement<CmAMm>(_CmAMm_QNAME, CmAMm.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link CmAKmResponse }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://ws.moster.edu.ec/", name = "cmAKmResponse")
    public JAXBElement<CmAKmResponse> createCmAKmResponse(CmAKmResponse value) {
        return new JAXBElement<CmAKmResponse>(_CmAKmResponse_QNAME, CmAKmResponse.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link CmAYardasResponse }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://ws.moster.edu.ec/", name = "cmAYardasResponse")
    public JAXBElement<CmAYardasResponse> createCmAYardasResponse(CmAYardasResponse value) {
        return new JAXBElement<CmAYardasResponse>(_CmAYardasResponse_QNAME, CmAYardasResponse.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link CmAMmResponse }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://ws.moster.edu.ec/", name = "cmAMmResponse")
    public JAXBElement<CmAMmResponse> createCmAMmResponse(CmAMmResponse value) {
        return new JAXBElement<CmAMmResponse>(_CmAMmResponse_QNAME, CmAMmResponse.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link CmAYardas }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://ws.moster.edu.ec/", name = "cmAYardas")
    public JAXBElement<CmAYardas> createCmAYardas(CmAYardas value) {
        return new JAXBElement<CmAYardas>(_CmAYardas_QNAME, CmAYardas.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link CmAM }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://ws.moster.edu.ec/", name = "cmAM")
    public JAXBElement<CmAM> createCmAM(CmAM value) {
        return new JAXBElement<CmAM>(_CmAM_QNAME, CmAM.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link CmAMResponse }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://ws.moster.edu.ec/", name = "cmAMResponse")
    public JAXBElement<CmAMResponse> createCmAMResponse(CmAMResponse value) {
        return new JAXBElement<CmAMResponse>(_CmAMResponse_QNAME, CmAMResponse.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link CmAPiesResponse }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://ws.moster.edu.ec/", name = "cmAPiesResponse")
    public JAXBElement<CmAPiesResponse> createCmAPiesResponse(CmAPiesResponse value) {
        return new JAXBElement<CmAPiesResponse>(_CmAPiesResponse_QNAME, CmAPiesResponse.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link CmAKm }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://ws.moster.edu.ec/", name = "cmAKm")
    public JAXBElement<CmAKm> createCmAKm(CmAKm value) {
        return new JAXBElement<CmAKm>(_CmAKm_QNAME, CmAKm.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link CmAPies }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://ws.moster.edu.ec/", name = "cmAPies")
    public JAXBElement<CmAPies> createCmAPies(CmAPies value) {
        return new JAXBElement<CmAPies>(_CmAPies_QNAME, CmAPies.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link CmAPulgadasResponse }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://ws.moster.edu.ec/", name = "cmAPulgadasResponse")
    public JAXBElement<CmAPulgadasResponse> createCmAPulgadasResponse(CmAPulgadasResponse value) {
        return new JAXBElement<CmAPulgadasResponse>(_CmAPulgadasResponse_QNAME, CmAPulgadasResponse.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link CmAPulgadas }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://ws.moster.edu.ec/", name = "cmAPulgadas")
    public JAXBElement<CmAPulgadas> createCmAPulgadas(CmAPulgadas value) {
        return new JAXBElement<CmAPulgadas>(_CmAPulgadas_QNAME, CmAPulgadas.class, null, value);
    }

}
