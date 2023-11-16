package org.sisuns.bucles_for.intermedio;

public class Ejercicio_05 {
    public static void main(String[] args) {
        // Declaración de variables
        double x, y;

        // Para cada valor de x de 1 a 10
        for (int i = 1; i <= 10; i++) {
            // Asignar el valor actual de x
            x = i;

            // Calcular el valor de la función Y
            y = (3 * Math.pow(x, 2) + 12 * x + 6 * x + 9) / (2 * Math.pow(x, 2) - 32);

            // Mostrar el resultado
            System.out.println("Cuando x = " + x + ", Y = " + y);
        }
    }
}
