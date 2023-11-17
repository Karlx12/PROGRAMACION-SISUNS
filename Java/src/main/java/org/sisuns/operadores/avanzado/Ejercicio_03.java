package org.sisuns.operadores.avanzado;

public class Ejercicio_03 {
    public static void main(String[] args) {
        // Valores predeterminados
        double capital = 1000.0; // Ejemplo: $1000
        double tasaInteres = 5.0; // Ejemplo: 5%
        double tiempo = 2.0; // Ejemplo: 2 años

        // Convertir la tasa de interés a decimal
        tasaInteres /= 100;

        // Calcular el interés simple
        double interes = capital * tasaInteres * tiempo;

        // Mostrar el resultado
        System.out.println("El interés simple es: " + interes);
    }
}
