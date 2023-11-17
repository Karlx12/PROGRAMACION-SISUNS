<?php
    for ($x = 1; $x <= 10; $x++) {
        $denominador = 2 * pow($x, 2) - 32;
        if ($denominador != 0) {
            $y = (3 * pow($x, 2) + 12 * $x + 6 * $x + 9) / $denominador;
            echo "Cuando x =".$x.", Y =".$y."<br>";
        } else {
            echo "Cuando x =".$x.", la función no está definida (división por cero) <br>";
        }
    }
?>