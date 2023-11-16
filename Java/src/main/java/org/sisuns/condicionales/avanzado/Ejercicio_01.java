package org.sisuns.condicionales.avanzado;

public class Ejercicio_01 {
    public static void main(String[] args) {
        // Definir el número
        int dato = 0; // Puedes cambiar este valor según tus necesidades

        // Verificar el tipo de número
        if (dato == 0) {
            System.out.println("Es neutro");
        } else if (dato > 0) {
            System.out.println("Es positivo");
        } else {
            System.out.println("Es negativo");
        }

        // Verificar si es múltiplo de 3 o 5
        if (dato % 3 == 0 || dato % 5 == 0) {
            System.out.println("El número es múltiplo de 3 o 5.");
        } else {
            System.out.println("El número no es múltiplo de 3 o 5.");
        }
    }
}
