package org.sisuns.operadores.basico;

import java.util.Scanner;

public class Ejercicio_04 {
    public static void main(String[] args) {
        // Crear un objeto Scanner para leer la entrada del usuario
        Scanner scanner = new Scanner(System.in);

        // Ingresar longitudes de los lados
        System.out.print("Ingrese la longitud del lado 1: ");
        double lado1 = scanner.nextDouble();

        System.out.print("Ingrese la longitud del lado 2: ");
        double lado2 = scanner.nextDouble();

        System.out.print("Ingrese la longitud del lado 3: ");
        double lado3 = scanner.nextDouble();

        // Calcular semiperímetro
        double s = (lado1 + lado2 + lado3) / 2;

        // Calcular área usando la fórmula de Herón
        double area = Math.sqrt(s * (s - lado1) * (s - lado2) * (s - lado3));

        // Mostrar resultado
        System.out.println("El área del triángulo es: " + area);

        // Cerrar el objeto Scanner para liberar recursos
        scanner.close();
    }
}
