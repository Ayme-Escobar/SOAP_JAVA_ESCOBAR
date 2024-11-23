package ec.edu.monster.prueba;

import ec.edu.monster.servicios.AutenticacionService;
import java.util.Scanner;

/**
 * Clase de prueba interactiva para generar el hash de una contraseña ingresada por el usuario.
 */
public class AutenticacionServiceTest {

    public static void main(String[] args) {
        AutenticacionService autenticacionService = new AutenticacionService();
        Scanner scanner = new Scanner(System.in);

        System.out.println("=== Prueba de Generación de Hash SHA-256 ===");

        // Solicitar la contraseña al usuario
        System.out.print("Ingrese una contraseña para generar su hash: ");
        String password = scanner.nextLine();

        // Generar el hash de la contraseña ingresada
        String hashGenerado = autenticacionService.generarHashSegura(password);

        // Imprimir el hash generado
        System.out.println("\nHash generado para la contraseña '" + password + "':");
        System.out.println(hashGenerado);

        // Comparar con el hash almacenado en AutenticacionService para "Monster9"
        String hashAlmacenado = autenticacionService.generarHashSegura("Monster9");
        if (hashGenerado.equals(hashAlmacenado)) {
            System.out.println("\nEl hash generado coincide con el hash de la contraseña 'Monster9'.");
        } else {
            System.out.println("\nEl hash generado NO coincide con el hash de la contraseña 'Monster9'.");
        }

        scanner.close();        
    }
}
