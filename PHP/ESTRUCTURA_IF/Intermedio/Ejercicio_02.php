<?php
    //Un array en PHP no necesariamente debe contener valores de un mismo tipo.
    $simbolos_romanos = ["M", "CM", "D", "CD", "C", "XC", "L", "XL", "X", "IX", "V", "IV", "I"];
    $valores = [1000, 900, 500, 400, 100, 90, 50, 40, 10, 9, 5, 4, 1];

    $numero = 55; //Valor dado por el usuario.

    if ($numero < 1 || $numero > 3999) {
        echo "Número fuera de rango";
        exit; //Detiene la ejecución del programa.
    }

    $resultado_romano = "";

    //count() realiza un conteo de cuantos elementos tiene un array.
    for ($i = 0; $i < count($simbolos_romanos); $i++) {
        while ($numero >= $valores[$i]) {
            $resultado_romano .= $simbolos_romanos[$i];
            $numero -= $valores[$i];
        }
    }

    echo "El número romano es: ". $resultado_romano;
?>