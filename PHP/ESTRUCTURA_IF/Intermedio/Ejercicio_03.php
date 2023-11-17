<?php
    //La función rand() genera un numero entero aleatorio entre un valor mínimo y máximo dados como parámetros.
    $descuentoAleatorio = rand(0, 100);

    $totalCompra = 150;
    if ($descuentoAleatorio < 74) {
        $descuento = $totalCompra * 0.15;
    } else {
        $descuento = $totalCompra * 0.20;
    }

    echo "El descuento es: ". $descuento;
?>