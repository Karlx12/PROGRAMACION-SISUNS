<?php
    $suma = 0;
    $numero = 1;

    while ($numero <= 10) {
        if ($numero % 2 == 0) {
            //El operador ** tambien puede ser reemplazado por la función pow() que solicita el valor
            //y el exponente como parámetros.
            $suma += pow($numero, 2);
        } else {
            $suma += pow($numero, 3);
        }
        $numero++;
    }
    echo "La suma de cuadrados de pares y cubos de impares entre 1 y 10 es: ". $suma;
?>