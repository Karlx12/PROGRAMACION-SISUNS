<?php
    $contadorPalabras = 0;
    $i = 0;
    $texto = "Este es un ejemplo de cadena de texto";

    $longitud = strlen($texto);

    while ($i < $longitud) {
        if (substr($texto, $i, 1) == " ") {
            $contadorPalabras++;
        }
        $i++;
    }

    $contadorPalabras++;

    echo "El número de palabras en el texto es: ". $contadorPalabras;
?>