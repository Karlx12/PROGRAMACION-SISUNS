<?php
    $a = 1;
    $b = -3;
    $c = 2;
    
    $discriminante = $b ** 2 - 4 * $a * $c;

    if ($discriminante >= 0) {
        $x1 = (-$b + sqrt($discriminante)) / (2 * $a);
        $x2 = (-$b - sqrt($discriminante)) / (2 * $a);

        echo "Las raíces reales son: $x1 y $x2";
    } else {
        echo "La ecuación no tiene raíces reales";
    }
?>