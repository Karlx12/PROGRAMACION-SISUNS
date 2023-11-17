package org.sisuns.bucles_while.basico;

public class Ejercicio_03 {
    public static void main(String[] args) {
        // Declaración e inicialización de variables
        int nivel = 1;
        int numero;
        int espacios;

        // Mientras el nivel sea menor o igual a 10
        while (nivel <= 10) {
            // Calcular el número de espacios antes de los números
            espacios = 10 - nivel;

            // Imprimir los espacios
            for (int i = 1; i <= espacios; i++) {
                System.out.print(" ");
            }

            // Imprimir los números ascendentes
            for (numero = 1; numero <= nivel; numero++) {
                System.out.print(numero);
            }

            // Imprimir los números descendentes
            for (numero = nivel - 1; numero >= 1; numero--) {
                System.out.print(numero);
            }

            // Ir al siguiente nivel
            nivel = nivel + 1;
            System.out.println();  // Nueva línea para la siguiente fila
        }
    }
}
