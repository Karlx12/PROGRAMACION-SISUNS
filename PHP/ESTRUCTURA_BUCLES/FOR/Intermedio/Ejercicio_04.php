<?php
    $primer_termino = 1;
    $segundo_termino = 1;
    $suma_terminos = 2;
    $promedio = 0;

    $N = 10;

    if ($N <= 0) {
        echo "N debe ser un número entero positivo.";
    } else {
        echo "Serie de Fibonacci hasta el término ".$N.": <br>".$primer_termino.", ".$segundo_termino;

        for ($termino_actual = 3; $termino_actual <= $N; $termino_actual++) {
            $siguiente_termino = $primer_termino + $segundo_termino;
            echo ", ". $siguiente_termino;
            $suma_terminos += $siguiente_termino;

            $primer_termino = $segundo_termino;
            $segundo_termino = $siguiente_termino;
        }

        $promedio = $suma_terminos / $N;
        echo "<br>Promedio de la serie: ". $promedio;
    }
?>