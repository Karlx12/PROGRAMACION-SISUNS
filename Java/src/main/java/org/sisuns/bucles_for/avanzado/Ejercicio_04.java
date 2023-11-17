package org.sisuns.bucles_for.avanzado;

import java.util.Scanner;

public class Ejercicio_04 {
    public static void main(String[] args) {
        // Declaración de variables
        int[] numeros = new int[5];
        int suma = 0;

        // Lectura de los 5 números desde la entrada estándar
        Scanner scanner = new Scanner(System.in);
        for (int i = 0; i < 5; i++) {
            System.out.print("Ingrese el número " + (i + 1) + ": ");
            numeros[i] = scanner.nextInt();
        }

        // Verificar si un número es primo y sumarlo
        for (int i = 0; i < 5; i++) {
            int numero = numeros[i];
            boolean esPrimo = true;

            if (numero <= 1) {
                esPrimo = false;
            } else {
                for (int j = 2; j <= Math.sqrt(numero); j++) {
                    if (numero % j == 0) {
                        esPrimo = false;
                        break;
                    }
                }
            }

            if (esPrimo) {
                suma += numero;
            }
        }

        // Mostrar la suma de los números primos
        System.out.println("La suma de los números primos es: " + suma);
    }
}
