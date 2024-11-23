/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ec.edu.monster.controlador;

import ec.edu.monster.servicios.AutenticacionService;

/**
 *
 * @author Usuario
 */
public class LoginController {
    private AutenticacionService authService;

    public LoginController() {
        this.authService = new AutenticacionService();
    }
    
    public boolean login(String username, String password) {
        return authService.autenticar(username, password);
    }    
}
