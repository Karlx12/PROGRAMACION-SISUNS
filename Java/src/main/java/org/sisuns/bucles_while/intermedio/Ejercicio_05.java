package org.sisuns.bucles_while.intermedio;

public class Ejercicio_05 {
    public static void main(String[] args) {
        // Declaración de variables
        int suma = 0;
        int numero = 1;

        // Calcular la suma de cuadrados de pares y cubos de impares con un bucle while
        while (numero <= 10) {
            if (numero % 2 == 0) {
                // Sumar el cuadrado de números pares
                suma += Math.pow(numero, 2);
            } else {
                // Sumar el cubo de números impares
                suma += Math.pow(numero, 3);
            }
            numero++;
        }

        // Mostrar el resultado
        System.out.println("La suma de cuadrados de pares y cubos de impares entre 1 y 10 es: " + suma);
    }
}
