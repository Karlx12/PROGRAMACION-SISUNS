package org.sisuns.bucles_while.basico;

public class Ejercicio_05 {
    public static void main(String[] args) {
        // Declaración de variables
        int numero = 9;  // Ingresa el número inicial
        int suma = 0;

        // Mientras el número sea menor o igual a 45
        while (numero <= 45) {
            // Excluir números entre 21 y 27
            if (numero < 21 || numero > 27) {
                // Verificar si es múltiplo de 3 o 7
                if (numero % 3 == 0 || numero % 7 == 0) {
                    // Sumar al resultado
                    suma += numero;
                }
            }

            // Incrementar el número
            numero++;
        }

        // Mostrar la suma
        System.out.println("La suma de los múltiplos de 3 y 7 es: " + suma);

    }
}
