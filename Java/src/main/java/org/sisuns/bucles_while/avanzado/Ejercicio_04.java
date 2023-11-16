package org.sisuns.bucles_while.avanzado;

import java.util.Scanner;

public class Ejercicio_04 {
    public static void main(String[] args) {
        // Declaración de variables
        String usuario = "usuario123";
        String contra = "contraseña456";
        int intentos = 0;
        String usuarioIngresado, contraIngresada;

        // Ciclo while para intentos de inicio de sesión
        while (intentos < 3) {
            // Solicitar al usuario ingresar credenciales
            System.out.print("Ingrese el nombre de usuario: ");
            Scanner scanner = new Scanner(System.in);
            usuarioIngresado = scanner.nextLine();

            System.out.print("Ingrese la contraseña: ");
            contraIngresada = scanner.nextLine();

            // Verificar credenciales
            if (usuarioIngresado.equals(usuario) && contraIngresada.equals(contra)) {
                System.out.println("Inicio de sesión exitoso. Bienvenido, " + usuario);
                break; // Salir del ciclo si las credenciales son correctas
            } else {
                System.out.println("Credenciales incorrectas. Intento " + (intentos + 1) + " de 3");
                intentos++;
            }
        }

        // Bloquear el programa después de 3 intentos fallidos
        if (intentos == 3) {
            System.out.println("Demasiados intentos fallidos. El programa se ha bloqueado.");
        }
    }
}
