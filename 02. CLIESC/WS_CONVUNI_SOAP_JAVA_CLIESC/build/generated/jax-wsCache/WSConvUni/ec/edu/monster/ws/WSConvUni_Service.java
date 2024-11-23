
package ec.edu.monster.ws;

import java.net.MalformedURLException;
import java.net.URL;
import javax.xml.namespace.QName;
import javax.xml.ws.Service;
import javax.xml.ws.WebEndpoint;
import javax.xml.ws.WebServiceClient;
import javax.xml.ws.WebServiceException;
import javax.xml.ws.WebServiceFeature;


/**
 * This class was generated by the JAX-WS RI.
 * JAX-WS RI 2.2.6-1b01 
 * Generated source version: 2.2
 * 
 */
@WebServiceClient(name = "WSConvUni", targetNamespace = "http://ws.moster.edu.ec/", wsdlLocation = "http://localhost:8080/WS_CONVUNI_SOAPJAVA/WSConvUni?wsdl")
public class WSConvUni_Service
    extends Service
{

    private final static URL WSCONVUNI_WSDL_LOCATION;
    private final static WebServiceException WSCONVUNI_EXCEPTION;
    private final static QName WSCONVUNI_QNAME = new QName("http://ws.moster.edu.ec/", "WSConvUni");

    static {
        URL url = null;
        WebServiceException e = null;
        try {
            url = new URL("http://localhost:8080/WS_CONVUNI_SOAPJAVA/WSConvUni?wsdl");
        } catch (MalformedURLException ex) {
            e = new WebServiceException(ex);
        }
        WSCONVUNI_WSDL_LOCATION = url;
        WSCONVUNI_EXCEPTION = e;
    }

    public WSConvUni_Service() {
        super(__getWsdlLocation(), WSCONVUNI_QNAME);
    }

    public WSConvUni_Service(WebServiceFeature... features) {
        super(__getWsdlLocation(), WSCONVUNI_QNAME, features);
    }

    public WSConvUni_Service(URL wsdlLocation) {
        super(wsdlLocation, WSCONVUNI_QNAME);
    }

    public WSConvUni_Service(URL wsdlLocation, WebServiceFeature... features) {
        super(wsdlLocation, WSCONVUNI_QNAME, features);
    }

    public WSConvUni_Service(URL wsdlLocation, QName serviceName) {
        super(wsdlLocation, serviceName);
    }

    public WSConvUni_Service(URL wsdlLocation, QName serviceName, WebServiceFeature... features) {
        super(wsdlLocation, serviceName, features);
    }

    /**
     * 
     * @return
     *     returns WSConvUni
     */
    @WebEndpoint(name = "WSConvUniPort")
    public WSConvUni getWSConvUniPort() {
        return super.getPort(new QName("http://ws.moster.edu.ec/", "WSConvUniPort"), WSConvUni.class);
    }

    /**
     * 
     * @param features
     *     A list of {@link javax.xml.ws.WebServiceFeature} to configure on the proxy.  Supported features not in the <code>features</code> parameter will have their default values.
     * @return
     *     returns WSConvUni
     */
    @WebEndpoint(name = "WSConvUniPort")
    public WSConvUni getWSConvUniPort(WebServiceFeature... features) {
        return super.getPort(new QName("http://ws.moster.edu.ec/", "WSConvUniPort"), WSConvUni.class, features);
    }

    private static URL __getWsdlLocation() {
        if (WSCONVUNI_EXCEPTION!= null) {
            throw WSCONVUNI_EXCEPTION;
        }
        return WSCONVUNI_WSDL_LOCATION;
    }

}
