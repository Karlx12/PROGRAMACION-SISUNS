package org.sisuns.condicionales.intermedio;

public class Ejercicio_03 {
    public static void main(String[] args) {
        // Asignar un valor específico al descuento aleatorio (por ejemplo, 50)
        double descuentoAleatorio = 50;

        // Definir el total de la compra
        double totalCompra = 0; // Puedes asignar un valor específico si lo deseas

        // Calcular el descuento según la regla dada
        double descuento;
        if (descuentoAleatorio < 74) {
            descuento = totalCompra * 0.15;
        } else {
            descuento = totalCompra * 0.20;
        }

        // Mostrar el descuento
        System.out.println("El descuento es: " + descuento);
    }
}
