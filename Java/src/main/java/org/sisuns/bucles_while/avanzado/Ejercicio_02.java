package org.sisuns.bucles_while.avanzado;

public class Ejercicio_02 {
    public static void main(String[] args) {
        // Declaración de variables
        int numeroAleatorio, intento = 0, numeroAdivinanza;

        // Inicialización de variables
        // Puedes cambiar el número aleatorio según tus preferencias
        numeroAleatorio = 50;

        // Ciclo para adivinar el número
        do {
            // Incrementar el contador de intentos
            intento++;

            // Solicitar al usuario adivinar el número
            System.out.print("Intento " + intento + ": Ingrese un número entre 1 y 100: ");
            numeroAdivinanza = Integer.parseInt(System.console().readLine());

            // Verificar si el número es igual, mayor o menor
            if (numeroAdivinanza == numeroAleatorio) {
                System.out.println("¡Felicitaciones! Has adivinado el número correctamente.");
            } else {
                if (numeroAdivinanza < numeroAleatorio) {
                    System.out.println("El número es mayor. Intenta nuevamente.");
                } else {
                    System.out.println("El número es menor. Intenta nuevamente.");
                }
            }

        } while (numeroAdivinanza != numeroAleatorio);
    }
}
