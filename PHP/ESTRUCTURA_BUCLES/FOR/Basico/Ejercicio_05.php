<?php
    $N = 5;
    $suma = 0;
    $contador = 0;
    for ($numero = 2; $numero <= $N * 20; $numero++) {
        //Este tipo de variable es conocida como booleana.
        $es_primo = true;

        for ($i = 2; $i <= sqrt($numero); $i++) {
            if ($numero % $i == 0) {
                $es_primo = false;
                break;
            }
        }

        if ($es_primo) {
            $suma += $numero;
            $contador++; 
        }
        if ($contador == $N) {
            break;
        }
    }

    echo "La suma de los primeros ".$N." números primos es: ".$suma;
?>