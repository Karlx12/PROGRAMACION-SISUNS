package org.sisuns.bucles_while.intermedio;

public class Ejercicio_02 {
    public static void main(String[] args) {
        // Declaración de variables
        int N, termino, incremento, i;

        // Supongamos que N se establece a 5, puedes cambiar este valor según tus necesidades
        N = 5;

        // Validar que N sea positivo
        if (N <= 0) {
            System.out.println("El número debe ser un entero positivo. Fin del programa.");
        } else {
            // Inicialización de variables
            termino = 7;
            incremento = 2;
            i = 1;

            // Mostrar los primeros N términos de la serie
            while (i <= N) {
                System.out.println(termino);
                termino = termino + incremento;
                incremento = incremento + 1;
                i = i + 1;
            }
        }
    }
}
