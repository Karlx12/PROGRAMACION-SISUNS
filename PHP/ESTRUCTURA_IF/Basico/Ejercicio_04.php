<?php
    $edad = 25;

    //El operador lógico && indica que se deben cumplir ambas condiciones para retornar true
    //Los elseif nos permiten agregar más cóndiciones en caso no se cumpla el if anterior a este.
    if ($edad >= 0 && $edad <= 12) {
        echo "Niño";
    } elseif ($edad >= 13 && $edad <= 17) {
        echo "Adolescente";
    } elseif ($edad >= 18 && $edad <= 64) {
        echo "Adulto";
    } else {
        echo "Adulto Mayor";
    }
?>