<?php
    $suma = 0;
    $numeros = [7, 12, 5, 8, 3];
    
    for ($i = 0; $i < 5; $i++) {
        if (esPrimo($numeros[$i])) {
            $suma += $numeros[$i];
        }
    }
    
    echo "La suma de los números primos es: ".$suma;
    
    // Función para verificar si un número es primo
    function esPrimo($numero) {
        if ($numero <= 1) {
            return false;
        }
        for ($i = 2; $i <= sqrt($numero); $i++) {
            if ($numero % $i == 0) {
                return false;
            }
        }
        return true;
    }
?>