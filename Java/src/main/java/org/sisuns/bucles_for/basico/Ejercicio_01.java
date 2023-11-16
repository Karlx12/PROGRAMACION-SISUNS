package org.sisuns.bucles_for.basico;

public class Ejercicio_01 {
    public static void main(String[] args) {
        // Definir número
        int dato = 0; // Asigna aquí el número que deseas verificar

        // Inicializar contador de divisores
        int contador = 0;

        // Verificar si el número es divisible entre él mismo y los anteriores a él
        for (int i = 1; i <= Math.sqrt(dato); i++) {
            if (dato % i == 0) {
                // El número es divisible, aumentar el contador
                contador++;
            }
        }

        // Determinar si el número es primo
        if (contador == 2) {
            System.out.println("El número " + dato + " es primo.");
        } else {
            // Aquellos con más de 2 divisores no son primos
            System.out.println("El número " + dato + " no es primo.");
        }
    }
}
