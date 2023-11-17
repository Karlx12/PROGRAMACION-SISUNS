<?php
    $lado1 = 3;
    $lado2 = 4;
    $lado3 = 5;

    if ($lado1 < $lado2 + $lado3 && $lado2 < $lado1 + $lado3 && $lado3 < $lado1 + $lado2) {
        if ($lado1 == $lado2 && $lado2 == $lado3) {
            echo "Es un triángulo equilátero";
        } elseif ($lado1 == $lado2 || $lado1 == $lado3 || $lado2 == $lado3) {
            echo "Es un triángulo isósceles";
        } else {
            echo "Es un triángulo escaleno";
        }
    } else {
        echo "No es un triángulo";
    }
?>