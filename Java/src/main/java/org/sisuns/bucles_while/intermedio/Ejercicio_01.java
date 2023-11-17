package org.sisuns.bucles_while.intermedio;

public class Ejercicio_01 {
    public static void main(String[] args) {
        // Declaración de variables
        int N = 5; // Puedes cambiar el valor de N según sea necesario
        int factorial = 1;

        // Inicializar el factorial a 1, para no multiplicar por cero
        // Además, el factorial de 0 y 1 es 1

        // Multiplicará desde 1 hasta el tamaño de N: N! = 1 * 2 * 3 * ... * N
        for (int i = 1; i <= N; i++) {
            factorial = factorial * i;
        }

        // Mostrar el resultado
        System.out.println("El factorial de " + N + " es " + factorial);
    }
}
