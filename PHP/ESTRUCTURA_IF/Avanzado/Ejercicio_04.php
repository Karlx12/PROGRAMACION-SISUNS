<?php
    $numero = 1234;

    if ($numero >= 1000 && $numero <= 9999) {
        $contador_impares = 0;

        while ($numero > 0) {
            $digito = $numero % 10;

            if ($digito % 2 != 0) {
                //El ++ es un operador incremental que aumenta el valor de la variable en 1.
                $contador_impares++;
            }

            //El colocar (int) significa que convertiremos lo continuo a él tipo entero.
            $numero = (int)($numero / 10);
        }

        echo "La cantidad de dígitos impares es: ". $contador_impares;
    } else {
        echo "El número no tiene 4 dígitos";
    }
?>