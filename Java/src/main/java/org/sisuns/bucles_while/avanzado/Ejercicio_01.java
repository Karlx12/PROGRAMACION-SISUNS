package org.sisuns.bucles_while.avanzado;

public class Ejercicio_01 {
    public static void main(String[] args) {
        // Declaración de variables
        int dividendo, divisor, cociente, residuo;

        // Entrada de datos
        System.out.print("Ingrese el dividendo: ");
        dividendo = Integer.parseInt(System.console().readLine());

        // Validar el divisor para evitar divisiones por cero
        do {
            System.out.print("Ingrese el divisor (debe ser mayor que 0): ");
            divisor = Integer.parseInt(System.console().readLine());

            if (divisor <= 0) {
                System.out.println("El divisor debe ser mayor que 0. Inténtelo de nuevo.");
            }
        } while (divisor <= 0);

        // Inicializar el cociente y el residuo
        cociente = 0;
        residuo = dividendo;

        // Simular la división usando restas
        while (residuo >= divisor) {
            residuo = residuo - divisor;
            cociente = cociente + 1;
        }

        // Mostrar resultados
        System.out.println("Cociente: " + cociente);
        System.out.println("Residuo: " + residuo);
    }
}
