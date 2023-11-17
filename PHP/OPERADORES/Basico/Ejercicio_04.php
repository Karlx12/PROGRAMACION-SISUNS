<?php
    //Longitudes de los lados, establecidos de manera estática.
    $lado1 = 5;
    $lado2 = 7;
    $lado3 = 8;

    //Calcular semiperímetro, se sigue la prioridad de operadores.
    $s = ($lado1 + $lado2 + $lado3) / 2;

    //La función sqrt() sirve para hallar la raíz cuadrada.
    $area = sqrt($s * ($s - $lado1) * ($s - $lado2) * ($s - $lado3));

    //La función round() redondea el número, recibiendo como parámetros
    //la variable y la cantidad de posiciones decimales (se puede omitir).
    echo "El área del triángulo es: ". round($area, 2);
?>