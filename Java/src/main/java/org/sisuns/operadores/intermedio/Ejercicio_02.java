package org.sisuns.operadores.intermedio;

import java.util.Scanner;

public class Ejercicio_02 {
    public static void main(String[] args) {
        // Crear un objeto Scanner para leer la entrada del usuario
        Scanner scanner = new Scanner(System.in);

        // Solicitar la cantidad de yardas al usuario
        System.out.print("Ingrese la cantidad de yardas: ");
        double yardas = scanner.nextDouble();

        // Realizar la conversión a millas
        double millas = yardas * 0.000568182;

        // Mostrar el resultado
        System.out.println("La cantidad en millas es: " + millas);

        // Cerrar el objeto Scanner para liberar recursos
        scanner.close();
    }
}
