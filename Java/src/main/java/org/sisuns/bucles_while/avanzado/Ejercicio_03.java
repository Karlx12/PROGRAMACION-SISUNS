package org.sisuns.bucles_while.avanzado;

public class Ejercicio_03 {
    public static void main(String[] args) {
        // Declaración de variables
        int multiplicando, multiplicador, resultado;

        // Lectura de los números a multiplicar desde la entrada estándar
        System.out.print("Ingrese el multiplicando: ");
        multiplicando = Integer.parseInt(System.console().readLine());

        System.out.print("Ingrese el multiplicador: ");
        multiplicador = Integer.parseInt(System.console().readLine());

        // Inicialización de variables
        resultado = 0;

        // Aplicar el algoritmo de la multiplicación rusa
        while (multiplicando > 0) {
            // Si el multiplicando es impar, sumar al resultado el multiplicador
            if (multiplicando % 2 != 0) {
                resultado += multiplicador;
            }

            // Dividir el multiplicando por 2 y multiplicar el multiplicador por 2
            multiplicando /= 2;
            multiplicador *= 2;
        }

        // Mostrar el resultado de la multiplicación
        System.out.println("El resultado de la multiplicación es: " + resultado);
    }
}
