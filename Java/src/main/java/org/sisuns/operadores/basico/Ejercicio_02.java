package org.sisuns.operadores.basico;

import java.util.Scanner;

public class Ejercicio_02 {
    public static void main(String[] args) {
        // Crear un objeto Scanner para leer la entrada del usuario
        Scanner scanner = new Scanner(System.in);

        // Ingresar dos números
        System.out.print("Ingrese el primer número: ");
        double num1 = scanner.nextDouble();

        System.out.print("Ingrese el segundo número: ");
        double num2 = scanner.nextDouble();

        // Realizar operaciones
        double suma = num1 + num2;
        double resta = num1 - num2;
        double multiplicacion = num1 * num2;

        // Verificar si el segundo número es distinto de cero antes de realizar la división
        double division = (num2 != 0) ? num1 / num2 : Double.POSITIVE_INFINITY;

        // Mostrar resultados
        System.out.println("Suma: " + suma);
        System.out.println("Resta: " + resta);
        System.out.println("Multiplicación: " + multiplicacion);

        // Mostrar la división solo si el segundo número no es cero
        if (num2 != 0) {
            System.out.println("División: " + division);
        } else {
            System.out.println("División por cero no permitida.");
        }

        // Cerrar el objeto Scanner para liberar recursos
        scanner.close();
    }
}
