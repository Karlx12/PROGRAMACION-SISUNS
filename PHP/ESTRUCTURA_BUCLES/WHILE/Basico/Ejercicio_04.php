<?php
    $numero = 7227;

    if ($numero < 1000 || $numero > 9999) {
        echo "El número ingresado no tiene 4 cifras. Fin del programa.";
    } else {
        $original = $numero;
        $inverso = 0;

        while ($numero > 0) {
            $digito = $numero % 10;
            $inverso = $inverso * 10 + $digito;
            $numero = (int)($numero / 10);
        }

        if ($original == $inverso) {
            echo "El número $original es capicúa.";
        } else {
            echo "El número $original no es capicúa.";
        }
    }
?>