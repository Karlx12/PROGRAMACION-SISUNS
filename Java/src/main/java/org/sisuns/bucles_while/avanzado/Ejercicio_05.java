package org.sisuns.bucles_while.avanzado;

import java.util.Scanner;

public class Ejercicio_05 {
    public static void main(String[] args) {
        // Declaración de variables
        String[] opciones = {"Piedra", "Papel", "Tijeras"};
        int victorias = 0;
        int derrotas = 0;
        String eleccionUsuario, eleccionComputadora;
        int indiceComputadora;

        // Ciclo while para jugar múltiples rondas
        while (true) {
            // Mostrar opciones al usuario
            System.out.println("Opciones: 1. Piedra, 2. Papel, 3. Tijeras, 0. Salir");
            System.out.println("Victorias: " + victorias + " Derrotas: " + derrotas);

            // Solicitar al usuario elegir una opción
            System.out.print("Elige una opción (1-3): ");
            Scanner scanner = new Scanner(System.in);
            eleccionUsuario = scanner.nextLine();

            // Salir del juego si el usuario elige la opción 0
            if (eleccionUsuario.equals("0")) {
                System.out.println("Fin del juego. Gracias por jugar.");
                break;
            }

            // Generar elección para la computadora (alternando entre las opciones)
            indiceComputadora = (Integer.parseInt(eleccionUsuario) % 3) + 1;
            eleccionComputadora = opciones[indiceComputadora - 1];

            // Mostrar las elecciones del usuario y la computadora
            System.out.println("Tu elección: " + opciones[Integer.parseInt(eleccionUsuario) - 1]);
            System.out.println("Elección de la computadora: " + eleccionComputadora);

            // Determinar el ganador de la ronda
            if (eleccionUsuario.equals(eleccionComputadora)) {
                System.out.println("Empate en esta ronda.");
            } else if ((eleccionUsuario.equals("1") && eleccionComputadora.equals("3")) ||
                    (eleccionUsuario.equals("2") && eleccionComputadora.equals("1")) ||
                    (eleccionUsuario.equals("3") && eleccionComputadora.equals("2"))) {
                System.out.println("¡Ganaste esta ronda!");
                victorias++;
            } else {
                System.out.println("¡Perdiste esta ronda!");
                derrotas++;
            }
        }
    }
}
