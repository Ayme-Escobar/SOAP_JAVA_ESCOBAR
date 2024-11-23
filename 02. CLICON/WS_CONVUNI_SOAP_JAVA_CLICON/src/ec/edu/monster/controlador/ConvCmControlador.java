/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ec.edu.monster.controlador;

import ec.edu.monster.servicios.ConvUniServices;
import java.text.DecimalFormat;

/**
 *
 * @author Usuario
 */
public class ConvCmControlador {
    private ConvUniServices conversionService;
    private static final DecimalFormat df = new DecimalFormat("0.######");
    
    public ConvCmControlador(){
        this.conversionService = new ConvUniServices();
    }
    public String convertirCm(double cm, int opcion) {
        switch(opcion) {
            case 1:
                return cm + " cm en Milímetros: " + df.format(conversionService.cmAMm(cm)) + " mm";
            case 2:
                return cm + " cm en Metros: " + df.format(conversionService.cmAM(cm)) + " m";
            case 3:
                return cm + " cm en Kilómetros: " + df.format(conversionService.cmAKm(cm)) + " km";
            case 4:
                return cm + " cm en Pulgadas: " + df.format(conversionService.cmAPulgadas(cm)) + " in";
            case 5:
                return cm + " cm en Pies: " + df.format(conversionService.cmAPies(cm)) + " ft";
            case 6:
                return cm + " cm en Yardas: " + df.format(conversionService.cmAYardas(cm)) + " yd";
            case 7:
                return "Adiós...";
            default:
                return "Opción no válida. Intente de nuevo.";
        }
    }       
}
