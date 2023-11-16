package org.sisuns.bucles_while.intermedio;

public class Ejercicio_03 {
    public static void main(String[] args) {
        // Declaración de variables y asignación de valores
        String palabra1 = "stackoverflow";
        String palabra2 = "stackexchange";
        String prefijo = "";
        int longitud1 = palabra1.length();
        int longitud2 = palabra2.length();
        int i = 1;

        // Encontrar el prefijo común con un bucle while
        while (i <= Math.min(longitud1, longitud2)) {
            if (palabra1.substring(0, i).equals(palabra2.substring(0, i))) {
                prefijo = palabra1.substring(0, i);
            } else {
                break; // Si no hay prefijo común, salir del bucle
            }
            i++;
        }

        // Mostrar el resultado
        if (prefijo.length() > 0) {
            System.out.println("El prefijo común es: " + prefijo);
        } else {
            System.out.println("No existe un prefijo común.");
        }
    }
}
