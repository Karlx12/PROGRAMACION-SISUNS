<?php
    $n = 5;
    if ($n > 0) {
        for ($fila = 1; $fila <= $n; $fila++) {
            for ($columna = 1; $columna <= $n; $columna++) {
                echo "* ";
            }
            echo "<br>";
        }
    } else {
        echo "El tamaño debe ser mayor que 0";
    }
?>