<?php
    $resultado = 0;

    $multiplicando = 7;
    $multiplicador = 4;

    while ($multiplicando > 0) {
        if ($multiplicando % 2 !== 0) {
            $resultado += $multiplicador;
        }
        //La función intdiv() realiza una división entera
        $multiplicando = intdiv($multiplicando, 2);
        $multiplicador = $multiplicador * 2;
    }

    echo "El resultado de la multiplicación es: $resultado <br>";
?>