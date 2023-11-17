<?php
    $montoPago = 250;

    //Dentro del paréntesis se ubica la condición y en las llaves el código si es verdadero.
    if ($montoPago > 200) {
        $montoPago = $montoPago * 0.8;
    }

    echo "El monto a pagar es: " . $montoPago;
?>