/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ec.edu.monster.vista;

import ec.edu.monster.controlador.ConvCmControlador;
import ec.edu.monster.controlador.LoginControlador;
import java.io.Console;
import java.util.Scanner;

/**
 *
 * @author Usuario
 */
public class ConvCm {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        LoginControlador loginController = new LoginControlador();
        Console console = System.console();
        boolean loginExitoso = false;

        while (!loginExitoso) {
            System.out.print("Ingrese su nombre de usuario: ");
            String username = scanner.nextLine();

            String password;
            if (console != null) {                
                password = new String(console.readPassword("Ingrese su contraseña: "));
            } else {                
                System.out.print("Ingrese su contraseña: ");
                password = scanner.nextLine();                
            }

            if (loginController.login(username, password)) {
                loginExitoso = true;
                System.out.println("Inicio de sesión exitoso. \nBienvenido " + username + "!");
            } else {
                System.out.println("Usuario o contraseña incorrectos. Intente de nuevo.\n");
            }
        }

        ConvCmControlador controller = new ConvCmControlador();
        System.out.println("------------------------------------------------------------------------");
        System.out.println("Bienvenido! Conversión de Unidades Cm");

        double cm = 0;
        boolean entradaValida = false;

        while (!entradaValida) {
            System.out.print("Ingrese un valor en centímetros: ");
            String inputText = scanner.next();

            inputText = inputText.replace(".", ",");

            if (inputText.matches("\\d+(,\\d+)?")) {
                inputText = inputText.replace(",", ".");
                cm = Double.parseDouble(inputText);
                entradaValida = true;
            } else {
                System.out.println("Entrada no válida. Por favor, ingrese solo números.");
            }
        }

        int opcion = -1;
        do {
            System.out.println("-----------------------------MENU PRINCIPAL-----------------------------");
            System.out.println("\nSeleccione la unidad a la que desea convertir:");
            System.out.println("1. Milímetros");
            System.out.println("2. Metros");
            System.out.println("3. Kilómetros");
            System.out.println("4. Pulgadas");
            System.out.println("5. Pies");
            System.out.println("6. Yardas");
            System.out.println("7. Salir");
            System.out.print("Opción: ");

            if (scanner.hasNextInt()) {
                opcion = scanner.nextInt();
                String resultado = controller.convertirCm(cm, opcion);
                System.out.println(resultado);
            } else {
                System.out.println("Opción no válida. Por favor, ingrese un número entre 1 y 7.");
                scanner.next();
            }

        } while (opcion != 7);

        scanner.close();
    }      
}
