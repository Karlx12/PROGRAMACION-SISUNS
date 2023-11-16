package org.sisuns.bucles_for.basico;

public class Ejercicio_04 {
    public static void main(String[] args) {
        // Leer la lista de números
        int[] lista_numeros = {1, 2, 3, 4, 5, 5, 6, 7, 8, 9};

        // Verificar si la lista no está vacía
        if (lista_numeros.length > 0) {
            // Calcular la media
            double media = 0;
            for (int numero : lista_numeros) {
                media += numero;
            }
            media /= lista_numeros.length;

            // Ordenar la lista para calcular la mediana
            int[] lista_numeros_ordenada = new int[lista_numeros.length];
            System.arraycopy(lista_numeros, 0, lista_numeros_ordenada, 0, lista_numeros.length);
            for (int i = 0; i < lista_numeros_ordenada.length - 1; i++) {
                for (int j = 0; j < lista_numeros_ordenada.length - 1 - i; j++) {
                    if (lista_numeros_ordenada[j] > lista_numeros_ordenada[j + 1]) {
                        // Intercambiar elementos si están en el orden incorrecto
                        int temp = lista_numeros_ordenada[j];
                        lista_numeros_ordenada[j] = lista_numeros_ordenada[j + 1];
                        lista_numeros_ordenada[j + 1] = temp;
                    }
                }
            }

            // Calcular la mediana
            double mediana;
            if (lista_numeros_ordenada.length % 2 == 0) {
                int medio1 = lista_numeros_ordenada[lista_numeros_ordenada.length / 2 - 1];
                int medio2 = lista_numeros_ordenada[lista_numeros_ordenada.length / 2];
                mediana = (double) (medio1 + medio2) / 2;
            } else {
                mediana = lista_numeros_ordenada[lista_numeros_ordenada.length / 2];
            }

            // Calcular la moda
            int moda = 0;
            int max_frecuencia = 0;
            for (int i = 0; i < lista_numeros.length; i++) {
                int frecuencia = 0;
                for (int j = 0; j < lista_numeros.length; j++) {
                    if (lista_numeros[j] == lista_numeros[i]) {
                        frecuencia++;
                    }
                }
                if (frecuencia > max_frecuencia) {
                    moda = lista_numeros[i];
                    max_frecuencia = frecuencia;
                }
            }

            // Mostrar los resultados
            System.out.println("Media: " + media);
            System.out.println("Mediana: " + mediana);
            System.out.println("Moda: " + moda);
        } else {
            System.out.println("La lista está vacía");
        }
    }
}
