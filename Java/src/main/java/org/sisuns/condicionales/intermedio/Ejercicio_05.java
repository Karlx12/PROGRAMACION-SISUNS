package org.sisuns.condicionales.intermedio;

public class Ejercicio_05 {
    public static void main(String[] args) {
        // Solicitar al usuario ingresar la cantidad de hijos y la situación de la madre
        System.out.print("Ingrese la cantidad de hijos: ");
        int cantidadHijos = 0; // Puedes asignar un valor específico si lo deseas
        // Leer la cantidad de hijos
        // cantidadHijos = ...; // Puedes utilizar Scanner si lo prefieres

        System.out.print("¿La madre es viuda? (Sí/No): ");
        String madreViuda = "No"; // Puedes asignar un valor específico si lo deseas
        // Leer la situación de la madre
        // madreViuda = ...; // Puedes utilizar Scanner si lo prefieres

        // Calcular el monto del subsidio familiar
        int monto = 0;

        if (cantidadHijos <= 2) {
            monto = 70;
        } else if (cantidadHijos >= 3 && cantidadHijos <= 5) {
            monto = 90;
        } else {
            monto = 120;
        }

        // Por cada hijo en edad escolar reciben S/.10.00 adicionales
        System.out.print("Ingrese la cantidad de hijos en edad escolar: ");
        int hijosEdadEscolar = 0; // Puedes asignar un valor específico si lo deseas
        // Leer la cantidad de hijos en edad escolar
        // hijosEdadEscolar = ...; // Puedes utilizar Scanner si lo prefieres
        monto += hijosEdadEscolar * 10;

        // Si la madre es viuda, la familia recibe S/.20.00 adicionales
        if (madreViuda.equalsIgnoreCase("Sí")) {
            monto += 20;
        }

        // Mostrar el monto mensual
        System.out.println("El monto mensual es: " + monto);
    }
}
