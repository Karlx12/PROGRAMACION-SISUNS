package org.sisuns.bucles_for.basico;

public class Ejercicio_03 {
    public static void main(String[] args) {
        // Leer el tamaño del cuadrado (n)
        int n = 5; // Puedes cambiar este valor según tus necesidades

        // Verificar si n es mayor que 0
        if (n > 0) {
            // Iterar a través de las filas del cuadrado
            for (int fila = 1; fila <= n; fila++) {
                // Iterar a través de las columnas del cuadrado
                for (int columna = 1; columna <= n; columna++) {
                    // Imprimir un asterisco
                    System.out.print("* ");
                }

                // Salto de línea después de cada fila
                System.out.println();
            }
        } else {
            System.out.println("El tamaño debe ser mayor que 0");
        }
    }
}
