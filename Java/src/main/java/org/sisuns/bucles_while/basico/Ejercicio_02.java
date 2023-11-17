package org.sisuns.bucles_while.basico;

public class Ejercicio_02 {
    public static void main(String[] args) {
        // Declaración e inicialización de la variable numero
        int numero = 1;

        // Mientras el número sea menor o igual a 20
        while (numero <= 20) {
            // Mostrar el número actual
            System.out.print(numero);

            // Si el número es divisible por 5, mostrar 0
            if (numero % 5 == 0) {
                System.out.print(0);
            }

            // Incrementar el número
            numero = numero + 1;
        }
    }
}
