<?php
    $inversion_inicial = 1000.00;
    $tasa_interes_mensual = 0.02;
    $meses_en_un_ano = 12;
    $dinero_despues_de_ano = $inversion_inicial;
    
    for ($mes = 1; $mes <= $meses_en_un_ano; $mes++) {
        $interes_del_mes = $dinero_despues_de_ano * $tasa_interes_mensual;
    
        $dinero_despues_de_ano += $interes_del_mes;
    }
    
    echo "La cantidad de dinero después de un año es: $". round($dinero_despues_de_ano, 2);
?>