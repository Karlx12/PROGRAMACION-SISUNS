package org.sisuns.bucles_for.basico;

public class Ejercicio_05 {
    public static void main(String[] args) {
        int N = 5; // Puedes cambiar este valor según sea necesario
        int suma = 0;
        int contador = 0;
        int numero = 2;

        while (true) {
            boolean es_primo = true;

            for (int i = 2; i <= Math.sqrt(numero); i++) {
                if (numero % i == 0) {
                    es_primo = false;
                    break; // Salir del bucle interno si no es primo
                }
            }

            if (es_primo) {
                suma += numero;
                contador++;

                if (contador == N) {
                    break; // Salir del bucle principal si se han encontrado N números primos
                }
            }

            numero++;
        }

        // Mostrar la suma de los primeros N números primos
        System.out.println("La suma de los primeros " + N + " números primos es: " + suma);
    }
}
