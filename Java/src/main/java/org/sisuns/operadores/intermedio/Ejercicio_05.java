package org.sisuns.operadores.intermedio;

import java.util.Scanner;

public class Ejercicio_05 {
    public static void main(String[] args) {
        // Crear un objeto Scanner para leer la entrada del usuario
        Scanner scanner = new Scanner(System.in);

        // Solicitar el radio y la altura al usuario
        System.out.print("Ingrese el radio del cilindro: ");
        double radio = scanner.nextDouble();

        System.out.print("Ingrese la altura del cilindro: ");
        double altura = scanner.nextDouble();

        // Calcular el área del cilindro
        double area = 2 * Math.PI * radio * (radio + altura);

        // Mostrar el resultado
        System.out.println("El área del cilindro es: " + area);

        // Cerrar el objeto Scanner para liberar recursos
        scanner.close();
    }
}
