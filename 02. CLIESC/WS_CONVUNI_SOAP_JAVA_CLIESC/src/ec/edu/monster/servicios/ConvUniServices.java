/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ec.edu.monster.servicios;

/**
 *
 * @author Usuario
 */
public class ConvUniServices {
    public double cmAKm(double cm) {
        ec.edu.monster.ws.WSConvUni_Service service = new ec.edu.monster.ws.WSConvUni_Service();
        ec.edu.monster.ws.WSConvUni port = service.getWSConvUniPort();
        return port.cmAKm(cm);
    }

    public double cmAM(double cm) {
        ec.edu.monster.ws.WSConvUni_Service service = new ec.edu.monster.ws.WSConvUni_Service();
        ec.edu.monster.ws.WSConvUni port = service.getWSConvUniPort();
        return port.cmAM(cm);
    }

    public double cmAMm(double cm) {
        ec.edu.monster.ws.WSConvUni_Service service = new ec.edu.monster.ws.WSConvUni_Service();
        ec.edu.monster.ws.WSConvUni port = service.getWSConvUniPort();
        return port.cmAMm(cm);
    }

    public double cmAPies(double cm) {
        ec.edu.monster.ws.WSConvUni_Service service = new ec.edu.monster.ws.WSConvUni_Service();
        ec.edu.monster.ws.WSConvUni port = service.getWSConvUniPort();
        return port.cmAPies(cm);
    }

    public double cmAPulgadas(double cm) {
        ec.edu.monster.ws.WSConvUni_Service service = new ec.edu.monster.ws.WSConvUni_Service();
        ec.edu.monster.ws.WSConvUni port = service.getWSConvUniPort();
        return port.cmAPulgadas(cm);
    }

    public double cmAYardas(double cm) {
        ec.edu.monster.ws.WSConvUni_Service service = new ec.edu.monster.ws.WSConvUni_Service();
        ec.edu.monster.ws.WSConvUni port = service.getWSConvUniPort();
        return port.cmAYardas(cm);
    }    
}
