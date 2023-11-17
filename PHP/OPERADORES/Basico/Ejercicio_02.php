<?php
    //Las variables o constantes deben iniciar con un $ para que sean reconocidas como tal.
    $num1 = 1;
    $num2 = 2;

    //Operaciones aritméticas conservan su operador representativo y se emplea el "="
    //para asignar el valor resultante a una variable.
    $suma = $num1 + $num2;
    $resta = $num1 - $num2;
    $multiplicacion = $num1 * $num2;
    $division = $num1 / $num2;

    //Usamos la etiqueta <br> (propia de HTML) para hacer un salto de línea y contatenamos con un punto.
    echo "Suma: ". $suma ."<br>";
    echo "Resta: ". $resta ."<br>";
    echo "Multiplicación: ". $multiplicacion ."<br>";
    echo "División: ". $division ."<br>";
?>