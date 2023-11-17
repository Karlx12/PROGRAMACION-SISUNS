<?php
    $contador = 0;
    $dato = 7;
    for ($i = 1; $i <= $dato; $i++) {
        if ($dato % $i == 0) {
            $contador++;
        }
    }

    if ($contador == 2) {
        echo "El número ".$dato." es primo.";
    } else {
        echo "El número ".$dato." no es primo.";
    }
?>