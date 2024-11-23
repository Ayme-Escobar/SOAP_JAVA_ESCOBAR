/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ec.edu.moster.servicios;

/**
 *
 * @author Usuario
 */
public class ConvCmServices {
    public double cmAMm(double cm){
        return cm*10;
    }
    public double cmAM(double cm){
        return cm*0.01;
    }
    public double cmAKm(double cm){
        return cm*0.00001;
    }
    public double cmAPulgadas(double cm){
        return cm/2.54;
    }
    public double cmAPies(double cm){
        return cm/30.48;
    }
    public double cmAYardas(double cm){
        return cm/91.44;
    }
    
}
