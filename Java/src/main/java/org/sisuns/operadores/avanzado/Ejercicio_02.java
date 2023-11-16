package org.sisuns.operadores.avanzado;

public class Ejercicio_02 {
    public static void main(String[] args) {
        // Definir la cantidad de metros cuadrados por árbol
        int metrosCuadradosPino = 10;
        int metrosCuadradosEucalipto = 15;
        int metrosCuadradosPalmera = 18;

        // Definir la cantidad de árboles por hectárea
        int arbolesPorHectareaPino = 8;
        int arbolesPorHectareaEucalipto = 15;
        int arbolesPorHectareaPalmera = 10;

        // Definir la cantidad de hectáreas disponibles
        int hectareasDisponibles = 7;

        // Calcular el número de árboles a sembrar
        int pinos = hectareasDisponibles * arbolesPorHectareaPino;
        int eucaliptos = hectareasDisponibles * arbolesPorHectareaEucalipto;
        int palmeras = hectareasDisponibles * arbolesPorHectareaPalmera;

        // Mostrar los resultados
        System.out.println("Número de pinos a sembrar: " + pinos);
        System.out.println("Número de eucaliptos a sembrar: " + eucaliptos);
        System.out.println("Número de palmeras a sembrar: " + palmeras);
    }
}
