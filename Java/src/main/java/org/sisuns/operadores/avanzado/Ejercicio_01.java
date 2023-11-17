package org.sisuns.operadores.avanzado;

public class Ejercicio_01 {
    public static void main(String[] args) {
        // Ingresar la hora de partida y el tiempo de viaje en segundos
        int HH = 10; // Hora de partida
        int MM = 30; // Minuto de partida
        int SS = 0;  // Segundo de partida
        int tiempoViaje = 7200; // Tiempo de viaje en segundos (2 horas)

        // Convertir la hora de partida a segundos
        int tiempoPartida = HH * 3600 + MM * 60 + SS;

        // Calcular la hora de llegada en segundos
        int tiempoLlegada = tiempoPartida + tiempoViaje;

        // Convertir la hora de llegada a formato HH:MM:SS
        int HH_llegada = tiempoLlegada / 3600;
        int MM_llegada = (tiempoLlegada % 3600) / 60;
        int SS_llegada = tiempoLlegada % 60;

        // Mostrar la hora de llegada
        System.out.println("Hora de llegada: " + HH_llegada + ":" + MM_llegada + ":" + SS_llegada);
    }
}
