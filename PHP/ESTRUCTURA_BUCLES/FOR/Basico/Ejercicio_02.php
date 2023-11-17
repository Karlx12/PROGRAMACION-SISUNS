<?php
    for ($numero = 1; $numero <= 100; $numero++) {
        echo $numero;
        if ($numero % 3 == 0) {
            echo "_";
        }
        echo " ";
    }
?>