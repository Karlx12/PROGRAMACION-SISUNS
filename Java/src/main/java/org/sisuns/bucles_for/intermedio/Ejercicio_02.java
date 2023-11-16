package org.sisuns.bucles_for.intermedio;

public class Ejercicio_02 {
    public static void main(String[] args) {
        // Definir la lista de números
        int[] numeros = {35, 67, 25, 90, 100, 31, 14, 90};

        // Obtener la longitud de la lista
        int longitud = numeros.length;

        // Aplicar el algoritmo de ordenamiento de burbuja
        for (int i = 0; i < longitud - 1; i++) {
            for (int j = 0; j < longitud - i - 1; j++) {
                if (numeros[j] < numeros[j + 1]) {
                    // Intercambiar los elementos si el elemento actual es menor que el siguiente
                    int temp = numeros[j];
                    numeros[j] = numeros[j + 1];
                    numeros[j + 1] = temp;
                }
            }
        }

        // Mostrar la lista ordenada
        for (int k = 0; k < longitud; k++) {
            System.out.print(numeros[k] + " ");
        }
    }
}
