package org.sisuns.bucles_for.intermedio;

public class Ejercicio_01 {
    public static void main(String[] args) {
        // Leer la palabra desde la entrada estándar
        String palabra = "reconocer"; // Puedes cambiar esto según sea necesario

        // Inicializar la palabraReversa
        String palabraReversa = "";

        // Calcular la palabra al revés
        int tamCadena = palabra.length();
        for (int i = tamCadena - 1; i >= 0; i--) {
            palabraReversa = palabraReversa + palabra.substring(i, i + 1);
        }

        // Verificar si es un palíndromo
        if (palabra.equals(palabraReversa)) {
            System.out.println("Es un palíndromo");
        } else {
            System.out.println("No es un palíndromo");
        }

        // Imprimir la palabra al revés
        System.out.println("Palabra al revés: " + palabraReversa);
    }
}
