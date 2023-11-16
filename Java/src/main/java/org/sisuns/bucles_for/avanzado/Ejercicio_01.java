package org.sisuns.bucles_for.avanzado;

public class Ejercicio_01 {
    public static void main(String[] args) {
        // Declaración de variables
        String secuenciaADN = "ATGCTAAGGTTCACGG";
        int longitudSADN = secuenciaADN.length();
        int adenina = 0, citosina = 0, guanina = 0, timina = 0;

        // Iterar a través de cada letra de la secuencia de ADN
        for (int i = 0; i < longitudSADN; i++) {
            // Obtener el carácter en la posición i
            char letra = secuenciaADN.charAt(i);

            // Utilizar un switch para determinar la letra y aumentar el contador correspondiente
            switch (letra) {
                case 'A':
                    adenina++;
                    break;
                case 'C':
                    citosina++;
                    break;
                case 'G':
                    guanina++;
                    break;
                case 'T':
                    timina++;
                    break;
            }
        }

        // Mostrar los resultados
        System.out.println("Adenina (A): " + adenina);
        System.out.println("Citosina (C): " + citosina);
        System.out.println("Guanina (G): " + guanina);
        System.out.println("Timina (T): " + timina);
    }
}
