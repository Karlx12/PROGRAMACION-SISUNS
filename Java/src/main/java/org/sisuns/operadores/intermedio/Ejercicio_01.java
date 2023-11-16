package org.sisuns.operadores.intermedio;

import java.util.Scanner;

public class Ejercicio_01 {
    public static void main(String[] args) {
        // Crear un objeto Scanner para leer la entrada del usuario
        Scanner scanner = new Scanner(System.in);

        // Solicitar tres notas al usuario
        System.out.print("Ingrese la nota 1: ");
        double nota1 = scanner.nextDouble();

        System.out.print("Ingrese la nota 2: ");
        double nota2 = scanner.nextDouble();

        System.out.print("Ingrese la nota 3: ");
        double nota3 = scanner.nextDouble();

        // Calcular el promedio
        double promedio = (nota1 + nota2 + nota3) / 3;

        // Mostrar el resultado
        System.out.println("El promedio de las notas es: " + promedio);

        // Cerrar el objeto Scanner para liberar recursos
        scanner.close();
    }
}
