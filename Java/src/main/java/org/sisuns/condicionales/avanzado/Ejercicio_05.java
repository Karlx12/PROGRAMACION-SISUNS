package org.sisuns.condicionales.avanzado;

public class Ejercicio_05 {
    public static void main(String[] args) {
        // Leer el consumo mensual en minutos (puedes cambiar el valor)
        int consumoMensual = 900;

        // Inicializar variables de precios y descuento
        double precioNormal = 0.03;
        double precioDescuento = 0.02;
        double descuentoPorcentaje = 1.25;

        // Calcular el costo según la política de la empresa
        double costoTotal;

        if (consumoMensual > 800) {
            // Calcular el costo para los primeros 300 minutos a precio normal
            double costoPrimeros300 = 300 * precioNormal;

            // Calcular el costo para los siguientes minutos a precio de descuento
            double costoRestantes = (consumoMensual - 300) * precioDescuento;

            // Calcular el descuento
            double descuento = (costoPrimeros300 + costoRestantes) * (descuentoPorcentaje / 100);

            // Calcular el costo final con descuento
            costoTotal = costoPrimeros300 + costoRestantes - descuento;
        } else if (consumoMensual > 500) {
            // Calcular el costo para los primeros 300 minutos a precio normal
            double costoPrimeros300 = 300 * precioNormal;

            // Calcular el costo para los siguientes minutos a precio de descuento
            double costoRestantes = (consumoMensual - 300) * precioDescuento;

            // Calcular el costo total sin descuento
            costoTotal = costoPrimeros300 + costoRestantes;
        } else if (consumoMensual > 300) {
            // Calcular el costo para todos los minutos a precio normal
            costoTotal = consumoMensual * precioNormal;
        } else {
            // Calcular el costo para todos los minutos a precio normal
            costoTotal = consumoMensual * precioNormal;
        }

        // Mostrar el costo total
        System.out.println("El costo total es: " + costoTotal);
    }
}
