/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ec.edu.moster.controlador;

import ec.edu.moster.modelo.Conversion;
import ec.edu.moster.servicios.ConvCmServices;

/**
 *
 * @author Usuario
 */
public class ConvCmController {
    
    private ConvCmServices servicio;

    public ConvCmController() {
        this.servicio = new ConvCmServices();
    }
    
    public double convertirCmAMm(Conversion conversion){
        return servicio.cmAMm(conversion.getValorCm());
    }
    
    public double convertirCmAM(Conversion conversion) {
        return servicio.cmAM(conversion.getValorCm());
    }

    public double convertirCmAKm(Conversion conversion) {
        return servicio.cmAKm(conversion.getValorCm());
    }

    public double convertirCmAPulgadas(Conversion conversion) {
        return servicio.cmAPulgadas(conversion.getValorCm());
    }

    public double convertirCmAPies(Conversion conversion) {
        return servicio.cmAPies(conversion.getValorCm());
    }

    public double convertirCmAYardas(Conversion conversion) {
        return servicio.cmAYardas(conversion.getValorCm());
    }  
    
}
