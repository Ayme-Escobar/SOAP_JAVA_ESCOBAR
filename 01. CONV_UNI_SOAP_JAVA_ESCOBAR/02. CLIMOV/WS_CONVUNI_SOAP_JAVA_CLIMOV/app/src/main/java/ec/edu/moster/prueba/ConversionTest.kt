package ec.edu.moster.prueba

import ec.edu.moster.controlador.ConversionController
import ec.edu.moster.modelo.ConversionModel
import java.util.Scanner

fun main() {
    val conversionModel = ConversionModel()
    val conversionController = ConversionController(conversionModel)
    val scanner = Scanner(System.`in`)

    println("=== Prueba de Conversión SOAP ===")
    println("Seleccione el tipo de conversión:")
    println("1. Centímetros a Milímetros")
    println("2. Centímetros a Metros")
    println("3. Centímetros a Kilómetros")
    println("4. Centímetros a Pies")
    println("5. Centímetros a Pulgadas")
    println("6. Centímetros a Yardas")
    println("7. Salir")

    print("Ingrese su elección: ")
    val choice = scanner.nextInt()
    scanner.nextLine() // Consumir el salto de línea

    val conversionType = when (choice) {
        1 -> "cmAMm"
        2 -> "cmAM"
        3 -> "cmAKm"
        4 -> "cmAPies"
        5 -> "cmAPulgadas"
        6 -> "cmAYardas"
        else -> {
            println("Saliendo...")
            return
        }
    }

    print("Ingrese el valor en centímetros: ")
    val value = scanner.nextLine()

    println("\nRealizando la conversión...\n")

    // Llamar al controlador para realizar la conversión
    conversionController.convert(conversionType, value) { result ->
        println("Resultado de la conversión: $result")
    }
}
