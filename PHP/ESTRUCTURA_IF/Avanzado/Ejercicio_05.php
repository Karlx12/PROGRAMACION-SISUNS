<?php
    $consumo_mensual = 900;

    $precio_normal = 0.03;
    $precio_descuento = 0.02;
    $descuento_porcentaje = 1.25;
    
    if ($consumo_mensual > 800) {
        $costo_primeros_300 = 300 * $precio_normal;
    
        $costo_restantes = ($consumo_mensual - 300) * $precio_descuento;
    
        $descuento = ($costo_primeros_300 + $costo_restantes) * ($descuento_porcentaje / 100);
    
        $costo_total = $costo_primeros_300 + $costo_restantes - $descuento;
    } elseif ($consumo_mensual > 500) {
        $costo_primeros_300 = 300 * $precio_normal;
    
        $costo_restantes = ($consumo_mensual - 300) * $precio_descuento;
    
        $costo_total = $costo_primeros_300 + $costo_restantes;
    } elseif ($consumo_mensual > 300) {
        $costo_total = $consumo_mensual * $precio_normal;
    } else {
        $costo_total = $consumo_mensual * $precio_normal;
    }
    
    echo "El costo total es: ". $costo_total;
?>