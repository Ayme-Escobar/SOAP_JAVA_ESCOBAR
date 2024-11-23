/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ec.edu.monster.controlador;

import ec.edu.monster.servicios.ConvUniServices;

/**
 *
 * @author Usuario
 */
public class ConvUniController {
     public double cmAMm(double cm) {
        ConvUniServices service = new ConvUniServices();
        double convMm = service.cmAMm(cm);
        return convMm;
    }

    public double cmAM(double cm) {
        ConvUniServices service = new ConvUniServices();
        double convM = service.cmAM(cm);
        return convM;
    }

    public double cmAKm(double cm) {
        ConvUniServices service = new ConvUniServices();
        double convKm = service.cmAKm(cm);        
        return convKm;
    }

    public double cmAPulgadas(double cm) {
        ConvUniServices service = new ConvUniServices();
        double convPulgadas = service.cmAPulgadas(cm);        
        return convPulgadas;
    }

    public double cmAPies(double cm) {
        ConvUniServices service = new ConvUniServices();
        double convPies = service.cmAPies(cm);                
        return convPies;
    }

    public double cmAYardas(double cm) {
        ConvUniServices service = new ConvUniServices();
        double convYardas = service.cmAYardas(cm);
        return convYardas;
    }

    
}
