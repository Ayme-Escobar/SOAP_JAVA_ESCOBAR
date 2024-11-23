/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ec.edu.moster.ws;

import ec.edu.moster.controlador.ConvCmController;
import ec.edu.moster.modelo.Conversion;
import ec.edu.moster.servicios.ConvCmServices;
import javax.jws.WebService;
import javax.jws.WebMethod;
import javax.jws.WebParam;

/**
 *
 * @author Usuario
 */
@WebService(serviceName = "WSConvUni")
public class WSConvUni {
    
    private ConvCmController controlador;
    
    public WSConvUni() {
        this.controlador = new ConvCmController();
    }
    
    /**
     * Web service operation
     */
    @WebMethod(operationName = "cmAMm")
    public double cmAMm(@WebParam(name = "cm") double cm) {
        //TODO write your implementation code here:
        Conversion conversion = new Conversion(cm);
        return controlador.convertirCmAMm(conversion);
    }
    
    /**
     * Web service operation
     */
    @WebMethod(operationName = "cmAM")
    public double cmAM(@WebParam(name = "cm") double cm) {
        //TODO write your implementation code here:
        Conversion conversion = new Conversion(cm);
        return controlador.convertirCmAM(conversion);
    }
    
     /**
     * Web service operation
     */
    @WebMethod(operationName = "cmAKm")
    public double cmAKm(@WebParam(name = "cm") double cm) {
        //TODO write your implementation code here:
        Conversion conversion = new Conversion(cm);
        return controlador.convertirCmAKm(conversion);
    }
    
     /**
     * Web service operation
     */
    @WebMethod(operationName = "cmAPulgadas")
    public double cmAPulgadas(@WebParam(name = "cm") double cm) {
        //TODO write your implementation code here:
        Conversion conversion = new Conversion(cm);
        return controlador.convertirCmAPulgadas(conversion);
    }
    
    /**
     * Web service operation
     */
    @WebMethod(operationName = "cmAPies")
    public double cmAPies(@WebParam(name = "cm") double cm) {
        //TODO write your implementation code here:
        Conversion conversion = new Conversion(cm);
        return controlador.convertirCmAPies(conversion);
    }
    
     /**
     * Web service operation
     */
    @WebMethod(operationName = "cmAYardas")
    public double cmAYardas(@WebParam(name = "cm") double cm) {
        //TODO write your implementation code here:
        Conversion conversion = new Conversion(cm);
        return controlador.convertirCmAYardas(conversion);
    }



}
