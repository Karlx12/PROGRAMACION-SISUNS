package org.sisuns.bucles_while.basico;

public class Ejercicio_01 {
    public static void main(String[] args) {
        // Establecer el iterador i e inicializarlo en 1
        int i = 1;

        // Iterar mientras i sea menor o igual a 100
        while (i <= 100) {
            // Verificar si i es un número par
            if (i % 2 == 0) {
                // Imprimir el número par
                System.out.println(i);
            }

            // Incrementar el iterador
            i = i + 1;
        }
    }
}
