package org.sisuns.condicionales.avanzado;

public class Ejercicio_03 {
    public static void main(String[] args) {
        // Definir tres números enteros
        int num1 = 0; // Puedes cambiar estos valores según tus necesidades
        int num2 = 0;
        int num3 = 0;

        // Verificar cuál es el número intermedio
        if ((num1 >= num2 && num1 <= num3) || (num1 <= num2 && num1 >= num3)) {
            System.out.println("El número intermedio es: " + num1);
        } else if ((num2 >= num1 && num2 <= num3) || (num2 <= num1 && num2 >= num3)) {
            System.out.println("El número intermedio es: " + num2);
        } else {
            System.out.println("El número intermedio es: " + num3);
        }
    }
}
