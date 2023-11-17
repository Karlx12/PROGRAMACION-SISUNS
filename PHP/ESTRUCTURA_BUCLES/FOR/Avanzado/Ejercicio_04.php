<?php
    $suma = 0;
    $numeros = [7, 12, 5, 8, 3];
    
    foreach ($numeros as $numero) {
        $esPrimo = true;
        if ($numero > 1) {
            for ($i = 2; $i <= sqrt($numero); $i++) {
                if ($numero % $i == 0) {
                    $esPrimo = false;
                    break;
                }
            }
            if ($esPrimo) {
                $suma += $numero;
            }
        }else{
            $esPrimo = false;
        }
    }
    
    echo "La suma de los números primos es: " . $suma;
?>
