<?php 
    $dividendo = 60;
    $divisor = 7;

    if ($divisor <= 0) {
        echo "El divisor debe ser mayor que 0.";
    } else {
        $cociente = 0;
        $residuo = $dividendo;

        while ($residuo >= $divisor) {
            $residuo -= $divisor;
            $cociente++;
        }
        echo "Cociente: ".$cociente."<br>";
        echo "Residuo: ".$residuo."<br>";
    }
?>