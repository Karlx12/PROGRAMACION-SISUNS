<?php
    $numeroAleatorio = 50;
    $intento = 0;
    $numeroAdivinanza = 0;

    do {
        $intento++;
        echo "<br> Intento $intento: Ingrese un número entre 1 y 100: <br>";
        $numeroAdivinanza = 50; // Valor que debe ser dato por el usuario
        //El operador de comparación === se llama idéntico indica que tanto el valor como su tipo de dato
        //deben ser iguales.
        if ($numeroAdivinanza === $numeroAleatorio) {
            echo "¡Felicitaciones! Has adivinado el número correctamente. <br>";
        } else {
            if ($numeroAdivinanza < $numeroAleatorio) {
                echo "El número es mayor. Intenta nuevamente. <br>";
            } else {
                echo "El número es menor. Intenta nuevamente. <br>";
            }
        }
    } while ($numeroAdivinanza !== $numeroAleatorio);
?>