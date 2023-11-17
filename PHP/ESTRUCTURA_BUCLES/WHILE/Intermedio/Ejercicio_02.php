<?php
    $N = 5;

    if ($N <= 0) {
        echo "El número debe ser un entero positivo. Fin del programa.";
    } else {
        $termino = 7;
        $incremento = 2;
        $i = 1;

        while ($i <= $N) {
            echo $termino ." ";
            $termino += $incremento;
            $incremento++;
            $i++;
        }
    }
?>