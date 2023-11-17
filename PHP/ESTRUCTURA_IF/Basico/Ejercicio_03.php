<?php
    $edad = 16;
    $precio = 100;
    
    if ($edad < 18) {
        $precio_con_descuento = $precio * 0.8;
        echo "Precio con descuento: " . $precio_con_descuento;
    } else {
        echo "Precio sin descuento: " . $precio;
    }
?>