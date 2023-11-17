<?php
    $palabra = "reconocer";
    $palabraReversa = "";
    $tamCadena = strlen($palabra);

    for ($i = $tamCadena - 1; $i >= 0; $i--) {
        
        $palabraReversa .=  $palabra[$i];
    }

    if ($palabra === $palabraReversa) {
        echo "Es un palíndromo";
    } else {
        echo "No es un palíndromo";
    }

    echo "<br>Palabra Reversa: ".$palabraReversa;
?>