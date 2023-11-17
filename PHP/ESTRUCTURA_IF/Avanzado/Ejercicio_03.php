<?php
    $num1 = 7;
    $num2 = 12;
    $num3 = 5;

    if (($num1 >= $num2 && $num1 <= $num3) || ($num1 <= $num2 && $num1 >= $num3)) {
        echo "El número intermedio es: ". $num1;
    } elseif (($num2 >= $num1 && $num2 <= $num3) || ($num2 <= $num1 && $num2 >= $num3)) {
        echo "El número intermedio es: ". $num2;
    } else {
        echo "El número intermedio es: ". $num3;
    }
?>