package org.sisuns.bucles_for.intermedio;

public class Ejercicio_03 {
    public static void main(String[] args) {
        // Definir las variables
        double inversionInicial = 1000.00;
        double tasaInteresMensual = 0.02;
        int mesesEnUnAno = 12;
        double dineroDespuesDeUnAno = inversionInicial;

        // Calcular la inversión anual
        for (int mes = 1; mes <= mesesEnUnAno; mes++) {
            // Calcular el interés del mes
            double interesDelMes = dineroDespuesDeUnAno * tasaInteresMensual;

            // Sumar el interés al dinero acumulado
            dineroDespuesDeUnAno += interesDelMes;
        }

        // Mostrar la cantidad de dinero después de un año
        System.out.println("La cantidad de dinero después de un año es: $" + dineroDespuesDeUnAno);
    }
}
