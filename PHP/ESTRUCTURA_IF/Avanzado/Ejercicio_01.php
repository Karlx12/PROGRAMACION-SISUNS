<?php
    $dato = 10;

    if ($dato == 0) {
        echo "Es neutro";
    } else {
        if ($dato > 0) {
            echo "Es positivo";
        } else {
            echo "Es negativo";
        }
        echo "<br>";
        if ($dato % 3 == 0 || $dato % 5 == 0) {
            echo " El número es múltiplo de 3 o 5.";
        } else {
            echo " El número no es múltiplo de 3 o 5.";
        }
    }
?>