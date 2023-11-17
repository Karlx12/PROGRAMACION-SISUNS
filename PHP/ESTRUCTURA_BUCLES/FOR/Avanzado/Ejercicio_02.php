<?php
    $palabra_morse = "";
    //Es te array vincula una clave con un valor, se le conoce como array asociativo.
    $diccionario_morse = [
        'A' => '.-', 'B' => '-...', 'C' => '-.-.', 'D' => '-..', 'E' => '.', 'F' => '..-.', 'G' => '--.', 'H' => '....',
        'I' => '..', 'J' => '.---', 'K' => '-.-', 'L' => '.-..', 'M' => '--', 'N' => '-.', 'O' => '---', 'P' => '.--.',
        'Q' => '--.-', 'R' => '.-.', 'S' => '...', 'T' => '-', 'U' => '..-', 'V' => '...-', 'W' => '.--', 'X' => '-..-',
        'Y' => '-.--', 'Z' => '--..',
        '0' => '-----', '1' => '.----', '2' => '..---', '3' => '...--', '4' => '....-', '5' => '.....',
        '6' => '-....', '7' => '--...', '8' => '---..', '9' => '----.'
    ];
    $palabra = "Hola";

    for ($i = 0; $i < strlen($palabra); $i++) {
        //La función strtoupper() convierte los caracteres de una cadena en mayúsculas
        $caracter = strtoupper($palabra[$i]);
        //La función array_key_exists() comprueba si la clave existe en el array
        if (array_key_exists($caracter, $diccionario_morse)) {
            $morse_caracter = $diccionario_morse[$caracter];
            $palabra_morse .= $morse_caracter." ";
        }
    }

    // Mostrar el resultado
    echo "La palabra '".$palabra."' en código Morse es: ".$palabra_morse;
?>