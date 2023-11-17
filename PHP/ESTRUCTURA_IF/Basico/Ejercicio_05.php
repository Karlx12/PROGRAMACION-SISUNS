<?php
    $peso = 70;
    $altura = 1.75;
    
    $imc = $peso / ($altura * $altura);
    
    if ($imc < 18.5) {
        echo "Bajo de peso";
    } elseif ($imc >= 18.5 && $imc < 25) {
        echo "Peso normal";
    } elseif ($imc >= 25 && $imc < 30) {
        echo "Sobrepeso";
    } else {
        echo "Obesidad";
    }
?>