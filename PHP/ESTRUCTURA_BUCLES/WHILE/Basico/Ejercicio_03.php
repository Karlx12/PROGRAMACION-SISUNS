<?php
    $nivel = 1;

    while ($nivel <= 10) {
        $espacios = 10 - $nivel;

        for ($i = 1; $i <= $espacios; $i++) {
            echo " ";
        }

        for ($numero = 1; $numero <= $nivel; $numero++) {
            echo $numero;
        }

        for ($numero = $nivel - 1; $numero >= 1; $numero--) {
            echo $numero;
        }

        $nivel++;
        echo "<br>";
    }
?>