/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ec.edu.moster.prueba;

import ec.edu.moster.controlador.ConvCmController;
import ec.edu.moster.servicios.ConvCmServices;
import ec.edu.moster.modelo.Conversion;

/**
 *
 * @author Usuario
 */
public class PruebaCm {
    public static void main(String[] args) {
        
        ConvCmController controlador = new ConvCmController();
        
        //Datos
        double cm=45;
        //Proceso
        Conversion conversion = new Conversion(cm);
        
        double convMm = controlador.convertirCmAMm(conversion);
        double convM = controlador.convertirCmAM(conversion);
        double convKm = controlador.convertirCmAKm(conversion);
        double convPulgadas = controlador.convertirCmAPulgadas(conversion);
        double convPies = controlador.convertirCmAPies(conversion); 
        double convYardas = controlador.convertirCmAYardas(conversion);
        
        //Reporte
        System.out.println("Cm: "+ cm);
        System.out.println("Milimetros: "+convMm);
        System.out.println("Metros: "+convM);
        System.out.println("Kilometros: "+convKm);
        System.out.println("Pulgadas: "+convPulgadas);
        System.out.println("Pies: "+convPies);
        System.out.println("Yardas: "+convYardas);        
        
    }
    
}
