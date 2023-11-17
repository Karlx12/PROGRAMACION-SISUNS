<?php
    $HH = 8;
    $MM = 30;
    $SS = 0;
    $tiempoViaje = 7200;

    $tiempoPartida = $HH * 3600 + $MM * 60 + $SS;

    $tiempoLlegada = $tiempoPartida + $tiempoViaje;

    //La función intval() nos devuelve la parte entera del valor dentro del paréntesis.
    //intval (Integer value): Valor entero.
    $HH_llegada = intval($tiempoLlegada / 3600);
    $MM_llegada = intval(($tiempoLlegada % 3600) / 60);
    $SS_llegada = $tiempoLlegada % 60;
    
    echo "Hora de llegada: " . $HH_llegada . ":" . $MM_llegada . ":" . $SS_llegada;
?>