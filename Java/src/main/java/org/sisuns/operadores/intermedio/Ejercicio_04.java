package org.sisuns.operadores.intermedio;

import java.util.Scanner;

public class Ejercicio_04 {
    public static void main(String[] args) {
        // Crear un objeto Scanner para leer la entrada del usuario
        Scanner scanner = new Scanner(System.in);

        // Solicitar minutos y horas al cliente
        System.out.print("Ingrese la cantidad de minutos: ");
        int minutos = scanner.nextInt();

        System.out.print("Ingrese la cantidad de horas: ");
        int horas = scanner.nextInt();

        // Calcular el monto total
        double montoTotal = 0;

        if (minutos > 10) {
            montoTotal = (minutos - 10) * 0.30;
        }

        if (horas > 0) {
            montoTotal = montoTotal + horas * 0.60;
        }

        // Solicitar el día de la semana
        System.out.print("Ingrese el día de la semana (en minúsculas): ");
        String diaDeLaSemana = scanner.next();

        // Aplicar descuento los martes y sábados
        if (diaDeLaSemana.equals("martes") || diaDeLaSemana.equals("sábado")) {
            double descuento = montoTotal * 0.15;
            montoTotal = montoTotal - descuento;
        }

        // Mostrar el monto a pagar
        System.out.println("El monto a pagar es: " + montoTotal);

        // Cerrar el objeto Scanner para liberar recursos
        scanner.close();
    }
}
