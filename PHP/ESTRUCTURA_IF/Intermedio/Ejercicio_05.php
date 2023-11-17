<?php
    $cantidadHijos = 5;
    $madreViuda = "sí";
    $hijosEdadEscolar = 2;

    if ($cantidadHijos <= 2) {
        $monto = 70;
    } elseif ($cantidadHijos >= 3 && $cantidadHijos <= 5) {
        $monto = 90;
    } else {
        $monto = 120;
    }

    //El operador de asignación += suma la variable misma con el resto de la expresión y la guarda en si misma.
    //$monto = $monto + $hijosEdadEscolar * 10;
    $monto += $hijosEdadEscolar * 10;

    if ($madreViuda == "sí") {
        $monto += 20;
    }

    echo "El monto mensual es: ". $monto;
?>