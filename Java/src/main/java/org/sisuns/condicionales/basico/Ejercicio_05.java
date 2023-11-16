package org.sisuns.condicionales.basico;

public class Ejercicio_05 {
    public static void main(String[] args) {
        // Peso y altura predeterminados para el ejemplo
        double peso = 70.0;
        double altura = 1.75;

        // Calcular el Índice de Masa Corporal (IMC)
        double imc = peso / (altura * altura);

        // Determinar la categoría del IMC
        if (imc < 18.5) {
            System.out.println("Bajo de peso");
        } else if (imc >= 18.5 && imc < 25) {
            System.out.println("Peso normal");
        } else if (imc >= 25 && imc < 30) {
            System.out.println("Sobrepeso");
        } else {
            System.out.println("Obesidad");
        }
    }
}
