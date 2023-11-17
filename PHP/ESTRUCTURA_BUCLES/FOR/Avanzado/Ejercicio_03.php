<?php
    $numero_convertido = "";
    $resultado = "";
    $base_simbolos = "0123456789ABCDEF";

    $numero_decimal = 255;
    $base = 16;
    // La función in_array() comprueba si un valor existe en un array.
    if (!in_array($base, [2, 8, 16])) {
        echo "La base de conversión no es válida. Debe ser 2, 8 o 16.";
    } else {
        // Proceso de conversión
        for ($digito_restante = $numero_decimal; $digito_restante > 0; $digito_restante = (int)($digito_restante / $base)) {
            $resultado = $base_simbolos[$digito_restante % $base] . $resultado;
        }

        echo "El número ".$numero_decimal." en base ".$base." es: ".$resultado;
    }
?>