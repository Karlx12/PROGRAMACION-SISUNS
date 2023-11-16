package org.sisuns.condicionales.intermedio;

public class Ejercicio_02 {
    public static void main(String[] args) {
        // Número predeterminado para el ejemplo
        int numero = 1984;

        // Definir listas para los símbolos romanos y sus equivalentes en valores
        String[] simbolosRomanos = {"M", "CM", "D", "CD", "C", "XC", "L", "XL", "X", "IX", "V", "IV", "I"};
        int[] valores = {1000, 900, 500, 400, 100, 90, 50, 40, 10, 9, 5, 4, 1};

        // Verificar si el número está en el rango válido
        if (numero < 1 || numero > 3999) {
            System.out.println("Número fuera de rango");
            return;
        }

        // Inicializar la cadena de resultado
        StringBuilder resultadoRomano = new StringBuilder();

        // Iterar sobre los valores y construir el número romano
        for (int i = 0; i < simbolosRomanos.length; i++) {
            while (numero >= valores[i]) {
                // Agregar el símbolo romano al resultado
                resultadoRomano.append(simbolosRomanos[i]);
                // Restar el valor correspondiente al número
                numero -= valores[i];
            }
        }

        // Mostrar el número romano resultante
        System.out.println("El número romano es: " + resultadoRomano.toString());
    }
}
