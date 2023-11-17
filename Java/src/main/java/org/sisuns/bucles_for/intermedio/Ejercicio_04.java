package org.sisuns.bucles_for.intermedio;

import java.util.Scanner;

public class Ejercicio_04 {
    public static void main(String[] args) {
        // Declaración de variables
        int N, terminoActual, primerTermino, segundoTermino, siguienteTermino, sumaTerminos;
        double promedio;

        // Inicialización de variables
        primerTermino = 1;
        segundoTermino = 1;
        sumaTerminos = 2;  // Inicializado con los dos primeros términos de la serie
        promedio = 0;

        // Lectura del valor de N desde la entrada estándar
        Scanner scanner = new Scanner(System.in);
        System.out.print("Ingrese el valor de N: ");
        N = scanner.nextInt();

        // Verificar si N es menor o igual a 0
        if (N <= 0) {
            System.out.println("N debe ser un número entero positivo.");
        } else {
            // Mostrar los dos primeros términos de la serie
            System.out.print("Serie de Fibonacci hasta el término " + N + ": " + primerTermino + ", " + segundoTermino);

            // Calcular y mostrar el resto de la serie
            for (terminoActual = 3; terminoActual <= N; terminoActual++) {
                siguienteTermino = primerTermino + segundoTermino;
                System.out.print(", " + siguienteTermino);
                sumaTerminos += siguienteTermino;

                // Actualizar los términos para el próximo cálculo
                primerTermino = segundoTermino;
                segundoTermino = siguienteTermino;
            }

            // Calcular y mostrar el promedio
            promedio = (double) sumaTerminos / N;
            System.out.println("\nPromedio de la serie: " + promedio);
        }
    }
}
