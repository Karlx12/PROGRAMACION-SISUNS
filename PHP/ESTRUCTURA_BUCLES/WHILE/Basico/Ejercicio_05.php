<?php
    $numero = 9;
    //$suma es un acumulador ya en el se guardan un conjunto de valores según una iteración.
    $suma = 0;

    while ($numero <= 45) {
        if ($numero < 21 || $numero > 27) {
            if ($numero % 3 == 0 || $numero % 7 == 0) {
                $suma += $numero;
            }
        }
        $numero++;
    }

    echo "La suma de los múltiplos de 3 y 7 es: $suma";
?>