
package ec.edu.monster.ws;

import javax.jws.WebMethod;
import javax.jws.WebParam;
import javax.jws.WebResult;
import javax.jws.WebService;
import javax.xml.bind.annotation.XmlSeeAlso;
import javax.xml.ws.Action;
import javax.xml.ws.RequestWrapper;
import javax.xml.ws.ResponseWrapper;


/**
 * This class was generated by the JAX-WS RI.
 * JAX-WS RI 2.2.6-1b01 
 * Generated source version: 2.2
 * 
 */
@WebService(name = "WSConvUni", targetNamespace = "http://ws.moster.edu.ec/")
@XmlSeeAlso({
    ObjectFactory.class
})
public interface WSConvUni {


    /**
     * 
     * @param cm
     * @return
     *     returns double
     */
    @WebMethod
    @WebResult(targetNamespace = "")
    @RequestWrapper(localName = "cmAKm", targetNamespace = "http://ws.moster.edu.ec/", className = "ec.edu.monster.ws.CmAKm")
    @ResponseWrapper(localName = "cmAKmResponse", targetNamespace = "http://ws.moster.edu.ec/", className = "ec.edu.monster.ws.CmAKmResponse")
    @Action(input = "http://ws.moster.edu.ec/WSConvUni/cmAKmRequest", output = "http://ws.moster.edu.ec/WSConvUni/cmAKmResponse")
    public double cmAKm(
        @WebParam(name = "cm", targetNamespace = "")
        double cm);

    /**
     * 
     * @param cm
     * @return
     *     returns double
     */
    @WebMethod
    @WebResult(targetNamespace = "")
    @RequestWrapper(localName = "cmAPies", targetNamespace = "http://ws.moster.edu.ec/", className = "ec.edu.monster.ws.CmAPies")
    @ResponseWrapper(localName = "cmAPiesResponse", targetNamespace = "http://ws.moster.edu.ec/", className = "ec.edu.monster.ws.CmAPiesResponse")
    @Action(input = "http://ws.moster.edu.ec/WSConvUni/cmAPiesRequest", output = "http://ws.moster.edu.ec/WSConvUni/cmAPiesResponse")
    public double cmAPies(
        @WebParam(name = "cm", targetNamespace = "")
        double cm);

    /**
     * 
     * @param cm
     * @return
     *     returns double
     */
    @WebMethod
    @WebResult(targetNamespace = "")
    @RequestWrapper(localName = "cmAYardas", targetNamespace = "http://ws.moster.edu.ec/", className = "ec.edu.monster.ws.CmAYardas")
    @ResponseWrapper(localName = "cmAYardasResponse", targetNamespace = "http://ws.moster.edu.ec/", className = "ec.edu.monster.ws.CmAYardasResponse")
    @Action(input = "http://ws.moster.edu.ec/WSConvUni/cmAYardasRequest", output = "http://ws.moster.edu.ec/WSConvUni/cmAYardasResponse")
    public double cmAYardas(
        @WebParam(name = "cm", targetNamespace = "")
        double cm);

    /**
     * 
     * @param cm
     * @return
     *     returns double
     */
    @WebMethod
    @WebResult(targetNamespace = "")
    @RequestWrapper(localName = "cmAMm", targetNamespace = "http://ws.moster.edu.ec/", className = "ec.edu.monster.ws.CmAMm")
    @ResponseWrapper(localName = "cmAMmResponse", targetNamespace = "http://ws.moster.edu.ec/", className = "ec.edu.monster.ws.CmAMmResponse")
    @Action(input = "http://ws.moster.edu.ec/WSConvUni/cmAMmRequest", output = "http://ws.moster.edu.ec/WSConvUni/cmAMmResponse")
    public double cmAMm(
        @WebParam(name = "cm", targetNamespace = "")
        double cm);

    /**
     * 
     * @param cm
     * @return
     *     returns double
     */
    @WebMethod
    @WebResult(targetNamespace = "")
    @RequestWrapper(localName = "cmAM", targetNamespace = "http://ws.moster.edu.ec/", className = "ec.edu.monster.ws.CmAM")
    @ResponseWrapper(localName = "cmAMResponse", targetNamespace = "http://ws.moster.edu.ec/", className = "ec.edu.monster.ws.CmAMResponse")
    @Action(input = "http://ws.moster.edu.ec/WSConvUni/cmAMRequest", output = "http://ws.moster.edu.ec/WSConvUni/cmAMResponse")
    public double cmAM(
        @WebParam(name = "cm", targetNamespace = "")
        double cm);

    /**
     * 
     * @param cm
     * @return
     *     returns double
     */
    @WebMethod
    @WebResult(targetNamespace = "")
    @RequestWrapper(localName = "cmAPulgadas", targetNamespace = "http://ws.moster.edu.ec/", className = "ec.edu.monster.ws.CmAPulgadas")
    @ResponseWrapper(localName = "cmAPulgadasResponse", targetNamespace = "http://ws.moster.edu.ec/", className = "ec.edu.monster.ws.CmAPulgadasResponse")
    @Action(input = "http://ws.moster.edu.ec/WSConvUni/cmAPulgadasRequest", output = "http://ws.moster.edu.ec/WSConvUni/cmAPulgadasResponse")
    public double cmAPulgadas(
        @WebParam(name = "cm", targetNamespace = "")
        double cm);

}
