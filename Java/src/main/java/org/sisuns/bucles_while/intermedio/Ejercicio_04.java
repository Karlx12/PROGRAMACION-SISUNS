package org.sisuns.bucles_while.intermedio;

public class Ejercicio_04 {
    public static void main(String[] args) {
        // Declaración de variables y asignación de valores
        String texto = "Esta es una cadena de ejemplo para contar palabras";
        int contadorPalabras = 0;
        int longitud = texto.length();
        int i = 1;

        // Contar el número de palabras con un bucle while
        while (i <= longitud) {
            // Si encuentra un espacio, incrementar el contador de palabras
            if (texto.substring(i - 1, i).equals(" ")) {
                contadorPalabras++;
            }
            i++;
        }

        // Incrementar el contador para la última palabra (no seguida por espacio)
        contadorPalabras++;

        // Mostrar el resultado
        System.out.println("El número de palabras en el texto es: " + contadorPalabras);
    }
}
