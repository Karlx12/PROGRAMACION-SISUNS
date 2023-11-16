package org.sisuns.condicionales.avanzado;

public class Ejercicio_04 {
    public static void main(String[] args) {
        // Ingresar un número de 4 dígitos (puedes cambiar el valor)
        int numero = 1234;

        // Verificar si el número tiene 4 dígitos
        if (numero >= 1000 && numero <= 9999) {
            // Inicializar contador de dígitos impares
            int contadorImpares = 0;

            // Iterar sobre cada dígito del número
            while (numero > 0) {
                // Obtener el último dígito
                int digito = numero % 10;

                // Verificar si el dígito es impar
                if (digito % 2 != 0) {
                    // Incrementar el contador de dígitos impares
                    contadorImpares++;
                }

                // Eliminar el último dígito
                numero = numero / 10;
            }

            // Mostrar la cantidad de dígitos impares
            System.out.println("La cantidad de dígitos impares es: " + contadorImpares);
        } else {
            System.out.println("El número no tiene 4 dígitos.");
        }
    }
}
