<?php
    $radio = 5;
    $altura = 10;

    //M_PI es una constante de PHP que guarda el valor de π
    $area = 2 * M_PI * $radio * ($radio + $altura);
    
    echo "El área del cilindro es:". round($area, 2);
?>