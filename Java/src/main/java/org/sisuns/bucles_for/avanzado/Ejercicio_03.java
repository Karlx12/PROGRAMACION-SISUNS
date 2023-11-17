package org.sisuns.bucles_for.avanzado;

public class Ejercicio_03 {
    public static void main(String[] args) {
        // Declaración de variables
        int numeroDecimal, base, digitoRestante;
        String resultado = "";
        String baseSimbolos = "0123456789ABCDEF";

        // Lectura del número decimal desde la entrada estándar
        System.out.print("Ingrese el número decimal a convertir: ");
        // Simulación de entrada de usuario
        numeroDecimal = 255;

        // Lectura de la base de conversión desde la entrada estándar
        System.out.print("Elija la base de conversión (2 para binario, 8 para octal, 16 para hexadecimal): ");
        // Simulación de entrada de usuario
        base = 16;

        // Verificar que la base esté en el conjunto {2, 8, 16}
        if (base != 2 && base != 8 && base != 16) {
            System.out.println("La base de conversión no es válida. Debe ser 2, 8 o 16.");
        } else {
            // Proceso de conversión
            while (numeroDecimal > 0) {
                digitoRestante = numeroDecimal % base;
                resultado = baseSimbolos.charAt(digitoRestante) + resultado;
                numeroDecimal = numeroDecimal / base;
            }

            // Mostrar el resultado
            System.out.println("El número " + numeroDecimal + " en base " + base + " es: " + resultado);
        }
    }
}
