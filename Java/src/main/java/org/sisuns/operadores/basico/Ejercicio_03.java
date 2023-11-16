package org.sisuns.operadores.basico;

import java.util.Scanner;

public class Ejercicio_03 {
    public static void main(String[] args) {
        // Crear un objeto Scanner para leer la entrada del usuario
        Scanner scanner = new Scanner(System.in);

        // Ingresar dos números
        System.out.print("Ingrese el dividendo: ");
        int dividendo = scanner.nextInt();

        System.out.print("Ingrese el divisor: ");
        int divisor = scanner.nextInt();

        // Calcular residuo
        int residuo = dividendo % divisor;

        // Mostrar resultado
        System.out.println("El residuo de la división es: " + residuo);

        // Cerrar el objeto Scanner para liberar recursos
        scanner.close();
    }
}
