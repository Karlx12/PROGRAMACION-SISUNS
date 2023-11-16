package org.sisuns.condicionales.basico;

public class Ejercicio_04 {
    public static void main(String[] args) {
        // Edad predeterminada para el ejemplo
        int edad = 25;

        // Determinar en qué rango se encuentra
        if (edad >= 0 && edad <= 12) {
            System.out.println("Niño");
        } else if (edad >= 13 && edad <= 17) {
            System.out.println("Adolescente");
        } else if (edad >= 18 && edad <= 64) {
            System.out.println("Adulto");
        } else {
            System.out.println("Adulto Mayor");
        }
    }
}
