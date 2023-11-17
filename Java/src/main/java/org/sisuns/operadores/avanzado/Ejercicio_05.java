package org.sisuns.operadores.avanzado;

public class Ejercicio_05 {
    public static void main(String[] args) {
        // Matriz predeterminada
        int[][] matriz = {
                {1, 2, 3},
                {4, 5, 6},
                {7, 8, 9}
        };

        // Calcular el determinante
        int determinante = matriz[0][0] * (matriz[1][1] * matriz[2][2] - matriz[1][2] * matriz[2][1])
                - matriz[0][1] * (matriz[1][0] * matriz[2][2] - matriz[1][2] * matriz[2][0])
                + matriz[0][2] * (matriz[1][0] * matriz[2][1] - matriz[1][1] * matriz[2][0]);

        // Mostrar el resultado
        if (determinante != 0) {
            System.out.println("El determinante de la matriz es diferente de cero.");
        } else {
            System.out.println("El determinante de la matriz es cero, la matriz no es invertible.");
        }
    }
}
