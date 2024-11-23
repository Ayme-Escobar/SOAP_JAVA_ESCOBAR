/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ec.edu.monster.prueba;
import ec.edu.monster.servicios.ConvUniServices;

/**
 *
 * @author Usuario
 */
public class PruebaConvCm {
    public static void main(String[] args) {
        //Datos
        double cm = 45;
        //Proceso
        ConvUniServices service = new ConvUniServices();
        double convMm = service.cmAMm(cm);
        double convM = service.cmAM(cm);
        double convKm = service.cmAKm(cm);
        double convPulgadas = service.cmAPulgadas(cm);
        double convPies = service.cmAPies(cm);        
        double convYardas = service.cmAYardas(cm);
        
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
