package org.sisuns.operadores.basico;

import java.util.Scanner;

public class Ejercicio_05 {
    public static void main(String[] args) {
        // Crear un objeto Scanner para leer la entrada del usuario
        Scanner scanner = new Scanner(System.in);

        // Ingresar longitud de la arista
        System.out.print("Ingrese la longitud de la arista: ");
        double arista = scanner.nextDouble();

        // Calcular área
        double area = Math.sqrt(3) * Math.pow(arista, 2);

        // Calcular volumen
        double volumen = (Math.sqrt(2) / 12) * Math.pow(arista, 3);

        // Mostrar resultados
        System.out.println("El área del tetraedro es: " + area);
        System.out.println("El volumen del tetraedro es: " + volumen);

        // Cerrar el objeto Scanner para liberar recursos
        scanner.close();
    }
}
