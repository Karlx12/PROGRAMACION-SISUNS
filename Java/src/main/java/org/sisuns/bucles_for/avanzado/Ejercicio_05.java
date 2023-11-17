package org.sisuns.bucles_for.avanzado;

import java.util.Scanner;

public class Ejercicio_05 {
    public static void main(String[] args) {
        // Declaración de variables
        int[][] matrizA = new int[4][4];
        int[][] matrizB = new int[4][4];
        int[][] matrizResultado = new int[4][4];
        int suma;

        // Lectura de la matriz A desde la entrada estándar
        System.out.println("Ingrese los elementos de la matriz A (4x4):");
        Scanner scanner = new Scanner(System.in);
        for (int i = 0; i < 4; i++) {
            for (int j = 0; j < 4; j++) {
                System.out.print("Ingrese el elemento A[" + i + "][" + j + "]: ");
                matrizA[i][j] = scanner.nextInt();
            }
        }

        // Lectura de la matriz B desde la entrada estándar
        System.out.println("Ingrese los elementos de la matriz B (4x4):");
        for (int i = 0; i < 4; i++) {
            for (int j = 0; j < 4; j++) {
                System.out.print("Ingrese el elemento B[" + i + "][" + j + "]: ");
                matrizB[i][j] = scanner.nextInt();
            }
        }

        // Multiplicación de matrices
        for (int i = 0; i < 4; i++) {
            for (int j = 0; j < 4; j++) {
                suma = 0;
                for (int k = 0; k < 4; k++) {
                    suma += matrizA[i][k] * matrizB[k][j];
                }
                matrizResultado[i][j] = suma;
            }
        }

        // Mostrar la matriz resultado
        System.out.println("Matriz Resultado (A * B):");
        for (int i = 0; i < 4; i++) {
            for (int j = 0; j < 4; j++) {
                System.out.print(matrizResultado[i][j] + " ");
            }
            System.out.println();
        }
    }
}
