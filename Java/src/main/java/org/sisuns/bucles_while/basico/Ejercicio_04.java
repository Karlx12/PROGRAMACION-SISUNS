package org.sisuns.bucles_while.basico;

public class Ejercicio_04 {
    public static void main(String[] args) {
        // Declaración de variables
        int numero = 12321;  // Ingresa el número a verificar

        // Verificar que el número tenga 4 cifras
        if (numero >= 1000 && numero <= 9999) {
            // Inicialización de variables
            int original = numero;
            int inverso = 0;
            int digito;

            // Obtener el número inverso
            while (numero > 0) {
                digito = numero % 10;
                inverso = inverso * 10 + digito;
                numero = numero / 10;
            }

            // Verificar si es capicúa y mostrar el resultado
            if (original == inverso) {
                System.out.println("El número " + original + " es capicúa.");
            } else {
                System.out.println("El número " + original + " no es capicúa.");
            }
        } else {
            System.out.println("El número ingresado no tiene 4 cifras. Fin del programa.");
        }
    }
}
