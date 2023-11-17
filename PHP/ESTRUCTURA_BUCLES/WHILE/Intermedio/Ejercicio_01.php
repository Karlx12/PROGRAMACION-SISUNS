<?php
    $N = 3;

    $factorial = 1;
    $i = 1;
    
    while ($i <= $N) {
        // El operador *= multiplica $factorial = $factorial * $i;
        $factorial *= $i;
        $i++;
    }
    
    // Mostrar el resultado
    echo "El factorial de ".$N." es ". $factorial;
?>