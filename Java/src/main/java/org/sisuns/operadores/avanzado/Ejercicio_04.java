package org.sisuns.operadores.avanzado;

public class Ejercicio_04 {
    public static void main(String[] args) {
        // Coeficientes predeterminados
        double a = 1.0;
        double b = -3.0;
        double c = 2.0;

        // Calcular el discriminante
        double discriminante = b * b - 4 * a * c;

        if (discriminante >= 0) {
            // Calcular las raíces reales
            double x1 = (-b + Math.sqrt(discriminante)) / (2 * a);
            double x2 = (-b - Math.sqrt(discriminante)) / (2 * a);

            // Mostrar las raíces
            System.out.println("Las raíces reales son: " + x1 + " y " + x2);
        } else {
            System.out.println("La ecuación no tiene raíces reales");
        }
    }
}
