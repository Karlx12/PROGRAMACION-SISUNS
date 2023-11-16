package org.sisuns.operadores.intermedio;

import java.util.Scanner;

public class Ejercicio_03 {
    public static void main(String[] args) {
        // Crear un objeto Scanner para leer la entrada del usuario
        Scanner scanner = new Scanner(System.in);

        // Solicitar la temperatura en grados Celsius
        System.out.print("Ingrese la temperatura en grados Celsius: ");
        double temperaturaCelsius = scanner.nextDouble();

        // Convertir a Kelvin
        double kelvin = temperaturaCelsius + 273.15;

        // Convertir a Ranking
        double ranking = temperaturaCelsius * 1.25;

        // Convertir a Fahrenheit
        double fahrenheit = (temperaturaCelsius * 9 / 5) + 32;

        // Mostrar los resultados
        System.out.println("Temperatura en Kelvin: " + kelvin);
        System.out.println("Temperatura en Ranking: " + ranking);
        System.out.println("Temperatura en Fahrenheit: " + fahrenheit);

        // Cerrar el objeto Scanner para liberar recursos
        scanner.close();
    }
}
