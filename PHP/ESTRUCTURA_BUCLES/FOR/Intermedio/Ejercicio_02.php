<?php
    $numeros = [35, 67, 25, 90, 100, 31, 14, 90];
    $longitud = count($numeros);

    for ($i = 0; $i < $longitud - 1; $i++) {
        for ($j = 0; $j < $longitud - $i - 1; $j++) {
            if ($numeros[$j] < $numeros[$j + 1]) {
                $temp = $numeros[$j];
                $numeros[$j] = $numeros[$j + 1];
                $numeros[$j + 1] = $temp;
            }
        }
    }

    for ($k = 0; $k < $longitud; $k++) {
        echo $numeros[$k]." ";
    }
?>