package org.sisuns.condicionales.basico;

public class Ejercicio_01 {
    public static void main(String[] args) {
        // Monto predeterminado para el ejemplo
        double montoPago = 250.0;

        // Aplicar descuento si el monto es mayor a 200
        if (montoPago > 200) {
            // Aplicar descuento del 20%
            montoPago = montoPago * 0.8;
        }

        // Mostrar el monto a pagar después del descuento
        System.out.println("El monto a pagar es: " + montoPago);
    }
}
