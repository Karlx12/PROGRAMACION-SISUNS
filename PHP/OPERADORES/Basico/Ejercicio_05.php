<?php
    $arista = 5;
    
    //El operador ** es el equivalente a ^ exponente en PHP
    $area = sqrt(3) * $arista ** 2;
    
    $volumen = (sqrt(2) / 12) * $arista ** 3;

    //Mostrar resultados
    echo "El área del tetraedro es: ". round($area, 2)."<br>";
    echo "El volumen del tetraedro es: ". round($volumen, 2)."<br>";
?>