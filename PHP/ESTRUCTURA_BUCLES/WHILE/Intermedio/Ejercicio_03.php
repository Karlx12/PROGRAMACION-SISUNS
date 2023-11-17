<?php
    $palabra1 = "hola";
    $palabra2 = "hombre";

    //La función strlen() nos da la lognitud de una cadena.
    // strlen(String lenght): Longitud de cadena
    $longitud1 = strlen($palabra1);
    $longitud2 = strlen($palabra2);
    $prefijo = "";
    $i = 1;

    //La función min() devuelve el minimo valor entre sus parámetros.
    while ($i <= min($longitud1, $longitud2)) {
        //La función substr() toma un conjunto de caracteres de una cadena de acuerdo a su posición y
        //cantidad de caracteres. substr(cadena, inicio, longitud);
        if (substr($palabra1, 0, $i) == substr($palabra2, 0, $i)) {
            $prefijo = substr($palabra1, 0, $i);
        } else {
            break; // Si no hay prefijo común, salir del bucle
        }
        $i++;
    }

    if (strlen($prefijo) > 0) {
        echo "El prefijo común es: ". $prefijo;
    } else {
        echo "No existe un prefijo común.";
    }
?>