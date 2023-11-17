<?php
    //Una array que contiene otros arrays se le llama array multidimensional.
    $matriz = [
        [1, 2, 3],
        [4, 5, 6],
        [7, 8, 9]
    ];
    //1 * (5*9 - 6*8) = -3
    //2 * (4*9 - 6*7) = -12
    //3 * (4*8 - 5*7) = -9
    //$determinante = -3 - (-12) + (-9) = 0
    $determinante = $matriz[0][0] * ($matriz[1][1] * $matriz[2][2] - $matriz[1][2] * $matriz[2][1]) -
                    $matriz[0][1] * ($matriz[1][0] * $matriz[2][2] - $matriz[1][2] * $matriz[2][0]) +
                    $matriz[0][2] * ($matriz[1][0] * $matriz[2][1] - $matriz[1][1] * $matriz[2][0]);

    //El operador de comparación != indica que la $determinante debe ser diferente de cero para retornar true.
    if ($determinante != 0) {
        echo "El determinante de la matriz es diferente de cero.";
    } else {
        echo "El determinante de la matriz es cero, la matriz no es invertible.";
    }
?>