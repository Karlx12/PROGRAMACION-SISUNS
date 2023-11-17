<?php
    $suma = 0;
    $matriz_a = [[1, 2, 3, 4], [5, 6, 7, 8], [9, 10, 11, 12], [13, 14, 15, 16]];
    $matriz_b = [[1, 0, 0, 0], [0, 1, 0, 0], [0, 0, 1, 0], [0, 0, 0, 1]];
    
    for ($i = 0; $i < 4; $i++) {
        for ($j = 0; $j < 4; $j++) {
            $matriz_resultado[$i][$j] = 0;
        }
    }
    
    for ($i = 0; $i < 4; $i++) {
        for ($j = 0; $j < 4; $j++) {
            for ($k = 0; $k < 4; $k++) {
                $suma += $matriz_a[$i][$k] * $matriz_b[$k][$j];
            }
            $matriz_resultado[$i][$j] = $suma;
            $suma = 0;
        }
    }
    
    echo "Matriz Resultado (A * B):<br>";
    for ($i = 0; $i < 4; $i++) {
        for ($j = 0; $j < 4; $j++) {
            echo $matriz_resultado[$i][$j]. " ";
        }
        echo "<br>";
    }
?>