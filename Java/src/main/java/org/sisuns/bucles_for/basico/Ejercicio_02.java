package org.sisuns.bucles_for.basico;

public class Ejercicio_02 {
    public static void main(String[] args) {
        // Iterar a través de los números del 1 al 100
        for (int numero = 1; numero <= 100; numero++) {
            // Imprimir el número actual
            System.out.print(numero);

            // Verificar si el número es divisible por 3 para agregar un guion bajo
            if (numero % 3 == 0) {
                System.out.print("_");
            }

            // Imprimir un espacio para separar los números
            System.out.print(" ");
        }
    }
}
