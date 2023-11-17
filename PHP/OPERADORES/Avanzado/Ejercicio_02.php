<?php
    $metrosCuadradosPino = 10;
    $metrosCuadradosEucalipto = 15;
    $metrosCuadradosPalmera = 18;

    $arbolesPorHectareaPino = 8;
    $arbolesPorHectareaEucalipto = 15;
    $arbolesPorHectareaPalmera = 10;

    $hectareasDisponibles = 7;

    $pinos = $hectareasDisponibles * $arbolesPorHectareaPino;
    $eucaliptos = $hectareasDisponibles * $arbolesPorHectareaEucalipto;
    $palmeras = $hectareasDisponibles * $arbolesPorHectareaPalmera;

    echo "Número de pinos a sembrar: " . $pinos . "<br>";
    echo "Número de eucaliptos a sembrar: " . $eucaliptos . "<br>";
    echo "Número de palmeras a sembrar: " . $palmeras . "<br>";
?>