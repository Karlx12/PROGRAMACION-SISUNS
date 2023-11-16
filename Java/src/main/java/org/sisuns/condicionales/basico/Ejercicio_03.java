package org.sisuns.condicionales.basico;

public class Ejercicio_03 {
    public static void main(String[] args) {
        // Edad y precio predeterminados para el ejemplo
        int edad = 16;
        double precio = 100.0;

        // Aplicar un descuento del 20% si es menor de 18 años
        if (edad < 18) {
            double precioConDescuento = precio * 0.8;
            System.out.println("Precio con descuento: " + precioConDescuento);
        } else {
            System.out.println("Precio sin descuento: " + precio);
        }
    }
}
