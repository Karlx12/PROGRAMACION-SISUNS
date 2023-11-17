package org.sisuns.condicionales.intermedio;

public class Ejercicio_04 {
    public static void main(String[] args) {
        // Definir el salario normal por hora (asignar un valor específico)
        double salarioNormal = 10.0;

        // Solicitar al usuario ingresar las horas trabajadas
        System.out.print("Ingrese las horas trabajadas: ");
        int horasTrabajadas = 0; // Puedes asignar un valor específico si lo deseas
        // Leer las horas trabajadas
        // horasTrabajadas = ...; // Puedes utilizar Scanner si lo prefieres

        // Calcular el salario según las horas extras
        double salario;
        if (horasTrabajadas > 40) {
            int horasNormales = 40;
            int horasExtras = horasTrabajadas - 40;
            salario = (horasNormales * salarioNormal) + (horasExtras * salarioNormal * 2);
        } else {
            salario = horasTrabajadas * salarioNormal;
        }

        // Mostrar el salario
        System.out.println("El salario es: " + salario);
    }
}
